package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzq0 {
    public final float a;
    public final List b;

    public pzq0(float f, int i) {
        this((i & 1) != 0 ? 0.0f : f, (List) z6x.a);
    }

    public final pzq0 a(pzq0 pzq0Var) {
        return new pzq0(this.a + pzq0Var.a, o7h.N0(pzq0Var.b, this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzq0)) {
            return false;
        }
        pzq0 pzq0Var = (pzq0) obj;
        return p3v.c(this.a, pzq0Var.a) && u890.j(this.b, pzq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) p3v.d(this.a)) + ", resourceIds=" + this.b + ')';
    }

    public pzq0(float f, List list) {
        this.a = f;
        this.b = list;
    }
}
