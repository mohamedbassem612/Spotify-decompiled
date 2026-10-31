package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hb80 implements jb80 {
    public final String a;
    public final String b;

    public hb80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb80)) {
            return false;
        }
        hb80 hb80Var = (hb80) obj;
        return this.a.equals(hb80Var.a) && this.b.equals(hb80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
