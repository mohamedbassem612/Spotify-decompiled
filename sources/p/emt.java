package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class emt {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public emt(String str, String str2, String str3, c380 c380Var, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = str4;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emt)) {
            return false;
        }
        emt emtVar = (emt) obj;
        return u890.j(this.a, emtVar.a) && u890.j(this.b, emtVar.b) && u890.j(this.c, emtVar.c) && u890.j(this.d, emtVar.d) && this.e.equals(emtVar.e) && this.f == emtVar.f && this.g == emtVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d(kk0.f(this.d, cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }
}
