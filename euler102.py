file = open('file.txt', 'r');
lines = []
triangles = []
ans = 0

#read file and separate lines
for line in file:
	line = line.replace('\n', '')
	lines.append(line)

#separate all the numbers in a line into arrays of points and triangles
for line in lines:
	nums = line.split(',')
	coords = []
	for i in range(0, len(nums), 2):
		coord = []
		coord.append(int(nums[i]))
		coord.append(int(nums[i+1]))
		coords.append(coord)
	triangles.append(coords)

#function that checks if a triangle contains (0,0)
def containsOrigin(triangle):
	p1 = triangle[0]
	p2 = triangle[1]
	p3 = triangle[2]
	alpha = ((p2[1] - p3[1])*(0 - p3[0]) + (p3[0] - p2[0])*(0 - p3[1])) / ((p2[1] - p3[1])*(p1[0] - p3[0]) + (p3[0] - p2[0])*(p1[1] - p3[1]));
	beta  =  ((p3[1] - p1[1])*(0 - p3[0]) + (p1[0] - p3[0])*(0 - p3[1])) / ((p2[1] - p3[1])*(p1[0] - p3[0]) + (p3[0] - p2[0])*(p1[1] - p3[1]));
	gamma = 1.0- alpha - beta

	if(alpha > 0 and beta > 0 and gamma > 0):
		return True

	return False

#solve
for triangle in triangles:
	if(containsOrigin(triangle)):
		ans += 1


print(ans)