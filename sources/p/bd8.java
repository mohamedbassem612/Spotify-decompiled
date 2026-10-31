package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bd8 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public bd8(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd8)) {
            return false;
        }
        bd8 bd8Var = (bd8) obj;
        return this.a.equals(bd8Var.a) && this.b.equals(bd8Var.b) && this.c.equals(bd8Var.c) && this.d == bd8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
