package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lm31 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public lm31(iu30 iu30Var, sm71 sm71Var) {
        this.a = (byte) 5;
        this.b = iu30Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                Object objInvoke = iu30Var.invoke(lnmVar);
                return objInvoke == d9n.a ? objInvoke : rih1Var;
            case 1:
                if (((qt80) obj) instanceof o5v) {
                    iu30Var.invoke(n151.a);
                    iu30Var.invoke(b151.a);
                }
                return rih1Var;
            case 2:
                iu30Var.invoke(new y151((String) obj, ""));
                return rih1Var;
            case 3:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 4:
                mmt mmtVar = (omt) obj;
                if (mmtVar instanceof mmt) {
                    wkt wktVar = mmtVar.a;
                    if (wktVar instanceof ukt) {
                        iu30Var.invoke(new ci71(((ukt) wktVar).a));
                    }
                }
                return rih1Var;
            case 5:
                clw0 clw0Var = (elw0) obj;
                if (clw0Var instanceof blw0) {
                    iu30Var.invoke(new kg71(((blw0) clw0Var).a));
                } else if (clw0Var instanceof clw0) {
                    zmt zmtVar = clw0Var.a;
                    if (zmtVar instanceof zmt) {
                        iu30Var.invoke(new qg71(zmtVar.d));
                    }
                    if (zmtVar instanceof xmt) {
                        iu30Var.invoke(lg71.a);
                    }
                    if (zmtVar instanceof ymt) {
                        ymt ymtVar = (ymt) zmtVar;
                        iu30Var.invoke(twb.g(ymtVar.d, k771.g, ymtVar.f, ymtVar.e, (p371) null, ymtVar.g));
                    }
                } else if (!(clw0Var instanceof dlw0)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 6:
                mmt mmtVar2 = (omt) obj;
                if (mmtVar2 instanceof mmt) {
                    wkt wktVar2 = mmtVar2.a;
                    o571 o571VarA = wktVar2.a();
                    vkt vktVar = wktVar2 instanceof vkt ? (vkt) wktVar2 : null;
                    iu30Var.invoke(new og71(o571VarA, vktVar != null ? vktVar.b : null));
                } else {
                    if (!(mmtVar2 instanceof nmt)) {
                        eg.o();
                        return null;
                    }
                    nmt nmtVar = (nmt) mmtVar2;
                    o571 o571VarA2 = nmtVar.b.a();
                    ne71 ne71Var = nmtVar.a;
                    tv80 tv80Var = nmtVar.c;
                    iu30Var.invoke(new hg71(o571VarA2, ne71Var, (p371) null, (String) null, (Integer) null, (q6q0) null, tv80Var != null ? tv80Var.a : null));
                }
                return rih1Var;
            case 7:
                thw0 thw0Var = (thw0) obj;
                tn71 tn71Var = new tn71();
                tn71Var.a = ea71.O0;
                tn71Var.b = ea71.Z;
                tn71Var.c = ea71.N0;
                tn71Var.d = qi71.Q0;
                tn71 tn71Var2 = (tn71) iu30Var.invoke(tn71Var);
                if (thw0Var instanceof yhw0) {
                    yhw0 yhw0Var = (yhw0) thw0Var;
                    tn71Var2.a.invoke(Integer.valueOf(yhw0Var.a), yhw0Var.b);
                } else if (thw0Var instanceof vhw0) {
                    vhw0 vhw0Var = (vhw0) thw0Var;
                    tn71Var2.b.invoke(Integer.valueOf(vhw0Var.a), vhw0Var.b);
                } else if (thw0Var instanceof xhw0) {
                    xhw0 xhw0Var = (xhw0) thw0Var;
                    tn71Var2.c.invoke(Integer.valueOf(xhw0Var.a), xhw0Var.b);
                } else {
                    if (!(thw0Var instanceof whw0)) {
                        eg.o();
                        return null;
                    }
                    tn71Var2.d.invoke(Integer.valueOf(((whw0) thw0Var).a));
                }
                return rih1Var;
            case 8:
                ((Boolean) obj).getClass();
                iu30Var.invoke(rx71.a);
                return rih1Var;
            case 9:
                iu30Var.invoke(qse1.a);
                return rih1Var;
            case 10:
                ((Number) obj).intValue();
                iu30Var.invoke(umh1.a);
                return rih1Var;
            case 11:
                iu30Var.invoke(new trh1((String) obj));
                return rih1Var;
            case 12:
                iu30Var.invoke(new rci1((String) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(new oci1((String) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new sci1((String) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke((s7j1) obj);
                return rih1Var;
            case 16:
                iu30Var.invoke((gqk1) obj);
                return rih1Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                iu30Var.invoke(bool);
                return rih1Var;
        }
    }

    public /* synthetic */ lm31(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }
}
