package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3g0 {
    public final Set a;
    public final int b;

    public s3g0(int i, Set set) {
        this.a = set;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3g0)) {
            return false;
        }
        s3g0 s3g0Var = (s3g0) obj;
        return u890.j(this.a, s3g0Var.a) && this.b == s3g0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
