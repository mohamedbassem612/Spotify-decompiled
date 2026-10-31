package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n0o0 implements z0o0 {
    public final String a;
    public final List b;
    public final String c;

    public n0o0(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n0o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n0o0 n0o0Var = (n0o0) obj;
        return this.a.equals(n0o0Var.a) && this.b.equals(n0o0Var.b) && this.c.equals(n0o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(cy30.d(Integer.hashCode(2131231039) * 31, 31, this.a), 31, this.b);
    }
}
