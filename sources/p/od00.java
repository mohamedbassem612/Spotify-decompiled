package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class od00 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ od00(vr20 vr20Var, boolean z, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        nd00 nd00Var;
        tz80 tz80Var;
        kl81[] kl81VarArr;
        rp41 rp41Var;
        fq41 fq41Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof nd00) {
                    nd00Var = (nd00) lnmVar;
                    int i = nd00Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nd00Var.b = i - Integer.MIN_VALUE;
                    } else {
                        nd00Var = new nd00(this, lnmVar);
                    }
                } else {
                    nd00Var = new nd00(this, lnmVar);
                }
                Object obj2 = nd00Var.a;
                int i2 = nd00Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    qef0 qef0Var = new qef0((String) obj, z);
                    nd00Var.b = 1;
                    return vr20Var.emit(qef0Var, nd00Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof tz80) {
                    tz80Var = (tz80) lnmVar;
                    int i3 = tz80Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tz80Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        tz80Var = new tz80(this, lnmVar);
                    }
                } else {
                    tz80Var = new tz80(this, lnmVar);
                }
                Object obj3 = tz80Var.a;
                int i4 = tz80Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                if (z) {
                    kl81VarArr = o4p1.t(playerState) ? new kl81[]{new dl81("", (el81) null)} : new kl81[0];
                } else {
                    boolean zT = o4p1.t(playerState);
                    kl81 kl81Var = yk81.a;
                    kl81VarArr = (!zT || o4p1.C(playerState)) ? new kl81[]{kl81Var} : new kl81[]{kl81Var, al81.a};
                }
                tz80Var.b = 1;
                return vr20Var.emit(kl81VarArr, tz80Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof rp41) {
                    rp41Var = (rp41) lnmVar;
                    int i5 = rp41Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rp41Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        rp41Var = new rp41(this, lnmVar);
                    }
                } else {
                    rp41Var = new rp41(this, lnmVar);
                }
                Object obj4 = rp41Var.a;
                int i6 = rp41Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (z) {
                    return rih1Var;
                }
                rp41Var.b = 1;
                return vr20Var.emit(obj, rp41Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof fq41) {
                    fq41Var = (fq41) lnmVar;
                    int i7 = fq41Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        fq41Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        fq41Var = new fq41(this, lnmVar);
                    }
                } else {
                    fq41Var = new fq41(this, lnmVar);
                }
                Object obj5 = fq41Var.a;
                int i8 = fq41Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    mmr0 mmr0Var = new mmr0(Boolean.valueOf(z), (tv80) obj);
                    fq41Var.b = 1;
                    return vr20Var.emit(mmr0Var, fq41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
