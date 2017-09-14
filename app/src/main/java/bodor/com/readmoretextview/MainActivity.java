package bodor.com.readmoretextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.borjabravo.readmoretextview.ReadMoreTextView;

public class MainActivity extends AppCompatActivity {
    private ReadMoreTextView readMoreTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readMoreTextView = (ReadMoreTextView) findViewById(R.id.readmore);
        readMoreTextView.setText("习近平在贺辞中指出，教育是国家发展进步的重要推动力，也是促进各国人民交流合作的重要纽带。近年来，中俄教育合作深入发展，两国高等院校交流更加密切，为增进两国和两国人民相互了解和友谊、推动中俄全面战略协作伙伴关系高水平发展发挥了积极作用。中俄联合创办深圳北理莫斯科大学是我和普京总统达成的重要共识，也是两国人文合作深入发展的重要成果，具有重要示范意义\n");
    }
}
