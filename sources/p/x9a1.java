package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x9a1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ baa1 c;

    public /* synthetic */ x9a1(vr20 vr20Var, baa1 baa1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = baa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        w9a1 w9a1Var;
        z9a1 z9a1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        baa1 baa1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof w9a1) {
                    w9a1Var = (w9a1) lnmVar;
                    int i = w9a1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w9a1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        w9a1Var = new w9a1(this, lnmVar);
                    }
                } else {
                    w9a1Var = new w9a1(this, lnmVar);
                }
                Object obj2 = w9a1Var.a;
                int i2 = w9a1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                Boolean boolValueOf = Boolean.valueOf(u890.j(playerState.contextUri(), baa1Var.i));
                w9a1Var.b = 1;
                return vr20Var.emit(boolValueOf, w9a1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof z9a1) {
                    z9a1Var = (z9a1) lnmVar;
                    int i3 = z9a1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z9a1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        z9a1Var = new z9a1(this, lnmVar);
                    }
                } else {
                    z9a1Var = new z9a1(this, lnmVar);
                }
                Object obj3 = z9a1Var.a;
                int i4 = z9a1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                Boolean boolValueOf2 = Boolean.valueOf(baa1Var.c(playerState2));
                z9a1Var.b = 1;
                return vr20Var.emit(boolValueOf2, z9a1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
