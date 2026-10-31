package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vp50 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wp50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp50(wp50 wp50Var, byte b) {
        super(4);
        this.a = b;
        this.b = wp50Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        wp50 wp50Var = this.b;
        switch (b) {
            case 0:
                tp50 tp50Var = (tp50) obj;
                ((Number) obj3).intValue();
                return ((cur) wp50Var.b.get()).b(tp50Var.b, ((op50) tp50Var.a.j).a);
            default:
                tp50 tp50Var2 = (tp50) obj2;
                sp50 sp50Var = (sp50) obj4;
                ynb0 ynb0Var = wp50Var.b;
                Object obj5 = tp50Var2.a.j;
                int i = tp50Var2.b;
                boolean zEquals = sp50Var.equals(rp50.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), ((cur) ynb0Var.get()).b(i, ((op50) obj5).a).b, r6h1.c, System.currentTimeMillis());
                }
                if (sp50Var.equals(pp50.a)) {
                    x6h1 x6h1VarC = ((cur) ynb0Var.get()).b(i, ((op50) obj5).a).b.c();
                    x6h1VarC.i.add(new a7h1("end_group_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!sp50Var.equals(qp50.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = ((cur) ynb0Var.get()).b(i, ((op50) obj5).a).b.c();
                    x6h1VarC2.i.add(new a7h1("end_group_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
