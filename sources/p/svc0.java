package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class svc0 {
    public final b8e0 a;
    public final unl b;
    public final List c;
    public final List d;

    public svc0(b8e0 b8e0Var, unl unlVar, List list, List list2) {
        this.a = b8e0Var;
        this.b = unlVar;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svc0)) {
            return false;
        }
        svc0 svc0Var = (svc0) obj;
        return u890.j(this.a, svc0Var.a) && u890.j(this.b, svc0Var.b) && u890.j(this.c, svc0Var.c) && u890.j(this.d, svc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ svc0(int i, b8e0 b8e0Var) {
        snl snlVar = snl.a;
        z6x z6xVar = z6x.a;
        this(b8e0Var, snlVar, z6xVar, z6xVar);
    }
}
