package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r9a1 {
    public final String a;
    public final String b;

    public r9a1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9a1)) {
            return false;
        }
        r9a1 r9a1Var = (r9a1) obj;
        return u890.j(this.a, r9a1Var.a) && u890.j(this.b, r9a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
