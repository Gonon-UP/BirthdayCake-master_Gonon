package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeModel newCakeModel;
    private CakeView newCakeView;


    public CakeController(CakeView _CakeView) {
        this.newCakeView = _CakeView;
        this.newCakeModel = _CakeView.getCakeModel();
    }

    // Button Event
    public void onClick(View v) {
        Log.d("Button", "Confirmed");
        newCakeModel.setLit(false);
        newCakeView.invalidate();
    }


    // Candles Switch
    public void onCheckedChanged(CompoundButton _compoundButton, boolean isChecked) {
        Log.d("Switch", "Yes");
        newCakeModel.setHasCandles(isChecked);
        newCakeView.invalidate();
    }

    // SeekBar
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("Seekbar", "It works");
        newCakeModel.setNumCandles(progress);
        newCakeView.invalidate();

    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}

//    @Override
//    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//        newCakeModel.setNumCandles(progress);
//        newCakeView.invalidate();
//    }

//    @Override
//    public void onStartTrackingTouch(SeekBar seekBar) {
//
//    }
//
//    @Override
//    public void onStopTrackingTouch(SeekBar seekBar) {

