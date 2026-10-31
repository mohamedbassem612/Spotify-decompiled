package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tji1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ tji1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        lnm sji1Var;
        lnm wwl1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof sji1) {
                    sji1Var = (sji1) lnmVar;
                    int i = ((sji1) sji1Var).b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ((sji1) sji1Var).b = i - Integer.MIN_VALUE;
                    } else {
                        sji1Var = new sji1(this, lnmVar);
                    }
                } else {
                    sji1Var = new sji1(this, lnmVar);
                }
                Object obj2 = ((sji1) sji1Var).a;
                int i2 = ((sji1) sji1Var).b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    String str = ((th61) obj).a;
                    ((sji1) sji1Var).b = 1;
                    return vr20Var.emit(str, sji1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof wwl1) {
                    wwl1Var = (wwl1) lnmVar;
                    int i3 = ((wwl1) wwl1Var).b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ((wwl1) wwl1Var).b = i3 - Integer.MIN_VALUE;
                    } else {
                        wwl1Var = new wwl1(this, lnmVar);
                    }
                } else {
                    wwl1Var = new wwl1(this, lnmVar);
                }
                Object obj3 = ((wwl1) wwl1Var).a;
                int i4 = ((wwl1) wwl1Var).b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((uwl1) it.next()).a());
                }
                ((wwl1) wwl1Var).b = 1;
                return vr20Var.emit(arrayList, wwl1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
