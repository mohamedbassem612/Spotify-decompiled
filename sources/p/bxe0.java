package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bxe0 {
    public final String a;
    public final sf8 b;

    public bxe0(String str, sf8 sf8Var) {
        this.a = str;
        this.b = sf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxe0)) {
            return false;
        }
        bxe0 bxe0Var = (bxe0) obj;
        return u890.j(this.a, bxe0Var.a) && this.b.equals(bxe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
