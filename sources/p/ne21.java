package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ne21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pe21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne21(pe21 pe21Var, byte b) {
        super(1);
        this.a = b;
        this.b = pe21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pe21 pe21Var = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).E(Float.intBitsToFloat((int) (pe21Var.c() & 4294967295L)));
                break;
            case 1:
                ((kd31) obj).C(Float.intBitsToFloat((int) (pe21Var.c() >> 32)));
                break;
            case 2:
                ((kd31) obj).E(Float.intBitsToFloat((int) (((Offset) pe21Var.v.e()).a & 4294967295L)));
                break;
            default:
                ((kd31) obj).C(Float.intBitsToFloat((int) (((Offset) pe21Var.v.e()).a >> 32)));
                break;
        }
        return rih1Var;
    }
}
