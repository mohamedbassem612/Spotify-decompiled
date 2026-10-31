package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bag1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bag1(boolean z, long j, float f, float f2, ven0 ven0Var) {
        super(1);
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        y9e1 y9e1Var = (y9e1) this.e.getValue();
        if (y9e1Var != null && y9e1Var.b.f != 0 && !this.a) {
            float f = this.c;
            nb51.w(drawScope, y9e1Var, this.b, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), true, this.d, 32);
        }
        return rih1.a;
    }
}
