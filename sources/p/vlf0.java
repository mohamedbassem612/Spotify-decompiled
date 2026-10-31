package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vlf0 extends hab0 implements iu30 {
    public final /* synthetic */ y9e1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlf0(y9e1 y9e1Var, long j, cb80 cb80Var) {
        super(1);
        this.a = y9e1Var;
        this.b = j;
        this.c = cb80Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fX0 = drawScope.X0(4.0f);
        char c = ' ';
        long j = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L);
        tob1 tob1Var = this.c;
        y9e1 y9e1Var = this.a;
        if (y9e1Var != null) {
            zrm0 zrm0Var = y9e1Var.b;
            int i = zrm0Var.f;
            int i2 = 0;
            while (i2 < i) {
                float fG = y9e1Var.g(i2);
                float fH = y9e1Var.h(i2);
                float f = zrm0Var.f(i2);
                float fB = zrm0Var.b(i2);
                float f2 = fH - fG;
                float fA = k2d0.a(tob1Var) * f2;
                char c2 = c;
                long j2 = j;
                long j3 = this.b;
                DrawScope drawScope2 = drawScope;
                y9e1 y9e1Var2 = y9e1Var;
                List listM = p7h.M(new u7h(u7h.b(j3, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j3, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j3, 0.1f, 0.0f, 0.0f, 0.0f, 14)));
                float f3 = fG + fA;
                zrm0 zrm0Var2 = zrm0Var;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) & j2) | (Float.floatToRawIntBits(f3) << c2);
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f3 + f2);
                long j4 = jFloatToRawIntBits;
                drawScope = drawScope2;
                DrawScope.c0(drawScope, v9c.m(jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fB)) & j2) | (jFloatToRawIntBits3 << c2), listM), (((long) Float.floatToRawIntBits(fG)) << c2) | (((long) Float.floatToRawIntBits(f)) & j2), (Float.floatToRawIntBits(f2) << c2) | (((long) Float.floatToRawIntBits(fB - f)) & j2), j4, 0.0f, (DrawStyle) null, 240);
                i2++;
                c = c2;
                jFloatToRawIntBits = j4;
                zrm0Var = zrm0Var2;
                i = i;
                y9e1Var = y9e1Var2;
                j = j2;
            }
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            float fA2 = k2d0.a(tob1Var) * fIntBitsToFloat;
            long j5 = this.b;
            List listM2 = p7h.M(new u7h(u7h.b(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14)));
            DrawScope.c0(drawScope, v9c.m((((long) Float.floatToRawIntBits(fA2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fA2 + fIntBitsToFloat) << 32), listM2), 0L, 0L, jFloatToRawIntBits, 0.0f, (DrawStyle) null, 246);
        }
        return rih1.a;
    }
}
