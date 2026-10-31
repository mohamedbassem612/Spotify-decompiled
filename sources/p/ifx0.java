package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ifx0 implements jfx0 {
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public ifx0(String str, String str2, float f, int i) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifx0)) {
            return false;
        }
        ifx0 ifx0Var = (ifx0) obj;
        return this.a.equals(ifx0Var.a) && u890.j(this.b, ifx0Var.b) && Float.compare(this.c, ifx0Var.c) == 0 && this.d == ifx0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        String str = this.b;
        return ab80.k(this.d, x0d.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
    }
}
