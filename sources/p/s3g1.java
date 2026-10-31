package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3g1 {
    public final List a;
    public final int b;
    public final o131 c;

    public s3g1(List list, int i, o131 o131Var) {
        this.a = list;
        this.b = i;
        this.c = o131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3g1)) {
            return false;
        }
        s3g1 s3g1Var = (s3g1) obj;
        return this.a.equals(s3g1Var.a) && this.b == s3g1Var.b && this.c.equals(s3g1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
