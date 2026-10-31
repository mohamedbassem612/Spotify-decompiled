package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rwi0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;

    public rwi0(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwi0)) {
            return false;
        }
        rwi0 rwi0Var = (rwi0) obj;
        return this.a.equals(rwi0Var.a) && this.b.equals(rwi0Var.b) && this.c == rwi0Var.c && this.d == rwi0Var.d && u890.j(this.e, rwi0Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
