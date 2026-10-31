package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m170 extends i170 {
    public boolean e;

    public m170(n170 n170Var, l370 l370Var) {
        super(n170Var, l370Var);
    }

    public final long O0(nac nacVar, long j) {
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (((i170) this).c) {
            eg.m("closed");
            return 0L;
        }
        if (this.e) {
            return -1L;
        }
        long jO0 = super.O0(nacVar, j);
        if (jO0 != -1) {
            return jO0;
        }
        this.e = true;
        a(v360.b);
        return -1L;
    }

    public final void close() {
        if (((i170) this).c) {
            return;
        }
        if (!this.e) {
            a(n170.f);
        }
        ((i170) this).c = true;
    }
}
