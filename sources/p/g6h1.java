package p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class g6h1 implements Serializable {
    public static final f6h1 Companion = new f6h1();
    public static final znb0[] c = {dm5.S(2, q9f1.c1), dm5.S(2, q9f1.d1)};
    public static final g6h1 d;
    public static final g6h1 e;
    public final List a;
    public final mla1 b;

    static {
        jla1 jla1Var = jla1.INSTANCE;
        z6x z6xVar = z6x.a;
        d = new g6h1(z6xVar, jla1Var);
        e = new g6h1(z6xVar, kla1.INSTANCE);
        new g6h1(z6xVar, lla1.INSTANCE);
    }

    public /* synthetic */ g6h1(int i, List list, mla1 mla1Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, e6h1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
            mla1Var = null;
        } else {
            this.b = mla1Var;
        }
        if (list.isEmpty() || mla1Var == null) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }

    public final mla1 a() {
        if (!this.a.isEmpty()) {
            return null;
        }
        mla1 mla1Var = this.b;
        return mla1Var == null ? kla1.INSTANCE : mla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6h1)) {
            return false;
        }
        g6h1 g6h1Var = (g6h1) obj;
        return u890.j(this.a, g6h1Var.a) && u890.j(this.b, g6h1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mla1 mla1Var = this.b;
        return iHashCode + (mla1Var == null ? 0 : mla1Var.hashCode());
    }

    public g6h1(List list, mla1 mla1Var) {
        this.a = list;
        this.b = mla1Var;
        if (list.isEmpty() || mla1Var == null) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }
}
