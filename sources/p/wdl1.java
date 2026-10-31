package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wdl1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pmg1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ frr0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdl1(boolean z, int i, pmg1 pmg1Var, int i2, float f, long j, float f2, frr0 frr0Var) {
        super(1);
        this.a = z;
        this.b = i;
        this.c = pmg1Var;
        this.d = i2;
        this.e = f;
        this.f = j;
        this.g = f2;
        this.h = frr0Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        if (!this.a) {
            long jS = this.h.s() - ((long) this.b);
            pmg1 pmg1Var = this.c;
            float f = (jS * (pmg1Var.g / this.d)) + pmg1Var.i;
            if (f >= 0.0f && f < this.e) {
                DrawScope.d0(drawScope, this.f, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(this.g * 3.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
            }
        }
        return rih1.a;
    }
}
