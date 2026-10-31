package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nqg1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ avl1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nqg1(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = avl1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        avl1 avl1Var = this.e;
        switch (b) {
            case 0:
                nqg1 nqg1Var = new nqg1((oqg1) avl1Var, (lnm) obj5, (byte) 0);
                nqg1Var.c = (kqg1) obj;
                nqg1Var.d = (jqg1) obj3;
                return nqg1Var.invokeSuspend(rih1Var);
            default:
                nqg1 nqg1Var2 = new nqg1((i5g1) avl1Var, (lnm) obj5, (byte) 1);
                nqg1Var2.c = (b5g1) obj2;
                nqg1Var2.d = (tqw) obj4;
                return nqg1Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        gtg1 gtg1Var;
        byte b = this.a;
        avl1 avl1Var = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                oqg1 oqg1Var = (oqg1) avl1Var;
                kqg1 kqg1Var = (kqg1) this.c;
                jqg1 jqg1Var = (jqg1) this.d;
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
                if (!u890.j(jqg1Var, hqg1.a)) {
                    if (u890.j(jqg1Var, iqg1.a)) {
                        dn90 dn90Var = kqg1Var.a;
                        if (dn90Var.equals(eqg1.e)) {
                            gtg1Var = gtg1.g;
                        } else if (dn90Var.equals(gqg1.e)) {
                            gtg1Var = gtg1.f;
                        } else if (dn90Var.equals(fqg1.e)) {
                            gtg1Var = gtg1.e;
                        } else if (dn90Var.equals(dqg1.e)) {
                            gtg1Var = gtg1.h;
                        } else {
                            eg.o();
                        }
                        a4q0 a4q0Var = oqg1Var.b;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (a4q0Var.a(gtg1Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        eg.o();
                    }
                    return null;
                }
                oqg1Var.a.f(new dwn0(oqg1.f, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                kqg1Var.b.invoke();
                return rih1Var;
            default:
                b5g1 b5g1Var = (b5g1) this.c;
                tqw tqwVar = (tqw) this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if ((b5g1Var instanceof a5g1) && tqwVar != null) {
                        tv80 tv80VarY = n3o1.y(tqwVar);
                        fns fnsVar = igu.a;
                        bs50 bs50Var = pyf0.a.f;
                        bfb1 bfb1Var = new bfb1((i5g1) avl1Var, b5g1Var, tv80VarY, (lnm) null, (byte) 25);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (fn31.Y(bs50Var, bfb1Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
