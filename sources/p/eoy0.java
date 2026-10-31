package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eoy0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public eoy0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoy0)) {
            return false;
        }
        eoy0 eoy0Var = (eoy0) obj;
        return this.a == eoy0Var.a && this.b == eoy0Var.b && this.c == eoy0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
