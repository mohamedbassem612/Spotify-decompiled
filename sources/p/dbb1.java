package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dbb1 {
    public final boolean a;
    public final String b;

    public dbb1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbb1)) {
            return false;
        }
        dbb1 dbb1Var = (dbb1) obj;
        return this.a == dbb1Var.a && u890.j(this.b, dbb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
