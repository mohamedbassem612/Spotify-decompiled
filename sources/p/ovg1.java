package p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ovg1 {
    public final Context a;
    public final idd1 b = new idd1(new nvg1(this));

    public ovg1(Context context) {
        this.a = context;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            idd1 idd1Var = this.b;
            if (((Vibrator) idd1Var.getValue()).hasVibrator()) {
                ((Vibrator) idd1Var.getValue()).vibrate(VibrationEffect.createPredefined(2));
            }
        }
    }
}
