package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u0t0 {
    public final String a;
    public final String b;

    public u0t0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0t0)) {
            return false;
        }
        u0t0 u0t0Var = (u0t0) obj;
        return this.a.equals(u0t0Var.a) && this.b.equals(u0t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
