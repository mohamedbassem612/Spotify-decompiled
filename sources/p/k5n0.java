package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k5n0 implements l5n0 {
    public final String a;
    public final String b;

    public k5n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5n0)) {
            return false;
        }
        k5n0 k5n0Var = (k5n0) obj;
        return this.a.equals(k5n0Var.a) && this.b.equals(k5n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
