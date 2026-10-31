package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cc7 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ lsm0 c;

    public /* synthetic */ cc7(vr20 vr20Var, lsm0 lsm0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = lsm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        bc7 bc7Var;
        zbn0 zbn0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lsm0 lsm0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof bc7) {
                    bc7Var = (bc7) lnmVar;
                    int i = bc7Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bc7Var.b = i - Integer.MIN_VALUE;
                    } else {
                        bc7Var = new bc7(this, lnmVar);
                    }
                } else {
                    bc7Var = new bc7(this, lnmVar);
                }
                Object obj2 = bc7Var.a;
                int i2 = bc7Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (!u890.j(((i091) obj).a, lsm0Var)) {
                    return rih1Var;
                }
                bc7Var.b = 1;
                return vr20Var.emit(obj, bc7Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof zbn0) {
                    zbn0Var = (zbn0) lnmVar;
                    int i3 = zbn0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zbn0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        zbn0Var = new zbn0(this, lnmVar);
                    }
                } else {
                    zbn0Var = new zbn0(this, lnmVar);
                }
                Object obj3 = zbn0Var.a;
                int i4 = zbn0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!u890.j(((i091) obj).a, lsm0Var)) {
                    return rih1Var;
                }
                zbn0Var.b = 1;
                return vr20Var.emit(obj, zbn0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
