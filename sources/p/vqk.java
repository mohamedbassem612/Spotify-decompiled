package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vqk {
    public final String a;
    public final af5 b;
    public final u7h c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final u7h k;
    public final String l;
    public final Integer m;
    public final Integer n;

    public vqk(String str, af5 af5Var, u7h u7hVar, boolean z, int i, int i2, boolean z2, boolean z3, u7h u7hVar2, String str2, Integer num, Integer num2, int i3) {
        af5 af5Var2 = (i3 & 4) != 0 ? null : af5Var;
        u7h u7hVar3 = (i3 & 8) != 0 ? null : u7hVar;
        boolean z4 = (i3 & 16) != 0 ? false : z;
        int i4 = (i3 & 32) != 0 ? 2 : i;
        int i5 = (i3 & 64) == 0 ? i2 : 2;
        boolean z5 = (i3 & 128) != 0 ? true : z2;
        boolean z6 = (i3 & 256) == 0;
        boolean z7 = (i3 & 512) != 0 ? false : z3;
        boolean z8 = (i3 & 1024) == 0;
        u7h u7hVar4 = (i3 & 2048) != 0 ? null : u7hVar2;
        String str3 = (i3 & 4096) != 0 ? null : str2;
        Integer num3 = (i3 & 8192) != 0 ? null : num;
        Integer num4 = (i3 & 16384) == 0 ? num2 : null;
        this.a = str;
        this.b = af5Var2;
        this.c = u7hVar3;
        this.d = z4;
        this.e = i4;
        this.f = i5;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = u7hVar4;
        this.l = str3;
        this.m = num3;
        this.n = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqk)) {
            return false;
        }
        vqk vqkVar = (vqk) obj;
        return u890.j(this.a, vqkVar.a) && u890.j(this.b, vqkVar.b) && u890.j(this.c, vqkVar.c) && this.d == vqkVar.d && this.e == vqkVar.e && this.f == vqkVar.f && this.g == vqkVar.g && this.h == vqkVar.h && this.i == vqkVar.i && this.j == vqkVar.j && u890.j(this.k, vqkVar.k) && u890.j(this.l, vqkVar.l) && u890.j(this.m, vqkVar.m) && u890.j(this.n, vqkVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        af5 af5Var = this.b;
        int iHashCode2 = (iHashCode + (af5Var == null ? 0 : af5Var.hashCode())) * 31;
        u7h u7hVar = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, ab80.k(this.e, xcg1.g((iHashCode2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        u7h u7hVar2 = this.k;
        int iHashCode3 = (iG + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31;
        String str = this.l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }
}
