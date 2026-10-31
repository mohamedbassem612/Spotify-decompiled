package p;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zab1 implements wjh0 {
    public final rdd1 a;
    public boolean b;
    public long c;
    public long d;
    public k2u0 e = k2u0.d;

    public zab1(rdd1 rdd1Var) {
        this.a = rdd1Var;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.a.getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.a.getClass();
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    @Override // p.wjh0
    public final k2u0 l() {
        return this.e;
    }

    @Override // p.wjh0
    public final void m(k2u0 k2u0Var) {
        if (this.b) {
            a(p());
        }
        this.e = k2u0Var;
    }

    @Override // p.wjh0
    public final long p() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        k2u0 k2u0Var = this.e;
        return (k2u0Var.a == 1.0f ? zoi1.W(jElapsedRealtime) : k2u0Var.a(jElapsedRealtime)) + j;
    }
}
