慕课网的高并发-dao层


秒杀功能难点：
秒杀接口暴露
执行秒杀
相关查询


代码开发阶段:
dao层设计编码：dao层工作演变成：接口设计 + SQL编写
             代码与sql的分离，方便review
             dao拼接等逻辑再service层完成
service设计编码
web设计编码


秒杀API
GET/seckill/list          秒杀列表
GET/seckill/{id}/detail   秒杀详情页
GET/seckill/time/now      系统时间

POST/seckill/{id}/exposer   暴露秒杀
POST/seckill/{id}/{md5}/execution   执行秒杀