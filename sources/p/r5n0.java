package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r5n0 implements s5n0 {
    public final String a;
    public final String b;

    public r5n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5n0)) {
            return false;
        }
        r5n0 r5n0Var = (r5n0) obj;
        return this.a.equals(r5n0Var.a) && this.b.equals(r5n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
