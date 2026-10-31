package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j170 implements c291 {
    public final jf30 a;
    public boolean b;
    public final /* synthetic */ n170 c;

    public j170(n170 n170Var) {
        this.c = n170Var;
        this.a = new jf30(((df01) n170Var.c.d).a.l());
    }

    public final void B0(nac nacVar, long j) {
        if (this.b) {
            eg.m("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        df01 df01Var = (df01) this.c.c.d;
        if (df01Var.c) {
            eg.m("closed");
            return;
        }
        df01Var.b.T(j);
        df01Var.a();
        df01Var.Q("\r\n");
        df01Var.B0(nacVar, j);
        df01Var.Q("\r\n");
    }

    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((df01) this.c.c.d).Q("0\r\n\r\n");
        jf30 jf30Var = this.a;
        gve1 gve1Var = jf30Var.e;
        jf30Var.e = gve1.d;
        gve1Var.a();
        gve1Var.b();
        this.c.d = (byte) 3;
    }

    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((df01) this.c.c.d).flush();
    }

    public final gve1 l() {
        return this.a;
    }
}
