L = ['Hello', 'Colin', 18,'IBM', 'UVa']
L1 = []
[L1.append(l) for l in L if isinstance(l,str)]
L2 = [s.lower() for s in L if isinstance(s,str)]


print(L1)