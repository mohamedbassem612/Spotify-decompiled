package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdf1 implements jn60, szg, miv0 {
    public final /* synthetic */ byte a;
    public final String b;
    public final String c;
    public final yz21 d;
    public final Object e;

    public /* synthetic */ tdf1(String str, String str2, yz21 yz21Var, Object obj, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = yz21Var;
        this.e = obj;
    }

    public final Set a() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                ArrayList arrayList = ((zdf1) obj).a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((xef1) it.next()).c, arrayList2);
                }
                return o7h.p1(arrayList2);
            default:
                return o7h.p1(((vef1) obj).c);
        }
    }

    public final Set b() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                ArrayList arrayList = ((zdf1) obj).a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((xef1) it.next()).c, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (bbp1.k((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                return o7h.p1(arrayList3);
            default:
                ArrayList arrayList4 = ((vef1) obj).c;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (bbp1.k((String) obj3)) {
                        arrayList5.add(obj3);
                    }
                }
                return o7h.p1(arrayList5);
        }
    }

    public final List d(op80 op80Var) {
        byte b = this.a;
        String str = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                ArrayList<xef1> arrayList = ((zdf1) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (xef1 xef1Var : arrayList) {
                    arrayList2.add(new sdf1(xef1Var.a, xef1Var.b, (String) o7h.s0(xef1Var.c), xef1Var.d, xef1Var.e, xef1Var.f, xef1Var.g));
                }
                return Collections.singletonList(new kdf1(new pdf1(this.c, arrayList2), str, op80Var));
            default:
                vef1 vef1Var = (vef1) obj;
                return Collections.singletonList(new wef1(new oef1(this.c, vef1Var.a, vef1Var.b, vef1Var.c, vef1Var.d, vef1Var.e), str, op80Var));
        }
    }

    public final yz21 f() {
        byte b = this.a;
        return this.d;
    }

    public final String getId() {
        byte b = this.a;
        return this.b;
    }
}
