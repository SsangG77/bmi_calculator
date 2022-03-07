키와 몸무게를 입력해서 나의 체질량 지수를 계산하는 어플을 만들었습니다.


Intent를 사용해서 작성한 키값과 몸무게값을 다음 액티비티로 넘겨서 BMI계산공식으로 계산한 값을 액티비티에 나타나게 합니다.

  val height = intent.getIntExtra("height",0)
        val weight = intent.getIntExtra("weight",0)

        val bmi = weight / (height / 100.0).pow(2.0)



그에 따라 나온 결과값을 해당하는 범위에 해당하는지 판단해서 액티비티에 나타나게 합니다.

  val resultText = when {
              bmi >= 30 -> "비만입니다."
              bmi >= 25 -> "과체중입니다."
              bmi >= 20 -> "정상입니다."
              else -> "저체중입니다."
          }

          result.text = bmi.toString()
          resultRange.text = resultText
