package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p960 {
    public final String a;
    public final String b;

    public p960(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p960)) {
            return false;
        }
        p960 p960Var = (p960) obj;
        return this.a.equals(p960Var.a) && this.b.equals(p960Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
