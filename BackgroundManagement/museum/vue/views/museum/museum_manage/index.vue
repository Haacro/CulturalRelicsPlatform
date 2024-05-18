<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="文物名称" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入文物名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['museum:museum_manage:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['museum:museum_manage:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['museum:museum_manage:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['museum:museum_manage:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="museum_manageList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="博物馆名称" align="center" prop="museum" />
      <el-table-column label="文物名称" align="center" prop="name" />
      <el-table-column label="存货" align="center" prop="inventory" />
      <el-table-column label="大小" align="center" prop="size" />
      <el-table-column label="源网址" align="center" prop="details" />
      <el-table-column label="朝代" align="center" prop="era" />
      <el-table-column label="工艺" align="center" prop="technique" />
      <el-table-column label="种类" align="center" prop="category" />
      <el-table-column label="图片url" align="center" prop="imageUrl" />
      <el-table-column label="作者" align="center" prop="author" />
      <el-table-column label="卷数" align="center" prop="numberOfVolume" />
      <el-table-column label="雕刻或手工复制" align="center" prop="engravedOrHandcopied" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['museum:museum_manage:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['museum:museum_manage:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改博物馆文物信息管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="ID" prop="id">
          <el-input v-model="form.id" placeholder="请输入ID" />
        </el-form-item>
        <el-form-item label="博物馆名称" prop="museum">
          <el-input v-model="form.museum" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="文物名称" prop="name">
          <el-input v-model="form.name" placeholder="请输入文物名称" />
        </el-form-item>
        <el-form-item label="存货" prop="inventory">
          <el-input v-model="form.inventory" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="大小" prop="size">
          <el-input v-model="form.size" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="源网址" prop="details">
          <el-input v-model="form.details" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="朝代" prop="era">
          <el-input v-model="form.era" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="工艺" prop="technique">
          <el-input v-model="form.technique" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="种类" prop="category">
          <el-input v-model="form.category" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="图片url" prop="imageUrl">
          <el-input v-model="form.imageUrl" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="作者" prop="author">
          <el-input v-model="form.author" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="卷数" prop="numberOfVolume">
          <el-input v-model="form.numberOfVolume" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="雕刻或手工复制" prop="engravedOrHandcopied">
          <el-input v-model="form.engravedOrHandcopied" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listMuseum_manage, getMuseum_manage, delMuseum_manage, addMuseum_manage, updateMuseum_manage } from "@/api/museum/museum_manage";

export default {
  name: "Museum_manage",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 博物馆文物信息管理表格数据
      museum_manageList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        name: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询博物馆文物信息管理列表 */
    getList() {
      this.loading = true;
      listMuseum_manage(this.queryParams).then(response => {
        this.museum_manageList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        museum: null,
        name: null,
        inventory: null,
        size: null,
        details: null,
        era: null,
        technique: null,
        category: null,
        imageUrl: null,
        author: null,
        numberOfVolume: null,
        engravedOrHandcopied: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加博物馆文物信息管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getMuseum_manage(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改博物馆文物信息管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateMuseum_manage(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addMuseum_manage(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除博物馆文物信息管理编号为"' + ids + '"的数据项？').then(function() {
        return delMuseum_manage(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('museum/museum_manage/export', {
        ...this.queryParams
      }, `museum_manage_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
