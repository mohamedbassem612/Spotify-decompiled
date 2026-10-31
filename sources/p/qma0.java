package p;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qma0 implements i0h1, a1h1, jla0 {
    public final rma0 a;
    public final znb0 b;
    public final String c;
    public final int d;
    public final y0h1 e;
    public volatile List f;

    /* JADX WARN: Illegal instructions before constructor call */
    public qma0(rma0 rma0Var, y0h1 y0h1Var, vma0 vma0Var) {
        int i;
        String strB = y0h1Var.getName().b();
        int iC = l1d.C(y0h1Var.x());
        if (iC != 0) {
            i = 2;
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    throw null;
                }
                i = 3;
            }
        } else {
            i = 1;
        }
        y0h1Var.u();
        this(y0h1Var, rma0Var, strB, i);
        List<a8b0> upperBounds = y0h1Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(q7h.U(upperBounds, 10));
        for (a8b0 a8b0Var : upperBounds) {
            a8b0Var.getClass();
            rgt rgtVar = new rgt(a8b0Var);
            vma0 vma0Var2 = vma0.b;
            oma0 oma0Var = vma0Var.a(1, rgtVar).b;
            if (oma0Var == null) {
                sh10.e(rma0Var);
                throw null;
            }
            arrayList.add(oma0Var);
        }
        this.f = arrayList;
    }

    public final GenericDeclaration b() {
        return (GenericDeclaration) this.b.getValue();
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qma0)) {
            return false;
        }
        qma0 qma0Var = (qma0) obj;
        return u890.j(this.c, qma0Var.c) && this.a.equals(qma0Var.a);
    }

    public final List getUpperBounds() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        u890.C("upperBounds");
        throw null;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iC = l1d.C(this.d);
        if (iC != 0) {
            if (iC == 1) {
                sb.append("in ");
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(this.c);
        return sb.toString();
    }

    public qma0(y0h1 y0h1Var, rma0 rma0Var, String str, int i) {
        this.a = rma0Var;
        this.b = dm5.S(2, new g030(this, (byte) 11));
        this.c = str;
        this.d = i;
        this.e = y0h1Var;
    }

    public qma0(rma0 rma0Var, y0h1 y0h1Var) {
        this(rma0Var, y0h1Var, vma0.b);
    }
}
