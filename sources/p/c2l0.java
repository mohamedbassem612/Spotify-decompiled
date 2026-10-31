package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c2l0 implements n8h1 {
    public final y6h1 a;

    public c2l0(i3l0 i3l0Var) {
        x6h1 x6h1VarC = i3l0Var.a.c();
        vi11 vi11VarP = m4c.p();
        vi11VarP.E("report_abuse_item");
        x6h1VarC.i.add(vi11VarP.l());
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    @Override // p.n8h1
    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        return dlg1VarS.f();
    }

    public final w7h1 e(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("report_abuse", 2, zno1.t(oqn1.n("item_to_report", str))), this.a, r6h1.c, System.currentTimeMillis());
    }
}
