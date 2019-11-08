# Lookie_Android_Syudy

## 과제 목록

Ch3. EditText, ImageView + (hashmap, Toast)

ImageView 1개, TextView 1개, EditText 1개, Button 1개를 배치

TextView에는 현재 가지고 있는 이미지들의 이름 목록이 보여진다. EditText에 이미지 이름 입력 후 Button을 클릭 시 ImageView는 해당하는 이미지로 바뀐다. 만약 찾는 이미지가 없을 경우 Toast 메세지로 찾는 과일이 없음을 알려준다.

조건 : Hashmap 사용을 권장합니다.

Ch4. RecyclerView, Dialog

class file 3개 (main, student, studentAdapter) XML file 3개 (main, studentview, dialogview)

class main - (-) student - 학생의 정보(이름, 나이, 전공)을 담을 클래스 studentAdapter - main의 RecyclerView에 장착할 CustomAdapter

XML main - Button 1개, RecyclerView 1개 studentview - TextView 3개 (이름, 나이, 전공) dialogview - EditText 3개 (이름, 나이, 전공)

설명 : main화면의 Button 클릭 시 Dialog 보여진다. Dialog내에서 3개의 값 입력후 추가 버튼 클릭 시 main화면에 해당 학생정보가 추가되고 Dialog가 종료된다. 취소 버튼 클릭 시 아무런 동작없이 Dialog가 종료된다.

조건 : 학생 정보는 항상 리스트의 가장 위에 추가된다. Dialog의 editText값들이 채워지지 않은 경우는 고려하지 않는다. (예외처리 필요없음)