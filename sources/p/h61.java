package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h61 extends hab0 implements iu30 {
    public final /* synthetic */ es41 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ lw4 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(es41 es41Var, float f, lw4 lw4Var, float f2, long j, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = es41Var;
        this.b = f;
        this.c = lw4Var;
        this.d = f2;
        this.e = j;
        this.f = ven0Var;
        this.g = ven0Var2;
    }

    public final Object invoke(Object obj) throws Throwable {
        float f;
        fid fidVar;
        lsl lslVar = (lsl) obj;
        es41 es41Var = this.a;
        err0 err0Var = es41Var.f;
        err0 err0Var2 = es41Var.a;
        err0 err0Var3 = es41Var.f;
        float fMin = (err0Var.s() <= 0 || Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) <= 0.0f) ? 0.0f : Math.min(lslVar.X0(this.b), Math.min(err0Var3.s() - err0Var2.s(), Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 4.0f));
        if (fMin > 0.0f) {
            float fX0 = lslVar.X0(4.0f);
            fid fidVarP = lslVar.a1().p();
            float f2 = -fX0;
            fidVarP.j(new n511(f2, 0.0f, Float.intBitsToFloat((int) (lslVar.j() >> 32)) + fX0, Float.intBitsToFloat((int) (lslVar.j() & 4294967295L))), this.c);
            try {
                lslVar.s1();
                fidVar = fidVarP;
                f = 2.0f;
                try {
                    DrawScope.S0(lslVar, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - fMin, Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (((long) Float.floatToRawIntBits(fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits((fX0 * 2.0f) + Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                    fidVar.i();
                } catch (Throwable th) {
                    th = th;
                    fidVar.i();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fidVar = fidVarP;
            }
        } else {
            f = 2.0f;
            lslVar.s1();
        }
        if (err0Var3.s() > 0 && ((!((Boolean) this.f.getValue()).booleanValue() || es41Var.h.b() || ((Boolean) this.g.getValue()).booleanValue()) && Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) > r15 && Float.intBitsToFloat((int) (lslVar.j() >> 32)) > r15)) {
            float fX1 = lslVar.X0(f);
            float fX2 = lslVar.X0(6.0f);
            float fX3 = lslVar.X0(zjy.p(6.0f, new p3v(this.d)).a);
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - fX3) - fX2;
            if (fIntBitsToFloat < r15) {
                fIntBitsToFloat = 0.0f;
            }
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / (Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + err0Var3.s())) * fIntBitsToFloat;
            float fX4 = lslVar.X0(12.0f);
            if (fIntBitsToFloat2 < fX4) {
                fIntBitsToFloat2 = fX4;
            }
            if (fIntBitsToFloat2 > fIntBitsToFloat) {
                fIntBitsToFloat2 = fIntBitsToFloat;
            }
            float f3 = fIntBitsToFloat - fIntBitsToFloat2;
            float fS = err0Var2.s() / err0Var3.s();
            if (lslVar.getLayoutDirection() == flb0.a) {
                fX2 = (Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX2) - fX1;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX2)) << 32) | (((long) Float.floatToRawIntBits((f3 * fS) + fX3)) & 4294967295L);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fX1);
            float f4 = fX1 / f;
            DrawScope.g0(lslVar, this.e, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits2 << 32), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
        }
        return rih1.a;
    }
}
