package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class er8 implements fr8 {
    public final String a;
    public final String b;

    public er8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er8)) {
            return false;
        }
        er8 er8Var = (er8) obj;
        return u890.j(this.a, er8Var.a) && u890.j(this.b, er8Var.b);
    }

    public final int hashCode() {
        int iHashCode = nhz.Y.hashCode() * 31;
        String str = this.a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
