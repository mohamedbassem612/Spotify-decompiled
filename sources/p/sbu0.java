package p;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sbu0 {
    public final rbu0 a;
    public final ip00 b;
    public final sqe1 c;
    public short d;
    public Object e;
    public Looper f;
    public final int g;
    public long h = -9223372036854775807L;
    public boolean i = true;
    public boolean j;
    public boolean k;

    public sbu0(ip00 ip00Var, rbu0 rbu0Var, sqe1 sqe1Var, int i, Looper looper) {
        this.b = ip00Var;
        this.a = rbu0Var;
        this.c = sqe1Var;
        this.f = looper;
        this.g = i;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        dm5.y(!this.j);
        if (this.h == -9223372036854775807L) {
            dm5.m(this.i);
        }
        this.j = true;
        ip00 ip00Var = this.b;
        if (!ip00Var.j1 && ip00Var.i.getThread().isAlive()) {
            ip00Var.g.c(14, this).b();
        } else {
            oon1.H("Ignoring messages sent after release.");
            a(false);
        }
    }

    public final void c(Object obj) {
        dm5.y(!this.j);
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        dm5.y(!this.j);
        this.d = i;
    }
}
