package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m9e implements s7c {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final x360 d;

    public m9e(String str, String str2, ArrayList arrayList, x360 x360Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = x360Var;
    }

    public final k9e a(List list, int i, int i2, int i3, ArrayList arrayList) {
        List<n7e> list2 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (n7e n7eVar : list2) {
            String str = n7eVar.a;
            String str2 = n7eVar.b;
            int iC = l1d.C(n7eVar.c);
            int i4 = 1;
            if (iC != 1 && iC == 2) {
                i4 = 2;
            }
            arrayList2.add(new g7e(str, str2, i4, arrayList.indexOf(n7eVar)));
        }
        return new k9e(this.b, arrayList2, i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // p.s7c
    public final List d(int i, int i2) {
        o460 o460Var;
        m9e m9eVar = this;
        hvl1 hvl1Var = m9eVar.d;
        if (hvl1Var == null) {
            o460Var = null;
        } else {
            hvl1 hvl1Var2 = hvl1Var instanceof hvl1 ? hvl1Var : null;
            if (hvl1Var2 == null) {
                o460Var = null;
            } else {
                s460 s460VarV = tho1.v(hvl1Var2);
                o460Var = new o460(m9eVar.a, new s460(2, s460VarV.i, s460VarV.a, s460VarV.b, s460VarV.c, s460VarV.d, s460VarV.f, s460VarV.g, s460VarV.h, s460VarV.j));
            }
        }
        List listN = p7h.N(o460Var);
        k3h1 k3h1Var = new k3h1(i);
        ArrayList arrayList = m9eVar.c;
        int i3 = i2;
        ArrayList arrayListS1 = o7h.s1(arrayList, i3, i3);
        int size = arrayListS1.size();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListS1, 10));
        int i4 = 0;
        for (Object obj : arrayListS1) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p7h.T();
                throw null;
            }
            List list = (List) obj;
            int i6 = l9e.a[l1d.C(((n7e) o7h.q0(list)).c)];
            String str = m9eVar.b;
            arrayList2.add(i6 == 1 ? new i9e(o7h.y0(list, " ", (String) null, (String) null, jzd.N0, 30), k3h1Var, str, m9eVar.a(list, i3, size, i4, arrayList)) : new h9e(o7h.y0(list, " ", (String) null, (String) null, jzd.O0, 30), k3h1Var, str, a(list, i2, size, i4, arrayList)));
            m9eVar = this;
            i3 = i2;
            i4 = i5;
        }
        return o7h.N0(arrayList2, listN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9e)) {
            return false;
        }
        m9e m9eVar = (m9e) obj;
        return this.a.equals(m9eVar.a) && this.b.equals(m9eVar.b) && this.c.equals(m9eVar.c) && u890.j(this.d, m9eVar.d);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        x360 x360Var = this.d;
        return iF + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
