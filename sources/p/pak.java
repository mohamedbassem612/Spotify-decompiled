package p;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pak extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pak(tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float fFloatValue = 0.0f;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                abk abkVar = (abk) obj;
                Consumer consumer = (Consumer) tob1Var.getValue();
                if (consumer != null) {
                    consumer.accept(abkVar);
                }
                return rih1Var;
            case 1:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 2:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 3:
                return new qr80(((long) jch0.U(((Number) tob1Var.getValue()).floatValue())) & 4294967295L);
            case 4:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 5:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 6:
                kd31 kd31Var = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var, 2);
                float fH = kd31Var.T0.h() * 50.0f;
                float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var.E(fH * (fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f));
                return rih1Var;
            case 7:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 8:
                kd31 kd31Var2 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var2, 2);
                float fH2 = kd31Var2.T0.h() * 50.0f;
                float fFloatValue3 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var2.E(fH2 * (fFloatValue3 >= 0.0f ? fFloatValue3 : 0.0f));
                return rih1Var;
            case 9:
                kd31 kd31Var3 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var3, 2);
                float fH3 = kd31Var3.T0.h() * 50.0f;
                float fFloatValue4 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var3.E(fH3 * (fFloatValue4 >= 0.0f ? fFloatValue4 : 0.0f));
                return rih1Var;
            case 10:
                kd31 kd31Var4 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var4, 2);
                float fH4 = kd31Var4.T0.h() * 50.0f;
                float fFloatValue5 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var4.E(fH4 * (fFloatValue5 >= 0.0f ? fFloatValue5 : 0.0f));
                return rih1Var;
            case 11:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 12:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 13:
                Set set = nz80.a;
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 14:
                kd31 kd31Var5 = (kd31) obj;
                zjy.m((Number) tob1Var.getValue(), kd31Var5, 2);
                kd31Var5.E((1.0f - ((Number) tob1Var.getValue()).floatValue()) * kd31Var5.T0.h() * 50.0f);
                return rih1Var;
            case 15:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 16:
                kd31 kd31Var6 = (kd31) obj;
                zjy.m((Number) tob1Var.getValue(), kd31Var6, 2);
                float fH5 = kd31Var6.T0.h() * 50.0f;
                float fFloatValue6 = 1.0f - ((Number) tob1Var.getValue()).floatValue();
                kd31Var6.E(fH5 * (fFloatValue6 >= 0.0f ? fFloatValue6 : 0.0f));
                return rih1Var;
            case 17:
                kd31 kd31Var7 = (kd31) obj;
                zjy.m((Number) tob1Var.getValue(), kd31Var7, 2);
                float fH6 = kd31Var7.T0.h() * 50.0f;
                float fFloatValue7 = 1.0f - ((Number) tob1Var.getValue()).floatValue();
                kd31Var7.E(fH6 * (fFloatValue7 >= 0.0f ? fFloatValue7 : 0.0f));
                return rih1Var;
            case 18:
                kd31 kd31Var8 = (kd31) obj;
                kd31Var8.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var8.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 19:
                kd31 kd31Var9 = (kd31) obj;
                if (((Number) tob1Var.getValue()).floatValue() < 0.0f) {
                    fFloatValue = ((Number) tob1Var.getValue()).floatValue() + 1.0f;
                } else if (((Number) tob1Var.getValue()).floatValue() != 1.0f) {
                    fFloatValue = 1.0f;
                }
                kd31Var9.b(fFloatValue);
                kd31Var9.i(2);
                return rih1Var;
            case 20:
                return new qr80(((long) ((int) (((int) ((wat) obj).X0(50.0f)) * (((Number) tob1Var.getValue()).floatValue() >= 0.0f ? ((Number) tob1Var.getValue()).floatValue() : 0.0f)))) & 4294967295L);
            case 21:
                kd31 kd31Var10 = (kd31) obj;
                if (((Number) tob1Var.getValue()).floatValue() < 0.0f) {
                    fFloatValue = ((Number) tob1Var.getValue()).floatValue() + 1.0f;
                } else if (((Number) tob1Var.getValue()).floatValue() != 1.0f) {
                    fFloatValue = 1.0f;
                }
                kd31Var10.b(fFloatValue);
                kd31Var10.i(2);
                return rih1Var;
            case 22:
                return new qr80(((long) ((int) (((int) ((wat) obj).X0(30.0f)) * (((Number) tob1Var.getValue()).floatValue() >= 0.0f ? ((Number) tob1Var.getValue()).floatValue() : 0.0f)))) & 4294967295L);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                kd31 kd31Var11 = (kd31) obj;
                kd31Var11.b(((Number) tob1Var.getValue()).floatValue() != 0.0f ? 1.0f : 0.0f);
                kd31Var11.i(2);
                kd31Var11.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var11.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 24:
                kd31 kd31Var12 = (kd31) obj;
                kd31Var12.b(p3v.c(((p3v) tob1Var.getValue()).a, 10.0f) ? 0.0f : 1.0f);
                kd31Var12.i(2);
                kd31Var12.E(kd31Var12.T0.h() * ((p3v) tob1Var.getValue()).a);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                kd31 kd31Var13 = (kd31) obj;
                kd31Var13.b(p3v.c(((p3v) tob1Var.getValue()).a, 30.0f) ? 0.0f : 1.0f);
                kd31Var13.i(2);
                kd31Var13.E(kd31Var13.T0.h() * ((p3v) tob1Var.getValue()).a);
                return rih1Var;
            case 26:
                u84 u84VarP = ((DrawScope) obj).a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawColor(z4p1.G(((u7h) tob1Var.getValue()).a));
                return rih1Var;
            case 27:
                kd31 kd31Var14 = (kd31) obj;
                float f = ((p3v) tob1Var.getValue()).a;
                kd31Var14.f(p3v.b(f, 0.0f) > 0);
                kd31Var14.w(er31.b(f));
                return rih1Var;
            case 28:
                kd31 kd31Var15 = (kd31) obj;
                zjy.m((Number) tob1Var.getValue(), kd31Var15, 2);
                vq60 vq60Var = htj0.a;
                kd31Var15.E((1.0f - ((Number) tob1Var.getValue()).floatValue()) * kd31Var15.T0.h() * 50.0f);
                return rih1Var;
            default:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
        }
    }
}
