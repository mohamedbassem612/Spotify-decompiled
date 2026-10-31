package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wp31 {
    public final String a;
    public final String b;

    public wp31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp31)) {
            return false;
        }
        wp31 wp31Var = (wp31) obj;
        return this.a.equals(wp31Var.a) && this.b.equals(wp31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
