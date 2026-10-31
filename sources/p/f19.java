package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f19 {
    public final String a;
    public final long b;
    public final long c;

    public f19(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public static ix7 a() {
        return new ix7((byte) 12);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f19) {
            f19 f19Var = (f19) obj;
            if (this.a.equals(f19Var.a) && this.b == f19Var.b && this.c == f19Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return pze0.h(this.c, "}", sb);
    }
}
