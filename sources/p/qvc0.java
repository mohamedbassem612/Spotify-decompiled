package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qvc0 implements poa0 {
    public final String a;
    public final g3d0 b;
    public final Set c;
    public final mqz0 d;

    public /* synthetic */ qvc0(String str, c3d0 c3d0Var, Set set, mqz0 mqz0Var, int i) {
        this(str, (i & 4) != 0 ? w7x.a : set, (i & 2) != 0 ? null : c3d0Var, (i & 8) != 0 ? hqz0.a : mqz0Var);
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.c;
    }

    public final mqz0 c() {
        return this.d;
    }

    public final g3d0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvc0)) {
            return false;
        }
        qvc0 qvc0Var = (qvc0) obj;
        return u890.j(this.a, qvc0Var.a) && u890.j(this.b, qvc0Var.b) && u890.j(this.c, qvc0Var.c) && u890.j(this.d, qvc0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return this.d.hashCode() + gvg.c((iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31, 31, this.c);
    }

    public qvc0(String str, Set set, g3d0 g3d0Var, mqz0 mqz0Var) {
        this.a = str;
        this.b = g3d0Var;
        this.c = set;
        this.d = mqz0Var;
    }
}
