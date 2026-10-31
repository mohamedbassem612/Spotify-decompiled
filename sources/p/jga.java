package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jga implements pua0 {
    public final /* synthetic */ byte a = 1;
    public volatile boolean b;
    public final iha c;
    public final Object d;
    public final /* synthetic */ Object e;

    public jga(mga mgaVar, iu30 iu30Var) {
        this.e = mgaVar;
        this.d = iu30Var;
        this.c = mgaVar.b.c(new uv8(this, (byte) 27));
    }

    public final Map a(Set set) {
        byte b = this.a;
        iha ihaVar = this.c;
        switch (b) {
            case 0:
                Set set2 = set;
                zjd1 zjd1Var = ((mga) this.e).c;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jh5(zjd1Var, it.next()));
                }
                Set<Map.Entry> setEntrySet = ihaVar.a(o7h.p1(arrayList)).entrySet();
                int iS = zno1.s(q7h.U(setEntrySet, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(((jh5) entry.getKey()).b, (k3r) entry.getValue());
                }
                return linkedHashMap;
            default:
                Set set3 = set;
                hvm hvmVar = hvm.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new jh5(hvmVar, it2.next()));
                }
                Set<Map.Entry> setEntrySet2 = ihaVar.a(o7h.p1(arrayList2)).entrySet();
                int iS2 = zno1.s(q7h.U(setEntrySet2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Map.Entry entry2 : setEntrySet2) {
                    linkedHashMap2.put(((jh5) entry2.getKey()).b, (k3r) entry2.getValue());
                }
                ((bpb1) this.d).m((Object) null, set);
                return linkedHashMap2;
        }
    }

    public final void b(Set set) {
        byte b = this.a;
        iha ihaVar = this.c;
        switch (b) {
            case 0:
                Set set2 = set;
                zjd1 zjd1Var = ((mga) this.e).c;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jh5(zjd1Var, it.next()));
                }
                ihaVar.b(o7h.p1(arrayList));
                break;
            default:
                Set set3 = set;
                hvm hvmVar = hvm.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new jh5(hvmVar, it2.next()));
                }
                ihaVar.b(o7h.p1(arrayList2));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final Object c(List list, onm onmVar) {
        iga igaVar;
        Iterator it;
        vu30 vu30Var;
        n961 n961Var;
        Iterator it2;
        vu30 vu30Var2;
        int i = 0;
        switch (this.a) {
            case 0:
                rih1 rih1Var = rih1.a;
                if (onmVar instanceof iga) {
                    igaVar = (iga) onmVar;
                    int i2 = igaVar.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        igaVar.f = i2 - Integer.MIN_VALUE;
                    } else {
                        igaVar = new iga(this, onmVar);
                    }
                } else {
                    igaVar = new iga(this, onmVar);
                }
                Object obj = igaVar.d;
                d9n d9nVar = d9n.a;
                int i3 = igaVar.f;
                if (i3 == 0) {
                    hm5.M(obj);
                    if (!this.b) {
                        vu30 vu30Var3 = ((mga) this.e).d;
                        it = list.iterator();
                        vu30Var = vu30Var3;
                    }
                    return rih1Var;
                }
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = igaVar.c;
                it = igaVar.b;
                vu30Var = igaVar.a;
                hm5.M(obj);
                i = i4;
                while (it.hasNext()) {
                    mmr0 mmr0Var = (mmr0) it.next();
                    igaVar.a = vu30Var;
                    igaVar.b = it;
                    igaVar.c = i;
                    igaVar.f = 1;
                    if (vu30Var.invoke(mmr0Var, igaVar) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                rih1 rih1Var2 = rih1.a;
                if (onmVar instanceof n961) {
                    n961Var = (n961) onmVar;
                    int i5 = n961Var.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        n961Var.f = i5 - Integer.MIN_VALUE;
                    } else {
                        n961Var = new n961(this, onmVar);
                    }
                } else {
                    n961Var = new n961(this, onmVar);
                }
                Object obj2 = n961Var.d;
                d9n d9nVar2 = d9n.a;
                int i6 = n961Var.f;
                if (i6 == 0) {
                    hm5.M(obj2);
                    if (!this.b) {
                        vu30 vu30Var4 = (clo) this.e;
                        it2 = list.iterator();
                        vu30Var2 = vu30Var4;
                    }
                    return rih1Var2;
                }
                if (i6 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = n961Var.c;
                it2 = n961Var.b;
                vu30Var2 = n961Var.a;
                hm5.M(obj2);
                i = i7;
                while (it2.hasNext()) {
                    mmr0 mmr0Var2 = (mmr0) it2.next();
                    n961Var.a = vu30Var2;
                    n961Var.b = it2;
                    n961Var.c = i;
                    n961Var.f = 1;
                    if (vu30Var2.invoke(mmr0Var2, n961Var) == d9nVar2) {
                        return d9nVar2;
                    }
                }
                return rih1Var2;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b = true;
                this.c.dispose();
                break;
            default:
                this.b = true;
                this.c.dispose();
                break;
        }
    }

    public jga(jha jhaVar, iu30 iu30Var, o961 o961Var, bpb1 bpb1Var, clo cloVar) {
        this.d = bpb1Var;
        this.e = cloVar;
        this.c = jhaVar.c(new n601(iu30Var, (byte) 26));
    }
}
