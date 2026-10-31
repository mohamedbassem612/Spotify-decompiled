package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tqm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqm(drr0 drr0Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = drr0Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        drr0 drr0Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                if (drr0Var.s() <= 1.0f) {
                    drr0Var.t(2.0f);
                } else {
                    drr0Var.t(1.0f);
                    kaa0.j(0L, ven0Var);
                }
                break;
            case 1:
                long j2 = ((Offset) obj).a;
                if (drr0Var.s() <= 1.0f) {
                    drr0Var.t(2.5f);
                } else {
                    drr0Var.t(1.0f);
                    kaa0.j(0L, ven0Var);
                }
                break;
            case 2:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(drr0Var.s());
                kd31Var.r(drr0Var.s());
                kd31Var.C(Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a >> 32)));
                kd31Var.E(Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a & 4294967295L)));
                break;
            default:
                long j3 = ((Offset) obj).a;
                if (drr0Var.s() <= 1.01f) {
                    drr0Var.t(2.2f);
                } else {
                    drr0Var.t(1.0f);
                    kaa0.j(0L, ven0Var);
                }
                break;
        }
        return rih1Var;
    }
}
