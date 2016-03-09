# DatePicker
从底部弹出的日期选择器
![Alt text](/1457534764216.gif)

###使用
  把整个项目git clone后，把关键代码复制到工程中，注意资源文件的复制
  初始化选择器：
   DatePickerView pickerView=new DatePickerView(MainActivity.this, new DatePickerView.DatePickerListener() {
            @Override
            public void dateChange(String string) {
                text.setText(string);
            }

            @Override
            public void finish(String string) {
                text.setText(string);

            }
        });
        pickerView.setFromYearAndToYear(1900,2016);//可选设置最大最小年
        pickerView.initDate(2016,3,9);//初始化当前的日期，默认是当前
        pickerView.show();//展示出来
        
####效果
  从底部弹出，点击 完成 关闭选择器，并调用finish方法，滑动停止后调用dateChange方法，具体细节可以修改源码
