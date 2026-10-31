package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfe {
    public final tl3 a;
    public final iu30 b;
    public final ni20 c;
    public final boolean d;

    public cfe(tl3 tl3Var, iu30 iu30Var, ni20 ni20Var, boolean z) {
        this.a = tl3Var;
        this.b = iu30Var;
        this.c = ni20Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfe)) {
            return false;
        }
        cfe cfeVar = (cfe) obj;
        return u890.j(this.a, cfeVar.a) && u890.j(this.b, cfeVar.b) && u890.j(this.c, cfeVar.c) && this.d == cfeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
