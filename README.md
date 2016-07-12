# bsdiffAndroidDemo
bsdiff demo for android
<br>bsdiff 4.3 android demo
old:老版本apk文件
patcher:新版本和老版本的diff(也就是增量包)
newFile:准备生成的新版本的存放路径
BsPatch.bspatch(old.getAbsolutePath(), patcher.getAbsolutePath(),newFile.getAbsolutePath());



patcher制作（mac）:
1 控制台运行 brew install bsdiff 安装diff工具
2 bsdiff old.apk new.apk  patcher(patcher就是要生成的增量包)
