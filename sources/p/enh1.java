package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class enh1 implements hgv0 {
    public final xvd0 a;
    public final ynb0 b;

    public enh1(xvd0 xvd0Var, ynb0 ynb0Var) {
        this.a = xvd0Var;
        this.b = ynb0Var;
    }

    @Override // p.hgv0
    public final void a() {
        String str = ((wvd0) this.a).a;
        i8h1 i8h1Var = (i8h1) this.b.get();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-live-entity-page";
        x6h1VarI.f = "6.3.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "live-audio/entity");
        x6h1VarR.i.add(new a7h1("failure_action_modal", "upcoming_party_notify_me", (Integer) null, (String) null, (String) null));
        x6h1VarR.j = true;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.hgv0
    public final void b() {
    }
}
