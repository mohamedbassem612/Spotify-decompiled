package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lrw0 implements o5s {
    public final iac0 a;
    public vze1 b;

    public lrw0(iac0 iac0Var) {
        this.a = iac0Var;
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = sze1.a;
        an90 an90Var = new an90(this, (byte) 25);
        if (u890.j(Looper.getMainLooper(), Looper.myLooper())) {
            an90Var.run();
        } else {
            handler.post(an90Var);
        }
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        this.b = tze1.a;
    }
}
