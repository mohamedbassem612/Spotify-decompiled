package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ygb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ zgb0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygb0(iu30 iu30Var, zgb0 zgb0Var) {
        super(1);
        this.c = iu30Var;
        this.b = zgb0Var;
    }

    public final Object invoke(Object obj) {
        w7h1 w7h1VarJ;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        zgb0 zgb0Var = this.b;
        int i = 0;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                haa0 haa0Var = zgb0Var.h;
                int iOrdinal = ((iaj0) obj).ordinal();
                if (iOrdinal == 0) {
                    i8h1 i8h1Var = (i8h1) ((kly0) haa0Var.b).get();
                    tnl0 tnl0Var = (tnl0) haa0Var.d;
                    x6h1 x6h1VarC = tnl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), tnl0Var.a, System.currentTimeMillis()), (xj61) null);
                    iu30Var.invoke(new whb0());
                    return rih1Var;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return rih1Var;
                }
                if (iOrdinal == 3) {
                    i8h1 i8h1Var2 = (i8h1) ((kly0) haa0Var.b).get();
                    tnl0 tnl0Var2 = (tnl0) haa0Var.d;
                    x6h1 x6h1VarC2 = tnl0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    iu30Var.invoke(new whb0(true, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), tnl0Var2.a, System.currentTimeMillis()), (xj61) null).a.a));
                    return rih1Var;
                }
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                i8h1 i8h1Var3 = (i8h1) ((kly0) haa0Var.b).get();
                tnl0 tnl0Var3 = (tnl0) haa0Var.d;
                x6h1 x6h1VarC3 = tnl0Var3.b.c();
                x6h1VarC3.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), tnl0Var3.a, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new whb0());
                return rih1Var;
            default:
                uib0 uib0Var = (uib0) obj;
                haa0 haa0Var2 = zgb0Var.h;
                if (uib0Var instanceof sib0) {
                    xib0 xib0Var = ((sib0) uib0Var).a;
                    rib0 rib0Var = xib0Var.a.a;
                    Integer num = rib0Var.f;
                    String str = rib0Var.a;
                    if (num == null) {
                        return rih1Var;
                    }
                    String strA = rib0Var.a();
                    vlw0 vlw0Var = (vlw0) zgb0Var.g.l.getValue();
                    sqk0 sqk0Var = new sqk0(num, str, (tdl0) haa0Var2.c);
                    if (vlw0Var.equals(tlw0.a)) {
                        w7h1VarJ = sqk0Var.j(str);
                    } else if (vlw0Var instanceof olw0) {
                        w7h1VarJ = u890.j(((olw0) vlw0Var).a, strA) ? sqk0Var.k(0) : sqk0Var.j(str);
                    } else if (vlw0Var instanceof rlw0) {
                        rlw0 rlw0Var = (rlw0) vlw0Var;
                        if (u890.j(rlw0Var.a, strA)) {
                            long j = rlw0Var.b;
                            long j2 = rlw0Var.c;
                            if (j > 0 && j2 > 0) {
                                if (j > j2) {
                                    j = j2;
                                }
                                if (j > 2147483647L) {
                                    j = 2147483647L;
                                }
                                i = (int) j;
                            }
                            w7h1VarJ = sqk0Var.k(Integer.valueOf(i));
                        } else {
                            w7h1VarJ = sqk0Var.j(str);
                        }
                    } else {
                        eg.o();
                    }
                    iu30Var.invoke(new uhb0(str, xib0Var.d, rib0Var.a(), ((i8h1) ((kly0) haa0Var2.b).get()).m(w7h1VarJ, (xj61) null)));
                    return rih1Var;
                }
                if (uib0Var instanceof tib0) {
                    rib0 rib0Var2 = ((tib0) uib0Var).a.a.a;
                    Integer num2 = rib0Var2.f;
                    String str2 = rib0Var2.a;
                    if (num2 == null) {
                        return rih1Var;
                    }
                    String str3 = rib0Var2.b;
                    String str4 = (String) rib0Var2.d.get("item.speed");
                    Double dA0 = str4 != null ? nhc1.a0(str4) : null;
                    i8h1 i8h1Var4 = (i8h1) ((kly0) haa0Var2.b).get();
                    x6h1 x6h1VarC4 = ((tdl0) haa0Var2.c).b.c();
                    x6h1VarC4.i.add(new a7h1("candidate_track_row", (String) null, num2, str2, (String) null));
                    x6h1VarC4.j = true;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("swap_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    iu30Var.invoke(new vhb0(str2, str3, dA0, i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str2)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygb0(zgb0 zgb0Var, iu30 iu30Var) {
        super(1);
        this.b = zgb0Var;
        this.c = iu30Var;
    }
}
