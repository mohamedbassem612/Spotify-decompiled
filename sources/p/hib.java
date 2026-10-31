package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hib implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ oib c;

    public /* synthetic */ hib(vr20 vr20Var, oib oibVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = oibVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        gib gibVar;
        kib kibVar;
        nib nibVar;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oib oibVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof gib) {
                    gibVar = (gib) lnmVar;
                    int i2 = gibVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gibVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        gibVar = new gib(this, lnmVar);
                    }
                } else {
                    gibVar = new gib(this, lnmVar);
                }
                Object obj2 = gibVar.a;
                int i3 = gibVar.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    peo0 peo0Var = (peo0) obj;
                    boolean zJ = u890.j(peo0Var, meo0.a);
                    peo0 peo0Var2 = oeo0.a;
                    if (zJ) {
                        if (!((Map) oibVar.e.getValue()).containsKey("social_radar")) {
                            peo0Var = peo0Var2;
                        }
                    } else if (!(peo0Var instanceof neo0) && !u890.j(peo0Var, peo0Var2)) {
                        eg.o();
                    }
                    gibVar.b = 1;
                    return vr20Var.emit(peo0Var, gibVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof kib) {
                    kibVar = (kib) lnmVar;
                    int i4 = kibVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kibVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        kibVar = new kib(this, lnmVar);
                    }
                } else {
                    kibVar = new kib(this, lnmVar);
                }
                Object obj3 = kibVar.a;
                int i5 = kibVar.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                UUID uuid = ((fib) obj).b.getUuid();
                Collection<Set> collectionValues = ((Map) oibVar.e.getValue()).values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    return rih1Var;
                }
                for (Set set : collectionValues) {
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (u890.j(((ee9) it.next()).getUuid(), uuid)) {
                                kibVar.b = 1;
                                return vr20Var.emit(obj, kibVar) == d9nVar ? d9nVar : rih1Var;
                            }
                        }
                    }
                }
                return rih1Var;
            default:
                if (lnmVar instanceof nib) {
                    nibVar = (nib) lnmVar;
                    int i6 = nibVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        nibVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        nibVar = new nib(this, lnmVar);
                    }
                } else {
                    nibVar = new nib(this, lnmVar);
                }
                Object objI = nibVar.a;
                int i7 = nibVar.b;
                if (i7 == 0) {
                    hm5.M(objI);
                    bpb1 bpb1Var = oibVar.d;
                    nibVar.c = obj;
                    nibVar.d = vr20Var;
                    i = 0;
                    nibVar.e = 0;
                    nibVar.b = 1;
                    objI = b5p1.i(bpb1Var, nibVar);
                    if (objI != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        hm5.M(objI);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = nibVar.e;
                vr20Var = nibVar.d;
                Object obj4 = nibVar.c;
                hm5.M(objI);
                i = i8;
                obj = obj4;
                boolean zContains = ((Set) objI).contains("social_radar");
                if (!zContains) {
                    n57.e("Received update for social_radar which isn't enabled");
                }
                if (!zContains) {
                    return rih1Var;
                }
                nibVar.c = null;
                nibVar.d = null;
                nibVar.e = i;
                nibVar.b = 2;
                if (vr20Var.emit(obj, nibVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
