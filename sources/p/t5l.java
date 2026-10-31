package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t5l {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;

    public t5l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5l)) {
            return false;
        }
        t5l t5lVar = (t5l) obj;
        return this.a == t5lVar.a && this.b == t5lVar.b && this.c == t5lVar.c && this.d == t5lVar.d && this.e == t5lVar.e && this.f.equals(t5lVar.f) && this.g.equals(t5lVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
