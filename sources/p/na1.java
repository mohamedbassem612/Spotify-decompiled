package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class na1 extends wa1 {
    public final String a;
    public final boolean b;

    public na1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na1)) {
            return false;
        }
        na1 na1Var = (na1) obj;
        return u890.j(this.a, na1Var.a) && this.b == na1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
