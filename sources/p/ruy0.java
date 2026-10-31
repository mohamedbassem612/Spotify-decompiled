package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ruy0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ suy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruy0(suy0 suy0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = suy0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        suy0 suy0Var = this.c;
        switch (b) {
            case 0:
                return new ruy0(suy0Var, lnmVar, (byte) 0);
            default:
                return new ruy0(suy0Var, lnmVar, (byte) 1);
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
        suy0 suy0Var = this.c;
        d9n d9nVar = d9n.a;
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
                lt20 lt20Var = new lt20(o4p1.l(new f5y0(new evz(suy0Var.a.c(), rc11.a.b(zyc.class), (byte) 12), suy0Var, (byte) 4)), new ob00(3, null, (byte) 24), (byte) 0);
                fun0 fun0Var = new fun0(suy0Var, (byte) 29);
                this.b = true;
                return lt20Var.collect(fun0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(500L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                smo1.p(suy0Var.f, (CancellationException) null);
                return rih1Var;
        }
    }
}
