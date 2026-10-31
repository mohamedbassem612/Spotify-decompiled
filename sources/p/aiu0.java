package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aiu0 {
    public final String a;
    public final wls0 b;
    public final String c;

    public aiu0(String str, wls0 wls0Var, String str2) {
        this.a = str;
        this.b = wls0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiu0)) {
            return false;
        }
        aiu0 aiu0Var = (aiu0) obj;
        return u890.j(this.a, aiu0Var.a) && this.b == aiu0Var.b && u890.j(this.c, aiu0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
