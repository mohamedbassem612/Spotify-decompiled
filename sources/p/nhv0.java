package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nhv0 extends xap1 {
    public final String c;
    public final String d;

    public nhv0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhv0)) {
            return false;
        }
        nhv0 nhv0Var = (nhv0) obj;
        return u890.j(this.c, nhv0Var.c) && u890.j(this.d, nhv0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
