package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y7f0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pbq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7f0(lnm lnmVar, pbq pbqVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = pbqVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                y7f0 y7f0Var = new y7f0(lnmVar, pbqVar, (byte) 0);
                y7f0Var.c = vr20Var;
                y7f0Var.d = obj2;
                return y7f0Var.invokeSuspend(rih1Var);
            default:
                y7f0 y7f0Var2 = new y7f0(lnmVar, pbqVar, (byte) 1);
                y7f0Var2.c = vr20Var;
                y7f0Var2.d = obj2;
                return y7f0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz mnc0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = (mmr0) obj2;
                mr20 mr20VarU = pbqVar.U((l0l) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue());
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                Object objCollect = mr20VarU.collect(new i2e0(vr20Var, (byte) 22), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var2 = (mmr0) obj3;
                List list = (List) mmr0Var2.a;
                boolean zBooleanValue = ((Boolean) mmr0Var2.b).booleanValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(pbqVar.U((l0l) it.next(), zBooleanValue));
                }
                if (arrayList.isEmpty()) {
                    mnc0Var = new huz(Boolean.FALSE, (byte) 10);
                } else {
                    mnc0Var = arrayList.size() == 1 ? new mnc0((mr20) o7h.q0(arrayList), (byte) 29) : new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 24);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, mnc0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
