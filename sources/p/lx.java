package p;

import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lx extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx(ox oxVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = oxVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ox oxVar = this.c;
        switch (b) {
            case 0:
                return new lx(oxVar, lnmVar, (byte) 0);
            default:
                return new lx(oxVar, lnmVar, (byte) 1);
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
        ox oxVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    SingleSource singleSource = (SingleSource) oxVar.f.get();
                    this.b = true;
                    obj = fc11.j(singleSource, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(((dma1) obj).h(ox.h, false));
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    SingleSource singleSource2 = (SingleSource) oxVar.f.get();
                    this.b = true;
                    obj = fc11.j(singleSource2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                hma1 hma1VarEdit = ((dma1) obj).edit();
                hma1VarEdit.a(ox.h, true);
                hma1VarEdit.g();
                return rih1.a;
        }
    }
}
