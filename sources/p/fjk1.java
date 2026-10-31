package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fjk1 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;

    public fjk1(float f, float f2, float f3, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
    }

    public final n511 a() {
        long j = this.d;
        if (Size.c(j, 0L)) {
            return n511.e;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.c;
        float f2 = this.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        float f3 = this.b;
        return new n511(f2, f3, (fIntBitsToFloat / f) + f2, fIntBitsToFloat2 + f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjk1)) {
            return false;
        }
        fjk1 fjk1Var = (fjk1) obj;
        return Float.compare(this.a, fjk1Var.a) == 0 && Float.compare(this.b, fjk1Var.b) == 0 && Float.compare(this.c, fjk1Var.c) == 0 && Size.c(this.d, fjk1Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
