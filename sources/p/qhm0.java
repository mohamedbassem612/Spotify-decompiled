package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qhm0 {
    public final boolean a;
    public final List b;
    public final List c;

    public qhm0(List list, List list2, boolean z) {
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public static qhm0 a(qhm0 qhm0Var, boolean z, List list, int i) {
        if ((i & 2) != 0) {
            list = qhm0Var.b;
        }
        return new qhm0(list, qhm0Var.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhm0)) {
            return false;
        }
        qhm0 qhm0Var = (qhm0) obj;
        return this.a == qhm0Var.a && this.b.equals(qhm0Var.b) && this.c.equals(qhm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
