package p;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ar9 extends OrientationEventListener {
    public final ContentResolver a;
    public final dt71 b;

    public ar9(Context context) {
        super(context);
        this.a = context.getContentResolver();
        this.b = mgo1.e(0, 1, 2, 1);
    }

    public static boolean a(int i, int i2) {
        return 180 - Math.abs(Math.abs(i - i2) + (-180)) <= 15;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        kq9 kq9Var;
        if (i == -1 || Settings.System.getInt(this.a, "accelerometer_rotation", 0) != 1) {
            return;
        }
        if (a(i, 0)) {
            kq9Var = kq9.a;
        } else {
            kq9Var = (a(i, 90) || a(i, 270)) ? kq9.c : null;
        }
        if (kq9Var != null) {
            this.b.a(kq9Var);
        }
    }
}
