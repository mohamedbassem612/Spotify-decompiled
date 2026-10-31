package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t0y0 implements v0y0 {
    public final String a;
    public final String b;

    public t0y0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0y0)) {
            return false;
        }
        t0y0 t0y0Var = (t0y0) obj;
        return u890.j(this.a, t0y0Var.a) && u890.j(this.b, t0y0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
