package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class biu0 {
    public final String a;
    public final wls0 b;
    public final String c;

    public biu0(String str, wls0 wls0Var, String str2) {
        this.a = str;
        this.b = wls0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biu0)) {
            return false;
        }
        biu0 biu0Var = (biu0) obj;
        return u890.j(this.a, biu0Var.a) && this.b == biu0Var.b && u890.j(this.c, biu0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
