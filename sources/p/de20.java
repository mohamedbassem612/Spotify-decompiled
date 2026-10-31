package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class de20 {
    public final String a;
    public final String b;
    public final int c;

    public de20(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de20)) {
            return false;
        }
        de20 de20Var = (de20) obj;
        return u890.j(this.a, de20Var.a) && u890.j(this.b, de20Var.b) && this.c == de20Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
