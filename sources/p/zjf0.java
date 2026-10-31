package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zjf0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ zjf0(iu30 iu30Var, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                iu30Var.invoke(new fif0(((Number) ((Function0) ven0Var.getValue()).invoke()).intValue(), (tv80) obj));
                break;
            default:
                a701 a701Var = (c701) obj;
                if (a701Var instanceof a701) {
                    ven0Var.setValue(a701Var.a);
                }
                iu30Var.invoke(a701Var);
                break;
        }
        return rih1Var;
    }
}
