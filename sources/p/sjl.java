package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sjl {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final List e;

    public sjl(long j, long j2, String str, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjl)) {
            return false;
        }
        sjl sjlVar = (sjl) obj;
        return this.a.equals(sjlVar.a) && this.b == sjlVar.b && this.c == sjlVar.c && u890.j(this.d, sjlVar.d) && this.e.equals(sjlVar.e);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
