package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hu31 {
    public final fu31 a;
    public final String b;
    public final boolean c;
    public final int d;
    public final uiw0 e;

    public hu31(fu31 fu31Var, String str, boolean z, int i, uiw0 uiw0Var) {
        this.a = fu31Var;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = uiw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu31)) {
            return false;
        }
        hu31 hu31Var = (hu31) obj;
        return this.a.equals(hu31Var.a) && u890.j(this.b, hu31Var.b) && this.c == hu31Var.c && this.d == hu31Var.d && u890.j(this.e, hu31Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ab80.k(this.d, xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
    }
}
