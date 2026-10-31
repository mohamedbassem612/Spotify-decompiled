package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pc61 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ uc61 c;

    public /* synthetic */ pc61(vr20 vr20Var, uc61 uc61Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = uc61Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        oc61 oc61Var;
        rc61 rc61Var;
        sc61 sc61Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uc61 uc61Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof oc61) {
                    oc61Var = (oc61) lnmVar;
                    int i = oc61Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oc61Var.b = i - Integer.MIN_VALUE;
                    } else {
                        oc61Var = new oc61(this, lnmVar);
                    }
                } else {
                    oc61Var = new oc61(this, lnmVar);
                }
                Object obj2 = oc61Var.a;
                int i2 = oc61Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                mb61 mb61VarW = ioo1.w(uc61Var.a((List) obj));
                String str = mb61VarW != null ? mb61VarW.b : null;
                oc61Var.b = 1;
                return vr20Var.emit(str, oc61Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof rc61) {
                    rc61Var = (rc61) lnmVar;
                    int i3 = rc61Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rc61Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        rc61Var = new rc61(this, lnmVar);
                    }
                } else {
                    rc61Var = new rc61(this, lnmVar);
                }
                Object obj3 = rc61Var.a;
                int i4 = rc61Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                ArrayList<mb61> arrayListA = uc61Var.a(((yc61) obj).a);
                boolean zA = uc61Var.d.a();
                ArrayList arrayList = new ArrayList(q7h.U(arrayListA, 10));
                for (mb61 mb61Var : arrayListA) {
                    arrayList.add((zA && ihc1.X0(mb61Var.a, "$").equals("prompt")) ? new arb(mb61Var.a, mb61Var.b, xmx.c, mb61Var.d) : new brb(mb61Var.a, mb61Var.b, mb61Var.d));
                }
                rrb rrbVar = new rrb(5, mqo1.A(arrayList));
                rc61Var.b = 1;
                return vr20Var.emit(rrbVar, rc61Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof sc61) {
                    sc61Var = (sc61) lnmVar;
                    int i5 = sc61Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sc61Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        sc61Var = new sc61(this, lnmVar);
                    }
                } else {
                    sc61Var = new sc61(this, lnmVar);
                }
                Object obj4 = sc61Var.a;
                int i6 = sc61Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                kby kbyVar = ((cxc0) obj).f;
                List list = kbyVar.z;
                Map map = kbyVar.q;
                Boolean boolValueOf = Boolean.valueOf(uc61Var.c.m(list, map) && !uc61Var.a(ioo1.P(list, map)).isEmpty());
                sc61Var.b = 1;
                return vr20Var.emit(boolValueOf, sc61Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
