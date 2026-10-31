package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tgi0 implements jn60, h030, szg, i631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final boolean e;
    public final ArrayList f;

    public tgi0(String str, String str2, x360 x360Var, yz21 yz21Var, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = z;
        this.f = arrayList;
    }

    public final Set a() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bhi0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final Set b() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bhi0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        String str = this.d.a;
        ArrayList arrayList = this.f;
        x360 x360Var = this.c;
        String str2 = this.a;
        String str3 = this.b;
        return Collections.singletonList(x360Var != null ? new zfi0(str2, op80Var, new hgi0(str2, str3, x360Var, rqo1.u(str2, str3, arrayList), this.e, str, 32)) : new yfi0(str2, op80Var, new hgi0(str2, str3, x360Var, rqo1.u(str2, str3, arrayList), this.e, str, 32)));
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
