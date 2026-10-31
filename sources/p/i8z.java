package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8z implements g6w0 {
    public final /* synthetic */ byte a;
    public final vk20 b;

    public /* synthetic */ i8z(vk20 vk20Var, byte b) {
        this.a = b;
        this.b = vk20Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object a(y5w0 y5w0Var, lnm lnmVar) {
        h8z h8zVar;
        stf1 stf1Var;
        byte b = this.a;
        mgv0 mgv0Var = mgv0.a;
        lgv0 lgv0Var = lgv0.a;
        vk20 vk20Var = this.b;
        ngv0 ngv0Var = ngv0.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof h8z) {
                    h8zVar = (h8z) lnmVar;
                    int i = h8zVar.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h8zVar.c = i - Integer.MIN_VALUE;
                    } else {
                        h8zVar = new h8z(this, (onm) lnmVar);
                    }
                } else {
                    h8zVar = new h8z(this, (onm) lnmVar);
                }
                Object objJ = h8zVar.a;
                int i2 = h8zVar.c;
                if (i2 == 0) {
                    hm5.M(objJ);
                    if (y5w0Var.c == 2) {
                        return ngv0Var;
                    }
                    Single singleA = vk20Var.a();
                    h8zVar.c = 1;
                    objJ = fc11.j(singleA, h8zVar);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ);
                }
                return ((Boolean) objJ).booleanValue() ? lgv0Var : mgv0Var;
            default:
                if (lnmVar instanceof stf1) {
                    stf1Var = (stf1) lnmVar;
                    int i3 = stf1Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        stf1Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        stf1Var = new stf1(this, (onm) lnmVar);
                    }
                } else {
                    stf1Var = new stf1(this, (onm) lnmVar);
                }
                Object objJ2 = stf1Var.a;
                int i4 = stf1Var.c;
                if (i4 == 0) {
                    hm5.M(objJ2);
                    if (y5w0Var.c == 2) {
                        return ngv0Var;
                    }
                    Single singleA2 = vk20Var.a();
                    stf1Var.c = 1;
                    objJ2 = fc11.j(singleA2, stf1Var);
                    if (objJ2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ2);
                }
                return ((Boolean) objJ2).booleanValue() ? lgv0Var : mgv0Var;
        }
    }
}
