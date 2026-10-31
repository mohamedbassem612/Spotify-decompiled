package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gfg1 implements hfg1 {
    public final String a;
    public final String b;

    public gfg1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfg1)) {
            return false;
        }
        gfg1 gfg1Var = (gfg1) obj;
        return u890.j(this.a, gfg1Var.a) && u890.j(this.b, gfg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
