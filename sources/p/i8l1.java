package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i8l1 implements jn60, h030 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final ial1 e;

    public i8l1(String str, String str2, x360 x360Var, yz21 yz21Var, ial1 ial1Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = ial1Var;
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        ArrayList<v8l1> arrayList = this.e.a;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = this.b;
        x360 x360Var = this.c;
        String str2 = this.a;
        if (!zIsEmpty) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (dug.d((v8l1) it.next())) {
                    ArrayList<v8l1> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((v8l1) obj).e.length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (v8l1 v8l1Var : arrayList2) {
                        arrayList3.add(new ucl1(v8l1Var.c, v8l1Var.a.a, v8l1Var.e, v8l1Var.d, v8l1Var.f));
                    }
                    return k4p1.x(new ral1(str2, op80Var, new wcl1(str2, str, arrayList3, x360Var)));
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
        for (v8l1 v8l1Var2 : arrayList) {
            u6l1 u6l1Var = v8l1Var2.b;
            if (u6l1Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            arrayList4.add(nln.A(u6l1Var, v8l1Var2.c));
        }
        return k4p1.x(new r6l1(str2, op80Var, new s6l1(str2, str, arrayList4, x360Var)));
    }

    @Override // p.h030
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8l1)) {
            return false;
        }
        i8l1 i8l1Var = (i8l1) obj;
        return this.a.equals(i8l1Var.a) && this.b.equals(i8l1Var.b) && u890.j(this.c, i8l1Var.c) && this.d.equals(i8l1Var.d) && this.e.equals(i8l1Var.e);
    }

    @Override // p.jn60
    public final yz21 f() {
        return this.d;
    }

    @Override // p.jn60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.a.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
