package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f840 implements o840 {
    public final String a;
    public final String b;

    public f840(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f840)) {
            return false;
        }
        f840 f840Var = (f840) obj;
        return u890.j(this.a, f840Var.a) && this.b.equals(f840Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
