package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k090 extends l090 {
    public final String b;
    public final String c;

    public k090(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k090)) {
            return false;
        }
        k090 k090Var = (k090) obj;
        return this.b.equals(k090Var.b) && this.c.equals(k090Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
