package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ik6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ik6(int i, float f) {
        super(1);
        this.a = (byte) 1;
        this.b = i;
        this.c = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float f2 = 32.0f - fFloatValue;
                return new p3v(z ? mk6.a(f, (44.0f - f2) - fFloatValue) : mk6.a(f, f2));
            case 1:
                return new qr80(((long) ((z ? 1 : 0) * ((int) f))) << 32);
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                float fE = us71.e((int) (drawScope.j() & 4294967295L), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)), Float.intBitsToFloat((int) (drawScope.j() >> 32)) * Float.intBitsToFloat((int) (drawScope.j() >> 32))) / (Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 4.0f);
                float f3 = this.c;
                if (f3 > 0.0f) {
                    long jB = u7h.b(u7h.f, f3, 0.0f, 0.0f, 0.0f, 14);
                    float fIntBitsToFloat = z ? Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fE : fE;
                    DrawScope.b0(drawScope, jB, fE, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f))), 0.0f, (DrawStyle) null, 120);
                }
                return rih1Var;
            case 3:
                kd31 kd31Var = (kd31) obj;
                if (!z) {
                    kd31Var.b(f);
                }
                kd31Var.f(false);
                kd31Var.i(2);
                return rih1Var;
            case 4:
                ((kd31) obj).b(z ? 1.0f - f : 1.0f);
                return rih1Var;
            default:
                eqc eqcVar = (eqc) obj;
                List listM = p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)});
                return eqcVar.b(new cb8(z, new mic0(0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L), listM, (List) null), (byte) 22));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik6(float f, boolean z, byte b) {
        super(1);
        this.a = b;
        this.c = f;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik6(boolean z, float f, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = f;
    }
}
