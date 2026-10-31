package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gnd0 implements pnc1, rjp0 {
    public final gnc1 a;
    public final iac0 b;
    public final ymd0 c;
    public volatile boolean d;
    public boolean e;
    public long f;
    public Object g;

    public gnd0(gnc1 gnc1Var, iac0 iac0Var, ymd0 ymd0Var) {
        this.a = gnc1Var;
        this.b = iac0Var;
        this.c = ymd0Var;
    }

    public final void b(Object obj) {
        if (this.d) {
            return;
        }
        if (this.f <= 0) {
            this.g = obj;
            return;
        }
        this.g = null;
        this.a.onNext(obj);
        long j = this.f;
        if (j != Long.MAX_VALUE) {
            this.f = j - 1;
        }
    }

    public final void cancel() {
        if (this.d) {
            return;
        }
        this.d = true;
        q26.e().b(new gv40(this, (byte) 11));
    }

    public final void request(long j) {
        if (this.d) {
            return;
        }
        q26.e().b(new p38(this, j, (byte) 1));
    }
}
