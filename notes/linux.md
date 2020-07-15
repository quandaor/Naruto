

1. 拷贝文件夹到远程服务器
   1. scp -r  /home/administrator/test/ root@192.168.1.100:/root/
2. 查看硬盘使用情况
   1. df  -k	以KB为单位显示磁盘使用量和占用率
   2. df -m：以Mb为单位显示磁盘使用量和占用率
3. 查看端口占用情况
4. 查看CPU top 或者 jps
5. 查看 JVM gc   jstat -PID 1000
6. 查看剩余内存 free -h
7. 查看磁盘占用
8. tail -f log.log
   1. Control + C退出
   2. control+ S 暂停
   3. control + Q继续
9. vi 11.log
   1. / 查找  n下一个N上一个
   2. 行号  set number
   3. 第一行  ：1回车
   4. 最后一行  G
10. 如何把本地jar上传到maven私服
    1. 把jar包放到其他路径
    2. mvn deploy:deploy-file \
       -Dmaven.test.skip=true \
       -DgroupId=xxx \
       -DartifactId=xxx \
       -Dversion=xxxx \
       -Dpackaging=jar \
       -Dfile=xxx.jar \
       -DrepositoryId=xxxx \
       -Durl= xxxx
11. CURL
    1. POST   url localhost:3000/api/json -X POST -d '{"hello": "world"}' --header "Content-Type: application/json"
12. git remote set-url origin url

