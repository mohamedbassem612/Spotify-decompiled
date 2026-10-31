package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ftl implements jn60, szg, qjl {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final gtl e;

    public ftl(String str, String str2, x360 x360Var, yz21 yz21Var, gtl gtlVar) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = gtlVar;
    }

    @Override // p.szg
    public final Set a() {
        return b();
    }

    public final Set b() {
        ArrayList arrayList = this.e.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi90) it.next()).a);
        }
        return o7h.p1(arrayList2);
    }

    @Override // p.qjl
    public final Set c() {
        return b();
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        gtl gtlVar = this.e;
        ArrayList<oi90> arrayList = gtlVar.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (oi90 oi90Var : arrayList) {
            arrayList2.add(new uv11(oi90Var.a, gtlVar.b ? tm80.v(oi90Var) : oi90Var.a, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
        }
        c380 c380VarA = mqo1.A(arrayList2);
        String str = this.b;
        x360 x360Var = this.c;
        dtl dtlVar = new dtl(str, x360Var, c380VarA);
        String str2 = this.a;
        return k4p1.x(x360Var != null ? new tsl(dtlVar, str2, op80Var) : new ssl(dtlVar, str2, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftl)) {
            return false;
        }
        ftl ftlVar = (ftl) obj;
        return this.a.equals(ftlVar.a) && this.b.equals(ftlVar.b) && u890.j(this.c, ftlVar.c) && this.d.equals(ftlVar.d) && this.e.equals(ftlVar.e);
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
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
