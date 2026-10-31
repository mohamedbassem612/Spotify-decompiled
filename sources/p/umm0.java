package p;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class umm0 {
    public static final umm0 a = new umm0();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }
}
