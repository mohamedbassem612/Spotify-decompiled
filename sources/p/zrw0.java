package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zrw0 {
    public final String a;
    public final String b;

    public zrw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrw0)) {
            return false;
        }
        zrw0 zrw0Var = (zrw0) obj;
        return u890.j(this.a, zrw0Var.a) && u890.j(this.b, zrw0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
