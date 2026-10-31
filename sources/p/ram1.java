package p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ram1 implements qam1 {
    public final View a;

    public ram1(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int iC = l1d.C(i);
        View view = this.a;
        if (iC == 0) {
            view.performHapticFeedback(6);
            return;
        }
        if (iC == 1) {
            if (Build.VERSION.SDK_INT >= 30) {
                view.performHapticFeedback(16);
                return;
            }
            return;
        }
        if (iC != 2) {
            if (iC != 3) {
                if (iC == 4) {
                    return;
                }
                eg.o();
                return;
            } else {
                if (Build.VERSION.SDK_INT >= 27) {
                    view.performHapticFeedback(9);
                    return;
                }
                return;
            }
        }
        Context context = view.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) != 1) {
            return;
        }
        Vibrator defaultVibrator = i2 >= 31 ? ((VibratorManager) context.getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) context.getSystemService("vibrator");
        defaultVibrator.getClass();
        defaultVibrator.vibrate(VibrationEffect.createPredefined(0));
    }
}
