package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class smh0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;
    public final List e;
    public final rmh0 f;

    public smh0(boolean z, boolean z2, int i, String str, List list, rmh0 rmh0Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = list;
        this.f = rmh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smh0)) {
            return false;
        }
        smh0 smh0Var = (smh0) obj;
        return this.a == smh0Var.a && this.b == smh0Var.b && this.c == smh0Var.c && u890.j(this.d, smh0Var.d) && this.e.equals(smh0Var.e) && this.f == smh0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b(cy30.d(kaa0.f(this.c, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }
}
