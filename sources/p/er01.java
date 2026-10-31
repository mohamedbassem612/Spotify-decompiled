package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class er01 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pux0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er01(pux0 pux0Var, byte b) {
        super(4);
        this.a = b;
        this.b = pux0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String strA;
        w7h1 w7h1Var;
        byte b = this.a;
        pux0 pux0Var = this.b;
        switch (b) {
            case 0:
                ney0 ney0Var = (ney0) obj;
                int iIntValue = ((Number) obj3).intValue();
                zq01 zq01Var = ney0Var.x;
                String strG = jyo1.g(zq01Var.a, zq01Var.b, ney0Var.v, ney0Var.w);
                String str = ney0Var.k;
                int length = str.length();
                brl0 brl0Var = (brl0) pux0Var.c;
                return length == 0 ? new vtl0(Integer.valueOf(iIntValue), strG, new mjl0(brl0Var)) : new utl0(Integer.valueOf(iIntValue), strG, str, new mjl0(brl0Var));
            default:
                n8h1 n8h1Var = (n8h1) obj;
                ney0 ney0Var2 = (ney0) obj3;
                String str2 = ney0Var2.k;
                switch (l1d.C(((mta) pux0Var.b).y((d700) obj4, ney0Var2))) {
                    case 0:
                        utl0 utl0Var = n8h1Var instanceof utl0 ? (utl0) n8h1Var : null;
                        if (utl0Var != null) {
                            return utl0Var.h(str2);
                        }
                        return null;
                    case 1:
                        utl0 utl0Var2 = n8h1Var instanceof utl0 ? (utl0) n8h1Var : null;
                        if (utl0Var2 != null) {
                            return utl0Var2.a(str2);
                        }
                        return null;
                    case 2:
                        String str3 = ney0Var2.u;
                        if (str3 == null) {
                            return null;
                        }
                        utl0 utl0Var3 = n8h1Var instanceof utl0 ? (utl0) n8h1Var : null;
                        if (utl0Var3 != null) {
                            return utl0Var3.a(str3);
                        }
                        return null;
                    case 3:
                        de71 de71Var = ney0Var2.y;
                        if (de71Var == null || (strA = de71Var.a()) == null) {
                            return null;
                        }
                        utl0 utl0Var4 = n8h1Var instanceof utl0 ? (utl0) n8h1Var : null;
                        if (utl0Var4 != null) {
                            return utl0Var4.a(strA);
                        }
                        return null;
                    case 4:
                        boolean z = ney0Var2.e;
                        boolean z2 = n8h1Var instanceof utl0;
                        b7x b7xVar = b7x.a;
                        if (z2) {
                            utl0 utl0Var5 = (utl0) n8h1Var;
                            if (!z) {
                                return utl0Var5.i();
                            }
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), utl0Var5.a, r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!(n8h1Var instanceof vtl0)) {
                                return null;
                            }
                            vtl0 vtl0Var = (vtl0) n8h1Var;
                            w7h1Var = z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), vtl0Var.a, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), vtl0Var.a, r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var;
                    case 5:
                        utl0 utl0Var6 = n8h1Var instanceof utl0 ? (utl0) n8h1Var : null;
                        if (utl0Var6 != null) {
                            return utl0Var6.i();
                        }
                        return null;
                    case 6:
                    case 7:
                        return null;
                    default:
                        eg.o();
                        return null;
                }
        }
    }
}
