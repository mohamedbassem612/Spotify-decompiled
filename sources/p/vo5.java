package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vo5 implements o5s {
    public boolean b;
    public final Handler d;
    public volatile boolean e;
    public final acn1 a = new acn1();
    public final hn5 c = new hn5();

    public vo5() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = handler;
        this.e = true;
        g54 g54Var = new g54(this, (byte) 1);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            g54Var.run();
        } else {
            handler.post(g54Var);
        }
    }

    public final void onStart(iac0 iac0Var) {
        if (this.b) {
            this.c.a++;
            return;
        }
        this.b = true;
        if (this.e) {
            return;
        }
        this.c.a++;
    }

    public final void onStop(iac0 iac0Var) {
    }
}
