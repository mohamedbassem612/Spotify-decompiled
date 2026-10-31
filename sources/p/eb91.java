package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eb91 {
    public final iu30 a;
    public final ni20 b;

    public eb91(ni20 ni20Var, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = ni20Var;
    }

    public final ni20 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb91)) {
            return false;
        }
        eb91 eb91Var = (eb91) obj;
        return u890.j(this.a, eb91Var.a) && u890.j(this.b, eb91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
