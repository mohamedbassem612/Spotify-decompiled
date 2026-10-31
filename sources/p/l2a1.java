package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l2a1 implements m2a1 {
    public final String a;
    public final String b;

    public l2a1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a1)) {
            return false;
        }
        l2a1 l2a1Var = (l2a1) obj;
        return u890.j(this.a, l2a1Var.a) && u890.j(this.b, l2a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
