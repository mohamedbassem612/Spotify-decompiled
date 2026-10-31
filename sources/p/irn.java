package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class irn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irn(y7e1 y7e1Var, iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 1;
        this.b = y7e1Var;
        this.c = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.b;
        iu30 iu30Var = this.c;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(ihc1.e1(y7e1Var.d().d.toString()).toString());
                break;
            case 1:
                ven0Var.setValue("");
                c4p1.q(y7e1Var);
                iu30Var.invoke(b251.a);
                break;
            default:
                ven0Var.setValue(uex0.a);
                iu30Var.invoke(new z151(y7e1Var.d().d.toString(), ""));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ irn(iu30 iu30Var, y7e1 y7e1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.c = iu30Var;
        this.b = y7e1Var;
        this.d = ven0Var;
    }
}
