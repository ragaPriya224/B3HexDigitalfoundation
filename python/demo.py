import calculation

print("hello user")
mark = 10

print(mark)
print(type(mark))
mark = 'team'
print(mark)
print(type(mark))
mark = 10
print(mark)
print(type(mark))
#strings
print("string demo")
name = "data"
print(type(name))
name = 'keyboard'
print(type(name))
name = '''mouse'''
print(type(name))

#usage of + concatenation of string
name = "coding"
print(name + "world")

#usage of * for repetition
subject = " coding "
print(subject * 3)

#list demo
num_list = [1,'hello',3,2]
print(type(num_list))

#tupdemo
tup = (5,3,2,1)
print(type(tup))

#setdemo
set = {5,3,2,1}
print(type(set))
print(set)

#if demo
num = 15
# only if
if num > 25:
 print("Hurray! {} is greater than25".format(num))
else:
    print("lesser")

#for loop demo

words = ['mac', 'window','linux']
for w in words:
 print(w, len(w))
#while loop demo

count = 0
while count < 5:
    print(count)
    count += 1

#input demo
# name = input("enter name")
# print("username is : " +name)
# id = input("enter id")
# print("emp id is:"+id)

#concat string
print('hello'+'user')
# print('hello'+4) #note can't concat string with other data types




calculation.to_add(4,5)
