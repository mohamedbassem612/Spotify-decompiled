package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7h1 extends q6h1 {
    public final y7h1 d;

    public w7h1(y7h1 y7h1Var, long j, List list) {
        super(y7h1Var.d().b(), y7h1Var.d().c(), j, list);
        this.d = y7h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w7h1) {
            return u890.j(this.d, ((w7h1) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // p.q6h1
    public final String toString() {
        return "interaction = " + this.d.a() + ' ' + super.toString();
    }

    public w7h1(String str, String str2, z7h1 z7h1Var, x7h1 x7h1Var, y6h1 y6h1Var, r6h1 r6h1Var, long j) {
        this(new y7h1(str, str2, new z6h1(y6h1Var, r6h1Var), z7h1Var, x7h1Var), j, z6x.a);
    }
}
