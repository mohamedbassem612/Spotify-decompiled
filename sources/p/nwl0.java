package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwl0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ owl0 b;

    public nwl0(owl0 owl0Var) {
        this.b = owl0Var;
        x6h1 x6h1VarC = owl0Var.a.c();
        vi11 vi11VarP = m4c.p();
        vi11VarP.E("confirm_button");
        x6h1VarC.i.add(vi11VarP.l());
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, zno1.t(oqn1.n("destination", str))), this.a, opl0.h(this.b.b), System.currentTimeMillis());
    }

    @Override // p.n8h1
    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        dlg1VarS.C(opl0.h(this.b.b));
        return dlg1VarS.f();
    }

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), this.a, opl0.h(this.b.b), System.currentTimeMillis());
    }
}
