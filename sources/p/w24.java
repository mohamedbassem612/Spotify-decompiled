package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w24 implements jn60, qjl {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final j34 e;

    public w24(String str, String str2, x360 x360Var, yz21 yz21Var, j34 j34Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = j34Var;
    }

    public final Set c() {
        ArrayList arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((oi90) it.next()).b, arrayList2);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        j34 j34Var = this.e;
        ArrayList<oi90> arrayList = j34Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (oi90 oi90Var : arrayList) {
            arrayList2.add(new x24(oi90Var.a, (String) o7h.s0(oi90Var.b)));
        }
        return Collections.singletonList(new v24(new y24(this.b, this.c, arrayList2, j34Var.b), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w24)) {
            return false;
        }
        w24 w24Var = (w24) obj;
        return this.a.equals(w24Var.a) && this.b.equals(w24Var.b) && u890.j(this.c, w24Var.c) && this.d.equals(w24Var.d) && this.e.equals(w24Var.e);
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
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
