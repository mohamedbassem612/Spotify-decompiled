package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fnd0 implements pnc1, rjp0 {
    public final gnc1 a;
    public final ymd0 b;
    public volatile boolean c;
    public boolean d;
    public long e;
    public Object f;

    public fnd0(gnc1 gnc1Var, ymd0 ymd0Var) {
        this.a = gnc1Var;
        this.b = ymd0Var;
    }

    @Override // p.rjp0
    public final void b(Object obj) {
        if (this.c) {
            return;
        }
        if (this.e <= 0) {
            this.f = obj;
            return;
        }
        this.f = null;
        this.a.onNext(obj);
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            this.e = j - 1;
        }
    }

    public final void cancel() {
        if (this.c) {
            return;
        }
        this.c = true;
        q26.e().b(new an90(this, (byte) 5));
    }

    public final void request(long j) {
        if (this.c) {
            return;
        }
        q26.e().b(new g2s(this, j, (byte) 2));
    }
}
