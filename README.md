
# bsdiffAndroidDemo
bsdiff demo for android
<br> android studio  & ndk debug
<br>bsdiff 4.3 android demo
<br>old:老版本apk文件
<br>patcher:新版本和老版本的diff(也就是增量包)
<br>newFile:准备生成的新版本的存放路径
<br>BsPatch.bspatch(old.getAbsolutePath(), patcher.getAbsolutePath(),newFile.getAbsolutePath());

<br>不编译的可以使用已经编译好的so /alone_so_lib

<br>patcher制作（mac）:
<br>1 控制台运行 brew install bsdiff 安装diff工具   
<br>2 bsdiff old.apk new.apk  patcher(patcher就是要生成的增量包)

<br>patcher制作(windows(32))
下载http://sites.inka.de/tesla/download/libapr_win9x.zip

由于友盟的自动更新要废弃了，所以准备基于bsdiff开发自动更新
