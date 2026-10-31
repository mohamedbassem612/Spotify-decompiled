package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wkw0 implements s7c, tzg, j631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final String d;
    public final n1x e;
    public final ArrayList f;

    public wkw0(String str, String str2, x360 x360Var, String str3, n1x n1xVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = str3;
        this.e = n1xVar;
        this.f = arrayList;
    }

    @Override // p.tzg
    public final Set a() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((xkw0) it.next()).c;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        return o7h.p1(arrayList2);
    }

    @Override // p.j631
    public final Set b() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((xkw0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.a;
            String str2 = this.b;
            if (!zHasNext) {
                return Collections.singletonList(new ukw0(str, k3h1Var, new oii0(str, str2, this.d, this.c, arrayList2, (n1x) null, (String) null)));
            }
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            xkw0 xkw0Var = (xkw0) next;
            arrayList2.add(new nii0(l1d.k(i3, str, "-"), l1d.k(i3, str2, "-"), xkw0Var.a, xkw0Var.b, xkw0Var.c, this.e));
            i3 = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkw0)) {
            return false;
        }
        wkw0 wkw0Var = (wkw0) obj;
        return this.a.equals(wkw0Var.a) && this.b.equals(wkw0Var.b) && u890.j(this.c, wkw0Var.c) && this.d.equals(wkw0Var.d) && this.e.equals(wkw0Var.e) && this.f.equals(wkw0Var.f);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d)) * 31);
    }
}
