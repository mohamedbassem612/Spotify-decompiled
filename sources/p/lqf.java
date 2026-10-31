package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lqf implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    public /* synthetic */ lqf(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        ven0 ven0Var2 = this.c;
        ven0 ven0Var3 = this.d;
        switch (b) {
            case 0:
                h5f h5fVar = (h5f) o7h.t0(((Number) obj).intValue(), (List) ven0Var.getValue());
                if (h5fVar != null && h5fVar != ven0Var2.getValue()) {
                    ((iu30) ven0Var3.getValue()).invoke(h5fVar);
                }
                return rih1Var;
            default:
                s8l1 s8l1Var = (u8l1) obj;
                if (s8l1Var instanceof s8l1) {
                    r160 r160Var = s8l1Var.a;
                    ven0Var.setValue(r160Var.b);
                    ven0Var2.setValue(r160Var.d);
                    ven0Var3.setValue(Boolean.valueOf(r160Var.e));
                    return rih1Var;
                }
                if (!u890.j(s8l1Var, t8l1.a)) {
                    eg.o();
                    return null;
                }
                ven0Var.setValue((Object) null);
                ven0Var2.setValue((Object) null);
                ven0Var3.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }
}
