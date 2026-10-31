package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cp6 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public cp6(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp6)) {
            return false;
        }
        cp6 cp6Var = (cp6) obj;
        return u890.j(this.a, cp6Var.a) && this.b.equals(cp6Var.b) && this.c == cp6Var.c && this.d == cp6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
