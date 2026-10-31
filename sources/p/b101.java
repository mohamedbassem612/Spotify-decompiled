package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b101 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c101 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b101(c101 c101Var, byte b) {
        super(4);
        this.a = b;
        this.b = c101Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        c101 c101Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new uvk0(c101Var.b);
            default:
                a101 a101Var = (a101) obj2;
                z001 z001Var = (z001) obj4;
                y6h1 y6h1Var = ((uvk0) obj).a;
                int i = a101Var.b;
                boolean zEquals = z001Var.equals(x001.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        String str = a101Var.a;
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("message", str, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iC == 1) {
                        String str2 = a101Var.a;
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("shareable_card", str2, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC != 2) {
                            if (iC == 3) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        vcl0 vcl0Var = (vcl0) c101Var.g.getValue();
                        vcl0Var.getClass();
                        x6h1 x6h1VarC5 = vcl0Var.a.c();
                        x6h1VarC5.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!(z001Var instanceof y001)) {
                        eg.o();
                        return null;
                    }
                    int iC2 = l1d.C(i);
                    if (iC2 == 0) {
                        String str3 = a101Var.a;
                        x6h1 x6h1VarC6 = y6h1Var.c();
                        x6h1VarC6.i.add(new a7h1("message", str3, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC2 != 1) {
                            if (iC2 == 2 || iC2 == 3) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        String str4 = a101Var.a;
                        x6h1 x6h1VarC8 = y6h1Var.c();
                        x6h1VarC8.i.add(new a7h1("shareable_card", str4, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = true;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
        }
    }
}
