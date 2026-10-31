package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j19 extends bse0 {
    public final long a;
    public final Integer b;
    public final vyh c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final d7o0 h;
    public final fr00 i;

    public j19(long j, Integer num, ry8 ry8Var, long j2, byte[] bArr, String str, long j3, n19 n19Var, u09 u09Var) {
        this.a = j;
        this.b = num;
        this.c = ry8Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = n19Var;
        this.i = u09Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bse0) {
            bse0 bse0Var = (bse0) obj;
            j19 j19Var = (j19) bse0Var;
            if (this.a == j19Var.a) {
                Integer num = j19Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    vyh vyhVar = j19Var.c;
                    vyh vyhVar2 = this.c;
                    if (vyhVar2 != null ? vyhVar2.equals(vyhVar) : vyhVar == null) {
                        if (this.d == j19Var.d) {
                            if (Arrays.equals(this.e, bse0Var instanceof j19 ? ((j19) bse0Var).e : j19Var.e)) {
                                String str = j19Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == j19Var.g) {
                                        d7o0 d7o0Var = j19Var.h;
                                        d7o0 d7o0Var2 = this.h;
                                        if (d7o0Var2 != null ? d7o0Var2.equals(d7o0Var) : d7o0Var == null) {
                                            fr00 fr00Var = j19Var.i;
                                            fr00 fr00Var2 = this.i;
                                            if (fr00Var2 != null ? fr00Var2.equals(fr00Var) : fr00Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        vyh vyhVar = this.c;
        int iHashCode2 = (iHashCode ^ (vyhVar == null ? 0 : vyhVar.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        d7o0 d7o0Var = this.h;
        int iHashCode5 = (i2 ^ (d7o0Var == null ? 0 : d7o0Var.hashCode())) * 1000003;
        fr00 fr00Var = this.i;
        return iHashCode5 ^ (fr00Var != null ? fr00Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
