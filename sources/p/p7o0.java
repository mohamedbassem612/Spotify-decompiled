package p;

import coil3.network.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p7o0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7o0(vu30 vu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = vu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vu30 vu30Var = this.d;
        switch (b) {
            case 0:
                p7o0 p7o0Var = new p7o0(vu30Var, lnmVar, (byte) 0);
                p7o0Var.c = obj;
                return p7o0Var;
            default:
                p7o0 p7o0Var2 = new p7o0(vu30Var, lnmVar, (byte) 1);
                p7o0Var2.c = obj;
                return p7o0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((i8o0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: coil3.network.HttpException */
    public final Object invokeSuspend(Object obj) throws HttpException {
        byte b = this.a;
        vu30 vu30Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                i8o0 i8o0Var = (i8o0) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iB = i8o0Var.b();
                if ((200 > iB || iB >= 300) && i8o0Var.b() != 304) {
                    throw new HttpException(i8o0Var);
                }
                this.c = null;
                this.b = true;
                Object objInvoke = vu30Var.invoke(i8o0Var, this);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    cen0 cen0Var = (cen0) this.c;
                    this.b = true;
                    obj = vu30Var.invoke(cen0Var, this);
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
                cen0 cen0Var2 = (cen0) obj;
                cen0Var2.b.set(true);
                return cen0Var2;
        }
    }
}
