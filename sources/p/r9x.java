package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r9x {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public r9x(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9x)) {
            return false;
        }
        r9x r9xVar = (r9x) obj;
        return this.a.equals(r9xVar.a) && this.b.equals(r9xVar.b) && this.c.equals(r9xVar.c) && this.d == r9xVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
