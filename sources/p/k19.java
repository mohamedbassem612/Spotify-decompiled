package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k19 extends use0 {
    public final long a;
    public final long b;
    public final oy8 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public k19(long j, long j2, oy8 oy8Var, Integer num, String str, ArrayList arrayList) {
        czy0 czy0Var = czy0.a;
        this.a = j;
        this.b = j2;
        this.c = oy8Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof use0)) {
            return false;
        }
        k19 k19Var = (k19) ((use0) obj);
        if (this.a != k19Var.a || this.b != k19Var.b || !this.c.equals(k19Var.c)) {
            return false;
        }
        Integer num = k19Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = k19Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(k19Var.f)) {
            return false;
        }
        Object obj2 = czy0.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ czy0.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + czy0.a + "}";
    }
}
