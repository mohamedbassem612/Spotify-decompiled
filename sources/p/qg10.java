package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qg10 {
    public final float a;
    public final ni20 b;

    public qg10(float f, ni20 ni20Var) {
        this.a = f;
        this.b = ni20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg10)) {
            return false;
        }
        qg10 qg10Var = (qg10) obj;
        return Float.compare(this.a, qg10Var.a) == 0 && u890.j(this.b, qg10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
