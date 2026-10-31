package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c641 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ g641 c;

    public /* synthetic */ c641(vr20 vr20Var, g641 g641Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = g641Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        b641 b641Var;
        String strUri;
        e641 e641Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g641 g641Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        boolean z = false;
        switch (b) {
            case 0:
                if (lnmVar instanceof b641) {
                    b641Var = (b641) lnmVar;
                    int i = b641Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b641Var.b = i - Integer.MIN_VALUE;
                    } else {
                        b641Var = new b641(this, lnmVar);
                    }
                } else {
                    b641Var = new b641(this, lnmVar);
                }
                Object obj2 = b641Var.a;
                int i2 = b641Var.b;
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
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                strUri = contextTrack != null ? contextTrack.uri() : null;
                if (strUri != null && strUri.equals(g641Var.d) && playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                b641Var.b = 1;
                return vr20Var.emit(boolValueOf, b641Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof e641) {
                    e641Var = (e641) lnmVar;
                    int i3 = e641Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        e641Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        e641Var = new e641(this, lnmVar);
                    }
                } else {
                    e641Var = new e641(this, lnmVar);
                }
                Object obj3 = e641Var.a;
                int i4 = e641Var.b;
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
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                strUri = contextTrack2 != null ? contextTrack2.uri() : null;
                if (strUri != null && strUri.equals(g641Var.d) && playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                e641Var.b = 1;
                return vr20Var.emit(boolValueOf2, e641Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
