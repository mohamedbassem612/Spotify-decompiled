package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a8x {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public a8x(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8x)) {
            return false;
        }
        a8x a8xVar = (a8x) obj;
        return this.a.equals(a8xVar.a) && this.b.equals(a8xVar.b) && this.c.equals(a8xVar.c) && this.d.equals(a8xVar.d) && this.e == a8xVar.e && u890.j(this.f, a8xVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
