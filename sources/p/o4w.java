package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o4w {
    public final List a;
    public final List b;
    public final Integer c;
    public final double d;
    public final double e;

    public o4w(List list, List list2, Integer num, double d, double d2) {
        this.a = list;
        this.b = list2;
        this.c = num;
        this.d = d;
        this.e = d2;
    }

    public static o4w a(o4w o4wVar, ArrayList arrayList, ArrayList arrayList2, Integer num, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = o4wVar.a;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 2) != 0) {
            list3 = o4wVar.b;
        }
        List list4 = list3;
        if ((i & 4) != 0) {
            num = o4wVar.c;
        }
        return new o4w(list2, list4, num, o4wVar.d, o4wVar.e);
    }

    public static s69 c(o4w o4wVar, iu30 iu30Var, int i) {
        iu30 iu30Var2 = (i & 1) != 0 ? a4w.c : iu30Var;
        double d = o4wVar.d;
        double d2 = o4wVar.e;
        List list = o4wVar.a;
        List<c4w> list2 = o4wVar.b;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (c4w c4wVar : list2) {
            xz3 xz3Var = (xz3) list.get(c4wVar.a);
            xz3 xz3Var2 = (xz3) list.get(c4wVar.b);
            smc0 smc0VarN = k4p1.n();
            double d3 = d;
            smc0VarN.add(new y9v0(0.0d, ((Number) iu30Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (xz3Var.a & 4294967295L))))).doubleValue()));
            Iterator it = c4wVar.c.iterator();
            while (it.hasNext()) {
                long j = ((Offset) it.next()).a;
                smc0VarN.add(new y9v0(Float.intBitsToFloat((int) (j >> 32)), ((Number) iu30Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))))).doubleValue()));
                d2 = d2;
            }
            smc0VarN.add(new y9v0(1.0d, ((Number) iu30Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (xz3Var2.a & 4294967295L))))).doubleValue()));
            arrayList.add(new p69(k4p1.k(smc0VarN), Float.intBitsToFloat((int) (xz3Var.a >> 32)), Float.intBitsToFloat((int) (xz3Var2.a >> 32))));
            d = d3;
            d2 = d2;
        }
        return new s69(arrayList, d, d2);
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4w)) {
            return false;
        }
        o4w o4wVar = (o4w) obj;
        return this.a.equals(o4wVar.a) && this.b.equals(o4wVar.b) && u890.j(this.c, o4wVar.c) && Double.compare(this.d, o4wVar.d) == 0 && Double.compare(this.e, o4wVar.e) == 0;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Double.hashCode(this.e) + xcg1.e(this.d, (iB + (num == null ? 0 : num.hashCode())) * 31, 31);
    }
}
