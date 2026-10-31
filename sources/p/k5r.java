package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k5r extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5r(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        ven0 ven0Var2 = this.c;
        ven0 ven0Var3 = this.b;
        switch (b) {
            case 0:
                w6r w6rVar = (w6r) obj;
                if (w6rVar instanceof t6r) {
                    ven0Var3.setValue(((t6r) w6rVar).a);
                } else if (w6rVar instanceof v6r) {
                    ven0Var2.setValue(((v6r) w6rVar).a);
                } else {
                    if (!(w6rVar instanceof u6r)) {
                        eg.o();
                        return null;
                    }
                    ven0Var.setValue(((u6r) w6rVar).a);
                }
                return rih1Var;
            case 1:
                eod eodVar = (fod) obj;
                if (eodVar instanceof eod) {
                    ((iu30) ven0Var.getValue()).invoke(new j3h0(eodVar.a));
                } else if (eodVar.equals(cod.a)) {
                    ven0Var3.setValue(Boolean.TRUE);
                } else if (eodVar.equals(dod.a)) {
                    ven0Var2.setValue(Boolean.TRUE);
                } else if (!eodVar.equals(bod.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            default:
                u760 u760Var = (u760) obj;
                if (!((Boolean) ven0Var3.getValue()).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    ven0Var3.setValue(bool);
                    if (u760Var == u760.b || u760Var == u760.d) {
                        ven0Var2.setValue(bool);
                    }
                    ((iu30) ven0Var.getValue()).invoke(u760Var);
                }
                return rih1Var;
        }
    }
}
