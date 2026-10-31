package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uh31 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public uh31(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh31)) {
            return false;
        }
        uh31 uh31Var = (uh31) obj;
        return this.a == uh31Var.a && this.b == uh31Var.b && this.c == uh31Var.c && this.d == uh31Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("RippleAlpha(draggedAlpha=", this.a, ", focusedAlpha=", this.b, ", hoveredAlpha=");
        sbM.append(this.c);
        sbM.append(", pressedAlpha=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
