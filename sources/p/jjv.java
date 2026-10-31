package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jjv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjv(iu30 iu30Var, iu30 iu30Var2, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = null;
        iu30 iu30Var = this.c;
        iu30 iu30Var2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = iu30Var2.invoke(obj);
                if (objInvoke != null) {
                    iu30Var.invoke(objInvoke);
                }
                return rih1Var;
            case 1:
                return iu30Var.invoke(iu30Var2.invoke(obj));
            case 2:
                k430 k430Var = (k430) obj;
                return new s430(k430Var.a, (String) iu30Var2.invoke(k430Var), true, false, true, ((Boolean) iu30Var.invoke(k430Var)).booleanValue());
            case 3:
                int iOrdinal = ((iaj0) obj).ordinal();
                dek0 dek0Var = dek0.a;
                if (iOrdinal == 0) {
                    iu30Var2.invoke(dek0Var);
                    iu30Var.invoke(rdk0.a);
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    iu30Var2.invoke(dek0Var);
                    iu30Var.invoke(new sdk0(true));
                    return rih1Var;
                }
                if (iOrdinal == 2) {
                    iu30Var2.invoke(dek0Var);
                    iu30Var.invoke(new sdk0(false));
                    return rih1Var;
                }
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                int iOrdinal2 = ((iaj0) obj).ordinal();
                ifk0 ifk0Var = ifk0.a;
                if (iOrdinal2 == 0) {
                    iu30Var2.invoke(ifk0Var);
                    iu30Var.invoke(cfk0.a);
                    return rih1Var;
                }
                if (iOrdinal2 == 1) {
                    iu30Var2.invoke(ifk0Var);
                    iu30Var.invoke(new dfk0(true));
                    return rih1Var;
                }
                if (iOrdinal2 == 2) {
                    iu30Var2.invoke(ifk0Var);
                    iu30Var.invoke(new dfk0(false));
                    return rih1Var;
                }
                if (iOrdinal2 == 3 || iOrdinal2 == 4) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                Object objInvoke2 = iu30Var2.invoke(obj);
                return (String) (((Boolean) iu30Var.invoke(obj)).booleanValue() ? objInvoke2 : null);
            default:
                Object objInvoke3 = iu30Var2.invoke(obj);
                String str = (String) objInvoke3;
                if (((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                    Set set = s4b1.f;
                    if (uic.h(str, blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6) || uic.g(str, blc0.fh)) {
                        obj2 = objInvoke3;
                    }
                }
                return (String) obj2;
        }
    }
}
