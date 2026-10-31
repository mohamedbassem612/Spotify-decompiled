package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wg6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(twn0 twn0Var, zf30 zf30Var, String str, String str2, String str3, boolean z, e6w0 e6w0Var) {
        super(0);
        this.c = twn0Var;
        this.d = zf30Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.b = z;
        this.h = e6w0Var;
    }

    public final Object invoke() {
        int i;
        byte b = this.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((drr0) obj4).t(0.0f);
                ((drr0) obj3).t(0.0f);
                ((xd6) obj6).e = true;
                ven0 ven0Var = (ven0) obj;
                x9b1 x9b1Var = (x9b1) ven0Var.getValue();
                if (x9b1Var != null && !x9b1Var.e) {
                    ((drr0) obj2).t(z ? dm5.T(x9b1Var.a, x9b1Var.c, ((Number) ((tob1) obj5).getValue()).floatValue()) : 0.0f);
                    ven0Var.setValue((Object) null);
                }
                return rih1Var;
            case 1:
                twn0 twn0Var = (twn0) obj6;
                syn0 syn0Var = twn0Var.j;
                zf30 zf30Var = (zf30) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                boolean z2 = this.b;
                e6w0 e6w0Var = (e6w0) obj;
                son0 son0VarA = syn0Var.a(azn0.a);
                try {
                    twn0Var.p(zf30Var, str, str2, str3, z2, e6w0Var);
                    return rih1Var;
                } finally {
                    syn0Var.e(son0VarA);
                }
            default:
                if (z) {
                    ((qam1) obj6).a(1);
                }
                c08 c08Var = (c08) obj5;
                zz7 zz7Var = c08Var instanceof zz7 ? (zz7) c08Var : null;
                if (zz7Var != null) {
                    String str4 = (String) obj4;
                    d08 d08Var = (d08) obj3;
                    hp80 hp80Var = (hp80) obj2;
                    if (str4 != null && d08Var != null) {
                        i8h1 i8h1Var = d08Var.c;
                        opl0 opl0VarA = d08Var.a(str4, hp80Var);
                        int iC = l1d.C(zz7Var.b);
                        if (iC == 0) {
                            i = 1;
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            i = 2;
                        }
                        String str5 = zz7Var.a;
                        x6h1 x6h1VarC = opl0VarA.c.c();
                        x6h1VarC.i.add(new a7h1("chip", (String) null, (Integer) null, str5, z3m0.i(i)));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        b7x b7xVar = b7x.a;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, opl0VarA.b, System.currentTimeMillis()), (xj61) null);
                    }
                }
                ((ven0) obj).setValue(Boolean.TRUE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(xd6 xd6Var, boolean z, ven0 ven0Var, drr0 drr0Var, drr0 drr0Var2, ven0 ven0Var2, drr0 drr0Var3) {
        super(0);
        this.c = xd6Var;
        this.b = z;
        this.d = ven0Var;
        this.e = drr0Var;
        this.f = drr0Var2;
        this.h = ven0Var2;
        this.g = drr0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(boolean z, qam1 qam1Var, c08 c08Var, String str, d08 d08Var, hp80 hp80Var, ven0 ven0Var) {
        super(0);
        this.b = z;
        this.c = qam1Var;
        this.d = c08Var;
        this.e = str;
        this.f = d08Var;
        this.g = hp80Var;
        this.h = ven0Var;
    }
}
