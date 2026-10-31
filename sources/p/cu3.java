package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cu3 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu3(umf0 umf0Var, byte b) {
        super(4);
        this.a = b;
        this.b = umf0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        umf0 umf0Var = this.b;
        switch (b) {
            case 0:
                bu3 bu3Var = (bu3) obj;
                ((Number) obj3).intValue();
                bqk0 bqk0Var = (bqk0) umf0Var.d;
                int i = bu3Var.a;
                h951 h951Var = bu3Var.b;
                String str = h951Var.c;
                int iC = l1d.C(h951Var.a);
                if (iC == 0) {
                    return new irk0(new sqk0(new jrk0(bqk0Var)), Integer.valueOf(i), str, (byte) 1);
                }
                if (iC == 1) {
                    return new irk0(new sqk0(new jrk0(bqk0Var)), Integer.valueOf(i), str, (byte) 0);
                }
                if (iC == 2) {
                    return new irk0(new sqk0(new jrk0(bqk0Var)), Integer.valueOf(i), str, (byte) 2);
                }
                eg.o();
                return null;
            default:
                bu3 bu3Var2 = (bu3) obj2;
                bqk0 bqk0Var2 = (bqk0) umf0Var.d;
                int i2 = bu3Var2.a;
                h951 h951Var2 = bu3Var2.b;
                String str2 = h951Var2.c;
                if (!((au3) obj4).equals(au3.a)) {
                    eg.o();
                    return null;
                }
                int iC2 = l1d.C(h951Var2.a);
                b7x b7xVar = b7x.a;
                if (iC2 == 0) {
                    x6h1 x6h1VarC = bqk0Var2.b.c();
                    x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    Integer numValueOf = Integer.valueOf(i2);
                    x6h1 x6h1VarC3 = y6h1VarA.c();
                    x6h1VarC3.i.add(new a7h1("default_item", (String) null, numValueOf, str2, (String) null));
                    x6h1VarC3.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC2 == 1) {
                    x6h1 x6h1VarC4 = bqk0Var2.b.c();
                    x6h1VarC4.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC5.a();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    x6h1 x6h1VarC6 = y6h1VarA2.c();
                    x6h1VarC6.i.add(new a7h1("artist_item", (String) null, numValueOf2, str2, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = bqk0Var2.b.c();
                    x6h1VarC7.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC8.a();
                    Integer numValueOf3 = Integer.valueOf(i2);
                    x6h1 x6h1VarC9 = y6h1VarA3.c();
                    x6h1VarC9.i.add(new a7h1("show_item", (String) null, numValueOf3, str2, (String) null));
                    x6h1VarC9.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
