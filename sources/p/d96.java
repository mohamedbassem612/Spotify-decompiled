package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d96 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 2;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d96(l96 l96Var, hwx0 hwx0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, hdn0 hdn0Var, ven0 ven0Var6, ven0 ven0Var7, lnm lnmVar) {
        super(2, lnmVar);
        this.c = l96Var;
        this.d = hwx0Var;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ven0Var3;
        this.h = ven0Var4;
        this.i = ven0Var5;
        this.Y = hdn0Var;
        this.t = ven0Var6;
        this.X = ven0Var7;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        Object obj3 = this.g;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.d;
        Object obj11 = this.c;
        switch (b) {
            case 0:
                return new d96((l96) obj11, (hwx0) obj10, (ven0) obj7, (ven0) obj6, (ven0) obj3, (ven0) obj9, (ven0) obj8, (hdn0) obj2, (ven0) obj5, (ven0) obj4, lnmVar);
            case 1:
                return new d96((mr20) obj11, (AtomicBoolean) obj10, (zhk0) obj7, (String) obj6, (String) obj3, (List) obj9, (List) obj8, (List) obj5, (List) obj4, (List) obj2, lnmVar);
            case 2:
                return new d96((b9l1) obj11, (ven0) obj7, (lsm0) obj10, (gij1) obj3, (q9l1) obj9, (c2u0) obj8, (ven0) obj6, (fal1) obj5, (m0t) obj4, (o0i) obj2, lnmVar);
            default:
                return new d96((nav0) obj11, (kzt) obj10, (i8d1) obj9, (c9n) obj8, (ven0) obj7, (ven0) obj6, (tob1) obj5, (tob1) obj4, (ven0) obj3, (xtb0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        r091 r091Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.t;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.i;
        Object obj8 = this.d;
        d9n d9nVar = d9n.a;
        Object obj9 = this.g;
        Object obj10 = this.h;
        Object obj11 = this.c;
        switch (b) {
            case 0:
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
                mfe mfeVarB = k4p1.B(((l96) obj11).j.a);
                c96 c96Var = new c96((hwx0) obj8, (l96) obj11, (ven0) obj6, (ven0) obj5, (ven0) obj9, (ven0) obj10, (ven0) obj7, (hdn0) obj2, (ven0) obj4, (ven0) obj3);
                this.b = true;
                return mfeVarB.collect(c96Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fu20 fu20Var = new fu20((mr20) obj11, new yn0((AtomicBoolean) obj8, (zhk0) obj6, (String) obj5, (String) obj9, (List) obj10, (List) obj7, (List) obj4, (List) obj3, (lnm) null, (byte) 8), (byte) 1);
                vuo vuoVar = new vuo((List) obj2, (lnm) null, (byte) 2);
                this.b = true;
                Object objJ = b5p1.j(fu20Var, vuoVar, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 2:
                ven0 ven0Var = (ven0) obj5;
                ven0 ven0Var2 = (ven0) obj6;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091VarA = ((b9l1) obj11).a((r091) ven0Var2.getValue());
                if (r091VarA != null) {
                    lsm0 lsm0Var = (lsm0) obj8;
                    gij1 gij1Var = (gij1) obj9;
                    q9l1 q9l1Var = (q9l1) obj10;
                    c2u0 c2u0Var = (c2u0) obj7;
                    if (!u890.j(ebp1.n(r091VarA), lsm0Var)) {
                        r091VarA.b(lsm0Var);
                    }
                    r091.f(r091VarA, (tv80) ((iu30) ven0Var.getValue()).invoke(n3p1.q(gij1Var.b)), q9l1Var.f.b, mky0.a, 4);
                    w590 w590VarA = r091VarA.a();
                    c2u0.a(c2u0Var, "MultiplayerVideoPlayback.onActive", new mwt0(w590VarA != null ? w590VarA.i() : null, (String) null, (String) null, gij1Var.a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "video", (String) null, (String) null, (String) null, (String) null, (String) null, 258038), 12);
                    r091Var = r091VarA;
                } else {
                    r091Var = null;
                }
                ven0Var2.setValue(r091Var);
                lsh0 lsh0Var = new lsh0((fal1) obj4, ven0Var2, (m0t) obj3, (gij1) obj9, (q9l1) obj10, ven0Var, (o0i) obj2, null);
                this.b = true;
                return smo1.s(lsh0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    vd6 vd6Var = new vd6((kzt) obj8, (i8d1) obj10, (c9n) obj7, (ven0) obj6, (ven0) obj5, (tob1) obj4, (tob1) obj3, (ven0) obj9, (xtb0) obj2, (byte) 9);
                    this.b = true;
                    return rqd1.d((nav0) obj11, (iu30) null, (iu30) null, (xu30) null, vd6Var, this, 7) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d96(mr20 mr20Var, AtomicBoolean atomicBoolean, zhk0 zhk0Var, String str, String str2, List list, List list2, List list3, List list4, List list5, lnm lnmVar) {
        super(2, lnmVar);
        this.c = mr20Var;
        this.d = atomicBoolean;
        this.e = zhk0Var;
        this.f = str;
        this.g = str2;
        this.h = list;
        this.i = list2;
        this.t = list3;
        this.X = list4;
        this.Y = list5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d96(nav0 nav0Var, kzt kztVar, i8d1 i8d1Var, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, tob1 tob1Var, tob1 tob1Var2, ven0 ven0Var3, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = nav0Var;
        this.d = kztVar;
        this.h = i8d1Var;
        this.i = c9nVar;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.t = tob1Var;
        this.X = tob1Var2;
        this.g = ven0Var3;
        this.Y = xtb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d96(b9l1 b9l1Var, ven0 ven0Var, lsm0 lsm0Var, gij1 gij1Var, q9l1 q9l1Var, c2u0 c2u0Var, ven0 ven0Var2, fal1 fal1Var, m0t m0tVar, o0i o0iVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = b9l1Var;
        this.e = ven0Var;
        this.d = lsm0Var;
        this.g = gij1Var;
        this.h = q9l1Var;
        this.i = c2u0Var;
        this.f = ven0Var2;
        this.t = fal1Var;
        this.X = m0tVar;
        this.Y = o0iVar;
    }
}
