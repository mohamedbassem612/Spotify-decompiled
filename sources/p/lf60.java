package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lf60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf60(Object obj, Object obj2, float f, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = f;
        this.e = obj3;
        this.f = obj4;
    }

    public final Object invoke(Object obj) {
        float f;
        byte b = this.a;
        float f2 = 1.0f;
        rih1 rih1Var = rih1.a;
        float f3 = this.c;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                smc0 smc0Var = (smc0) obj4;
                rtb0Var.e(smc0Var.b(), new jf60(smc0Var, (byte) 0), new jf60(smc0Var, (byte) 1), new j2i(802480018, new kf60(smc0Var, f3, (rsq) obj5, (byte) 0), true));
                List list = (List) obj2;
                rtb0Var.e(list.size(), new xg50(list, (byte) 4), new xg50(list, (byte) 5), new j2i(802480018, new kf60(list, f3, (qsq) obj3, (byte) 1), true));
                break;
            case 1:
                float fFloatValue = ((Number) ((o95) obj4).e()).floatValue() * 1050.0f;
                Paint paint = (Paint) obj5;
                eyz0 eyz0Var = (eyz0) obj3;
                u84 u84VarP = ((DrawScope) obj).a1().p();
                for (i0s0 i0s0Var : (List) obj2) {
                    short s = i0s0Var.a;
                    long j = i0s0Var.d;
                    long j2 = i0s0Var.c;
                    float fO = yoi1.o((fFloatValue - s) / i0s0Var.b, 0.0f, f2);
                    if (fFloatValue < i0s0Var.a || fO >= f2) {
                        f = f2;
                    } else {
                        float fA = fyz0.a.a(fO);
                        f = f2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(us71.e((int) (j & 4294967295L), fA, Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(us71.e((int) (j >> 32), fA, Float.intBitsToFloat((int) (j2 >> 32))))) << 32);
                        float f4 = i0s0Var.e;
                        float fE = l1d.e(i0s0Var.f, f4, fA, f4);
                        float fA2 = fO < 0.15f ? fyz0.b.a(fO / 0.15f) : fO <= 0.7f ? f : f - fyz0.b.a((fO - 0.7f) / 0.3f);
                        paint.setAlpha(jch0.U((fO < 0.1f ? fyz0.b.a(fO / 0.1f) : fO <= 0.75f ? f : f - fyz0.b.a((fO - 0.75f) / 0.25f)) * 255.0f));
                        Canvas canvas = v84.a;
                        Canvas canvas2 = u84VarP.a;
                        canvas2.save();
                        canvas2.translate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                        canvas2.rotate(fE);
                        canvas2.scale(fA2, fA2);
                        canvas2.drawText(eyz0Var.b, 0.0f, f3, paint);
                        canvas2.restore();
                    }
                    rih1Var = rih1Var;
                    f2 = f;
                }
                break;
            default:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue2 = ((Number) ((o95) obj4).e()).floatValue() + uvg0.g((ven0) obj5);
                float fFloatValue3 = ((Number) ((o95) obj2).e()).floatValue() + uvg0.h((ven0) obj3);
                kd31Var.b(f3);
                kd31Var.C(fFloatValue2);
                kd31Var.E(((1.0f - f3) * 50.0f) + fFloatValue3);
                kd31Var.p(fFloatValue2 / 30.0f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf60(o95 o95Var, List list, Paint paint, eyz0 eyz0Var, float f) {
        super(1);
        this.a = (byte) 1;
        this.d = o95Var;
        this.b = list;
        this.e = paint;
        this.f = eyz0Var;
        this.c = f;
    }
}
