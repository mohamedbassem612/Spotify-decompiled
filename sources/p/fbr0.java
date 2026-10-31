package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fbr0 {
    public final ebr0 a;
    public final String b;
    public final abu c;

    public fbr0(ebr0 ebr0Var, String str, abu abuVar) {
        this.a = ebr0Var;
        this.b = str;
        this.c = abuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbr0)) {
            return false;
        }
        fbr0 fbr0Var = (fbr0) obj;
        return this.a.equals(fbr0Var.a) && u890.j(this.b, fbr0Var.b) && this.c.equals(fbr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
