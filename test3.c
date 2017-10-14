#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
	int number_of_lines;
	int temp1 = 0;
	int i = 0,j=0;
	char a[20], b[20];
	char temp[20];
	scanf("%d", &number_of_lines);
		char color[number_of_lines][20];
		int radius[number_of_lines];
		for (i; i < number_of_lines; i++) {
			if (scanf("%s %s", &a, &b) == 2) {
				if (a[0] >= 97 && a[0] <= 122) {
					strcpy(color[i], a);
					radius[i] = atoi(b);
				} else {
					radius[i] = atoi(a) / 2;
					strcpy(color[i], b);
				}
			} else {
				return EXIT_FAILURE;
			}
		}
		for (i = 0; i < number_of_lines; i++) {
			for (j = i + 1; j < number_of_lines; j++) {
				
				if (radius[i] > radius[j]) {
					temp1 = radius[i];
					strcpy(temp, color[i]);
					radius[i] = radius[j];
					strcpy(color[i], color[j]);
					radius[j] = temp1;
					strcpy(color[j], temp);
				}
			}
		}
		for (i = 0; i < number_of_lines; i++) {
			printf("%s\n", color[i]);
		}
	return EXIT_SUCCESS;
}

