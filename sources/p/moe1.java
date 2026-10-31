package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class moe1 implements p641 {
    public final p641 a;
    public final long b;

    public moe1(p641 p641Var, long j) {
        this.a = p641Var;
        this.b = j;
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        int iC = this.a.c(w2zVar, garVar, i);
        if (iC == -4) {
            garVar.f += this.b;
        }
        return iC;
    }

    public final void e() {
        this.a.e();
    }

    public final int getFlags() {
        return this.a.getFlags();
    }

    public final boolean isReady() {
        return this.a.isReady();
    }

    public final int s(long j) {
        return this.a.s(j - this.b);
    }
}
