package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b2d0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d2d0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2d0(d2d0 d2d0Var, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d2d0Var;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new b2d0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new b2d0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        List list;
        vrc0 vrc0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    rsc0 rsc0Var = (xrc0) this.c.c;
                    this.b = true;
                    rsc0 rsc0Var2 = rsc0Var;
                    obj = c921.H(rsc0Var2.c, new asc0(rsc0Var2, this.d, this.e, null, (byte) 1), this);
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
                py21 py21Var = (py21) obj;
                if (py21Var == null || (list = (List) py21Var.c()) == null || (vrc0Var = (vrc0) o7h.s0(list)) == null) {
                    return null;
                }
                return vrc0Var.a;
            default:
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
                b2d0 b2d0Var = new b2d0(this.c, this.d, this.e, null, (byte) 0);
                this.b = true;
                Object objM = rc2.M(7000L, b2d0Var, this);
                return objM == d9nVar ? d9nVar : objM;
        }
    }
}
