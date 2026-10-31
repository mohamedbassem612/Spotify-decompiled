package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssa {
    public final int a;
    public final int b;
    public final ucp1 c;
    public final ebp1 d;
    public final ebp1 e;
    public final fbp1 f;

    public ssa(int i, int i2, ucp1 ucp1Var, ebp1 ebp1Var, ebp1 ebp1Var2, fbp1 fbp1Var) {
        this.a = i;
        this.b = i2;
        this.c = ucp1Var;
        this.d = ebp1Var;
        this.e = ebp1Var2;
        this.f = fbp1Var;
    }

    public static ssa a(ssa ssaVar, int i, int i2, ucp1 ucp1Var, ebp1 ebp1Var, ebp1 ebp1Var2, fbp1 fbp1Var, int i3) {
        if ((i3 & 1) != 0) {
            i = ssaVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = ssaVar.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            ucp1Var = ssaVar.c;
        }
        ucp1 ucp1Var2 = ucp1Var;
        if ((i3 & 8) != 0) {
            ebp1Var = ssaVar.d;
        }
        ebp1 ebp1Var3 = ebp1Var;
        if ((i3 & 16) != 0) {
            ebp1Var2 = ssaVar.e;
        }
        ebp1 ebp1Var4 = ebp1Var2;
        if ((i3 & 32) != 0) {
            fbp1Var = ssaVar.f;
        }
        ssaVar.getClass();
        return new ssa(i4, i5, ucp1Var2, ebp1Var3, ebp1Var4, fbp1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssa)) {
            return false;
        }
        ssa ssaVar = (ssa) obj;
        return this.a == ssaVar.a && this.b == ssaVar.b && u890.j(this.c, ssaVar.c) && u890.j(this.d, ssaVar.d) && u890.j(this.e, ssaVar.e) && u890.j(this.f, ssaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, l1d.C(this.a) * 31, 31)) * 31)) * 31)) * 31);
    }
}
