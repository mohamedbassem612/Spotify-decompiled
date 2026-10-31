package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ao41 implements zn41 {
    public final qn41 a;
    public final qn41 b;

    public ao41(xm41 xm41Var) {
        fns fnsVar = igu.a;
        this.a = new qn41(xm41Var, b3s.c.M(1));
        this.b = new qn41(xm41Var, pyf0.a);
    }

    @Override // p.zn41
    public final void a(String str, iu30 iu30Var) {
        qn41 qn41Var = this.a;
        c921.y(qn41Var.b, (o8n) null, 0, new n641(qn41Var, str, iu30Var, (lnm) null, (byte) 5), 3);
    }

    @Override // p.zn41
    public final void b(String str, long j, gyq0 gyq0Var, ozp0 ozp0Var) {
        on41 on41Var = new on41(str, ozp0Var, gyq0Var);
        qn41 qn41Var = this.a;
        c921.y(qn41Var.c, (o8n) null, 0, new xn2(j, on41Var, qn41Var, str, (lnm) null), 3);
        c921.y(qn41Var.b, (o8n) null, 0, new lc41(qn41Var, on41Var, (lnm) null, (byte) 6), 3);
    }

    @Override // p.zn41
    public final void c(String str, iu30 iu30Var) {
        qn41 qn41Var = this.b;
        c921.y(qn41Var.b, (o8n) null, 0, new n641(qn41Var, str, iu30Var, (lnm) null, (byte) 5), 3);
    }
}
