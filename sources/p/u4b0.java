package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4b0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v4b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4b0(v4b0 v4b0Var, byte b) {
        super(1);
        this.a = b;
        this.b = v4b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    public final Object invoke(Object obj) {
        hoj0 hoj0Var;
        String str;
        hoj0 hoj0Var2;
        hoj0 hoj0Var3;
        hoj0 hoj0Var4;
        goj0 goj0VarA;
        xkk1 xkk1Var;
        pp70 pp70Var;
        goj0 goj0VarA2;
        xkk1 xkk1Var2;
        pp70 pp70Var2;
        goj0 goj0VarA3;
        xkk1 xkk1Var3;
        goj0 goj0VarA4;
        jo70 jo70Var;
        byte b = this.a;
        e7e e7eVar = null;
        v4b0 v4b0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.E(v4b0Var.c, v4b0Var.g, (g7e) obj);
            case 1:
                g7e g7eVar = (g7e) obj;
                k1r k1rVarN = x2p1.n(v4b0Var.c, v4b0Var.g, g7eVar);
                k1rVarN.getClass();
                if (k1rVarN instanceof i1r) {
                    return v4b0.f((t4b0) u890.k(k1rVarN, (d0r) null, (n4r) null), g7eVar);
                }
                dps0 dps0VarG = c0p1.g(b7x.a);
                String str2 = g7eVar.a;
                cqs0 cqs0Var = (cqs0) dps0VarG.get(str2);
                if (cqs0Var != null) {
                    Object obj2 = cqs0Var.get(jo70.class);
                    if (obj2 instanceof hoj0) {
                        hoj0Var = (hoj0) obj2;
                    } else {
                        hoj0Var = null;
                    }
                } else {
                    hoj0Var = null;
                }
                if (hoj0Var == null || (goj0VarA4 = hoj0Var.a()) == null || (jo70Var = (jo70) goj0VarA4.a) == null || (str = jo70Var.a) == null) {
                    str = "";
                }
                String str3 = str;
                cqs0 cqs0Var2 = (cqs0) dps0VarG.get(str2);
                if (cqs0Var2 != null) {
                    Object obj3 = cqs0Var2.get(xkk1.class);
                    if (obj3 instanceof hoj0) {
                        hoj0Var2 = (hoj0) obj3;
                    } else {
                        hoj0Var2 = null;
                    }
                } else {
                    hoj0Var2 = null;
                }
                String strE = (hoj0Var2 == null || (goj0VarA3 = hoj0Var2.a()) == null || (xkk1Var3 = (xkk1) goj0VarA3.a) == null) ? null : q0o1.e(xkk1Var3);
                cqs0 cqs0Var3 = (cqs0) dps0VarG.get(str2);
                if (cqs0Var3 != null) {
                    Object obj4 = cqs0Var3.get(xkk1.class);
                    if (obj4 instanceof hoj0) {
                        hoj0Var3 = (hoj0) obj4;
                    } else {
                        hoj0Var3 = null;
                    }
                } else {
                    hoj0Var3 = null;
                }
                u7h u7hVar = (hoj0Var3 == null || (goj0VarA2 = hoj0Var3.a()) == null || (xkk1Var2 = (xkk1) goj0VarA2.a) == null || (pp70Var2 = xkk1Var2.d) == null) ? null : new u7h(pp70Var2.a.a.c);
                cqs0 cqs0Var4 = (cqs0) dps0VarG.get(str2);
                if (cqs0Var4 != null) {
                    Object obj5 = cqs0Var4.get(xkk1.class);
                    if (obj5 instanceof hoj0) {
                        hoj0Var4 = (hoj0) obj5;
                    } else {
                        hoj0Var4 = null;
                    }
                } else {
                    hoj0Var4 = null;
                }
                u7h u7hVar2 = (hoj0Var4 == null || (goj0VarA = hoj0Var4.a()) == null || (xkk1Var = (xkk1) goj0VarA.a) == null || (pp70Var = xkk1Var.d) == null) ? null : new u7h(pp70Var.a.b.a);
                if (u7hVar != null && u7hVar2 != null) {
                    e7eVar = new e7e(u7hVar2, u7hVar);
                }
                return new h7e(str3, g7eVar.b, g7eVar.c, strE, e7eVar);
            default:
                ((qtr) obj).b(new jaz(v4b0Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
