package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdj1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public vdj1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final um20 a(String str, boolean z) {
        boolean z2 = this.a && str.length() != 0;
        return new um20(str, z2, z2 && this.b, z, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdj1)) {
            return false;
        }
        vdj1 vdj1Var = (vdj1) obj;
        return this.a == vdj1Var.a && this.b == vdj1Var.b && this.c == vdj1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
