package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jk20 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public jk20(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk20)) {
            return false;
        }
        jk20 jk20Var = (jk20) obj;
        return u890.j(this.a, jk20Var.a) && u890.j(this.b, jk20Var.b) && u890.j(this.c, jk20Var.c) && this.d == jk20Var.d && this.e == jk20Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.e) + kaa0.f(this.d, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append("action=");
            sb.append(str);
            sb.append(' ');
        }
        String str2 = this.b;
        if (str2 != null) {
            sb.append("data=");
            sb.append(str2);
            sb.append(':');
            String str3 = this.c;
            if (str3 != null) {
                sb.append("//");
                sb.append(str3);
            }
            sb.append(' ');
        }
        sb.append("flags=0x");
        sb.append(Integer.toHexString(this.d));
        sb.append(" extras=");
        sb.append(this.e);
        return sb.toString();
    }
}
