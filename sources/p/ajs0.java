package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ajs0 extends cjs0 {
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ajs0(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        super(z, z2, true);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // p.cjs0
    public final boolean a() {
        return this.g;
    }

    @Override // p.cjs0
    public final boolean b() {
        return this.i;
    }

    @Override // p.cjs0
    public final String c() {
        return this.e;
    }

    @Override // p.cjs0
    public final String d() {
        return this.d;
    }

    @Override // p.cjs0
    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajs0)) {
            return false;
        }
        ajs0 ajs0Var = (ajs0) obj;
        return u890.j(this.d, ajs0Var.d) && u890.j(this.e, ajs0Var.e) && u890.j(this.f, ajs0Var.f) && this.g == ajs0Var.g && this.h == ajs0Var.h && this.i == ajs0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }
}
