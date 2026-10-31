package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class tca extends v61 implements g0g1 {
    public final q8n A;
    public final iu30 B;
    public final iu30 C;
    public boolean D;
    public boolean E;
    public y1k1 F;
    public boolean G;
    public int H;
    public LinkedHashSet I;
    public final ArrayList J;
    public final vu30 w;
    public final boolean x;
    public final boolean y;
    public final c5u0 z;

    public tca(vu30 vu30Var, boolean z, boolean z2, c5u0 c5u0Var, pnf1 pnf1Var, int[] iArr, o4a o4aVar, q8n q8nVar, iu30 iu30Var, iu30 iu30Var2) {
        super(pnf1Var, iArr, o4aVar);
        this.w = vu30Var;
        this.x = z;
        this.y = z2;
        this.z = c5u0Var;
        this.A = q8nVar;
        this.B = iu30Var;
        this.C = iu30Var2;
        this.H = ((v61) this).s;
        int i = pnf1Var.a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(pnf1Var.d[i2]);
        }
        this.J = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object C(tca tcaVar, List list, onm onmVar) {
        sca scaVar;
        Object next;
        if (onmVar instanceof sca) {
            scaVar = (sca) onmVar;
            int i = scaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scaVar.d = i - Integer.MIN_VALUE;
            } else {
                scaVar = new sca(tcaVar, onmVar);
            }
        } else {
            scaVar = new sca(tcaVar, onmVar);
        }
        Object objY = scaVar.b;
        int i2 = scaVar.d;
        if (i2 == 0) {
            hm5.M(objY);
            scaVar.a = tcaVar;
            scaVar.d = 1;
            objY = fn31.Y(tcaVar.A, new wc5(list, tcaVar, (lnm) null, (byte) 27), scaVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tcaVar = scaVar.a;
            hm5.M(objY);
        }
        List list2 = (List) objY;
        if (!list2.isEmpty()) {
            ie30 ie30Var = ((yca) tcaVar).d[tcaVar.H];
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                ie30 ie30Var2 = (ie30) ((mmr0) obj).b;
                if (tcaVar.G || tcaVar.D(ie30Var2)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((ie30) ((mmr0) obj2).b).k >= ie30Var.k || tcaVar.G) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i3 = ((ie30) ((mmr0) next).b).k;
                    do {
                        Object next2 = it.next();
                        int i4 = ((ie30) ((mmr0) next2).b).k;
                        if (i3 < i4) {
                            next = next2;
                            i3 = i4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            mmr0 mmr0Var = (mmr0) next;
            int iIntValue = mmr0Var != null ? ((Number) mmr0Var.a).intValue() : -1;
            if (iIntValue != -1) {
                return new Integer(iIntValue);
            }
        }
        return null;
    }

    public Object B(ArrayList arrayList, wn2 wn2Var) {
        return C(this, arrayList, wn2Var);
    }

    public final boolean D(ie30 ie30Var) {
        LinkedHashSet linkedHashSet = this.I;
        if (linkedHashSet != null) {
            return linkedHashSet.contains(ie30Var);
        }
        List listL1 = o7h.l1(this.J);
        vu30 vu30Var = this.w;
        if (vu30Var != null) {
            return ((Boolean) vu30Var.invoke(ie30Var, listL1)).booleanValue();
        }
        return true;
    }

    public abstract Object E(vjh0 vjh0Var, zi3 zi3Var);

    public final boolean b(long j, yag yagVar, List list) {
        if (!this.D) {
            return false;
        }
        this.D = false;
        this.E = true;
        return true;
    }

    public final int c() {
        return this.H;
    }

    public final void g() {
        ((v61) this).v = null;
        this.C.invoke(this);
    }

    public final void l(long j, long j2, long j3, List list, vjh0[] vjh0VarArr) {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = this.J;
        vu30 vu30Var = this.w;
        if (vu30Var == null) {
            linkedHashSet = null;
        } else {
            List listL1 = o7h.l1(arrayList);
            linkedHashSet = new LinkedHashSet();
            for (Object obj : arrayList) {
                ie30 ie30Var = (ie30) obj;
                ie30Var.getClass();
                if (((Boolean) vu30Var.invoke(ie30Var, listL1)).booleanValue()) {
                    linkedHashSet.add(obj);
                }
            }
        }
        this.I = linkedHashSet;
        super.l(j, j2, j3, list, vjh0VarArr);
        this.H = ((v61) this).s;
        ArrayList arrayList2 = new ArrayList();
        int length = vjh0VarArr.length;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            vjh0 vjh0Var = vjh0VarArr[i];
            int i3 = i2 + 1;
            mmr0 mmr0Var = (u890.j(vjh0Var, vjh0.a) || !vjh0Var.next()) ? null : new mmr0(Integer.valueOf(i2), vjh0Var);
            if (mmr0Var != null) {
                arrayList2.add(mmr0Var);
            }
            i++;
            i2 = i3;
        }
        if (this.y && j2 == 0 && this.z.a == 1) {
            z = true;
        }
        this.G = z;
        if (j2 > 0 && this.z.a == 1) {
            this.z.a = 2;
        }
        if (this.x) {
            jo31.u(new xn2(this, arrayList2, j2, (lnm) null, (byte) 2));
        }
        this.I = null;
    }

    public final void p() {
        super.p();
        this.B.invoke(this);
    }

    public final int q(long j, List list) {
        if (this.E) {
            this.D = false;
            this.E = false;
            if (!list.isEmpty()) {
                return 1;
            }
        }
        return super.q(j, list);
    }

    @Override // p.g0g1
    public final void u(y1k1 y1k1Var) {
        if (!u890.j(this.F, y1k1Var)) {
            this.D = true;
            this.E = true;
        }
        this.F = y1k1Var;
    }

    public final boolean x(ie30 ie30Var, int i, long j) {
        y1k1 y1k1Var = this.F;
        if (y1k1Var != null) {
            return ie30Var.w == y1k1Var.a && ie30Var.x == y1k1Var.b;
        }
        return super.x(ie30Var, i, j) && D(ie30Var);
    }
}
