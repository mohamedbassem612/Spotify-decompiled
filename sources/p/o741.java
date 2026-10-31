package p;

import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o741 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ q741 c;
    public final /* synthetic */ slc0 d;
    public final /* synthetic */ f841 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o741(q741 q741Var, slc0 slc0Var, f841 f841Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = q741Var;
        this.d = slc0Var;
        this.e = f841Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new o741(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new o741(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        int i;
        byte b = this.a;
        f841 f841Var = this.e;
        slc0 slc0Var = this.d;
        q741 q741Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        int i2 = 1;
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
                g841 g841Var = (g841) q741Var.b.get();
                this.b = true;
                g841Var.getClass();
                int iOrdinal = f841Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 6;
                }
                zdr zdrVar = g841Var.a;
                Object objI = fc11.i(fq7.C(zdrVar.d).flatMapCompletable(new ydr(zdrVar, slc0Var, i2, (byte) 0)).o(Functions.h), this);
                if (objI != d9nVar) {
                    objI = rih1Var;
                }
                if (objI == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
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
                g841 g841Var2 = (g841) q741Var.b.get();
                this.b = true;
                g841Var2.getClass();
                int iOrdinal2 = f841Var.ordinal();
                if (iOrdinal2 == 0) {
                    i = 1;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                zdr zdrVar2 = g841Var2.a;
                Object objI2 = fc11.i(fq7.C(zdrVar2.d).flatMapCompletable(new ydr(zdrVar2, slc0Var, i, (byte) 1)).o(Functions.h), this);
                if (objI2 != d9nVar) {
                    objI2 = rih1Var;
                }
                if (objI2 == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }
}
