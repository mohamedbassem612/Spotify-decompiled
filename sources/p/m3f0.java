package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3f0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3f0(tob1 tob1Var, o95 o95Var, dui1 dui1Var, long j, long j2, mic0 mic0Var) {
        super(1);
        this.d = tob1Var;
        this.e = o95Var;
        this.f = dui1Var;
        this.b = j;
        this.c = j2;
        this.g = mic0Var;
    }

    public final Object invoke(Object obj) {
        zje1 zje1Var;
        long j;
        lee1 lee1VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j2 = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        long j3 = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                tob1 tob1Var = (tob1) obj5;
                float fFloatValue = tob1Var != null ? ((Number) ((o95) obj4).e()).floatValue() : 0.0f;
                if (fFloatValue <= 0.0f || tob1Var == null || (zje1Var = (zje1) tob1Var.getValue()) == null) {
                    zje1Var = new zje1();
                }
                float f = zje1Var.a * fFloatValue;
                float f2 = zje1Var.b * fFloatValue;
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                if (fSqrt > 1.0f) {
                    fSqrt = 1.0f;
                }
                long j4 = drawScope.j();
                long j5 = u7h.f;
                jmr0.g((dui1) obj3, drawScope, j4, 0.0f, new f2b(j5, 5), 2);
                long jH = Offset.h(1.2f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * f)) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
                mic0 mic0Var = (mic0) obj2;
                ((dg8) drawScope.a1().b).z(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    DrawScope.S0(drawScope, mic0Var, jH ^ (-9223372034707292160L), drawScope.j(), (0.3f * fSqrt) + 0.45f, (DrawStyle) null, (ColorFilter) null, 9, 48);
                    ((dg8) drawScope.a1().b).z(-fIntBitsToFloat, -fIntBitsToFloat2);
                    if (fFloatValue > 0.0f) {
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fd21.g(f2, 0.5f, 0.5f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(fd21.g(f, 0.5f, 0.5f, Float.intBitsToFloat((int) (drawScope.j() >> 32))))) << 32);
                        float fP = c13.p(fSqrt, 0.4f, 0.15f, fFloatValue);
                        j = j5;
                        DrawScope.S0(drawScope, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j5, fP, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.7f), new u7h(u7h.j))}, jFloatToRawIntBits, Size.e(drawScope.j()) * 0.55f, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 9, 62);
                    } else {
                        j = j5;
                    }
                    long jH2 = Offset.h(0.25f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * f)) << 32));
                    DrawScope.S0(drawScope, v9c.l(new mmr0[]{new mmr0(Float.valueOf(0.015f), new u7h(u7h.b(j, 0.95f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, Offset.g(j3, jH2), Offset.g(j2, jH2), 0), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                    return rih1Var;
                } catch (Throwable th) {
                    ((dg8) drawScope.a1().b).z(-fIntBitsToFloat, -fIntBitsToFloat2);
                    throw th;
                }
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.j() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L));
                wat watVar = (wat) obj5;
                xat xatVar = new xat(watVar.h(), 1.0f);
                float f3 = 0.4261f * fIntBitsToFloat4;
                long jY = fc11.Y(f3 / watVar.h(), 4294967296L);
                if (Build.VERSION.SDK_INT >= 29) {
                    ga30 ga30VarI = u890.I(130.0f);
                    FontWeight fontWeight = n8h0.a;
                    lee1VarA = new lee1(0L, jY, fontWeight, hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{ga30VarI, u890.H(fontWeight.a)}))}), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
                } else {
                    lee1VarA = lee1.a((lee1) obj4, 0L, fc11.Y((f3 * 1.05f) / watVar.h(), 4294967296L), n8h0.a, (FontStyle) null, new FontSynthesis(1), (FontFamily) null, "liga 1", fc11.Y(-0.07f, 8589934592L), new TextGeometricTransform(2), 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16776489);
                }
                y9e1 y9e1VarA = yae1.a((yae1) obj3, (String) obj2, lee1VarA, 0, false, 0, 0L, (flb0) null, xatVar, 892);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.258f * fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.6894f * fIntBitsToFloat3)) << 32);
                cab cabVarA1 = drawScope2.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).s(-15.0f, jFloatToRawIntBits2);
                    long j6 = u7h.f;
                    w5p1.i(drawScope2, y9e1VarA, j6, (((long) Float.floatToRawIntBits((-0.7525f) * fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits((-0.2429f) * fIntBitsToFloat4)) & 4294967295L), 0.0f, 248);
                    w5p1.i(drawScope2, y9e1VarA, j6, (((long) Float.floatToRawIntBits((-0.6263f) * fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(0.1065f * fIntBitsToFloat4)) & 4294967295L), 0.0f, 248);
                    w5p1.i(drawScope2, y9e1VarA, j6, (((long) Float.floatToRawIntBits((-0.5f) * fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 * 0.456f)) & 4294967295L), 0.0f, 248);
                    cabVarA1.p().i();
                    cabVarA1.D(jU);
                    DrawScope.S0(drawScope2, v9c.s(p7h.M(new u7h[]{new u7h(j3), new u7h(j2), new u7h(j3)}), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                    return rih1Var;
                } catch (Throwable th2) {
                    i3a.n(cabVarA1, jU);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3f0(wat watVar, lee1 lee1Var, yae1 yae1Var, String str, long j, long j2) {
        super(1);
        this.d = watVar;
        this.e = lee1Var;
        this.f = yae1Var;
        this.g = str;
        this.b = j;
        this.c = j2;
    }
}
