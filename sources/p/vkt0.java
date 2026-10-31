package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vkt0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkt0(tob1 tob1Var, long j, tob1 tob1Var2, tob1 tob1Var3, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
        this.c = j;
        this.d = tob1Var2;
        this.e = tob1Var3;
    }

    public final Object invoke(Object obj) throws Throwable {
        cab cabVar;
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.e;
        tob1 tob1Var2 = this.d;
        tob1 tob1Var3 = this.b;
        float f = 2.0f;
        char c = ' ';
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.16666667f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.083333336f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.33333334f;
                wkt0.c(drawScope, fIntBitsToFloat2, fIntBitsToFloat, ((Number) tob1Var3.getValue()).floatValue(), this.c);
                wkt0.c(drawScope, fIntBitsToFloat2 + fIntBitsToFloat3, fIntBitsToFloat, ((Number) tob1Var2.getValue()).floatValue(), this.c);
                wkt0.c(drawScope, (fIntBitsToFloat3 * 2.0f) + fIntBitsToFloat2, fIntBitsToFloat, ((Number) tob1Var.getValue()).floatValue(), this.c);
                return rih1Var;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                float fE = (Size.e(drawScope2.j()) / 2.0f) * 0.9f;
                float fFloatValue = ((Number) tob1Var3.getValue()).floatValue();
                long jO = zno1.o(drawScope2.j());
                long j2 = this.c;
                cab cabVarA1 = drawScope2.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).s(fFloatValue, jO);
                    int i = 0;
                    while (i < 4) {
                        float fFloatValue2 = ((Number) tob1Var2.getValue()).floatValue() * 90.0f;
                        float f2 = (i * 90.0f) + fFloatValue2;
                        float fFloatValue3 = (((Number) tob1Var.getValue()).floatValue() * 90.0f) - fFloatValue2;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope2.g1() >> c)) - fE;
                        float f3 = f;
                        char c2 = c;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.g1() & 4294967295L)) - fE)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << c2);
                        drawScope2.j();
                        float f4 = f3 * fE;
                        int i2 = i;
                        float f5 = fE;
                        cabVar = cabVarA1;
                        long j3 = j2;
                        j = jU;
                        try {
                            DrawScope.i1(drawScope2, j3, f2, fFloatValue3, jFloatToRawIntBits, Size.a(f4, f4), new phc1((float) Math.ceil(Size.e(drawScope2.j()) * 0.06508876f), 0.0f, 1, 0, (uw4) null, 26), 832);
                            i = i2 + 1;
                            cabVarA1 = cabVar;
                            jU = j;
                            j2 = j3;
                            f = f3;
                            c = c2;
                            fE = f5;
                        } catch (Throwable th) {
                            th = th;
                            i3a.n(cabVar, j);
                            throw th;
                        }
                    }
                    i3a.n(cabVarA1, jU);
                    return rih1Var;
                } catch (Throwable th2) {
                    th = th2;
                    cabVar = cabVarA1;
                    j = jU;
                }
                break;
        }
    }
}
