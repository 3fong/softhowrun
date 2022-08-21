## 程序是怎么跑起来的

计算机五大部件: 输入装置,输出装置,存储器,运算器,控制器

CPU -> 二进制 -> 内存 -> 硬盘 -> 压缩 -> 操作系统 -> 可执行文件 -> 应用 -> 汇编语言 -> 硬件 -> BI -> C语言语法

### CPU

- 程序是什么
- 程序由什么组成
- 什么是机器语言
- 运行中的程序存储在哪里
- 什么是内存地址
- 计算机的组件中,哪个负责程序的解释和运行?
- CPU的运行机制

CPU:central processing unit 中央处理器.负责解释和运行程序内容.    
IC=CPU+内存    
CPU=寄存器,控制器,运算器,时钟     
寄存器: 暂存指令,数据等处理对象,内存的一部分.一个CPU有20-100个寄存器    
控制器:把内存指令,数据读入到寄存器,并根据指令的执行结果控制整个计算机    
运算器: 运算从内存读入寄存器的数据    
时钟: 发出CPU开始计时的时钟信号     

内存: 指计算机的主存储器(main memory),简称主存.通过控制芯片等于CPU相连,主要负责存储指令和数据.

程序运行机制: 程序启动后,根据时钟信号,控制器从内存读取指令和数据后,进行解释和运行;运算器对数据进行运算.控制器根据该运行结果来控制计算机.    
控制:数据运算之外的处理,主要是数据输入输出的时机控制.如键盘的输入输出等.

- 寄存器

CPU的核心是寄存器,因为程序把寄存器作为对象来描述.    
汇编: 汇编语言编写的程序转化成机器语言的过程;    
反汇编: 机器语言程序转化成汇编语言的过程

```
mov eax, dword ptr [ebp-8]   把数值从内存复制到eax    
add eax, dword ptr [ebp-0Ch] eax的数据和内存的数值相加    
mov dword ptr [ebp-4], eax   把eax的数值存储到内存
```
上面是汇编语言转成成机器语言的程序执行情况.机器语言级别的程序是通过寄存器来处理的.CPU是寄存器的集合体

程序的处理过程就是将高级语言程序编译后转化为机器语言,再通过CPU内部的寄存器等进行处理.

寄存器可以分为8类.寄存器的存储内容可以是指令也可以是数据.    
数据:运算数值,内存地址的数值    

![寄存器分类](https://upload-images.jianshu.io/upload_images/4933701-4cc3831e6b621953.png?imageMogr2/auto-orient/strip|imageView2/2/w/1200/format/webp)

程序计数器,累加寄存器,标志寄存器,指令寄存器和栈寄存器只有一个,其他的一般有多个

- 计数器

cpu计数器存放下一条指令的执行地址.CPU控制器每次读取计数器的地址来获取内存中的数据,完成程序的执行.

1 程序的流程与计数器

程序的流程: 顺序执行,条件执行,循环.    
程序的流程是通过计数器来控制指令执行顺序,通过标志寄存器来决定条件和循环的跳转行为;标志寄存器中存储了当前执行的运算结果;

![条件分支下的计数器](https://img1.baidu.com/it/u=3728839880,2864243253&fm=253&fmt=auto&app=138&f=JPG?w=991&h=500)

2 函数与计数器

函数调用处理通过把程序计数器的值设置为函数的存储地址.但函数的调用需要入口地址和出口地址,单纯的计数器无法在一个计数上标记两个地址.
这时就需要栈首先存入函数执行结束后的地址,函数执行结束后将结果值读取并设定到程序计数器中对应的地址上.函数执行完全在栈中完成即可.

![函数与计数器-栈](https://img0.baidu.com/it/u=3382044954,2575628411&fm=253&fmt=auto&app=138&f=PNG?w=635&h=479)

- 基址寄存器和变址寄存器与数组

通过基址寄存器和变址寄存器将内存上特点的区域划分,实现数组的功能.基址寄存器相当于数组的起始角标,变址寄存器相当于索引,两个地址组合即可获取到对象的实际存储位置.

机器语言指令类型和功能:    

> 数据转送指令：寄存器和内存、内存核内存、寄存器和外围设置之间的数据读写操作    
运算指令：用累加寄存器执行算术运算、逻辑运算、比较运算、移位运算    
跳转指令：实现条件分支、循环、强制跳转等    
call/return指令：函数的调用/返回调用前的地址    


### 二进制

1 32位是几个字节    
2 二进制数 01011100 转换成十进制是多少    
3 二进制数 00001111 左移两位后,变成原来的几倍    
4 补码形式表示的8位二进制数 11111111 , 用十进制表示是多少    
5 补码形式的8位二进制数 10101010,用16位二进制数表示是多少    
6 反转部分图形模式时,使用的是什么逻辑运算
7 为什么用二进制表示数据    
8 -1如何用二进制表示 

计算机内部由集成电路IC构成.IC的引脚只有直流电压0V,5V两种状态.这个特性决定了计算机的信息数据使用二进制表示非常吻合.IC引脚的状态就表示为二进制的0,1,11...    
计算机的最小单位--位(bit:binary digit),相当于二进制中的一位.二进制的位数一般是8的倍数,因为计算机所处理的信息的基本单位是8位二进制数.8位二进制被称为一个字节(byte).    
字节是最基本的信息计量单位.位是最小单位,字节是基本单位.    
字节单位处理数据时,若数据小于存储数据的字节数,高位用0填补.如:1011,用8位表示为00001011,16位表示0000000000001011.当然还有32位,64位....      
二进制数可以表示任意数据,可以是数字,文字,图片,视频等.

- 二进制数

进制数=SUM(数值*位权)
位权=基数^(位数-1)
 
如十进制数39,它的基数为10,几进制它的基数就是几.    
即: 39=3*10^(2-1)+9*10^(1-1)=3*10+9*1

所以二进制1011=1*2^(4-1)+0*2^(3-1)+1*2^(2-1)+1*2^(1-1)=2^3+0+2^1+2^0=11

移位运算相当于乘除运算.左移(向高位移)<<相当于乘法运算,右移(向低位移)>>相当于除法运算.所以溢出位直接被舍弃    
左移空出低位补0;右移空出高位,需要根据右移运算规则判断.

二进制中使用加法来进行减法运算.
负数: 二进制的补数.核心法则:正数+负数=0    
补数: 正数来表示负数.二进制数取反+1.    
所以00000001表示1,-1的二进制数为: 1取反->11111110+1=11111111,而不是直观上的10000001.    
因为:1+(-1)=0而 00000001 +10000001=10000010 = -126 != 0 
正确的是: 1+(-1)=00000001 + 11111111 = 100000000 溢出首位舍弃则为 00000000 

由于所有的减法是通过加法实现.所以3-5=3+(-5)
即:     
3= 00000011
5= 00000101 5取反+1 -> 11111010 + 00000001 = 11111011
最终等于: 00000011+11111011=11111110=-2

-2的补数为-2取反+1=00000001+1=00000010

同样的位数包含符号位与不包含符号位数据量相同,但是取值范围不同.如short(float)类型能表示2^16=65536个值.其中unsigned short取值范围为0-65535,short类型取值范围为:-32768-32767.因为最高为1的表示负数,所以0归到了正数中.整个数值总数为2的偶数倍.

- 右移运算规则    
逻辑右移:高位填0.如 11111100,逻辑右移两位为: 00111111=63    
算术右移:高位不变.负数高位填1,正数高位填0.如:11111100,算术运算两位为: 11111111=-1

> 问题: 11111100算术右移5位是多少?计算器中无法计算算术右移后小于-1的值

符号扩充: 正数高位补0,负数高位补1.8位二进制数 00001111 扩充为16位二进制数为: 00000000 00001111 

- 逻辑运算

将二进制数作四则运算的数值为算术.像图形模式将数值作0,1的罗列为逻辑.    
算术运算:加减乘除    
逻辑运算:逻辑非NOT,逻辑与AND,逻辑或OR,逻辑异或XOR

逻辑非:0变1,1变0的取反操作;    
逻辑与:两个值都是1则为1,否则为0    
逻辑或:只要有一个1即为1    
逻辑异或: 排斥相同数值的运算.一方为1,一方为0,结果为1,否则都是0

二进制数:0为假(false),1为真(true)


### 小数运算

1 二进制数0.1,用十进制表示的话是多少    
2 用小数点后有三位的二进制数,能表示十进制数0.625吗    
3 将小数分为符号,尾数,基数,指数4部分进行表现的形式称为什么    
4 二进制数的基数是多少    
5 把0作为数值范围的中间值,而不是用符号位的情况来表示负数的表示方法称为什么    
6 10101100.01010011用十六进制数表示是多少    

### 小数

二进制小数和整数的计算规则一样都等于: 基数*位权

如:二进制转十进制 1011.0011 = 1*2^3+0*2^2+1*2^1+1*2^0+0*2^-1+0*2^-2+1*2^-3+1*2^-4=1*8+0*4+1*2+1*1+0*0.5+0*0.25+1*0.125+1*0.0625=11.1875


![二进制四位小数转十进制](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic3.zhimg.com%2Fv2-d5313d5427f04a17974b040992310c9a_b.jpg&refer=http%3A%2F%2Fpic3.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1663462882&t=309ba6b783cae0b65645ed5966ee506b)

由于二进制和十进制由于循环小数以及精度的限制,无法完全相等,计算机只能通过截断或四舍五入,这样就造成了计算机运算错误.

- 浮点数

浮点数: 像0.12345*10^3和0.12345*10^-1这样使用与实际小数点位置不同的书写方法来表示小数的形式.与其相对的是定点数.    
定点数: 小数的小数点的实际位置固定不变.如:123.45,0.012345.

程序中使用双精度浮点数,单精度浮点数来表示小数.双精度浮点数类型使用64位,单精度浮点数使用32位表示所有小数.

浮点数使用符号,尾数,基数,指数四部分表示小数.因为计算机使用二进制表示数据,所以基数为2.所以符号,尾数,指数三部分可以表示浮点数       

![浮点数公式](http://image.bubuko.com/info/201707/20180110235911806090.png)    
![浮点数](https://pic3.zhimg.com/80/v2-603331d7d99b75a7b5dea8fe96259172_720w.jpg)


符号:0为正,1为负.数值大小用尾数和指数表示    
尾数部分:使用正则表达式表示.正则表达式:按照特定的规则来表示数据的形式.为了统一数据表示形式,避免表示形式太多    
如:
> 十进制浮点数遵循: 小数点前面是0,小数点后面第一位不能是0;0.75=0.75*10^0    
> 二进制浮点数遵循: 小数点前面是1.小数要进行逻辑移位.    

![单精度浮点数表示](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimage.bubuko.com%2Finfo%2F201707%2F20180110235911810973.png&refer=http%3A%2F%2Fimage.bubuko.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1663554115&t=7eaea8dde17bbf74074da078c82e3f0a)

浮点数中移位后第一位会被省略,实际浮点数可以表示24的数值.



计算机是进行数据处理的设备;程序是处理顺序和数据结构;     

- 内存的物理机制

内存IC有电源,地址信号,数据信号,控制信号等用于输入输出的大量引脚,通过为其指定地址读写数据.    
VCC和GND是电源;+5V的直流电压表示1,0V表示0    
A0-A9:是地址信号引脚    
D0-D7:数据信号引脚    
RD,WR:控制信号引脚.两者都为0时,写入和读出操作都无法进行    

![虚拟内存IC](https://tse1-mm.cn.bing.net/th/id/OIP-C.GcfUCfLbBYJQP59a8Nm6LQHaEt?pid=ImgDet&rs=1)

10位内存IC存储数据情况:    
数据信号引脚D0-D7: 共八个一次输入输出8位(1byte).这也是byte是最基本的数据单位的原因吧    
地址信号引脚A0-A9:共10个,0000000000-1111111111共1024个地址.     
所以该内存IC可以存储1024个1字节数据.故该内存容量是1kB(1024).一个内存IC可以存储数10M字节数据,512M内存它通过组合多个内存IC实现    

![向内存IC中写入和读出数据的方法](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.it610.com%2Fimage%2Finfo10%2F2406f5336edc41be9539711d9ef73f94.jpg&refer=http%3A%2F%2Fimg.it610.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1663590512&t=627363a7ce134d55da62da3607f4ec53)

简单来说,内存的物理机制就是内存IC内部有大量可以存储8位数据的地方,通过地址指定这些场所,即可进行数据读写.

- 物理内存逻辑模型

内存逻辑模型由地址(A0-A9)组成,它类似于楼房,每一层是一个地址编号,用于存储一字节的数据(D0-D7).    
编程语言中还有数据类型的概念,用于约定内存占用大小.数据操作时不同的数据类型,会读写不同大小的内存地址.同时编程语言的变量用于简化内存分配流程,它将实际的内存地址指定交友操作系统完成,和数据类型共同决定分配内存的地址.    

不同类型的变量赋值:    
> char a = 123;
float b =123;
long c =123;

虽然同样是值123,但是三个变量的内存占用大小分别为:1byte,2byte,4byte;实际的内存分配如下:    
![](https://tse2-mm.cn.bing.net/th/id/OIP-C.DY7O_IvSJU2vGartL4dNeAHaE_?pid=ImgDet&rs=1)

这种预分配的方式虽然存在部分资源浪费,但简化了数据的读取,效率更高.


- 指针

指针是一种变量,表示存储数据的内存地址.地址指向数据,指针指向地址(地址的地址).通过指针可以对任意地址的数据进行读写.    
定义指针时通常在变量前加星号*(Java中没有指针的概念,它由虚拟机来统一管理,进一步傻瓜式编程).

c语言指针定义:    
> char *d;
long *f

指针变量指定内存地址,数据类型来定义读取内存大小,实现内存数据的读取.因为一个内存地址可能存储了多个内存地址(32位,64位).

#### 内存与数据结构

- 数组

数组: 多个同数据类型的数据在内存中连续排列的形式.作为数组元素的各个数据会通过连续的编号被区分开,这个编号称为索引.指定索引即可通过编译器自动找到内存地址,实现数据的读写.    
char g[10]; 这是定义一个容量为10,存储char类型数据(1byte)的数组.    
数组是使用内存的基本,其他数据类型都要在数组上使用内存.因为数组和内存的物理构造是一样的.特别是1byte类型的数组,它和内存的物理构造完全一致.而数据类型让内存的存取方式更灵活.

- 栈,队列,环形缓冲区

栈和队列简化数据的读取方式,它不需要指定地址和索引.两者区别是数据的出入顺序不同.    
栈:LIFO;队列:FIFO.由于数据的顺序在放入时已确定,读取时直接取就可以,不需要再指定地址.    
栈适合存储临时数据,数据恢复;    
队列适合协调数据输入和处理时间的关系,如排队,通讯.

队列一般以环状缓冲区(ring buffer)方式实现.从数组起始位置写入,按存储顺序读出,在数组的末尾写入数据后,后一个数据会写到数组起始位置(可能会覆盖,也可能已经被读出后空闲).这样数组的首尾连接,数据的写入和读出就循环起来了.

- 链表与二叉树

链表和二叉树都不需要考虑索引顺序就可对数组元素进行读写.由于非强制连续,它可以更高效的对数组元素新增和删除,但查询效率较低;二叉树则更高效的查询,新增和删除效率较低.    
链表: 在数组的元素中,除了数据的值外,附带上下元素索引的数据结构.通过索引指向进行数据的逻辑删除.实际数据删除由其他机制或程序处理.    
数据越多,数组的新增和删除操作(保证数据连续)的成本越高.链表就避免了这种操作.

二叉树: 在链表的基础上增删数组元素时,考虑数据大小关系,将其分成左右两个方向表现形式的逻辑结构.增删时数据分类,大的放右边,小的放左边.    
通过数据预分类,在查询时不需要从数组的头部开始,而是从根部比较当前值和目标大小即可,当前值小向右找,当前值大向左找.


### 内存与磁盘

1. 存储程序方式指什么
2. 通过使用内存来提高磁盘访问速度的方式称为什么
3. 把磁盘一部分当内存用的机制是什么
4. windows中,程序运行时,存储着动态加载调用函数的数据文件称为什么
5. exe程序中,静态加载函数的方式称为什么
6. windows中,一般磁盘的一个扇区多少字节

磁盘和内存都属于计算机五大部件中的存储器.磁盘利用磁效应实现存储,且容量大;内存利用电流实现存储,容量小.    
内存主要指主内存,负责存储CPU中运行的程序指令和数据的内存.磁盘主要值硬盘

存储程序方式(程序内置方式): 程序保存在存储设备中,通过有序地被读出来实现运行.    
计算机中主要存储部件是内存和磁盘.磁盘中存储的程序不能直接运行,必须要加载到内存后才能被CPU运行.因为CPU解析和运行程序,通过内部程序计数器来指定内存地址,然后才读出程序.核心是为了避免CPU的
读写效率被磁盘的低效拖累.

磁盘缓存: 把从磁盘读出的数据存储到内存空间中的方式.缓存的价值是把低速设备数据保存到高速设备中,使用时从高速设备中读出.如web浏览器从网络读取数据比磁盘慢,可以将数据缓存到磁盘来提速.    
虚拟内存: 把磁盘当成内存的一部分使用.它是一种假想内存,实际运行的程序它必须在内存中,所以虚拟内存会把实际内存(物理内存)的内存,置换(swap,转存)到虚拟内存中.当内存不足时,可以通过虚拟内存运行程序.    
虚拟内存的方法: 分页式和分段式,用于映射虚拟地址和物理地址    
分页式: 不考虑程序构造的情况下, 把运行的程序按照一定大小的页进行分割,并以页为单位在内存和磁盘间进行置换.磁盘读入到内存称为Page In,内存写入磁盘称为Page Out.常用于windows中,大小为4KB.虚拟内存在磁盘的存储文件为页文件(page file).windows自动管理,大小是内存大小的1到2倍.    
分段式: 内存分段是根据程序的逻辑角度，分成了栈段、堆段、数据段、代码段等，这样可以分离出不同属性的段，同时是一块连续的空间。但是每个段的大小都不是统一的，这就会导致内存碎片和内存交换效率低的问题。    

- 节约内存
 
1 通过DLL文件实现函数共用    
2 将栈清理处理由调用方改为被调用方.c语言使用_stdcal.这个和语言特性有关系    

- 磁盘

磁盘的物理结构是指磁盘存储数据的形式.磁盘通过把其物理表面划分成多个空间来使用的.    
划分空间方式: 扇区方式,可变长方式.扇区方式将磁盘划分为固定长度的空间;可变长方式把磁盘划分为长度可变的空间    
扇区方式中把磁盘表面分成若干同心圆的空间就是磁道.把磁道按照固定大小划分成的空间就是扇区.    
扇区是对磁盘进行物理读写的最小单位.windows中使用的磁盘,一般1扇区是512字节.但windows逻辑上对磁盘读写的单位是扇区整数倍-簇.1簇可以512字节,1KB,2KB...32KB.磁盘容量越大,簇的容量也越大.    
不同文件不能存储在同一个簇中,否则有一方文件无法删除.因此,不管多小的文件都会占用1簇空间.


### 数据压缩

1. 文件存储的基本单位是什么
2. doc,lzh,txt哪个是压缩文件的扩展名
3. 文件内容用"数据的值*循环次数"表示压缩方法是什么
4. windows中shift jis字符编码中,1个半角英数用几个字节表示
5. BMP(BITMAP)格式的图形文件被压缩过吗
6. 可逆压缩和非可逆压缩的区别?










