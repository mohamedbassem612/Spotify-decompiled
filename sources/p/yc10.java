package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yc10 {
    public final uwh a;
    public final o3r b;

    public yc10(uwh uwhVar) {
        this.a = uwhVar;
        jd11 jd11Var = rc11.a;
        this.b = w3p1.n(new l4r(new xv00(jd11Var.b(cd8.class)), 3, xc10.b, new j4r(la10.d1), xc10.c), new l4r(new xv00(jd11Var.b(s78.class)), 3, xc10.d, new j4r(la10.e1), xc10.e), tc10.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[LOOP:1: B:37:0x0092->B:39:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[LOOP:0: B:32:0x0066->B:59:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, k1r k1rVar, onm onmVar) {
        sc10 sc10Var;
        List list;
        List list2;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        if (onmVar instanceof sc10) {
            sc10Var = (sc10) onmVar;
            int i = sc10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc10Var.c = i - Integer.MIN_VALUE;
            } else {
                sc10Var = new sc10(this, onmVar);
            }
        } else {
            sc10Var = new sc10(this, onmVar);
        }
        Object objC = sc10Var.a;
        int i2 = sc10Var.c;
        List listM = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                if (!(k1rVar instanceof i1r)) {
                    if (k1rVar instanceof j1r) {
                        return j1r.a;
                    }
                    if (k1rVar instanceof h1r) {
                        return k1rVar;
                    }
                    eg.o();
                    return null;
                }
                if (((s78) ((i1r) k1rVar).a).b) {
                    bxh bxhVar = this.a;
                    sc10Var.c = 1;
                    objC = bxhVar.c(str, sc10Var);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    list = listM;
                }
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((zvh) it.next()).b.isEmpty()) {
                            qc10 qc10Var = qc10.a;
                            h8k1 h8k1Var = new h8k1(qc10Var, qc10Var);
                            arrayList = new ArrayList(q7h.U(list2, 10));
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((zvh) it2.next()).a);
                            }
                            pc10 pc10Var = new pc10(arrayList);
                            listM = p7h.M(new h8k1[]{h8k1Var, new h8k1(pc10Var, pc10Var)});
                            break;
                        }
                    }
                }
                return new i1r(listM, (Integer) null);
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
            list = (List) objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        list2 = list;
        if (list2 instanceof Collection) {
            it = list2.iterator();
            while (it.hasNext()) {
                if (!((zvh) it.next()).b.isEmpty()) {
                    qc10 qc10Var2 = qc10.a;
                    h8k1 h8k1Var2 = new h8k1(qc10Var2, qc10Var2);
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((zvh) it2.next()).a);
                    }
                    pc10 pc10Var2 = new pc10(arrayList);
                    listM = p7h.M(new h8k1[]{h8k1Var2, new h8k1(pc10Var2, pc10Var2)});
                    break;
                }
            }
        } else {
            it = list2.iterator();
            while (it.hasNext()) {
                if (!((zvh) it.next()).b.isEmpty()) {
                    qc10 qc10Var3 = qc10.a;
                    h8k1 h8k1Var3 = new h8k1(qc10Var3, qc10Var3);
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((zvh) it2.next()).a);
                    }
                    pc10 pc10Var3 = new pc10(arrayList);
                    listM = p7h.M(new h8k1[]{h8k1Var3, new h8k1(pc10Var3, pc10Var3)});
                    break;
                }
            }
        }
        return new i1r(listM, (Integer) null);
    }
}
