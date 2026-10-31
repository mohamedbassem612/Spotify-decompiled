package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy(tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
        this.c = tob1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        tob1 tob1Var2 = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(((Number) tob1Var2.getValue()).floatValue());
                kd31Var.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 1:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(((Number) tob1Var.getValue()).floatValue() * ((Number) tob1Var2.getValue()).floatValue());
                kd31Var2.i(2);
                return rih1Var;
            case 2:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b((1.0f - ((Number) tob1Var.getValue()).floatValue()) * (1.0f - ((Number) tob1Var2.getValue()).floatValue()));
                kd31Var3.i(2);
                pxg1 pxg1Var = rka.a;
                float fH = kd31Var3.T0.h() * 50.0f;
                float fFloatValue = ((Number) tob1Var2.getValue()).floatValue();
                kd31Var3.E(fH * (fFloatValue >= 0.0f ? fFloatValue : 0.0f));
                return rih1Var;
            case 3:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.n(((Number) tob1Var2.getValue()).floatValue());
                kd31Var4.A(sgc1.u(0.0f, 0.5f));
                kd31Var4.e(17.0f);
                kd31Var4.u(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 4:
                kd31 kd31Var5 = (kd31) obj;
                zjy.m((Number) tob1Var2.getValue(), kd31Var5, 2);
                kd31Var5.E(((Number) tob1Var.getValue()).floatValue() * kd31Var5.T0.h() * 50.0f);
                return rih1Var;
            case 5:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.b(((Number) tob1Var2.getValue()).floatValue());
                kd31Var6.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var6.r(((Number) tob1Var.getValue()).floatValue());
                kd31Var6.i(2);
                return rih1Var;
            case 6:
                ((kd31) obj).f(((Number) tob1Var2.getValue()).floatValue() == 1.0f && ((Number) tob1Var.getValue()).floatValue() == 0.0f);
                return rih1Var;
            case 7:
                kd31 kd31Var7 = (kd31) obj;
                kd31Var7.q(((Number) tob1Var2.getValue()).floatValue());
                kd31Var7.r(((Number) tob1Var2.getValue()).floatValue());
                kd31Var7.p(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 8:
                kd31 kd31Var8 = (kd31) obj;
                kd31Var8.b(((Number) tob1Var2.getValue()).floatValue());
                kd31Var8.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var8.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 9:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.S0(drawScope, v9c.s(p7h.M(new u7h[]{tob1Var2.getValue(), tob1Var.getValue()}), 0.0f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.85f, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 10:
                kd31 kd31Var9 = (kd31) obj;
                kd31Var9.b(((Number) tob1Var2.getValue()).floatValue());
                kd31Var9.E(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 11:
                kd31 kd31Var10 = (kd31) obj;
                kd31Var10.q(((Number) tob1Var2.getValue()).floatValue());
                kd31Var10.r(((Number) tob1Var2.getValue()).floatValue());
                kd31Var10.b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 12:
                return new qr80((((long) ((int) ((Number) tob1Var.getValue()).floatValue())) & 4294967295L) | (((long) ((int) ((Number) tob1Var2.getValue()).floatValue())) << 32));
            case 13:
                kd31 kd31Var11 = (kd31) obj;
                kd31Var11.q(((Number) tob1Var2.getValue()).floatValue());
                kd31Var11.r(((Number) tob1Var2.getValue()).floatValue());
                kd31Var11.b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            default:
                kd31 kd31Var12 = (kd31) obj;
                kd31Var12.E(((Number) tob1Var2.getValue()).floatValue());
                kd31Var12.b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
        }
    }
}
