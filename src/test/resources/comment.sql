drop table if exists ACCOUNTING_LOG;

drop table if exists CRAWLER_LOG;

drop table if exists FINANCE_INNER;

drop table if exists LOGONLOG;

drop table if exists TASKINFO;

drop table if exists TASK_APPEAL;

drop table if exists TASK_GET;

drop table if exists USER;

drop table if exists USER_ACCOUNT;

drop table if exists USER_DETAIL;

drop table if exists VERIFICATION_CODE_LOG;

drop table if exists WITHDRAW_DEPOSITS_LOG;

/*==============================================================*/
/* Table: ACCOUNTING_LOG                                        */
/*==============================================================*/
create table ACCOUNTING_LOG
(
   id                   bigint not null,
   outflow_account      bigint not null comment '流出帐号',
   inflow_account       bigint comment '流入帐号',
   flow_amount          decimal(10,2) comment '流动金额',
   flow_type            varchar(2) comment '流动方式（充值、转账、提现、平台手续费、支付宝手续费）',
   taskid               bigint comment '任务id',
   taskgetid            bigint comment '任务领取id',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table ACCOUNTING_LOG comment '账务流水记录表';

/*==============================================================*/
/* Table: CRAWLER_LOG                                           */
/*==============================================================*/
create table CRAWLER_LOG
(
   id                   bigint not null,
   taskid               bigint comment '任务id',
   taskgetid            bigint comment '任务领取id',
   comment_md5          varchar(32) comment '评价摘要（MD5: 昵称+时间+标题+内容）',
   remark               varchar(200) comment '备注',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table CRAWLER_LOG comment '任务爬虫记录表';

/*==============================================================*/
/* Table: FINANCE_INNER                                         */
/*==============================================================*/
create table FINANCE_INNER
(
   id                   bigint not null,
   inout_type           varchar(2) comment '收支类型（入账、出账）',
   inout_subtype        varchar(2) comment '收支方式（广告收入、吃饭、服务器费用...、其他）',
   amount               decimal(10,2) comment '金额',
   inout_user           varchar(50) comment '收支人',
   remark               varchar(200) comment '备注',
   status               varchar(2) comment '有效状态（1有效 0无效）',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table FINANCE_INNER comment '内部财务记录表';

/*==============================================================*/
/* Table: LOGONLOG                                              */
/*==============================================================*/
create table LOGONLOG
(
   ID                   bigint not null comment 'ID',
   USERID               bigint comment '用户ID',
   IP                   varchar(15) comment 'IP',
   LOGONTIME            datetime comment '上线时间',
   LOGONFLAG            varchar(1) comment '登录成功标志，1为成功，0为失败',
   LOGFAILEDREASON      varchar(500) comment '登录失败原因',
   primary key (ID)
);

alter table LOGONLOG comment 'LOGONLOG(系统登录历史纪录)';

/*==============================================================*/
/* Table: TASKINFO                                              */
/*==============================================================*/
create table TASKINFO
(
   id                   bigint not null,
   TASK_USERID          bigint comment '任务发起人id',
   TASK_USERAPPNAME     varchar(50) comment '任务发起人名称',
   software_title       varchar(50) comment '软件名称',
   Software_FORWORD_URL varchar(120) comment '软件跳转地址',
   software_url         varchar(120) comment '软件地址',
   software_version     varchar(8) comment '软件版本',
   software_size        decimal(6,2) comment '软件大小',
   software_cost        decimal(10,2) comment '下载费用（软件单价）',
   comment_num          int(5) comment '评论条数',
   comment_unit_cost    decimal(10,2) comment '评论单价',
   comment_rate         varchar(1) comment '评论星级',
   special_remark       varchar(200) comment '特殊说明（备注）',
   software_detail_content varchar(500) comment '软件内容明细',
   status               varchar(2) comment '状态（待审核、驳回、进行中、已完成）',
   version              smallint,
   LAST_UPDATE_TIME     datetime comment '最后更新时间',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table TASKINFO comment '任务信息表';

/*==============================================================*/
/* Table: TASK_APPEAL                                           */
/*==============================================================*/
create table TASK_APPEAL
(
   id                   bigint not null,
   taskid               bigint comment '任务id',
   taskgetid            bigint comment '任务领取id',
   software_title       varchar(50) comment '软件名称',
   task_userid          bigint comment '发布人id',
   task_userappname     varchar(50) comment '发布人名称',
   task_get_userid      bigint comment '领取人id',
   task_get_userappname varchar(50) comment '领取人名称',
   type                 varchar(1) comment '类型（发布人驳回、领取人申述、平台审核）',
   revoke_type          varchar(1) comment '驳回类型（虚假、重复...、其他）',
   revoke_reason        varchar(500) comment '驳回理由（驳回类型选择 其他 时填写）',
   appeal_reason        varchar(500) comment '申述理由',
   auth_result          varchar(500) comment '审核结果',
   auth_userid          bigint comment '审核人id',
   auth_username        varchar(50) comment '审核人名称',
   status               varchar(2) comment '状态',
   appeal_time          datetime comment '申述时间',
   auth_time            datetime comment '审核时间',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table TASK_APPEAL comment '任务申述表';

/*==============================================================*/
/* Table: TASK_GET                                              */
/*==============================================================*/
create table TASK_GET
(
   id                   bigint not null,
   taskid               bigint comment '任务id',
   software_title       varchar(50) comment '软件名称',
   task_get_userid      bigint comment '领取人id',
   task_get_time        datetime comment '领取时间（生效时间）',
   expiry_time          datetime comment '失效时间',
   comment_userappname  varchar(50) comment '评价昵称',
   commment_time        datetime comment '评价时间',
   comment_title        varchar(50) comment '评价标题',
   comment_content      varchar(500) comment '评价内容',
   comment_md5          varchar(32) comment '评价摘要（MD5: 昵称+时间+标题+内容）',
   finished_ommit_time  datetime comment '完成提交时间',
   status               varchar(2) comment '状态（进行、超时、审核、驳回、完成）',
   remark               varchar(200) comment '备注',
   version              smallint,
   LAST_UPDATE_TIME     datetime comment '最后更新时间',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table TASK_GET comment '任务领取表';

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   id                   bigint not null,
   USERNAME             varchar(20) comment '用户名',
   PASSWD               varchar(32) comment '密码',
   APPNAME              varchar(50) comment '苹果昵称',
   LOGINEDCOUNT         int(8) comment '已登录次数',
   LOCKSTATE            varchar(1) comment '账户锁定状态：0正常，1账户停用',
   LOCKTIME             datetime comment '账户锁定时间',
   LOCKREASON           varchar(500) comment '账户锁定原因',
   LASTLOGONTIME        datetime comment '上次登录时间',
   LAST_UPDATE_TIME     datetime comment '最后更新时间',
   CREATETIME           datetime comment '注册时间',
   primary key (id)
);

alter table USER comment '用户表';

/*==============================================================*/
/* Table: USER_ACCOUNT                                          */
/*==============================================================*/
create table USER_ACCOUNT
(
   userid               bigint not null comment '用户id',
   account_balance      decimal(10,2) comment '个人账户余额',
   account_available_balance decimal(10,2) comment '个人账户可用余额',
   account_frozen_balance decimal(10,2) comment '个人账户冻结金额',
   status               varchar(2) comment '账户状态（正常、冻结）',
   version              smallint comment 'version',
   LAST_UPDATE_TIME     datetime comment '最后更新时间',
   createtime           datetime comment '创建时间',
   primary key (userid)
);

alter table USER_ACCOUNT comment '个人账户';

/*==============================================================*/
/* Table: USER_DETAIL                                           */
/*==============================================================*/
create table USER_DETAIL
(
   id                   bigint not null,
   REALNAME             varchar(32) comment '姓名',
   SEX                  varchar(1) comment '性别',
   BIRTHDATE            int(8) comment '出生日期',
   MOBILEPHONE          varchar(20) comment '手机号码',
   EMAIL                varchar(120) comment '邮箱',
   QQ                   varchar(20) comment 'QQ号码',
   REMARK               varchar(500) comment '备注',
   primary key (id)
);

alter table USER_DETAIL comment '用户详细信息表';

/*==============================================================*/
/* Table: VERIFICATION_CODE_LOG                                 */
/*==============================================================*/
create table VERIFICATION_CODE_LOG
(
   ID                   bigint not null comment '电脑号',
   MOBILEPHONE          varchar(20) comment '手机号码',
   IP                   varchar(15) comment 'IP',
   VERIFYCODE           varchar(8) comment '验证码',
   SEND_TIME            datetime comment '发送时间（年月日时分秒）',
   EXPIRY_TIME          datetime comment '失效时间（年月日时分秒）',
   CREATEDATE           int(8) comment '创建日期（年月日）',
   CREATETIME           datetime comment '创建时间',
   primary key (ID)
);

alter table VERIFICATION_CODE_LOG comment '手机验证码记录表';

/*==============================================================*/
/* Table: WITHDRAW_DEPOSITS_LOG                                 */
/*==============================================================*/
create table WITHDRAW_DEPOSITS_LOG
(
   id                   bigint not null,
   userid               bigint not null comment '用户id',
   withdraw_type        varchar(2) comment '提现方式（支付宝）',
   payment_obj          varchar(30) comment '支出对象（提现帐号）',
   withdraw_amount      decimal(10,2) comment '提现金额',
   handling_charge      decimal(6,2) comment '手续费',
   status               varchar(2) comment '审批状态（待审批、通过、驳回）',
   auth_result          varchar(500) comment '审批结果',
   version              smallint comment 'version',
   createtime           datetime comment '创建时间',
   primary key (id)
);

alter table WITHDRAW_DEPOSITS_LOG comment '提现记录表';
