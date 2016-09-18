L = ['Hello WorlD', 'APPLE', 'IBM', 18,'Colin']
k = []
k2 = []
for e in L:
    if isinstance(e,str):
        k.append(e)
    else:
        k2.append(e)
b = [s.lower() for s in k]
L2 = b+k2
print(L2)
