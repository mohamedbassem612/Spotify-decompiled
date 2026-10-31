package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xar0 {
    public bbr0 a;
    public izm0 b;
    public an90 d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final kdn0 e = new kdn0((Object) null);

    public final shq0 a(bbr0 bbr0Var) {
        Runnable runnable = this.d;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        this.a = bbr0Var;
        izm0 izm0Var = this.b;
        if (izm0Var == null) {
            izm0Var = new izm0();
            this.b = izm0Var;
        }
        ((kdn0) izm0Var.b).m(bbr0Var);
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        this.e.m(obj);
        return new shq0(this, bbr0Var, (byte) 7);
    }
}
