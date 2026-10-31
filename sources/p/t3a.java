package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t3a {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public /* synthetic */ t3a(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, (i & 16) != 0 ? "" : str3, z, z2, false);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3a)) {
            return false;
        }
        t3a t3aVar = (t3a) obj;
        return u890.j(this.a, t3aVar.a) && u890.j(this.b, t3aVar.b) && this.c == t3aVar.c && this.d == t3aVar.d && u890.j(this.e, t3aVar.e) && this.f == t3aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public t3a(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = z3;
    }
}
