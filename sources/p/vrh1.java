package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vrh1 {
    public final String a;
    public final gsh1 b;

    public vrh1(String str, gsh1 gsh1Var) {
        this.a = str;
        this.b = gsh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrh1)) {
            return false;
        }
        vrh1 vrh1Var = (vrh1) obj;
        return u890.j(this.a, vrh1Var.a) && this.b.equals(vrh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
