import math

#gen Prime Numbers
def get_primes(n):
    """sieveOfEratosthenes(n): return the list of the primes < n."""
    # Code from: <dickinsm@gmail.com>, Nov 30 2006
    # http://groups.google.com/group/comp.lang.python/msg/f1f10ced88c68c2d
    if n <= 2:
        return []
    sieve = list(range(3, n, 2))
    top = len(sieve)
    for si in sieve:
        if si:
            bottom = (si*si - 3) // 2
            if bottom >= top:
                break
            sieve[bottom::si] = [0] * -((bottom - top) // si)
    return [2] + [el for el in sieve if el]

pasc = [[1], [1,1]]
set = set()
set.add(1)
sfs = []
sum = 0

for i in range (2, 51):
	row = []
	row.append(1)

	for k in range(0, (len(pasc[i-1]))):
		nums = pasc[i-1]
		poss = 0
		if (k is (len(nums)-1)):
			row.append(nums[k])	
			set.add(nums[k])
		else:
			row.append(nums[k] + nums[k+1])
			set.add((nums[k] + nums[k+1]))
	pasc.append(row)


set = list(set)


for j in range(0, len(set)):
	num = set[j]
	pfs = []
	pfs = get_primes(math.ceil(math.sqrt(num)) + 1)
	#print(str(num) + str(pfs))
	#print(pfs)
	for h in range (0, len(pfs)):
		pf = pfs[h]
		#print(str(num) + "  " +  str (pf))
		if((num % (math.pow(pf, 2))) == 0):
			break
		elif(h == (len(pfs) - 1)):
			sfs.append(num)
			print(num)
			break


		


for p in range(len(sfs)):
	sum += sfs[p]

print(sum + 1)



