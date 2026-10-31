package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z6h1 {
    public final y6h1 a;
    public final r6h1 b;

    public z6h1(y6h1 y6h1Var, r6h1 r6h1Var) {
        this.a = y6h1Var;
        this.b = r6h1Var;
    }

    public final r6h1 a() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.b;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final y6h1 b() {
        return this.a;
    }

    public final r6h1 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6h1)) {
            return false;
        }
        z6h1 z6h1Var = (z6h1) obj;
        return u890.j(this.a, z6h1Var.a) && u890.j(this.b, z6h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UbiEventPath(location=" + this.a + ", parentAbsoluteLocation=" + this.b + ')';
    }
}
