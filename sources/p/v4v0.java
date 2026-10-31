package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v4v0 implements jn60, h030, szg, i631, qjl {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final ArrayList e;

    public v4v0(String str, String str2, x360 x360Var, yz21 yz21Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = arrayList;
    }

    public final Set a() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bhi0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final Set b() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bhi0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final Set c() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bhi0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        ArrayList arrayList = this.e;
        String str = this.a;
        String str2 = this.b;
        hgi0 hgi0Var = new hgi0(str, str2, this.c, rqo1.u(str, str2, arrayList), true, true, this.d.a);
        return Collections.singletonList(this.c != null ? new t4v0(str, op80Var, hgi0Var) : new s4v0(str, op80Var, hgi0Var));
    }

    public final String e() {
        return this.a;
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }
}
