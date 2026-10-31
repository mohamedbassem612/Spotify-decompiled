package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y3b0 {
    public int a;
    public z0o1 b;
    public final ArrayList c = new ArrayList(0);
    public y3b0 d;
    public y3b0 e;
    public t3b0 f;
    public final ArrayList g;

    public y3b0(int i) {
        this.a = i;
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new lka0());
        }
        this.g = arrayList;
    }

    public final z0o1 a() {
        z0o1 z0o1Var = this.b;
        if (z0o1Var != null) {
            return z0o1Var;
        }
        u890.C("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y3b0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y3b0 y3b0Var = (y3b0) obj;
        return this.a == y3b0Var.a && a().equals(y3b0Var.a()) && u890.j(this.c, y3b0Var.c) && u890.j(this.e, y3b0Var.e) && u890.j(this.d, y3b0Var.d) && u890.j(this.f, y3b0Var.f) && u890.j(this.g, y3b0Var.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.a * 31)) * 31);
    }
}
