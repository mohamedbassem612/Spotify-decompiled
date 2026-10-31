package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class snd0 implements jn60, szg {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final wnd0 e;

    public snd0(String str, String str2, x360 x360Var, yz21 yz21Var, wnd0 wnd0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = wnd0Var;
    }

    public final Set a() {
        ArrayList arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi90) it.next()).a);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        ArrayList arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi90) it.next()).a);
        }
        return Collections.singletonList(new ynd0(this.a, op80Var, new krk(this.b, this.c, mqo1.A(arrayList2))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snd0)) {
            return false;
        }
        snd0 snd0Var = (snd0) obj;
        return this.a.equals(snd0Var.a) && this.b.equals(snd0Var.b) && u890.j(this.c, snd0Var.c) && this.d.equals(snd0Var.d) && this.e.equals(snd0Var.e);
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
