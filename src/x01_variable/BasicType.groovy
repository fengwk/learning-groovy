package x01_variable

// groovy中没有真正的基本类型，使用的都是包装类型

byte byte_type = 1
printf "byte_type class is %s \n", byte_type.class

short short_type = 1
printf "short_type class is %s \n", short_type.class

int int_type = 1
printf "int_type class is %s \n", int_type.class

long long_type = 1L
printf "long_type class is %s \n", long_type.class

float float_type = 1f
printf "float_type class is %s \n", float_type.class

double double_type = 1d
printf "double_type class is %s \n", double_type.class

char char_type = "a"
printf "char_type class is %s\n", char_type.class

boolean boolean_type = true
printf "boolean_type class is %s \n", boolean_type.class