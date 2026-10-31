package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jmr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ a680 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ tv80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmr(a680 a680Var, List list, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = a680Var;
        this.d = list;
        this.e = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new jmr(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new jmr(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        tv80 tv80Var = this.e;
        a680 a680Var = this.c;
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
                xyc0 xyc0Var = (iyc0) a680Var.c;
                ((xrm1) a680Var.e).getClass();
                zxc0 zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                this.b = true;
                return xyc0Var.d("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", this.d, "your-episodes-content", "your-episodes-content", zxc0Var, this) == d9nVar ? d9nVar : rih1Var;
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
                xyc0 xyc0Var2 = (iyc0) a680Var.c;
                ((xrm1) a680Var.e).getClass();
                this.b = true;
                return xyc0Var2.l("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", this.d, this, tv80Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
