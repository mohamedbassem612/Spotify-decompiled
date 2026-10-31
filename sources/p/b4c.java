package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4c {
    public String a;
    public String b;
    public Date c;
    public boolean d;
    public long e;

    public /* synthetic */ b4c(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4c)) {
            return false;
        }
        b4c b4cVar = (b4c) obj;
        return u890.j(this.a, b4cVar.a) && u890.j(this.b, b4cVar.b) && u890.j(this.c, b4cVar.c) && this.d == b4cVar.d && this.e == b4cVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.c;
        int iHashCode3 = (iHashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return Long.hashCode(this.e) + ((iHashCode3 + r1) * 31);
    }

    public final String toString() {
        return "BranchUrlQueryParameter(name=" + this.a + ", value=" + this.b + ", timestamp=" + this.c + ", isDeepLink=" + this.d + ", validityWindow=" + this.e + ')';
    }

    public b4c(String str, String str2, Date date, long j) {
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = false;
        this.e = j;
    }
}
