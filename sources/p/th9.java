package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class th9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ jh9 c;

    public /* synthetic */ th9(vr20 vr20Var, jh9 jh9Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = jh9Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        sh9 sh9Var;
        xdz0 xdz0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jh9 jh9Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof sh9) {
                    sh9Var = (sh9) lnmVar;
                    int i = sh9Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sh9Var.b = i - Integer.MIN_VALUE;
                    } else {
                        sh9Var = new sh9(this, lnmVar);
                    }
                } else {
                    sh9Var = new sh9(this, lnmVar);
                }
                Object obj2 = sh9Var.a;
                int i2 = sh9Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    sh9Var.b = 1;
                    return vr20Var.emit(jh9Var, sh9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xdz0) {
                    xdz0Var = (xdz0) lnmVar;
                    int i3 = xdz0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xdz0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        xdz0Var = new xdz0(this, lnmVar);
                    }
                } else {
                    xdz0Var = new xdz0(this, lnmVar);
                }
                Object obj3 = xdz0Var.a;
                int i4 = xdz0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    xdz0Var.b = 1;
                    return vr20Var.emit(jh9Var, xdz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
