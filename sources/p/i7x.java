package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i7x extends jmr0 {
    public final n6a1 f;
    public final long g;

    public i7x(n6a1 n6a1Var, long j) {
        this.f = n6a1Var;
        this.g = j;
    }

    public final long i() {
        return this.g;
    }

    public final void j(DrawScope drawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.g1() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L));
        DrawScope.o(drawScope, this.f, 350.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, (phc1) null, 120);
    }
}
