#include<stdio.h>
#include<math.h>

int main() {
	long long request, number_of_requests;
	double max;
	scanf("%lld %lf", &number_of_requests, &max);
	int a[number_of_requests];
	int count = 0;
	for (; count < max; count++) {
		scanf("%lld", &request);
		a[count] = request;
		number_of_requests--;
	}
	count--;
	outerloop: while (number_of_requests > 0) {
		scanf("%lld", &request);
		for (int j = 0; j <= count; j++) {
			if (request >= (a[j] + 1000)) {
				a[j] = request;
				number_of_requests--;
				goto outerloop;
			}
		}
		count = count + 1;
		a[count] = request;
		number_of_requests--;
	}
	printf("%d", (int) ceil((count + 1) / max));
	return 0;
}
