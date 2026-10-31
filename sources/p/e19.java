package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e19 {
    public final String a;
    public final String b;
    public final String c;
    public final r29 d;
    public final int e;

    public e19(String str, String str2, String str3, r29 r29Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r29Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e19)) {
            return false;
        }
        e19 e19Var = (e19) obj;
        String str = e19Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = e19Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = e19Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        r29 r29Var = e19Var.d;
        r29 r29Var2 = this.d;
        if (r29Var2 == null) {
            if (r29Var != null) {
                return false;
            }
        } else if (!r29Var2.equals(r29Var)) {
            return false;
        }
        int i = e19Var.e;
        int i2 = this.e;
        if (i2 == 0) {
            return i == 0;
        }
        return l1d.d(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        r29 r29Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (r29Var == null ? 0 : r29Var.hashCode())) * 1000003;
        int i = this.e;
        return iHashCode4 ^ (i != 0 ? l1d.C(i) : 0);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + ab80.w(this.e) + "}";
    }
}
