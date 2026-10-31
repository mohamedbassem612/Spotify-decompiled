package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class did1 {
    public final String a;
    public final String b;

    public did1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof did1)) {
            return false;
        }
        did1 did1Var = (did1) obj;
        return u890.j(this.a, did1Var.a) && this.b.equals(did1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
