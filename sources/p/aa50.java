package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aa50 {
    public final String a;
    public final String b;
    public final int c;

    public aa50(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa50)) {
            return false;
        }
        aa50 aa50Var = (aa50) obj;
        return this.a.equals(aa50Var.a) && this.b.equals(aa50Var.b) && this.c == aa50Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
