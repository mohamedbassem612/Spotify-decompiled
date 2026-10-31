package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class np2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(lnm lnmVar, v1k v1kVar, boolean z) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.f = v1kVar;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                np2 np2Var = new np2((fq2) this.e, (tn2) obj4, (lnm) obj3, (byte) 0);
                np2Var.c = zBooleanValue;
                np2Var.d = (dp2) obj2;
                return np2Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                np2 np2Var2 = new np2((fq2) this.e, (tn2) obj4, (lnm) obj3, (byte) 1);
                np2Var2.c = zBooleanValue2;
                np2Var2.d = (dp2) obj2;
                return np2Var2.invokeSuspend(rih1Var);
            default:
                np2 np2Var3 = new np2((lnm) obj3, (v1k) obj4, this.c);
                np2Var3.d = (vr20) obj;
                np2Var3.e = obj2;
                return np2Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVarE;
        byte b = this.a;
        dp2 dp2Var = dp2.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fq2 fq2Var = (fq2) this.e;
                boolean z = this.c;
                dp2 dp2Var2 = (dp2) this.d;
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
                if (dp2Var2 == dp2Var) {
                    Set set = fq2.c0;
                    fq2Var.d();
                }
                boolean zC = fq2.C((tn2) obj2);
                this.d = null;
                this.c = z;
                this.b = true;
                return fq2Var.f(z, dp2Var2, zC, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                fq2 fq2Var2 = (fq2) this.e;
                boolean z3 = this.c;
                dp2 dp2Var3 = (dp2) this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (dp2Var3 == dp2Var) {
                    Set set2 = fq2.c0;
                    fq2Var2.d();
                }
                boolean zC2 = fq2.C((tn2) obj2);
                this.d = null;
                this.c = z3;
                this.b = true;
                return fq2Var2.f(z3, dp2Var3, zC2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var = (vr20) this.d;
                Object obj3 = this.e;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    i1r i1rVar = (k1r) obj3;
                    if (i1rVar instanceof j1r) {
                        huzVarE = new huz(mio0.a, (byte) 10);
                    } else if (i1rVar instanceof h1r) {
                        huzVarE = new huz(new lio0(z6x.a), (byte) 10);
                    } else if (i1rVar instanceof i1r) {
                        v1k v1kVar = (v1k) obj2;
                        huzVarE = hu20.e((mr20) v1kVar.c, new h64(null, this.c, (List) i1rVar.a, v1kVar));
                    } else {
                        eg.o();
                    }
                    this.d = null;
                    this.e = null;
                    this.b = true;
                    return l4p1.s(vr20Var, huzVarE, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np2(fq2 fq2Var, tn2 tn2Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = fq2Var;
        this.f = tn2Var;
    }
}
