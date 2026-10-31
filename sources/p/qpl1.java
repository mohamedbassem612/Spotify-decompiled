package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qpl1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ spl1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpl1(spl1 spl1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = spl1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        spl1 spl1Var = this.c;
        switch (b) {
            case 0:
                return new qpl1(spl1Var, lnmVar, (byte) 0);
            default:
                return new qpl1(spl1Var, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        spl1 spl1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    geo0 geo0Var = geo0.b;
                    i7u0 i7u0Var = new i7u0(spl1Var, (lnm) null, (byte) 17);
                    this.b = true;
                    if (fn31.Y(geo0Var, i7u0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                spl1Var.l.d((CancellationException) null);
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ry30 ry30Var = (ry30) spl1Var.a.get();
                    ry30Var.a.a(ry30Var.a(2, null, null));
                    sn40 sn40Var = (sn40) spl1Var.i.get();
                    this.b = true;
                    obj = ((un40) sn40Var).a(this);
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
                Integer num = (Integer) obj;
                if ((num != null ? num.intValue() : 0) <= 0) {
                    return rih1Var;
                }
                eth.z((xm41) spl1Var.k.get(), new tak1(spl1Var, (byte) 22));
                return rih1Var;
        }
    }
}
