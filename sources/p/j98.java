package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j98 {
    public final String a;
    public final String b;
    public final int c;

    public j98(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j98)) {
            return false;
        }
        j98 j98Var = (j98) obj;
        return this.a.equals(j98Var.a) && u890.j(this.b, j98Var.b) && this.c == j98Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
