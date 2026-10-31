package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zk1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ el1 c;
    public final /* synthetic */ o0i d;
    public final /* synthetic */ xk1 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk1(el1 el1Var, o0i o0iVar, xk1 xk1Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = el1Var;
        this.d = o0iVar;
        this.e = xk1Var;
        this.f = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new zk1(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            default:
                return new zk1(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.f;
        d9n d9nVar = d9n.a;
        xk1 xk1Var = this.e;
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
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                String str = xk1Var.a;
                String str2 = xk1Var.d;
                this.b = true;
                el1 el1Var = this.c;
                Object objCollect = el1Var.g.h.a.collect(new mf(new bl1(zBooleanValue, el1Var, this.d, str, str2), (byte) 29), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
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
                String str3 = xk1Var.a;
                boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
                String str4 = xk1Var.d;
                o0i o0iVar = this.d;
                el1 el1Var2 = this.c;
                Function0 hhVar = new hh(el1Var2, o0iVar, xk1Var, (byte) 5);
                this.b = true;
                return el1Var2.d(this.d, str3, zBooleanValue2, str4, hhVar, p4.d1, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
