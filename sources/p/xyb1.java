package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xyb1 implements p5c {
    public final Function0 b;
    public final boolean c;
    public final flb0 d;
    public final boolean e;
    public final p5c f;

    public xyb1(Function0 function0, boolean z, flb0 flb0Var, boolean z2, p5c p5cVar) {
        this.b = function0;
        this.c = z;
        this.d = flb0Var;
        this.e = z2;
        this.f = p5cVar;
    }

    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.invoke()).intValue();
        boolean z = false;
        boolean z2 = this.d == flb0.b;
        if (!this.e && z2) {
            z = true;
        }
        if (this.c == z) {
            f -= fIntValue;
        }
        return this.f.a(f, f2, f3 - fIntValue);
    }
}
