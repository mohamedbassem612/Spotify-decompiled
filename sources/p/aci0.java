package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aci0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public aci0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aci0)) {
            return false;
        }
        aci0 aci0Var = (aci0) obj;
        return this.a == aci0Var.a && this.b == aci0Var.b && this.c == aci0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
