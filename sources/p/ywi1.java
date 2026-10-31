package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ywi1 {
    public final av50 a;
    public final List b;
    public final kyi1 c;
    public final q1a d;

    public ywi1(av50 av50Var, List list, kyi1 kyi1Var, q1a q1aVar) {
        this.a = av50Var;
        this.b = list;
        this.c = kyi1Var;
        this.d = q1aVar;
    }

    public static ywi1 a(ywi1 ywi1Var, kyi1 kyi1Var, q1a q1aVar, int i) {
        av50 av50Var = ywi1Var.a;
        List list = ywi1Var.b;
        if ((i & 4) != 0) {
            kyi1Var = ywi1Var.c;
        }
        if ((i & 8) != 0) {
            q1aVar = ywi1Var.d;
        }
        return new ywi1(av50Var, list, kyi1Var, q1aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywi1)) {
            return false;
        }
        ywi1 ywi1Var = (ywi1) obj;
        return this.a.equals(ywi1Var.a) && this.b.equals(ywi1Var.b) && this.c.equals(ywi1Var.c) && u890.j(this.d, ywi1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
