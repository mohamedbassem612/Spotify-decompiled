package p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ts50 implements n8r0 {
    public final yqg a;
    public long b;
    public final Vibrator c;

    public ts50(Context context, yqg yqgVar) {
        this.a = yqgVar;
        this.c = mb4.u(context);
    }

    public final void a(o8r0 o8r0Var) {
        VibrationEffect vibrationEffectCreateOneShot;
        VibrationEffect vibrationEffectCreatePredefined;
        Vibrator vibrator = this.c;
        if (vibrator == null) {
            return;
        }
        o8r0 o8r0Var2 = o8r0.b;
        yqg yqgVar = this.a;
        if (o8r0Var == o8r0Var2 || yqgVar.b() - this.b >= 500) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                int iOrdinal = o8r0Var.ordinal();
                if (iOrdinal == 0) {
                    vibrationEffectCreatePredefined = VibrationEffect.createPredefined(5);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    vibrationEffectCreatePredefined = VibrationEffect.createPredefined(1);
                }
                vibrationEffectCreatePredefined.getClass();
                vibrator.vibrate(vibrationEffectCreatePredefined);
            } else if (i >= 26) {
                int iOrdinal2 = o8r0Var.ordinal();
                if (iOrdinal2 == 0) {
                    vibrationEffectCreateOneShot = VibrationEffect.createOneShot(30L, 180);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return;
                    }
                    vibrationEffectCreateOneShot = VibrationEffect.createWaveform(new long[]{0, 30, 80, 30}, new int[]{0, 255, 0, 255}, -1);
                }
                vibrator.vibrate(vibrationEffectCreateOneShot);
            } else {
                int iOrdinal3 = o8r0Var.ordinal();
                if (iOrdinal3 == 0) {
                    vibrator.vibrate(30L);
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return;
                    }
                    vibrator.vibrate(new long[]{0, 30, 80, 30}, -1);
                }
            }
            this.b = yqgVar.b();
        }
    }
}
