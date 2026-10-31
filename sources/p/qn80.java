package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qn80 {
    public final String a;
    public final long b;
    public final String c;
    public final long d;
    public final Long e;
    public final Long f;
    public final boolean g;

    public qn80(String str, long j, String str2, long j2, Long l, Long l2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = l;
        this.f = l2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn80)) {
            return false;
        }
        qn80 qn80Var = (qn80) obj;
        return u890.j(this.a, qn80Var.a) && this.b == qn80Var.b && u890.j(this.c, qn80Var.c) && this.d == qn80Var.d && u890.j(this.e, qn80Var.e) && u890.j(this.f, qn80Var.f) && this.g == qn80Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final int hashCode() {
        String str = this.a;
        int iF = cy30.f((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        String str2 = this.c;
        int iF2 = cy30.f((iF + (str2 == null ? 0 : str2.hashCode())) * 31, this.d, 31);
        Long l = this.e;
        int iHashCode = (iF2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        boolean z = this.g;
        ?? r5 = z;
        if (z) {
            r5 = 1;
        }
        return iHashCode2 + r5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallReferrerResult(appStore=");
        sb.append(this.a);
        sb.append(", installBeginTimestampSeconds=");
        sb.append(this.b);
        sb.append(", installReferrer=");
        sb.append(this.c);
        sb.append(", referrerClickTimestampSeconds=");
        sb.append(this.d);
        sb.append(", installBeginTimestampServerSeconds=");
        sb.append(this.e);
        sb.append(", referrerClickTimestampServerSeconds=");
        sb.append(this.f);
        sb.append(", isClickThrough=");
        return f4i1.g(sb, this.g, ')');
    }
}
