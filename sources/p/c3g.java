package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c3g implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ kp5 c;

    public /* synthetic */ c3g(vr20 vr20Var, kp5 kp5Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = kp5Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        b3g b3gVar;
        TreeMap treeMap;
        f3g f3gVar;
        g3g g3gVar;
        i3g i3gVar;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        kp5 kp5Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof b3g) {
                    b3gVar = (b3g) lnmVar;
                    int i = b3gVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b3gVar.b = i - Integer.MIN_VALUE;
                    } else {
                        b3gVar = new b3g(this, lnmVar);
                    }
                } else {
                    b3gVar = new b3g(this, lnmVar);
                }
                Object obj2 = b3gVar.a;
                int i2 = b3gVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                SortedMap sortedMap = (SortedMap) obj;
                int iA = ((ap4) kp5Var.a).a();
                Set setKeySet = sortedMap.keySet();
                ArrayList arrayList = new ArrayList();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    Integer numI = ((r2g) ((List) kp5Var.c).get(((Number) it.next()).intValue())).i();
                    if (numI != null) {
                        arrayList.add(numI);
                    }
                }
                Integer num = (Integer) o7h.G0(arrayList);
                if (num != null) {
                    iA = Math.min(iA, num.intValue());
                }
                if (sortedMap.size() >= iA) {
                    treeMap = new TreeMap((Map) sortedMap);
                } else {
                    TreeMap treeMap2 = new TreeMap();
                    sqg0.R(treeMap2, new mmr0[0]);
                    treeMap = treeMap2;
                }
                b3gVar.b = 1;
                return vr20Var.emit(treeMap, b3gVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof f3g) {
                    f3gVar = (f3g) lnmVar;
                    int i3 = f3gVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f3gVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        f3gVar = new f3g(this, lnmVar);
                    }
                } else {
                    f3gVar = new f3g(this, lnmVar);
                }
                Object obj3 = f3gVar.a;
                int i4 = f3gVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Set setKeySet2 = ((Map) obj).keySet();
                if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                    Iterator it2 = setKeySet2.iterator();
                    while (it2.hasNext()) {
                        if (((r2g) ((List) kp5Var.c).get(((Number) it2.next()).intValue())).getType() == 2) {
                            z = true;
                        }
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                f3gVar.b = 1;
                return vr20Var.emit(boolValueOf, f3gVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof g3g) {
                    g3gVar = (g3g) lnmVar;
                    int i5 = g3gVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        g3gVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        g3gVar = new g3g(this, lnmVar);
                    }
                } else {
                    g3gVar = new g3g(this, lnmVar);
                }
                Object obj4 = g3gVar.a;
                int i6 = g3gVar.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    ArrayList arrayListB = kp5Var.B((SortedMap) obj);
                    g3gVar.b = 1;
                    return vr20Var.emit(arrayListB, g3gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof i3g) {
                    i3gVar = (i3g) lnmVar;
                    int i7 = i3gVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        i3gVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        i3gVar = new i3g(this, lnmVar);
                    }
                } else {
                    i3gVar = new i3g(this, lnmVar);
                }
                Object obj5 = i3gVar.a;
                int i8 = i3gVar.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    ArrayList arrayListB2 = kp5Var.B((Map) obj);
                    i3gVar.b = 1;
                    return vr20Var.emit(arrayListB2, i3gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
