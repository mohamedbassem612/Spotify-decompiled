package p;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jk31 {
    public final byte[] a;
    public final boolean b;
    public final int c;
    public final int d;
    public final ik31 e;
    public final Function0 f;
    public final iu30 g;

    public jk31(byte[] bArr, boolean z, int i, int i2, ik31 ik31Var, Function0 function0, iu30 iu30Var, int i3) {
        i2 = (i3 & 8) != 0 ? 2 : i2;
        ik31Var = (i3 & 16) != 0 ? null : ik31Var;
        function0 = (i3 & 32) != 0 ? n521.W0 : function0;
        iu30Var = (i3 & 64) != 0 ? oe31.b1 : iu30Var;
        this.a = bArr;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = ik31Var;
        this.f = function0;
        this.g = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk31)) {
            return false;
        }
        jk31 jk31Var = (jk31) obj;
        return u890.j(this.a, jk31Var.a) && this.b == jk31Var.b && this.c == jk31Var.c && this.d == jk31Var.d && u890.j(this.e, jk31Var.e) && this.f.equals(jk31Var.f) && this.g.equals(jk31Var.g);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, ab80.k(this.c, xcg1.g(Arrays.hashCode(this.a) * 31, 31, this.b), 31), 31);
        ik31 ik31Var = this.e;
        return this.g.hashCode() + rjx.n((iK + (ik31Var == null ? 0 : ik31Var.hashCode())) * 31, 31, this.f);
    }
}
