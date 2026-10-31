package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wrm implements rqw {
    public final /* synthetic */ byte a;

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        String str;
        pxk0 pxk0Var;
        w7h1 w7h1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                if (obj3 != null) {
                    bhn0.d();
                }
                return null;
            case 4:
                xjw0 xjw0Var = (xjw0) obj2;
                wjw0 wjw0Var = (wjw0) obj3;
                vu30 vu30Var = xjw0Var.f;
                if (wjw0Var.equals(ujw0.a)) {
                    if (xjw0Var.a != null) {
                        return (w7h1) vu30Var.invoke(wjw0Var, op80Var);
                    }
                    return null;
                }
                if (wjw0Var.equals(vjw0.a)) {
                    return (w7h1) vu30Var.invoke(wjw0Var, op80Var);
                }
                eg.o();
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                qie1 qie1Var = (qie1) obj;
                if (!qie1Var.d || (str = qie1Var.b) == null || (pxk0Var = qie1Var.c) == null) {
                    return null;
                }
                x6h1 x6h1VarC = pxk0Var.b.c();
                x6h1VarC.i.add(new a7h1("ticket_artwork_image", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), pxk0Var.a, System.currentTimeMillis());
            default:
                zie1 zie1Var = (zie1) obj;
                yie1 yie1Var = (yie1) obj3;
                pxk0 pxk0Var2 = zie1Var.c;
                if (pxk0Var2 == null) {
                    return null;
                }
                r6h1 r6h1Var = pxk0Var2.a;
                String str2 = zie1Var.b;
                x6h1 x6h1VarC2 = pxk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("ticket_preview", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                int iOrdinal = yie1Var.ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC3 = y6h1VarA.c();
                    x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else if (iOrdinal == 1) {
                    w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else if (iOrdinal == 2) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        String str;
        pxk0 pxk0Var;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                p8h1 p8h1Var = ((s480) obj2).a;
                if (p8h1Var != null) {
                    return p8h1Var.e();
                }
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                qie1 qie1Var = (qie1) obj;
                if (!qie1Var.d || (str = qie1Var.b) == null || (pxk0Var = qie1Var.c) == null) {
                    return null;
                }
                x6h1 x6h1VarC = pxk0Var.b.c();
                x6h1VarC.i.add(new a7h1("ticket_artwork_image", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = pxk0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                zie1 zie1Var = (zie1) obj;
                pxk0 pxk0Var2 = zie1Var.c;
                if (pxk0Var2 == null) {
                    return null;
                }
                String str2 = zie1Var.b;
                x6h1 x6h1VarC2 = pxk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("ticket_preview", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = pxk0Var2.a;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }
}
