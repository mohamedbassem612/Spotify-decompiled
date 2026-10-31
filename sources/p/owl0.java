package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class owl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ opl0 b;

    public owl0(opl0 opl0Var) {
        this.b = opl0Var;
        x6h1 x6h1VarC = opl0.e(opl0Var).c();
        vi11 vi11VarP = m4c.p();
        vi11VarP.E("dialog");
        x6h1VarC.i.add(vi11VarP.l());
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    @Override // p.n8h1
    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        dlg1VarS.C(opl0.h(this.b));
        return dlg1VarS.f();
    }

    @Override // p.p8h1
    public final l7h1 e() {
        k7h1 k7h1VarL = s3o1.l();
        k7h1VarL.d(this.a);
        k7h1VarL.e(opl0.h(this.b));
        k7h1VarL.c(System.currentTimeMillis());
        return (l7h1) k7h1VarL.a();
    }
}
