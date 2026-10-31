package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ye20 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ye20(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye20)) {
            return false;
        }
        ye20 ye20Var = (ye20) obj;
        return u890.j(this.a, ye20Var.a) && u890.j(this.b, ye20Var.b) && this.c == ye20Var.c && this.d == ye20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
