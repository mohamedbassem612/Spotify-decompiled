package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lq2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq2(tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
                List list = qq2.a;
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                float f = 1.5f * fFloatValue;
                float f2 = (f * 0.15f) + 0.7853982f;
                float f3 = (f * 0.22f) + 0.7853982f;
                float fSin = (0.15f * fIntBitsToFloat3 * ((float) Math.sin(1.3f * f2))) + (fIntBitsToFloat3 * 0.4f * ((float) Math.sin((f2 * 0.7f) + 0.3f)));
                float fCos = (((float) Math.cos(0.8f * f2)) * 6.0f) + (((float) Math.sin(f2 * 0.5f)) * 10.0f);
                float fSin2 = ((((((float) Math.sin(f2 * 0.4f)) * 0.3f) + 0.5f) * 20.0f) + 25.0f) / 100.0f;
                float fSin3 = ((((float) Math.sin(f2 * 0.6f)) * 15.0f) + 50.0f) / 100.0f;
                float fCos2 = (0.1f * fIntBitsToFloat3 * ((float) Math.cos(f3 * 0.6f))) + (0.35f * fIntBitsToFloat3 * ((float) Math.sin((0.9f * f3) + 2.0f)));
                float f4 = f3 * 0.7f;
                float fSin4 = (((float) Math.sin(1.1f * f3)) * 5.0f) + (((float) Math.cos(f4 + 1.0f)) * 12.0f);
                float fCos3 = ((((((float) Math.cos(f3 * 0.5f)) * 0.3f) + 0.5f) * 18.0f) + 20.0f) / 100.0f;
                float fCos4 = ((((float) Math.cos(f4)) * 20.0f) + 45.0f) / 100.0f;
                pq2 pq2Var = new pq2(fSin, fCos, fSin2 * 0.7f * 2.2f * fIntBitsToFloat3, fSin3 * 0.7f * 2.2f * fIntBitsToFloat4, qq2.a(fFloatValue, qq2.a));
                pq2 pq2Var2 = new pq2(fCos2, fSin4, fCos3 * 0.7f * 2.2f * fIntBitsToFloat3, fCos4 * 0.7f * 2.2f * fIntBitsToFloat4, qq2.a(fFloatValue + 2.0f, qq2.b));
                oq2.c(drawScope, pq2Var, fIntBitsToFloat, fIntBitsToFloat2);
                oq2.c(drawScope, pq2Var2, fIntBitsToFloat, fIntBitsToFloat2);
                return rih1Var;
            case 1:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 2:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 3:
                kd31 kd31Var2 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var2, 2);
                float fH = kd31Var2.T0.h() * 50.0f;
                float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                kd31Var2.E(fH * fFloatValue2);
                return rih1Var;
            case 4:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 5:
                ((kd31) obj).b(tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 1.0f);
                return rih1Var;
            case 6:
                return new qr80(((long) jch0.U(((Number) tob1Var.getValue()).floatValue())) << 32);
            case 7:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.q(((Number) tob1Var.getValue()).floatValue() * 2.5f);
                kd31Var3.r(kd31Var3.b);
                kd31Var3.b(((Number) tob1Var.getValue()).floatValue());
                kd31Var3.A(sgc1.u(0.5f, 1.0f));
                kd31Var3.i(2);
                return rih1Var;
            case 8:
                boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                if (zBooleanValue) {
                    bpb1 bpb1Var = fk41.b;
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                return new gi6(zBooleanValue);
            case 9:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 10:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 11:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 12:
                kd31 kd31Var4 = (kd31) obj;
                float fFloatValue3 = ((Number) tob1Var.getValue()).floatValue();
                int i = if8.a;
                kd31Var4.b(fFloatValue3);
                kd31Var4.i(2);
                kd31Var4.E(kd31Var4.T0.h() * 50.0f * (1.0f - fFloatValue3));
                return rih1Var;
            case 13:
                kd31 kd31Var5 = (kd31) obj;
                float fFloatValue4 = ((Number) tob1Var.getValue()).floatValue();
                int i2 = if8.a;
                kd31Var5.b(fFloatValue4);
                kd31Var5.i(2);
                kd31Var5.E(kd31Var5.T0.h() * 50.0f * (1.0f - fFloatValue4));
                return rih1Var;
            case 14:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 15:
                DrawScope.d0((DrawScope) obj, ((u7h) tob1Var.getValue()).a, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 16:
                v8r.u((kd31) obj, ((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 17:
                v8r.u((kd31) obj, ((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 18:
                v8r.u((kd31) obj, ((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 19:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 20:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 21:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 22:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 23:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var6.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 24:
                kd31 kd31Var7 = (kd31) obj;
                kd31Var7.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var7.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 25:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 26:
                ((kd31) obj).p(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 27:
                kd31 kd31Var8 = (kd31) obj;
                kd31Var8.b(((Number) tob1Var.getValue()).floatValue());
                kd31Var8.A(ofg1.b);
                return rih1Var;
            case 28:
                kd31 kd31Var9 = (kd31) obj;
                kd31Var9.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var9.r(((Number) tob1Var.getValue()).floatValue());
                kd31Var9.b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            default:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
        }
    }
}
