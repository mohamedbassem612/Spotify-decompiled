package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ar0 extends a8d1 implements bv30 {
    public pxc a;
    public ki0 b;
    public boolean c;
    public /* synthetic */ zq0 d;
    public /* synthetic */ vq0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ br0 g;
    public final /* synthetic */ pxc h;
    public final /* synthetic */ mr20 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(iu30 iu30Var, br0 br0Var, pxc pxcVar, mr20 mr20Var, lnm lnmVar) {
        super(5, lnmVar);
        this.f = iu30Var;
        this.g = br0Var;
        this.h = pxcVar;
        this.i = mr20Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pxc pxcVar = this.h;
        mr20 mr20Var = this.i;
        ar0 ar0Var = new ar0(this.f, this.g, pxcVar, mr20Var, (lnm) obj5);
        ar0Var.d = (zq0) obj2;
        ar0Var.e = (vq0) obj3;
        return ar0Var.invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ki0 ki0VarA;
        pxc pxcVar;
        zq0 zq0Var = this.d;
        vq0 vq0Var = this.e;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        if (!z) {
            hm5.M(obj);
            int iOrdinal = vq0Var.ordinal();
            br0 br0Var = this.g;
            iu30 iu30Var = this.f;
            if (iOrdinal == 0) {
                if (iu30Var != null) {
                    iu30Var.invoke(yah0.m(true));
                }
                bpb1 bpb1VarF = br0.f(br0Var);
                Boolean boolM = yah0.m(true);
                bpb1VarF.getClass();
                bpb1VarF.m((Object) null, boolM);
                return rih1Var;
            }
            if (iOrdinal == 1) {
                if (iu30Var != null) {
                    iu30Var.invoke(yah0.m(false));
                }
                bpb1 bpb1VarF2 = br0.f(br0Var);
                Boolean boolM2 = yah0.m(false);
                bpb1VarF2.getClass();
                bpb1VarF2.m((Object) null, boolM2);
                return rih1Var;
            }
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            if (zq0Var.a() == null) {
                return rih1Var;
            }
            ki0VarA = zq0Var.a();
            this.d = null;
            this.e = null;
            pxc pxcVar2 = this.h;
            this.a = pxcVar2;
            this.b = ki0VarA;
            this.c = true;
            Object objI = b5p1.i(this.i, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            pxcVar = pxcVar2;
            obj = objI;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ki0VarA = this.b;
            pxc pxcVar3 = this.a;
            hm5.M(obj);
            pxcVar = pxcVar3;
        }
        pxc.a(pxcVar, ki0VarA, (Long) obj, (String) null, "info_row", 20);
        return rih1Var;
    }
}
