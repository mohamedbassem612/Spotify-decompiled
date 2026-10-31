package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class waf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ waf1(byte b, float f) {
        super(1);
        this.a = b;
        this.b = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(f);
                kd31Var.i(2);
                return rih1Var;
            case 1:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(f);
                kd31Var2.i(2);
                return rih1Var;
            case 2:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b(1.0f - f);
                kd31Var3.i(2);
                kd31Var3.E(kd31Var3.T0.h() * 50.0f * (f >= 0.0f ? f : 0.0f));
                return rih1Var;
            case 3:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.b(1.0f - f);
                kd31Var4.E(kd31Var4.T0.h() * 50.0f * (f >= 0.0f ? f : 0.0f));
                return rih1Var;
            case 4:
                kd31 kd31Var5 = (kd31) obj;
                kd31Var5.b(1.0f - f);
                kd31Var5.E(kd31Var5.T0.h() * 50.0f * (f >= 0.0f ? f : 0.0f));
                return rih1Var;
            case 5:
                ((kd31) obj).b(f);
                return rih1Var;
            case 6:
                ((kd31) obj).b(1.0f - f);
                return rih1Var;
            case 7:
                ((kd31) obj).b(f);
                return rih1Var;
            case 8:
                ((kd31) obj).p(f * 180.0f);
                return rih1Var;
            case 9:
                return new qr80(((long) ((int) f)) & 4294967295L);
            case 10:
                return new qr80(((long) jch0.U(f)) << 32);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                long j = u7h.j;
                u7h u7hVar = new u7h(j);
                long j2 = u7h.b;
                DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{u7hVar, new u7h(j2)}), 0.0f, f, 8), 0L, Size.b(lslVar.j(), 2, f, 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{new u7h(j2), new u7h(j)}), Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f, Float.intBitsToFloat((int) (lslVar.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Size.b(lslVar.j(), 2, f, 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                return rih1Var;
            case grn1.d /* 12 */:
                return ((eqc) obj).b(new waf1((byte) 11, f));
            case 13:
                float fFloatValue = ((Number) ((mmr0) obj).b).floatValue();
                boolean z = false;
                if (f < 0.0f ? fFloatValue < 0.0f : fFloatValue >= 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ((kd31) obj).b(f);
                return rih1Var;
        }
    }
}
