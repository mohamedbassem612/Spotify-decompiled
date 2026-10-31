package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hb9 {
    public final String a;
    public final String b;

    public hb9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb9)) {
            return false;
        }
        hb9 hb9Var = (hb9) obj;
        return this.a.equals(hb9Var.a) && this.b.equals(hb9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
