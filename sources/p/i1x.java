package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i1x {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public i1x(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1x)) {
            return false;
        }
        i1x i1xVar = (i1x) obj;
        return u890.j(this.a, i1xVar.a) && u890.j(this.b, i1xVar.b) && this.c.equals(i1xVar.c) && this.d == i1xVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
