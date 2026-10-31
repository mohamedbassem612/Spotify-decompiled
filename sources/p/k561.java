package p;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k561 extends OrientationEventListener {
    public final boolean a;
    public final PublishProcessor b;

    public k561(Context context) {
        super(context);
        this.a = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
        this.b = new PublishProcessor();
    }

    public static boolean a(int i, int i2) {
        return 180 - Math.abs(Math.abs(i - i2) + (-180)) <= 15;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        pqq0 pqq0Var;
        if (!this.a || i == -1) {
            return;
        }
        if (a(i, 0)) {
            pqq0Var = pqq0.a;
        } else {
            pqq0Var = (a(i, 90) || a(i, 270)) ? pqq0.b : null;
        }
        if (pqq0Var != null) {
            this.b.onNext(pqq0Var);
        }
    }
}
