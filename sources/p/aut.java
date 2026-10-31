package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aut {
    public final int a;
    public final int b;
    public final boolean c;
    public final f0u d;
    public final String e;
    public final String f;
    public final String g;
    public final dy31 h;
    public final String i;
    public final int j;

    public aut(int i, int i2, boolean z, f0u f0uVar, String str, String str2, String str3, dy31 dy31Var, String str4, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = f0uVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = dy31Var;
        this.i = str4;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aut)) {
            return false;
        }
        aut autVar = (aut) obj;
        return this.a == autVar.a && this.b == autVar.b && this.c == autVar.c && this.d == autVar.d && u890.j(this.e, autVar.e) && u890.j(this.f, autVar.f) && u890.j(this.g, autVar.g) && this.h.equals(autVar.h) && u890.j(this.i, autVar.i) && this.j == autVar.j;
    }

    public final int hashCode() {
        int i = this.a;
        int iD = cy30.d((this.h.hashCode() + cy30.d(cy30.d(cy30.d((this.d.hashCode() + xcg1.g(kaa0.f(this.b, (i == 0 ? 0 : l1d.C(i)) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
        int i2 = this.j;
        return iD + (i2 != 0 ? l1d.C(i2) : 0);
    }
}
