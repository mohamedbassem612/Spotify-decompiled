package p;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yen1 implements h8q0, d5q0, z1q0 {
    public final Object a = new Object();
    public final int b;
    public final hfp1 c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public yen1(int i, hfp1 hfp1Var) {
        this.b = i;
        this.c = hfp1Var;
    }

    public final void a() {
        int i = this.d;
        int i2 = this.e;
        int i3 = i + i2 + this.f;
        int i4 = this.b;
        if (i3 == i4) {
            Exception exc = this.g;
            hfp1 hfp1Var = this.c;
            if (exc == null) {
                if (this.h) {
                    hfp1Var.s();
                    return;
                } else {
                    hfp1Var.r((Object) null);
                    return;
                }
            }
            hfp1Var.q(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.g));
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    public final void i(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
