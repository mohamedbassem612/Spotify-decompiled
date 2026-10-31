package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ch6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch6(zk8 zk8Var, iu30 iu30Var, fjt fjtVar, at80 at80Var, boolean z, iu30 iu30Var2, ven0 ven0Var, iu30 iu30Var3, ven0 ven0Var2) {
        super(0);
        this.e = zk8Var;
        this.f = iu30Var;
        this.g = fjtVar;
        this.h = at80Var;
        this.b = z;
        this.i = iu30Var2;
        this.c = ven0Var;
        this.t = iu30Var3;
        this.d = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj = this.t;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj8;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    gh6.a((drr0) obj6, (Function0) obj4, (xd6) obj2, this.b, (Function0) obj3, (hdn0) obj, (ven0) obj7, (drr0) obj5, false);
                }
                break;
            case 1:
                ven0 ven0Var2 = (ven0) obj7;
                iu30 iu30Var = (iu30) obj;
                iu30 iu30Var2 = (iu30) obj2;
                at80 at80Var = (at80) obj3;
                ven0 ven0Var3 = (ven0) obj8;
                zk8 zk8Var = (zk8) obj6;
                int iOrdinal = zk8Var.a.a.ordinal();
                if (iOrdinal == 0) {
                    if (((fjt) obj4) == fjt.b || at80Var == at80.a || z) {
                        iu30Var2.invoke(zk8Var);
                    } else {
                        md80 md80Var = (md80) ven0Var3.getValue();
                        if (md80Var != null) {
                            iu30Var.invoke(new mg80(at80Var, md80Var, md80.c));
                        }
                        ven0Var3.setValue(md80.c);
                        ven0Var2.setValue((md80) ven0Var3.getValue());
                    }
                } else if (iOrdinal == 5) {
                    ((iu30) obj5).invoke(adb.a);
                    md80 md80Var2 = (md80) ven0Var3.getValue();
                    if (md80Var2 != null) {
                        iu30Var.invoke(new mg80(at80Var, md80Var2, md80.b));
                    }
                    ven0Var3.setValue(md80.b);
                    ven0Var2.setValue((md80) ven0Var3.getValue());
                } else {
                    iu30Var2.invoke(zk8Var);
                }
                break;
            default:
                c9n c9nVar = (c9n) obj8;
                qxc0 qxc0Var = (qxc0) obj7;
                String str = (String) obj6;
                tha1 tha1Var = (tha1) obj5;
                Function0 function0 = (Function0) obj4;
                zsu0 zsu0Var = (zsu0) obj3;
                r3d0 r3d0Var = (r3d0) obj2;
                g3d0 g3d0Var = (g3d0) ((tob1) obj).getValue();
                if (!z) {
                    tha1Var.c(qxc0Var);
                } else {
                    g3d0 g3d0VarA = tha1Var.getSortOrder().getClass() == g3d0Var.getClass() ? tha1Var.a(g3d0Var) : tha1Var.getSortOrder();
                    String strG = g3d0VarA.g();
                    i8h1 i8h1Var = zsu0Var.a;
                    r6h1 r6h1Var = r6h1.c;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-playlist-entity-dialogs-sort";
                    x6h1VarI.f = "2.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1 x6h1VarC = x6h1VarI.a().c();
                    x6h1VarC.i.add(new a7h1("sort_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("sort_option", strG, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                    fn31.T(c9nVar, (o8n) null, 0, new n0a0(r3d0Var, str, g3d0VarA, (lnm) null, (byte) 18), 3);
                    tha1Var.c(qxc0Var);
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch6(c9n c9nVar, qxc0 qxc0Var, String str, tha1 tha1Var, Function0 function0, boolean z, zsu0 zsu0Var, r3d0 r3d0Var, tob1 tob1Var) {
        super(0);
        this.c = c9nVar;
        this.d = qxc0Var;
        this.e = str;
        this.f = tha1Var;
        this.g = function0;
        this.b = z;
        this.h = zsu0Var;
        this.i = r3d0Var;
        this.t = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch6(ven0 ven0Var, drr0 drr0Var, Function0 function0, xd6 xd6Var, boolean z, Function0 function1, hdn0 hdn0Var, ven0 ven0Var2, drr0 drr0Var2) {
        super(0);
        this.c = ven0Var;
        this.e = drr0Var;
        this.g = function0;
        this.i = xd6Var;
        this.b = z;
        this.h = function1;
        this.t = hdn0Var;
        this.d = ven0Var2;
        this.f = drr0Var2;
    }
}
