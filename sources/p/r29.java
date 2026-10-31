package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r29 {
    public final String a;
    public final long b;
    public final int c;

    public r29(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static mgc a() {
        mgc mgcVar = new mgc((byte) 6);
        mgcVar.d = 0L;
        return mgcVar;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r29)) {
            return false;
        }
        r29 r29Var = (r29) obj;
        String str = r29Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != r29Var.b) {
            return false;
        }
        int i = r29Var.c;
        int i2 = this.c;
        if (i2 == 0) {
            return i == 0;
        }
        return l1d.d(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? l1d.C(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
