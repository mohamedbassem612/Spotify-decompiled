package p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ys50 {
    public final Context a;
    public final Vibrator b;
    public final c380 c;
    public xab1 d;
    public int e;
    public int f = 2;

    public ys50(Context context, Vibrator vibrator, c380 c380Var) {
        this.a = context;
        this.b = vibrator;
        this.c = c380Var;
    }

    public final void a(c9n c9nVar) {
        int i;
        Vibrator vibrator;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c380 c380Var = this.c;
        if (c380Var.isEmpty()) {
            return;
        }
        xab1 xab1Var = this.d;
        if ((xab1Var != null && xab1Var.isActive()) || (i = this.f) == 1 || i == 3 || (vibrator = this.b) == null || Settings.System.getInt(this.a.getContentResolver(), "haptic_feedback_enabled", 1) != 1) {
            return;
        }
        this.f = 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = this.e;
        List<zs50> listK0 = o7h.k0(c380Var, i2);
        for (zs50 zs50Var : listK0) {
            arrayList.add(Long.valueOf(zs50Var.b));
            arrayList2.add(Integer.valueOf(yoi1.p((int) (zs50Var.c * 255.0f), 0, 255)));
        }
        if (listK0.isEmpty()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createWaveform(o7h.m1(arrayList), o7h.k1(arrayList2), -1));
        this.d = fn31.T(c9nVar, (o8n) null, 0, new xs50(this, listK0, i2, null), 3);
    }
}
