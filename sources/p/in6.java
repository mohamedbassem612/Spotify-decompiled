package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class in6 {
    public final String a;
    public final String b;

    public in6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in6)) {
            return false;
        }
        in6 in6Var = (in6) obj;
        return u890.j(this.a, in6Var.a) && u890.j(this.b, in6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
