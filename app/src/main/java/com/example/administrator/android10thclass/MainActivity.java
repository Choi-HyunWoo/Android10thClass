package com.example.administrator.android10thclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.android10thclass.ex1.Ex1Activity;

public class MainActivity extends AppCompatActivity {

    /** 160502 10주차

     Chapter 5 - 그래픽 (DAY 20~21)
     >> 공부좀 해야된다 이부분~~

     * 1. 빨간색 사각형 그리기 (동영상 Day20-01)
     * - 내가 그리는 뷰는 Custom View이므로 View를 상속받은 클래스를 만드는게 첫번째 할일이다.
     * - 그리는 작업은 특정 조건(터치...)을 만족 할 때, onDraw()라는 메소드가 호출되면서 수행된다.
     * - onTouch 메소드 내에 터치 이벤트를 처리하는 코드를 넣는다.
     * - 새로만든 뷰를 Activity에 추가한다.
      Java에서는 Graphics 라는 클래스를 사용하지만 바뀜 >> onDraw() 메소드의 Canvas와 Paint라는 객체를 이용하여 그리자


     * 2. 그래픽 그리기 (동영상 Day20-02)


     * 3. 그리기 객체로 만들어 그리기 <<< XXXXX 안함


     * 4. 비트맵 이미지 사용하기 (동영상 Day21-01 ~ 02)
       1) 더블버퍼링 개념
     Computer Architecture...
     [모니터]---[Video Memory] <원래는 여기에 그리지만>              [CPU]---[Memory] <여기서 그려서 버스로 전송한다.>
     PCI___________________________________<---BUS---_____________________________PCI

     *** 더블버퍼링의 이점
     45개의 점을 Video Memory에 찍는 경우, 버스가 45번 CPU >> Video memory로 전송
     버스는 말그대로 버스이므로 한번에 최대한 많은 양을 담고 보내는것이 이득
     Memory에 그려둔 후 Bus로 한번에 보내자.!
     동적인 여러 이미지를 빠르게 보여줄 수 있다.
    *** 더블버퍼링의 단점
     * 화면이 급격히 변화하지 않고 천천히 변화하는 경우 Memory상에 그려진 그림이 천천히 불려오므로 오히려 손해
     * 급격히 변하는 동적인 화면에서만 사용할 것,


     * 5. 페인트보드 만들기 (동영상 Day21-03)



     * 6. 서피스뷰 사용하기 << (다음주)


     <과제>
     페인트보드 >> 서피스뷰

     */

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn_ex1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ex1Activity.class));
            }
        });

    }
}
