package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f740 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ s640 c;

    public /* synthetic */ f740(vr20 vr20Var, s640 s640Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = s640Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        e740 e740Var;
        zcr0 zcr0Var;
        adr0 adr0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s640 s640Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof e740) {
                    e740Var = (e740) lnmVar;
                    int i = e740Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        e740Var.b = i - Integer.MIN_VALUE;
                    } else {
                        e740Var = new e740(this, lnmVar);
                    }
                } else {
                    e740Var = new e740(this, lnmVar);
                }
                Object obj2 = e740Var.a;
                int i2 = e740Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (!(((Map) obj).get(s640Var) instanceof b740)) {
                    return rih1Var;
                }
                e740Var.b = 1;
                return vr20Var.emit(obj, e740Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof zcr0) {
                    zcr0Var = (zcr0) lnmVar;
                    int i3 = zcr0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zcr0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        zcr0Var = new zcr0(this, lnmVar);
                    }
                } else {
                    zcr0Var = new zcr0(this, lnmVar);
                }
                Object obj3 = zcr0Var.a;
                int i4 = zcr0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Set<String> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    for (String str : set) {
                        String str2 = s640Var.a;
                        if (new y6b1(str, false).c == v6b1.I1) {
                            arrayList.add(new s640(str2, str));
                        } else {
                            hhg1.n("ItemUri must be an episode");
                        }
                    }
                    Set setP1 = o7h.p1(arrayList);
                    zcr0Var.b = 1;
                    return vr20Var.emit(setP1, zcr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof adr0) {
                    adr0Var = (adr0) lnmVar;
                    int i5 = adr0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        adr0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        adr0Var = new adr0(this, lnmVar);
                    }
                } else {
                    adr0Var = new adr0(this, lnmVar);
                }
                Object obj4 = adr0Var.a;
                int i6 = adr0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    LinkedHashSet linkedHashSetX0 = dm61.x0(s640Var, (Set) obj);
                    adr0Var.b = 1;
                    return vr20Var.emit(linkedHashSetX0, adr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
