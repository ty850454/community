### 文章资源设计

#### 文章接口
url | get | post | delete | put
--- | --- | --- | --- | ---
post | 获取文章列表 | 创建文章 | - | -
post/`{id}` | 获取指定文章信息 | - | 删除指定文章 | 更新指定文章
post/`{id}`/reply | 获取指定文章的评论列表 | 为某篇文章新增评论 | - | -
post/`{id}`/reply/`{id}` | 获取某评论的回复评论列表 | 回复某评论 | 删除某评论 | -
post/`{id}`/file | 获取某文章附件列表 | - | - | -
post/`{id}`/file/`{id}` | 下载指定附件 | - | 删除某附件 | -

#### 文章类型接口
url | get | post | delete | put
--- | --- | --- | --- | ---
post/type | 获取类型列表 | 新增类型 | - | -
post/type/`{id}` | 获取指定类型下的所有文章 | - | 删除类型 | -

#### 文章标签接口
url | get | post | delete | put
--- | --- | --- | --- | ---
post/tag | 获取标签列表 | 新增标签 | - | -
post/tag/`{id}` | 获取指定标签下的所有文章 | - | 删除标签 | -

#### 文章属性
属性 | 说明
--- | ---
id | 主键
title | 文章标题
createBy | 创建人(公共属性)
createTime | 创建时间(公共属性)
updateBy | 更新人(公共属性)
updateTime | 更新时间(公共属性)

#### 文章内容属性
属性 | 说明
--- | ---
id | 主键(同文章主键)
content | 正文

#### 文章回复属性
属性 | 说明
--- | ---
id | 主键
postId | 文章主键
content | 回复内容
replyTo | 回复的目标用户

#### 文章附件属性
属性 | 说明
--- | ---
id | 主键
postId | 文章主键
type | 附件类型
path | 附件路径
