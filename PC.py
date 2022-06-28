class PC:
    def __init__(self):
        self.mutex=1
        self.full=0
        self.empty=10
        self.x=0
    def producer(self):
        self.mutex-=1
        self.full+=1
        self.empty-=1
        self.x+=1
        print("producer produce item ",self.x)
        self.mutex+=1
    def consumer(self):
        self.mutex-=1
        self.full-=1
        self.empty+=1
        print("producer produce item ",self.x)
        self.x-=1
        self.mutex+=1
    def procon(self):
        print("1.Press 1 to produce\n2.press 2 to consume\n3.press 3 to exit")
        while True:
            n=int(input("Enter your choise: "))
            if n==1:
                if self.mutex==1 and self.empty!=0:
                    ob.producer()
                else:
                    print("Full")
            elif n==2:
                if self.mutex==1 and self.full!=0:
                    ob.consumer()
                else:
                    print("Empty")
            elif n==3:
                break
if __name__=='__main__':
    ob=PC()
    ob.procon()