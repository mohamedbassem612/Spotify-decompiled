package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vg31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg31 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg31(gg31 gg31Var, iu30 iu30Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = gg31Var;
        this.c = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ven0 ven0Var = this.d;
        gg31 gg31Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                if (((Boolean) ven0Var.getValue()).booleanValue() && (gg31Var.n instanceof eg31) && gg31Var.w.equals(yf31.a)) {
                    iu30Var.invoke(mf31.a);
                }
                break;
            default:
                long j2 = ((Offset) obj).a;
                fg31 fg31Var = gg31Var.n;
                if ((fg31Var instanceof cg31) || (((Boolean) ven0Var.getValue()).booleanValue() && (fg31Var instanceof eg31) && !gg31Var.w.equals(vf31.a))) {
                    iu30Var.invoke(of31.a);
                }
                break;
        }
        return rih1Var;
    }
}
