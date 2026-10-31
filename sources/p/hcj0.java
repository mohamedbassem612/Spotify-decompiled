package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hcj0 implements icj0 {
    public final String a;
    public final String b;

    public hcj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcj0)) {
            return false;
        }
        hcj0 hcj0Var = (hcj0) obj;
        return u890.j(this.a, hcj0Var.a) && this.b.equals(hcj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
