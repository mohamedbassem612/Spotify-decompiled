package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xrq0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d0r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xrq0(lnm lnmVar, d0r d0rVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = d0rVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d0r d0rVar = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                xrq0 xrq0Var = new xrq0(lnmVar, d0rVar, (byte) 0);
                xrq0Var.c = vr20Var;
                xrq0Var.d = obj2;
                return xrq0Var.invokeSuspend(rih1Var);
            default:
                xrq0 xrq0Var2 = new xrq0(lnmVar, d0rVar, (byte) 1);
                xrq0Var2.c = vr20Var;
                xrq0Var2.d = obj2;
                return xrq0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d0r d0rVar = this.e;
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
                ay8 ay8VarF = d3p1.F(d0rVar, w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 1, rfq0.O0, new j4r(rfq0.X), rfq0.P0), rfq0.Y), (String) obj2);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                ay8VarF.collect(new gtp0(vr20Var, (byte) 12), this);
                return d9nVar;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    i1r i1rVar = (k1r) obj3;
                    if (i1rVar instanceof i1r) {
                        l331 l331Var = (l331) i1rVar.a;
                        List list = l331Var.a;
                        boolean z3 = l331Var.b;
                        o3r o3rVar = vyj1.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            Set set = s4b1.f;
                            if (uic.x(((pvc0) obj4).c).c == blc0.ti) {
                                arrayList.add(obj4);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            if (hashSet.add(((pvc0) obj5).c)) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            huzVar = new huz(new qyj1(fg91.b, z3), (byte) 10);
                        } else {
                            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((pvc0) it.next()).c);
                            }
                            huzVar = new vtm(t2p1.u(d0rVar, vyj1.a, arrayList3), arrayList3, arrayList2, z3, (byte) 3);
                        }
                    } else if (i1rVar instanceof h1r) {
                        huzVar = new huz(pyj1.a, (byte) 10);
                    } else if (u890.j(i1rVar, j1r.a)) {
                        huzVar = r6x.a;
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
