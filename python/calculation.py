def to_multiply(num):
 print("multiply")
 print(num*num)
to_multiply(5)
class computer:
 def __check__(self):
     print("check is called")
 def __init__(self,ram,hardisk):
  print("init called")
  self.ram=ram
  self.hardisk=hardisk
 def config(self):
  print("Computer configuration")
  print(self.ram, self.hardisk)

comp=computer("16GB","80GB")
comp1=computer("8GB","30GB")

comp.config()
comp1.config()


#function creation
def to_add(number1,number2):
    print("code is in calculation module")
    print(number1+number2)
    return number1+number2
to_add(1,2) 