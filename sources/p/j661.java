package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j661 implements h661, mtc {
    public final String a;
    public final yoi1 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final h661[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final h661[] k;
    public final idd1 l;

    public j661(String str, yoi1 yoi1Var, int i, List list, neg negVar) {
        this.a = str;
        this.b = yoi1Var;
        this.c = i;
        this.d = negVar.b;
        ArrayList arrayList = negVar.c;
        this.e = o7h.j1(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = j0o1.q(negVar.e);
        this.h = (List[]) negVar.f.toArray(new List[0]);
        this.i = o7h.f1(negVar.g);
        ba80 ba80VarV0 = f46.V0(strArr);
        ArrayList arrayList2 = new ArrayList(q7h.U(ba80VarV0, 10));
        Iterator it = ba80VarV0.iterator();
        while (true) {
            ca80 ca80Var = (ca80) it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                this.j = sqg0.T(arrayList2);
                this.k = j0o1.q(list);
                this.l = new idd1(new g24(this, (byte) 9));
                return;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            arrayList2.add(oqn1.n(aa80Var.b, Integer.valueOf(aa80Var.a)));
        }
    }

    @Override // p.mtc
    public final Set a() {
        return this.e;
    }

    @Override // p.h661
    public final int c(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p.h661
    public final int d() {
        return this.c;
    }

    @Override // p.h661
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j661) {
            h661 h661Var = (h661) obj;
            if (this.a.equals(h661Var.h()) && Arrays.equals(this.k, ((j661) obj).k)) {
                int iD = h661Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        h661[] h661VarArr = this.g;
                        if (u890.j(h661VarArr[i2].h(), h661Var.g(i2).h()) && u890.j(h661VarArr[i2].getKind(), h661Var.g(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p.h661
    public final List f(int i) {
        return this.h[i];
    }

    @Override // p.h661
    public final h661 g(int i) {
        return this.g[i];
    }

    @Override // p.h661
    public final List getAnnotations() {
        return this.d;
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return this.b;
    }

    @Override // p.h661
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // p.h661
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return p6p1.w(this);
    }
}
