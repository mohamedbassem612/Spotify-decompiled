package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(float f, float f2, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                return new Offset((((long) Float.floatToRawIntBits(f2 + ((Number) list.get(0)).floatValue())) << 32) | (((long) Float.floatToRawIntBits(f + ((Number) list.get(1)).floatValue())) & 4294967295L));
            case 1:
                kd31 kd31Var = (kd31) obj;
                kd31Var.E(kd31Var.T0.h() * f2 * f);
                return rih1Var;
            case 2:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(f2);
                kd31Var2.q(f);
                kd31Var2.r(f);
                return rih1Var;
            case 3:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.C(f2 * f);
                kd31Var3.p(f * 3.0f);
                kd31Var3.w(er31.b(8.0f));
                kd31Var3.f(true);
                return rih1Var;
            case 4:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.p(kd31Var4.T0.h() * f2);
                kd31Var4.E(kd31Var4.T0.h() * f);
                return rih1Var;
            case 5:
                return new qr80((((long) jch0.U(f)) & 4294967295L) | (((long) jch0.U(f2)) << 32));
            case 6:
                return new qr80((((long) ((int) f)) & 4294967295L) | (((long) ((int) f2)) << 32));
            case 7:
                kd31 kd31Var5 = (kd31) obj;
                kd31Var5.b(f2);
                kd31Var5.i(2);
                kd31Var5.E(kd31Var5.T0.h() * 50.0f * f);
                return rih1Var;
            case 8:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.E(f2 * 0.5f);
                kd31Var6.b(((-1.0f) * f) + 1.0f);
                float f3 = ((-0.07999998f) * f) + 1.04f;
                kd31Var6.q(f3);
                kd31Var6.r(f3);
                return rih1Var;
            case 9:
                return Boolean.valueOf(((w5o0) obj).dispatchNestedPreFling(f2, f));
            case 10:
                kd31 kd31Var7 = (kd31) obj;
                kd31Var7.E(f2);
                kd31Var7.b(f);
                return rih1Var;
            case 11:
                kd31 kd31Var8 = (kd31) obj;
                kd31Var8.b(1.0f - f2);
                kd31Var8.C(kd31Var8.T0.h() * 16.0f * f2 * f);
                return rih1Var;
            case 12:
                kd31 kd31Var9 = (kd31) obj;
                kd31Var9.b(1.0f - f2);
                kd31Var9.C(kd31Var9.T0.h() * 16.0f * f2 * f);
                return rih1Var;
            case 13:
                return new qr80(((long) jch0.U(f2 - (f / 2.0f))) << 32);
            case 14:
                return Integer.valueOf((int) ((((Number) obj).intValue() * f2) - f));
            case 15:
                kd31 kd31Var10 = (kd31) obj;
                kd31Var10.b(f2 * f);
                kd31Var10.i(2);
                return rih1Var;
            case 16:
                kd31 kd31Var11 = (kd31) obj;
                kd31Var11.b(f2 * f);
                kd31Var11.i(2);
                return rih1Var;
            case 17:
                ((kd31) obj).E(f2 * f);
                return rih1Var;
            default:
                return new qr80((((long) ((int) f)) & 4294967295L) | (((long) ((int) f2)) << 32));
        }
    }
}
