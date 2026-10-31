package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dke1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fke1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dke1(fke1 fke1Var, byte b) {
        super(1);
        this.a = b;
        this.b = fke1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fke1 fke1Var = this.b;
        switch (b) {
            case 0:
                fke1Var.Z0 = ((Number) ((o95) obj).e()).floatValue();
                dio1.z(fke1Var);
                break;
            case 1:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(fke1Var.Z0);
                kd31Var.A(fke1Var.U0);
                kd31Var.b(1.0f - ((float) Math.sqrt(yoi1.o(Math.abs(fke1Var.Z0) / 90.0f, 0.0f, 1.0f))));
                break;
            default:
                long j = ((Offset) obj).a;
                float f = fke1Var.X0;
                long j2 = fke1Var.U0;
                int i = ofg1.c;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fke1Var.U0 & 4294967295L)) * fke1Var.Y0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32)) - fIntBitsToFloat;
                float f2 = -(Float.intBitsToFloat((int) (j & 4294967295L)) - fIntBitsToFloat2);
                fke1Var.d1 = (float) Math.sqrt((f2 * f2) + (fIntBitsToFloat3 * fIntBitsToFloat3));
                fke1Var.c1 = (float) Math.atan2(fIntBitsToFloat3, f2);
                fke1Var.e1.d();
                break;
        }
        return rih1Var;
    }
}
