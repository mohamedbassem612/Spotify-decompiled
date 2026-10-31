package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z950 {
    public final String a;
    public final String b;
    public final int c;

    public z950(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z950)) {
            return false;
        }
        z950 z950Var = (z950) obj;
        return u890.j(this.a, z950Var.a) && u890.j(this.b, z950Var.b) && this.c == z950Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
