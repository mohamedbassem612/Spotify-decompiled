package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxj extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ drr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj(float f, float f2, long j, drr0 drr0Var) {
        super(1);
        this.c = f;
        this.d = f2;
        this.b = j;
        this.e = drr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.e;
        float f = this.d;
        float f2 = this.c;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                if ((f2 + f) - drr0Var.s() > 0.0f) {
                    DrawScope.d0(drawScope, this.b, (((long) Float.floatToRawIntBits(-f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f + 1.0f)) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                }
                break;
            default:
                float fLongValue = ((((Number) obj).longValue() - this.b) / 1000000.0f) + f2;
                if (fLongValue > f) {
                    fLongValue = f;
                }
                drr0Var.t(yoi1.o(fLongValue / f, 0.0f, 1.0f));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj(long j, float f, float f2, drr0 drr0Var) {
        super(1);
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = drr0Var;
    }
}
