package p;

import android.content.Context;
import android.text.Html;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ei0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u961 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(u961 u961Var, byte b) {
        super(3);
        this.a = b;
        this.b = u961Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0203  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        xn70 xn70Var;
        String strW;
        String str;
        csz0 asz0Var;
        ArrayList arrayList2;
        Long l;
        hll hllVarN;
        l98 l98VarN;
        a7q0 a7q0VarN;
        hll hllVarN2;
        pnt pntVarN;
        goj0 goj0VarA;
        w281 w281Var;
        goj0 goj0VarA2;
        byte b = this.a;
        u961 u961Var = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                ioj0 ioj0Var = (ioj0) obj3;
                em3 em3Var = (em3) u961Var.d;
                List list = vxo1.o(ioj0Var.c(jo70.class, str2)).d;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).a);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ow3 ow3Var = (ow3) em3Var.b;
                    xn70Var = new xn70(((Context) ow3Var.b).getString(2131952636, ((quc0) ow3Var.c).a(arrayList)), (String) null, 6, (String) null);
                } else {
                    xn70Var = null;
                }
                yqg yqgVar = (yqg) em3Var.c;
                hoj0 hoj0VarC = ioj0Var.c(zoy0.class, str2);
                Long lA = l4o1.A((hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) ? null : (zoy0) goj0VarA2.a, yqgVar);
                po11 po11Var = lA != null ? new po11(lA.longValue()) : null;
                hoj0 hoj0VarC2 = ioj0Var.c(w281.class, str2);
                kob kobVarK = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (w281Var = (w281) goj0VarA.a) == null) ? null : pqo.k(w281Var);
                job jobVar = kobVarK instanceof job ? (job) kobVarK : null;
                String str3 = jobVar != null ? jobVar.a : null;
                ati1 ati1Var = str3 != null ? new ati1(str3) : null;
                String str4 = vxo1.o(ioj0Var.c(jo70.class, str2)).a;
                hoj0 hoj0VarC3 = ioj0Var.c(pnt.class, str2);
                String str5 = (hoj0VarC3 == null || (pntVarN = vxo1.n(hoj0VarC3)) == null) ? null : pntVarN.a;
                if (str5 == null) {
                    strW = null;
                } else {
                    if (ihc1.y0(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        strW = nhc1.W(Html.fromHtml(str5, 0).toString(), "\n", " ");
                    } else {
                        strW = null;
                    }
                }
                up70 up70VarA = vxo1.o(ioj0Var.c(xkk1.class, str2)).a.a(vp70.c);
                if (up70VarA == null || (str = up70VarA.a.a) == null) {
                    str = "";
                }
                sz6 sz6Var = new sz6(str);
                hoj0 hoj0VarC4 = ioj0Var.c(hll.class, str2);
                List list3 = (hoj0VarC4 == null || (hllVarN2 = vxo1.n(hoj0VarC4)) == null) ? null : hllVarN2.b;
                if (list3 == null) {
                    list3 = z6x.a;
                }
                c380 c380VarA = mqo1.A(list3);
                hoj0 hoj0VarC5 = ioj0Var.c(a7q0.class, str2);
                if (hoj0VarC5 == null || (a7q0VarN = vxo1.n(hoj0VarC5)) == null) {
                    asz0Var = null;
                } else {
                    y6q0 y6q0Var = a7q0VarN.d;
                    asz0Var = y6q0Var == null ? csz0.c : new asz0(y6q0Var.a);
                }
                hoj0 hoj0VarC6 = ioj0Var.c(l98.class, str2);
                if (hoj0VarC6 == null || (l98VarN = vxo1.n(hoj0VarC6)) == null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList3 = l98VarN.a;
                    arrayList2 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((k98) it2.next()).a);
                    }
                }
                c380 c380VarA2 = arrayList2 != null ? mqo1.A(arrayList2) : null;
                hoj0 hoj0VarC7 = ioj0Var.c(hll.class, str2);
                if (hoj0VarC7 == null || (hllVarN = vxo1.n(hoj0VarC7)) == null) {
                    l = null;
                } else {
                    long jH = jfv.h(hllVarN.a);
                    Long lValueOf = Long.valueOf(jH);
                    if (jH > 0) {
                        l = lValueOf;
                    } else {
                        l = null;
                    }
                }
                return new q6g1(xn70Var, new bv11(str4, strW, (Long) null, l, (u380) null, 0, false, c380VarA, (h540) null, asz0Var, c380VarA2, sz6Var, false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, po11Var, (msv0) null, ati1Var, (c380) null, (String) null, (ktl) null, 64483700));
            default:
                return t5p1.j(new u70(((btt0) u961Var.c).a((String) obj), (byte) 2), 3);
        }
    }
}
