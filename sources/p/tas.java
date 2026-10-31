package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tas implements fkf1, kof1 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final pdl0 c;
    public final idd1 d;

    public tas(bsp bspVar, pdl0 pdl0Var) {
        this.a = (byte) 0;
        this.b = bspVar;
        this.c = pdl0Var;
        this.d = new idd1(new dor(this, (byte) 18));
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        byte b = this.a;
        pdl0 pdl0Var = this.c;
        ckf1 ckf1Var2 = ckf1.a;
        long j = fvf1Var.b;
        long j2 = fvf1Var.a;
        switch (b) {
            case 0:
                return ckf1Var == ckf1Var2 ? new qgl0(pdl0Var).x(Integer.valueOf((int) j2), str, Integer.valueOf((int) j)) : new qgl0(pdl0Var).y(Integer.valueOf((int) j2), str, Integer.valueOf((int) j));
            default:
                return ckf1Var == ckf1Var2 ? new qgl0(pdl0Var).x(Integer.valueOf((int) j2), str, Integer.valueOf((int) j)) : new qgl0(pdl0Var).y(Integer.valueOf((int) j2), str, Integer.valueOf((int) j));
        }
    }

    public final tv80 c(gof1 gof1Var, String str) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        pdl0 pdl0Var = this.c;
        gof1 gof1Var2 = gof1.a;
        idd1 idd1Var = this.d;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) idd1Var.getValue();
                y6h1 y6h1Var = pdl0Var.b;
                if (gof1Var == gof1Var2) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("artist_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return i8h1Var.m(w7h1Var, (xj61) null);
            default:
                i8h1 i8h1Var2 = (i8h1) idd1Var.getValue();
                y6h1 y6h1Var2 = pdl0Var.b;
                if (gof1Var == gof1Var2) {
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("artist_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                return i8h1Var2.m(w7h1Var2, (xj61) null);
        }
    }

    public tas(bsp bspVar, pdl0 pdl0Var, byte b) {
        this.a = (byte) 1;
        this.b = bspVar;
        this.c = pdl0Var;
        this.d = new idd1(new vwz0(this, (byte) 18));
    }
}
