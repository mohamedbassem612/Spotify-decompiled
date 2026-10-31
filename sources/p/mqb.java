package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class mqb implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Brush b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ phc1 h;

    public /* synthetic */ mqb(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, phc1 phc1Var) {
        this.a = z;
        this.b = brush;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = j3;
        this.h = phc1Var;
    }

    public final Object invoke(Object obj) throws Throwable {
        long j;
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        boolean z = this.a;
        Brush brush = this.b;
        long j2 = this.c;
        if (z) {
            DrawScope.c0(lslVar, brush, 0L, 0L, j2, 0.0f, (DrawStyle) null, 246);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float f = this.d;
            if (fIntBitsToFloat < f) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                float f2 = this.e;
                float f3 = fIntBitsToFloat2 - f2;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - f2;
                cab cabVarA1 = lslVar.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).k(f2, f2, f3, fIntBitsToFloat3, 0);
                    j = jU;
                    try {
                        DrawScope.c0(lslVar, brush, 0L, 0L, j2, 0.0f, (DrawStyle) null, 246);
                        i3a.n(cabVarA1, j);
                    } catch (Throwable th) {
                        th = th;
                        i3a.n(cabVarA1, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jU;
                }
            } else {
                DrawScope.c0(lslVar, brush, this.f, this.g, d1u.H(f, j2), 0.0f, this.h, 208);
            }
        }
        return rih1.a;
    }
}
