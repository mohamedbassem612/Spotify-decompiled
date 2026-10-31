package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gws0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iws0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gws0(iws0 iws0Var, byte b) {
        super(3);
        this.a = b;
        this.b = iws0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w7h1 w7h1Var;
        byte b = this.a;
        cws0 cws0Var = cws0.a;
        iws0 iws0Var = this.b;
        switch (b) {
            case 0:
                ews0 ews0Var = (ews0) obj2;
                tqw tqwVar = (tqw) obj3;
                if (ews0Var instanceof aws0) {
                    iws0Var.c.invoke(((aws0) ews0Var).a, tqwVar != null ? (tv80) tqwVar.a(rc11.a.b(tv80.class)) : null);
                } else if (ews0Var instanceof bws0) {
                    bws0 bws0Var = (bws0) ews0Var;
                    iws0Var.f.invoke(bws0Var.a, Integer.valueOf(bws0Var.b));
                } else if (ews0Var instanceof dws0) {
                    iws0Var.d.invoke(Integer.valueOf(((dws0) ews0Var).a));
                } else {
                    if (!ews0Var.equals(cws0Var)) {
                        eg.o();
                        return null;
                    }
                    iws0Var.e.invoke();
                }
                return rih1.a;
            default:
                fws0 fws0Var = (fws0) obj2;
                ews0 ews0Var2 = (ews0) obj3;
                if (!(ews0Var2 instanceof aws0)) {
                    if ((ews0Var2 instanceof bws0) || (ews0Var2 instanceof dws0) || ews0Var2.equals(cws0Var)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                grk0 grk0Var = (grk0) iws0Var.b.invoke();
                gxs0 gxs0Var = ((aws0) ews0Var2).a;
                int iIndexOf = fws0Var.a.indexOf(gxs0Var);
                xl81 xl81Var = gxs0Var.c;
                boolean z = gxs0Var.d;
                int i = gxs0Var.b;
                boolean z2 = xl81Var instanceof w4a;
                b7x b7xVar = b7x.a;
                if (z2) {
                    Integer numValueOf = Integer.valueOf(i);
                    grk0Var.getClass();
                    x6h1 x6h1VarC = grk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("banner_section", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf2 = Integer.valueOf(iIndexOf);
                    String str = ((w4a) xl81Var).a;
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("banner_tile", (String) null, numValueOf2, str, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    w7h1Var = z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else if (xl81Var instanceof qpl) {
                    Integer numValueOf3 = Integer.valueOf(i);
                    grk0Var.getClass();
                    x6h1 x6h1VarC3 = grk0Var.a.c();
                    x6h1VarC3.i.add(new a7h1("squircle_section", (String) null, numValueOf3, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    Integer numValueOf4 = Integer.valueOf(iIndexOf);
                    String str2 = ((qpl) xl81Var).a;
                    x6h1 x6h1VarC4 = y6h1VarA3.c();
                    x6h1VarC4.i.add(new a7h1("squircle_tile", (String) null, numValueOf4, str2, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    w7h1Var = z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(xl81Var instanceof ckm0)) {
                        return null;
                    }
                    Integer numValueOf5 = Integer.valueOf(i);
                    grk0Var.getClass();
                    x6h1 x6h1VarC5 = grk0Var.a.c();
                    x6h1VarC5.i.add(new a7h1("squircle_section", (String) null, numValueOf5, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    y6h1 y6h1VarA5 = x6h1VarC5.a();
                    Integer numValueOf6 = Integer.valueOf(iIndexOf);
                    String str3 = ((ckm0) xl81Var).a;
                    x6h1 x6h1VarC6 = y6h1VarA5.c();
                    x6h1VarC6.i.add(new a7h1("squircle_more", (String) null, numValueOf6, str3, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
