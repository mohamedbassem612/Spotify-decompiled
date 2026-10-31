package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class edk0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public edk0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edk0)) {
            return false;
        }
        edk0 edk0Var = (edk0) obj;
        return this.a == edk0Var.a && this.b == edk0Var.b && this.c == edk0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
