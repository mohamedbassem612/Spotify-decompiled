package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yun1 implements Runnable {
    public final yyn1 a;
    public final gyn1 b;

    public yun1(yyn1 yyn1Var, gyn1 gyn1Var) {
        this.a = yyn1Var;
        this.b = gyn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        gyn1 gyn1Var = this.b;
        if (nvn1.g.V(this.a, this, yyn1.h(gyn1Var))) {
            yyn1.j(this.a);
        }
    }
}
