package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d5b1 implements kf20 {
    public final List a;
    public final boolean b;
    public final rrc1 c;
    public final nn51 d;
    public final xw7 e;
    public final Set f;

    public d5b1(List list, boolean z, rrc1 rrc1Var, nn51 nn51Var, xw7 xw7Var, Set set) {
        this.a = list;
        this.b = z;
        this.c = rrc1Var;
        this.d = nn51Var;
        this.e = xw7Var;
        this.f = set;
    }

    @Override // p.kf20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d5b1 a(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = this.a;
        rpl rplVar = (rpl) o7h.q0(list2);
        List list3 = ((rpl) o7h.q0(list2)).d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vdc1 vdc1Var = (vdc1) it.next();
            int i = vdc1Var.b;
            int i2 = vdc1Var.c;
            Integer numValueOf = Integer.valueOf(i);
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(((xdx0) list3.get(i)).b.get(i2));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new xdx0(null, (List) entry.getValue(), ((xdx0) rplVar.d.get(((Number) entry.getKey()).intValue())).a));
        }
        return new d5b1(Collections.singletonList(new rpl(rplVar.a, rplVar.b, rplVar.c, arrayList)), this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5b1)) {
            return false;
        }
        d5b1 d5b1Var = (d5b1) obj;
        return this.a.equals(d5b1Var.a) && this.b == d5b1Var.b && u890.j(this.c, d5b1Var.c) && u890.j(this.d, d5b1Var.d) && u890.j(this.e, d5b1Var.e) && this.f.equals(d5b1Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        rrc1 rrc1Var = this.c;
        int iHashCode = (iG + (rrc1Var == null ? 0 : rrc1Var.a.hashCode())) * 31;
        nn51 nn51Var = this.d;
        int iHashCode2 = (iHashCode + (nn51Var == null ? 0 : nn51Var.hashCode())) * 31;
        xw7 xw7Var = this.e;
        return this.f.hashCode() + ((iHashCode2 + (xw7Var != null ? xw7Var.hashCode() : 0)) * 31);
    }
}
