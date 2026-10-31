package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class in20 implements erl1 {
    public final float a;
    public final float b;

    public in20(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final int a(wat watVar, flb0 flb0Var) {
        return watVar.i0(0.0f);
    }

    public final int b(wat watVar, flb0 flb0Var) {
        return watVar.i0(this.a);
    }

    public final int c(wat watVar) {
        return watVar.i0(0.0f);
    }

    public final int d(wat watVar) {
        return watVar.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in20)) {
            return false;
        }
        in20 in20Var = (in20) obj;
        return p3v.c(this.a, in20Var.a) && p3v.c(0.0f, 0.0f) && p3v.c(0.0f, 0.0f) && p3v.c(this.b, in20Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, 0.0f), 31, 0.0f);
    }

    public final String toString() {
        String strD = p3v.d(this.a);
        String strD2 = p3v.d(0.0f);
        return rjx.o(gvg.n("Insets(left=", strD, ", top=", strD2, ", right="), p3v.d(0.0f), ", bottom=", p3v.d(this.b), ")");
    }
}
