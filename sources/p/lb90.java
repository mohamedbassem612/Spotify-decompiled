package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lb90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ drr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb90(drr0 drr0Var, tob1 tob1Var) {
        super(1);
        this.a = (byte) 2;
        this.c = drr0Var;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.c;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).E(drr0Var.s() * (-((Number) tob1Var.getValue()).floatValue()));
                return rih1Var;
            case 1:
                ((kd31) obj).E(drr0Var.s() * (1.0f - ((Number) tob1Var.getValue()).floatValue()));
                return rih1Var;
            default:
                float fO = yoi1.o(((Number) ((o95) obj).e()).floatValue(), 0.0f, ((Number) tob1Var.getValue()).floatValue());
                drr0Var.t(fO);
                if (fO == 0.0f || fO == ((Number) tob1Var.getValue()).floatValue()) {
                    throw new CancellationException("Pan boundary reached");
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb90(tob1 tob1Var, drr0 drr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
        this.c = drr0Var;
    }
}
