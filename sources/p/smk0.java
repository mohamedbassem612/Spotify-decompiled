package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class smk0 {
    public final List a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public smk0(List list, int i, boolean z, int i2, boolean z2) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk0)) {
            return false;
        }
        smk0 smk0Var = (smk0) obj;
        return u890.j(this.a, smk0Var.a) && this.b == smk0Var.b && this.c == smk0Var.c && this.d == smk0Var.d && this.e == smk0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kaa0.f(this.d, xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }
}
