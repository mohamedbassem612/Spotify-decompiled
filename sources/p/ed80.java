package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ed80 extends jmr0 {
    public final long X;
    public final yae1 f;
    public final String g;
    public final lee1 h;
    public final n6a1 i;
    public final Function0 t;

    public ed80(yae1 yae1Var, String str, lee1 lee1Var, n6a1 n6a1Var, long j) {
        df dfVar = df.W0;
        this.f = yae1Var;
        this.g = str;
        this.h = lee1Var;
        this.i = n6a1Var;
        this.t = dfVar;
        this.X = j;
    }

    @Override // p.jmr0
    public final long i() {
        return this.X;
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) {
        DrawScope.o(drawScope, this.i, 350.0f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.g1() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L)))) & 4294967295L), 0.0f, null, 120);
        yae1 yae1Var = this.f;
        String str = this.g;
        lee1 lee1Var = this.h;
        y9e1 y9e1VarA = yae1.a(yae1Var, str, lee1Var, 0, false, 0, 0L, null, null, 1020);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.g1() >> 32));
        long j = y9e1VarA.c;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L)) - (((int) (j & 4294967295L)) / 2);
        w5p1.i(drawScope, y9e1VarA, lee1Var.c(), (Float.floatToRawIntBits(fIntBitsToFloat - (((int) (j >> 32)) / 2)) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), ((Number) this.t.invoke()).floatValue(), 240);
    }
}
