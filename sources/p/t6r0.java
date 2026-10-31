package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t6r0 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ jkr0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6r0(float f, float f2, float f3, jkr0 jkr0Var, float f4, long j, long j2) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = jkr0Var;
        this.e = f4;
        this.f = j;
        this.g = j2;
    }

    public final Object invoke(Object obj) throws Throwable {
        float f;
        float f2;
        t6r0 t6r0Var = this;
        DrawScope drawScope = (DrawScope) obj;
        float fX0 = drawScope.X0(t6r0Var.a);
        float fX1 = drawScope.X0(t6r0Var.b);
        float fX2 = drawScope.X0(t6r0Var.c);
        jkr0 jkr0Var = t6r0Var.d;
        int iMin = Math.min(jkr0Var.l(), 5);
        char c = ' ';
        float f3 = 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) - (((iMin - 1) * fX2) + ((iMin * fX1) + fX0))) / 2.0f;
        float f4 = (-((Number) qpn1.n(jkr0Var).a).floatValue()) * fX1;
        float f5 = 1.0f;
        float fFloatValue = (((Number) qpn1.n(jkr0Var).a).floatValue() - 1.0f) * fX2;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        float f6 = (f4 - fFloatValue) + fIntBitsToFloat;
        float f7 = t6r0Var.e;
        ((dg8) drawScope.a1().b).z(f6, 0.0f);
        float f8 = fX1 / 2.0f;
        try {
            int iL = jkr0Var.l();
            float f9 = 0.0f;
            int i = 0;
            while (i < iL) {
                int iN = (int) u2o1.n(jkr0Var);
                int i2 = iN + 1;
                float fN = (fX0 - fX1) * (u2o1.n(jkr0Var) % f5);
                if (i == iN) {
                    f2 = fX0 - fN;
                } else {
                    f2 = i == i2 ? fX1 + fN : fX1;
                }
                float fV = qpn1.v(jkr0Var, i, drawScope.X0(f7), f2);
                char c2 = c;
                float fV2 = qpn1.v(jkr0Var, i, drawScope.X0(f7), fX1);
                float f10 = f3;
                int iN2 = (int) u2o1.n(jkr0Var);
                float f11 = f5;
                int i3 = iN2 + 1;
                long j = t6r0Var.f;
                DrawScope drawScope2 = drawScope;
                float f12 = f7;
                long jA = t6r0Var.g;
                if (i == iN2) {
                    try {
                        jA = z4p1.A(u2o1.n(jkr0Var) % f11, j, jA);
                    } catch (Throwable th) {
                        th = th;
                        drawScope = drawScope2;
                        f = -0.0f;
                        ((dg8) drawScope.a1().b).z(-f6, f);
                        throw th;
                    }
                } else if (i == i3) {
                    jA = z4p1.A(u2o1.n(jkr0Var) % f11, jA, j);
                }
                float f13 = fV2 / f10;
                long j2 = jA;
                vq31 vq31VarG = ila0.g(f9, f8 - f13, f9 + fV, f8 + f13, (((long) Float.floatToRawIntBits(f13)) << c2) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
                tw4 tw4VarA = ww4.a();
                tw4VarA.e(vq31VarG, 1);
                int i4 = i;
                float f14 = f2;
                int i5 = iL;
                drawScope = drawScope2;
                f = -0.0f;
                try {
                    DrawScope.w0(drawScope, tw4VarA, j2, (DrawStyle) null, 60);
                    f9 = f14 + fX2 + f9;
                    i = i4 + 1;
                    iL = i5;
                    c = c2;
                    f3 = f10;
                    f5 = f11;
                    f7 = f12;
                    t6r0Var = this;
                } catch (Throwable th2) {
                    th = th2;
                    ((dg8) drawScope.a1().b).z(-f6, f);
                    throw th;
                }
            }
            ((dg8) drawScope.a1().b).z(-f6, -0.0f);
            return rih1.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
