package p;

import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dv91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ev91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv91(ev91 ev91Var, byte b) {
        super(1);
        this.a = b;
        this.b = ev91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ev91 ev91Var = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                long j = ((Offset) ev91Var.U0.e()).a;
                kd31Var.C(Float.intBitsToFloat((int) (j >> 32)));
                kd31Var.E(Float.intBitsToFloat((int) (j & 4294967295L)));
                break;
            case 1:
                long j2 = ((Offset) obj).a;
                ev91Var.V0 = true;
                xab1 xab1Var = ev91Var.W0;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                ev91Var.W0 = null;
                break;
            default:
                dio1.z(ev91Var);
                break;
        }
        return rih1Var;
    }
}
