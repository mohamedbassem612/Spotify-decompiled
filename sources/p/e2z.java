package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e2z {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public e2z(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, boolean z3, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2z)) {
            return false;
        }
        e2z e2zVar = (e2z) obj;
        return this.a.equals(e2zVar.a) && this.b.equals(e2zVar.b) && this.c.equals(e2zVar.c) && this.d.equals(e2zVar.d) && this.e.equals(e2zVar.e) && this.f.equals(e2zVar.f) && this.g.equals(e2zVar.g) && this.h == e2zVar.h && this.i == e2zVar.i && this.j == e2zVar.j && this.k == e2zVar.k && this.l.equals(e2zVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.h, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k);
    }
}
