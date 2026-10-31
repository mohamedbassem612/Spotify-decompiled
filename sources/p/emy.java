package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class emy {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final qtt0 g;

    public emy(String str, String str2, String str3, boolean z, int i, int i2, qtt0 qtt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emy)) {
            return false;
        }
        emy emyVar = (emy) obj;
        return this.a.equals(emyVar.a) && u890.j(this.b, emyVar.b) && u890.j(this.c, emyVar.c) && this.d == emyVar.d && this.e == emyVar.e && this.f == emyVar.f && this.g == emyVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + ab80.k(this.f, kaa0.f(this.e, xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31), 31);
    }
}
