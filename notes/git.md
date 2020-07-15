1. 如何使.gitignore生效
   1. git rm -r --cached .       #清除缓存  
   2. git add .                         #重新trace file  
2. 如何回退分支
   1. git reset --hard 
3. 如何查看git记录
   1. git log --stat
   2. git log --oneling --graph 
   3. git log --since=2.weeks
4. 如何设置远程url
   1. git remote set-url origin xxxxx.git