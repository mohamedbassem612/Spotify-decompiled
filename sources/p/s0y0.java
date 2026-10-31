package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s0y0 implements v0y0 {
    public final String a;
    public final String b;
    public final int c;

    public s0y0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0y0)) {
            return false;
        }
        s0y0 s0y0Var = (s0y0) obj;
        return this.a.equals(s0y0Var.a) && u890.j(this.b, s0y0Var.b) && this.c == s0y0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
