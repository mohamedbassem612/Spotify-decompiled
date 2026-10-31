package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jls0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kls0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jls0(kls0 kls0Var, byte b) {
        super(4);
        this.a = b;
        this.b = kls0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        kls0 kls0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new a6m0((l6m0) kls0Var.d);
            default:
                dls0 dls0Var = (dls0) obj4;
                if (!dls0Var.equals(als0.a)) {
                    if (dls0Var.equals(bls0.a) || dls0Var.equals(cls0.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                l6m0 l6m0Var = (l6m0) kls0Var.d;
                x6h1 x6h1VarC = l6m0Var.b.c();
                x6h1VarC.i.add(new a7h1("enable_activity_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("enable_activity_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, l6m0Var.a, System.currentTimeMillis());
        }
    }
}
