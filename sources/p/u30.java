package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u30 implements jn60, szg, qjl {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final x30 e;

    public u30(String str, String str2, x360 x360Var, yz21 yz21Var, x30 x30Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = x30Var;
    }

    public final Set a() {
        ArrayList arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((oi90) it.next()).b, arrayList2);
        }
        return o7h.p1(arrayList2);
    }

    public final Set c() {
        ArrayList<oi90> arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList();
        for (oi90 oi90Var : arrayList) {
            List listSingletonList = oi90Var.b;
            if (listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(oi90Var.a);
            }
            r7h.W(listSingletonList, arrayList2);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        ArrayList<oi90> arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (oi90 oi90Var : arrayList) {
            arrayList2.add(new i30(oi90Var.a, mqo1.A(oi90Var.b)));
        }
        return Collections.singletonList(new g30(this.a, op80Var, new k30(this.b, this.c, mqo1.A(arrayList2))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return this.a.equals(u30Var.a) && this.b.equals(u30Var.b) && u890.j(this.c, u30Var.c) && this.d.equals(u30Var.d) && this.e.equals(u30Var.e);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.a.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
