package p;

import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t960 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t960(long j, wat watVar, lee1 lee1Var, yae1 yae1Var, String str, long j2, long j3) {
        super(1);
        this.b = j;
        this.e = watVar;
        this.f = lee1Var;
        this.g = yae1Var;
        this.h = str;
        this.c = j2;
        this.d = j3;
    }

    public final Object invoke(Object obj) {
        lee1 lee1VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.d;
        Object obj2 = this.g;
        long j2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.h;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.d0(drawScope, this.b, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                wat watVar = (wat) obj4;
                xat xatVar = new xat(watVar.h(), 1.0f);
                float f = 0.4261f * fIntBitsToFloat2;
                long jY = fc11.Y(f / watVar.h(), 4294967296L);
                if (Build.VERSION.SDK_INT >= 29) {
                    ga30 ga30VarI = u890.I(130.0f);
                    FontWeight fontWeight = v960.a;
                    lee1VarA = new lee1(0L, jY, fontWeight, hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{ga30VarI, u890.H(fontWeight.a)}))}), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
                } else {
                    lee1VarA = lee1.a((lee1) obj3, 0L, fc11.Y((f * 1.05f) / watVar.h(), 4294967296L), v960.a, (FontStyle) null, new FontSynthesis(1), (FontFamily) null, "liga 1", fc11.Y(-0.07f, 8589934592L), new TextGeometricTransform(2), 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16776489);
                }
                y9e1 y9e1VarA = yae1.a((yae1) obj2, (String) obj5, lee1VarA, 0, false, 0, 0L, (flb0) null, xatVar, 892);
                fid fidVarP = drawScope.a1().p();
                n511 n511Var = new n511(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
                lw4 lw4VarL = fdg1.l();
                lw4VarL.a(0.55f);
                fidVarP.j(n511Var, lw4VarL);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.258f * fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.6894f * fIntBitsToFloat)) << 32);
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).s(-15.0f, jFloatToRawIntBits);
                    long j3 = u7h.f;
                    w5p1.i(drawScope, y9e1VarA, j3, (((long) Float.floatToRawIntBits((-0.7525f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits((-0.2429f) * fIntBitsToFloat2)) & 4294967295L), 0.0f, 248);
                    w5p1.i(drawScope, y9e1VarA, j3, (((long) Float.floatToRawIntBits((-0.6263f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.1065f * fIntBitsToFloat2)) & 4294967295L), 0.0f, 248);
                    w5p1.i(drawScope, y9e1VarA, j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat * (-0.5f))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 * 0.456f)) & 4294967295L), 0.0f, 248);
                    cabVarA1.p().i();
                    cabVarA1.D(jU);
                    DrawScope.S0(drawScope, v9c.s(p7h.M(new u7h[]{new u7h(j2), new u7h(j), new u7h(j2)}), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                    drawScope.a1().p().i();
                    return rih1Var;
                } catch (Throwable th) {
                    i3a.n(cabVarA1, jU);
                    throw th;
                }
            default:
                ((Number) obj).longValue();
                drr0 drr0Var = (drr0) obj5;
                zck0 zck0Var = (zck0) obj3;
                long jB = zck0Var.b + (((yqg) ((res) obj4).f).b() - zck0Var.a);
                long j4 = this.b;
                if (j4 <= 0 || jB < j2) {
                    drr0Var.t(j4 > 0 ? yoi1.o((jB - j) / j4, 0.0f, 1.0f) : 0.0f);
                } else {
                    drr0Var.t(1.0f);
                    ((l811) obj2).a = true;
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t960(res resVar, zck0 zck0Var, long j, long j2, l811 l811Var, long j3, drr0 drr0Var) {
        super(1);
        this.e = resVar;
        this.f = zck0Var;
        this.b = j;
        this.c = j2;
        this.g = l811Var;
        this.d = j3;
        this.h = drr0Var;
    }
}
