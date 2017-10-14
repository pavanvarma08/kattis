#include <stdio.h>
#include <string.h>

int main() {
	int number_of_lines;
	int i, j, p;
	int x;
	scanf("%d", &number_of_lines);
	char a[20], b[20],*temp;
	char *colors[number_of_lines];
	int r[number_of_lines];
	for (i = 0; i < number_of_lines; i++) {
		scanf("%s %s", &a, &b);
		if (a[0] >= 97 && a[0] <= 122) {
			colors[i] = a;
			r[i] = getInteger(b);
		} else {
			colors[i] = b;
			r[i] = getInteger(a) / 2;
		}
	}
	for (i = 0; i < number_of_lines; i++) {
		for (j = i + 1; j < number_of_lines; j++) {
			if (r[i] > r[j]) {
				p = r[i];
				temp = colors[i];
				r[i] = r[j];
				colors[i] = colors[j];
				r[j] = temp;
				colors[j] = a;
			}
		}
	}

	for (i = 0; i < number_of_lines; i++) {
		printf("\n%d - - %s", r[i], colors[i]);
	}
	return 0;
}
int getInteger(char *integer) {
	int len = strlen(integer);
	int i, result = 0;
	for (i = 0; i < len; i++) {
		result = result * 10 + (integer[i] - '0');
	}
	return result;
}
