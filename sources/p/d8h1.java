package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class d8h1 implements Serializable {
    public static final c8h1 Companion = new c8h1();
    public final ou80 a;
    public final y6r0 b;
    public final r6h1 c;

    public /* synthetic */ d8h1(int i, ou80 ou80Var, y6r0 y6r0Var, r6h1 r6h1Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, b8h1.a.getDescriptor());
            throw null;
        }
        this.a = ou80Var;
        this.b = y6r0Var;
        this.c = r6h1Var;
    }

    public final r6h1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8h1)) {
            return false;
        }
        d8h1 d8h1Var = (d8h1) obj;
        return u890.j(this.a, d8h1Var.a) && u890.j(this.b, d8h1Var.b) && u890.j(this.c, d8h1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        y6r0 y6r0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (y6r0Var == null ? 0 : y6r0Var.a.hashCode())) * 31);
    }

    public d8h1(ou80 ou80Var, y6r0 y6r0Var, r6h1 r6h1Var) {
        this.a = ou80Var;
        this.b = y6r0Var;
        this.c = r6h1Var;
    }
}
