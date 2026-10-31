package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rka0 {
    public static final rka0 i;
    public final rob0 a;
    public final vma0 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    static {
        vma0 vma0Var = vma0.b;
        eqn1.r();
        i = new rka0(null, vma0.b, 0, false, false, false, false, false);
    }

    public rka0(rob0 rob0Var, vma0 vma0Var, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = rob0Var;
        this.b = vma0Var;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static rka0 a(rka0 rka0Var, rob0 rob0Var, vma0 vma0Var, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        if ((i3 & 1) != 0) {
            rob0Var = rka0Var.a;
        }
        rob0 rob0Var2 = rob0Var;
        if ((i3 & 2) != 0) {
            vma0Var = rka0Var.b;
        }
        vma0 vma0Var2 = vma0Var;
        if ((i3 & 4) != 0) {
            i2 = rka0Var.c;
        }
        int i4 = i2;
        boolean z5 = (i3 & 8) != 0 ? rka0Var.d : true;
        if ((i3 & 16) != 0) {
            z = rka0Var.e;
        }
        boolean z6 = z;
        if ((i3 & 32) != 0) {
            z2 = rka0Var.f;
        }
        boolean z7 = z2;
        if ((i3 & 64) != 0) {
            z3 = rka0Var.g;
        }
        boolean z8 = z3;
        boolean z9 = (i3 & 128) != 0 ? rka0Var.h : z4;
        rka0Var.getClass();
        return new rka0(rob0Var2, vma0Var2, i4, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rka0) {
            rka0 rka0Var = (rka0) obj;
            if (u890.j(this.a, rka0Var.a) && this.b == rka0Var.b && this.c == rka0Var.c && this.d == rka0Var.d && this.e == rka0Var.e && this.f == rka0Var.f && this.g == rka0Var.g && this.h == rka0Var.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        rob0 rob0Var = this.a;
        int iHashCode = (this.b.hashCode() + ((rob0Var == null ? 0 : rob0Var.hashCode()) * 31)) * 31;
        int i2 = this.c;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (i2 != 0 ? l1d.C(i2) : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.a);
        sb.append(", typeSubstitutor=");
        sb.append(this.b);
        sb.append(", modality=");
        sb.append(cfm0.s(this.c));
        sb.append(", isFakeOverride=");
        sb.append(this.d);
        sb.append(", forceIsExternal=");
        sb.append(this.e);
        sb.append(", forceIsOperator=");
        sb.append(this.f);
        sb.append(", forceIsInfix=");
        sb.append(this.g);
        sb.append(", forceIsInline=");
        return f4i1.g(sb, this.h, ')');
    }
}
