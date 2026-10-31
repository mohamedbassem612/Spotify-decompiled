package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class chj1 {
    public final String a;
    public final String b;

    public chj1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj1)) {
            return false;
        }
        chj1 chj1Var = (chj1) obj;
        return u890.j(this.a, chj1Var.a) && u890.j(this.b, chj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
