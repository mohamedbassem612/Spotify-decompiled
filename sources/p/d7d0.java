package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d7d0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ wj3 c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ g3d0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7d0(wj3 wj3Var, Set set, g3d0 g3d0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = wj3Var;
        this.d = set;
        this.e = g3d0Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new d7d0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new d7d0(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g3d0 g3d0Var = this.e;
        Set set = this.d;
        d9n d9nVar = d9n.a;
        wj3 wj3Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (wj3Var.q(set, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (wj3Var.r(g3d0Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (wj3Var.q(set, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (wj3Var.r(g3d0Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
