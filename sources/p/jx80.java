package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jx80 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ PlayerState c;

    public /* synthetic */ jx80(vr20 vr20Var, PlayerState playerState, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = playerState;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        ix80 ix80Var;
        vha0 vha0Var;
        boolean z;
        ceu0 ceu0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PlayerState playerState = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ix80) {
                    ix80Var = (ix80) lnmVar;
                    int i = ix80Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ix80Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ix80Var = new ix80(this, lnmVar);
                    }
                } else {
                    ix80Var = new ix80(this, lnmVar);
                }
                Object obj2 = ix80Var.a;
                int i2 = ix80Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                PlayerState playerState2 = (PlayerState) obj;
                if (!o4p1.C(playerState) && u890.j(playerState2.playbackId().h(), playerState.playbackId().h())) {
                    return rih1Var;
                }
                ix80Var.b = 1;
                return vr20Var.emit(obj, ix80Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof vha0) {
                    vha0Var = (vha0) lnmVar;
                    int i3 = vha0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vha0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vha0Var = new vha0(this, lnmVar);
                    }
                } else {
                    vha0Var = new vha0(this, lnmVar);
                }
                Object obj3 = vha0Var.a;
                int i4 = vha0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (((Boolean) obj).booleanValue()) {
                    playerState.getClass();
                    if (o4p1.C(playerState)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                vha0Var.b = 1;
                return vr20Var.emit(boolValueOf, vha0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof ceu0) {
                    ceu0Var = (ceu0) lnmVar;
                    int i5 = ceu0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ceu0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ceu0Var = new ceu0(this, lnmVar);
                    }
                } else {
                    ceu0Var = new ceu0(this, lnmVar);
                }
                Object obj4 = ceu0Var.a;
                int i6 = ceu0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    mmr0 mmr0Var = new mmr0(playerState, (iko) obj);
                    ceu0Var.b = 1;
                    return vr20Var.emit(mmr0Var, ceu0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
