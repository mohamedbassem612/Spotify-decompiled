package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tks {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final Map d = sqg0.J(new mmr0[]{new mmr0(wly0.a, 0), new mmr0(wly0.c, 1), new mmr0(wly0.d, 2), new mmr0(wly0.b, 3), new mmr0(wly0.e, 4)});

    public tks(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
    }

    public final jge a() {
        Iterable<but> iterable = (Iterable) this.a.get();
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        for (but butVar : iterable) {
            arrayList.add(new ht20(new qer(butVar.b(), butVar, (byte) 24), new qjr(2, (lnm) null, (byte) 11)));
        }
        return hu20.e(new qer((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), this, (byte) 26), new b7c((lnm) null, this, (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, onm onmVar) {
        sks sksVar;
        if (onmVar instanceof sks) {
            sksVar = (sks) onmVar;
            int i = sksVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sksVar.d = i - Integer.MIN_VALUE;
            } else {
                sksVar = new sks(this, onmVar);
            }
        } else {
            sksVar = new sks(this, onmVar);
        }
        Object objY = sksVar.b;
        int i2 = sksVar.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            nur nurVar = (nur) this.b.get();
            Map map = nurVar.b;
            Iterator it = ((Iterable) nurVar.a.get()).iterator();
            if (!it.hasNext()) {
                hhg1.k();
                return null;
            }
            Object next = it.next();
            if (it.hasNext()) {
                ((f7l) next).getClass();
                dwt dwtVar = dwt.a;
                Integer num = (Integer) map.get(dwtVar);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                do {
                    Object next2 = it.next();
                    ((f7l) next2).getClass();
                    Integer num2 = (Integer) map.get(dwtVar);
                    int iIntValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            f7l f7lVar = (f7l) next;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ki90) it2.next()).a);
            }
            sksVar.a = list;
            sksVar.d = 1;
            objY = fn31.Y(f7lVar.d, new zti(arrayList, f7lVar, lnmVar, (byte) 20), sksVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = sksVar.a;
            hm5.M(objY);
        }
        ba80 ba80VarU1 = o7h.u1((List) objY);
        int iS = zno1.s(q7h.U(ba80VarU1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        ca80 it3 = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it3;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return o7h.a1(list, new rks(linkedHashMap, (byte) 0));
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            linkedHashMap.put((String) aa80Var.b, new Integer(aa80Var.a));
        }
    }
}
