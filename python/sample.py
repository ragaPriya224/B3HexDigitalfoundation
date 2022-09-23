class Customer:
def __init__(self,name):
  self.name=name
 def Details(self):
  print("Customer information.....")
class Order(Customer):
 def __init__(self,ordername):
  super().__init__("Vimala")
  self.ordername=ordername
 def Details(self):
  print("Order details!!!!!!")
  print(self.name,self.ordername)
ord=Order("Watch")
ord.Details()