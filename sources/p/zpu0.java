package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zpu0 {
    public final iqi0 a;
    public final String b;
    public final boolean c;
    public final List d;

    public zpu0(iqi0 iqi0Var, String str, boolean z, List list) {
        this.a = iqi0Var;
        this.b = str;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpu0)) {
            return false;
        }
        zpu0 zpu0Var = (zpu0) obj;
        return this.a.equals(zpu0Var.a) && u890.j(this.b, zpu0Var.b) && this.c == zpu0Var.c && this.d.equals(zpu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
