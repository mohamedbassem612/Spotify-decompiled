package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2z0 implements o2z0 {
    public final String a;
    public final String b;

    public k2z0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2z0)) {
            return false;
        }
        k2z0 k2z0Var = (k2z0) obj;
        return u890.j(this.a, k2z0Var.a) && u890.j(this.b, k2z0Var.b);
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
