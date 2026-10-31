package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yf6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ tob1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf6(Object obj, float f, float f2, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        float f2 = this.b;
        Object obj2 = this.d;
        ven0 ven0Var = this.e;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.C(kd31Var.T0.h() * l1d.e(f2, 0.0f, ((Number) ((tob1) obj2).getValue()).floatValue(), 0.0f));
                kd31Var.E(kd31Var.T0.h() * f);
                kd31Var.b(((Number) ven0Var.getValue()).floatValue());
                return rih1Var;
            case 1:
                long j = ((Offset) obj).a;
                long j2 = ((nav0) obj2).Y0;
                float f3 = ((int) (j2 >> 32)) / 2.0f;
                float f4 = ((int) (j2 & 4294967295L)) / 2.0f;
                float fMax = Math.max(((drr0) ven0Var).s() * f2, f) / 2.0f;
                return Boolean.valueOf(Math.abs(Float.intBitsToFloat((int) (j >> 32)) - f3) <= fMax && Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)) - f4) <= fMax);
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(((Boolean) ven0Var.getValue()).booleanValue() ? 0.0f : ((Number) ((tob1) obj2).getValue()).floatValue() * f2 * f);
                kd31Var2.i(2);
                return rih1Var;
        }
    }
}
