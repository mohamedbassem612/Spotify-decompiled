package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dux0 {
    public final List a;
    public final List b;
    public final List c;

    public dux0(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dux0)) {
            return false;
        }
        dux0 dux0Var = (dux0) obj;
        return u890.j(this.a, dux0Var.a) && u890.j(this.b, dux0Var.b) && u890.j(this.c, dux0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dux0() {
        z6x z6xVar = z6x.a;
        this(z6xVar, z6xVar, z6xVar);
    }
}
