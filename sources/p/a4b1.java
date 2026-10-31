package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4b1 extends tca {
    public final yfu K;
    public final boolean L;

    public a4b1(yfu yfuVar, vu30 vu30Var, boolean z, pnf1 pnf1Var, int[] iArr, o4a o4aVar, q8n q8nVar, iu30 iu30Var, iu30 iu30Var2, boolean z2, boolean z3, c5u0 c5u0Var) {
        super(vu30Var, z, z3, c5u0Var, pnf1Var, iArr, o4aVar, q8nVar, iu30Var, iu30Var2);
        this.K = yfuVar;
        this.L = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object F(a4b1 a4b1Var, ArrayList arrayList, onm onmVar) {
        z3b1 z3b1Var;
        a4b1 a4b1Var2;
        List list;
        if (onmVar instanceof z3b1) {
            z3b1Var = (z3b1) onmVar;
            int i = z3b1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3b1Var.e = i - Integer.MIN_VALUE;
            } else {
                z3b1Var = new z3b1(a4b1Var, onmVar);
            }
        } else {
            z3b1Var = new z3b1(a4b1Var, onmVar);
        }
        Object objH = z3b1Var.c;
        int i2 = z3b1Var.e;
        if (i2 == 0) {
            hm5.M(objH);
            boolean z = a4b1Var.L;
            d9n d9nVar = d9n.a;
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mmr0 mmr0Var = (mmr0) it.next();
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    Object obj = ((vjh0) mmr0Var.b).c().j;
                    np51 np51Var = obj instanceof np51 ? (np51) obj : null;
                    y3b1 y3b1Var = np51Var != null ? new y3b1(iIntValue, ((yca) a4b1Var).d[iIntValue], np51Var) : null;
                    if (y3b1Var != null) {
                        arrayList2.add(y3b1Var);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    ie30 ie30Var = ((y3b1) obj2).b;
                    if (a4b1Var.G || a4b1Var.D(ie30Var)) {
                        arrayList3.add(obj2);
                    }
                }
                List listA1 = o7h.a1(arrayList3, new be21((byte) 15));
                if (!listA1.isEmpty()) {
                    ptl ptlVarA = ((y3b1) o7h.q0(listA1)).c.a();
                    List list2 = listA1;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((y3b1) it2.next()).c.b);
                    }
                    yfu yfuVar = a4b1Var.K;
                    z3b1Var.a = a4b1Var;
                    z3b1Var.b = listA1;
                    z3b1Var.e = 2;
                    objH = c921.H((q8n) yfuVar.c, new sr1(yfuVar, arrayList4, ptlVarA, (lnm) null, (byte) 20), z3b1Var);
                    if (objH != d9nVar) {
                        a4b1Var2 = a4b1Var;
                        list = listA1;
                    }
                }
                return null;
            }
            z3b1Var.a = null;
            z3b1Var.e = 1;
            Object objC = tca.C(a4b1Var, arrayList, z3b1Var);
            if (objC != d9nVar) {
                return objC;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objH);
            return objH;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = z3b1Var.b;
        a4b1Var2 = z3b1Var.a;
        hm5.M(objH);
        int iIntValue2 = ((Number) objH).intValue();
        if (iIntValue2 != -1) {
            y3b1 y3b1Var2 = (y3b1) list.get(iIntValue2);
            if (y3b1Var2.b.k < ((yca) a4b1Var2).d[a4b1Var2.H].k && !a4b1Var2.G) {
                y3b1Var2 = null;
            }
            if (y3b1Var2 != null) {
                return new Integer(y3b1Var2.a);
            }
        }
        return null;
    }

    @Override // p.tca
    public final Object B(ArrayList arrayList, wn2 wn2Var) {
        return F(this, arrayList, wn2Var);
    }

    @Override // p.tca
    public final Object E(vjh0 vjh0Var, zi3 zi3Var) {
        Object obj = vjh0Var.c().j;
        np51 np51Var = obj instanceof np51 ? (np51) obj : null;
        if (np51Var == null) {
            return Boolean.FALSE;
        }
        String str = np51Var.b;
        ptl ptlVarA = np51Var.a();
        yfu yfuVar = this.K;
        return c921.H((q8n) yfuVar.c, new lqv(yfuVar, str, ptlVarA, false, (lnm) null, (byte) 7), zi3Var);
    }
}
