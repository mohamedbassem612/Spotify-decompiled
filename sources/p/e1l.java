package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e1l {
    public final boolean a;
    public final List b;
    public final spq0 c;
    public final spq0 d;

    public e1l(boolean z, List list, spq0 spq0Var, spq0 spq0Var2) {
        this.a = z;
        this.b = list;
        this.c = spq0Var;
        this.d = spq0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1l)) {
            return false;
        }
        e1l e1lVar = (e1l) obj;
        return this.a == e1lVar.a && u890.j(this.b, e1lVar.b) && u890.j(this.c, e1lVar.c) && u890.j(this.d, e1lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e1l() {
        z6x z6xVar = z6x.a;
        j5 j5Var = j5.a;
        this(false, z6xVar, j5Var, j5Var);
    }
}
