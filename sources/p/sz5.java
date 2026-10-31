package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sz5 {
    public final String a;
    public final String b;
    public final int c;

    public sz5(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz5)) {
            return false;
        }
        sz5 sz5Var = (sz5) obj;
        return u890.j(this.a, sz5Var.a) && u890.j(this.b, sz5Var.b) && this.c == sz5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
