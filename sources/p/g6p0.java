package p;

import android.os.Bundle;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g6p0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ poj0 c;

    public /* synthetic */ g6p0(vr20 vr20Var, poj0 poj0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = poj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Object emit(Object obj, lnm lnmVar) {
        f6p0 f6p0Var;
        int i;
        h6p0 h6p0Var;
        wa71 wa71Var;
        ContextTrack contextTrack;
        Object obj2 = obj;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        poj0 poj0Var = this.c;
        vr20 vr20Var = this.b;
        Object obj3 = d9n.a;
        String strContextUri = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof f6p0) {
                    f6p0Var = (f6p0) lnmVar;
                    int i2 = f6p0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        f6p0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        f6p0Var = new f6p0(this, lnmVar);
                    }
                } else {
                    f6p0Var = new f6p0(this, lnmVar);
                }
                Object objA = f6p0Var.a;
                int i3 = f6p0Var.b;
                if (i3 == 0) {
                    hm5.M(objA);
                    ContextTrack contextTrack2 = (ContextTrack) ((PlayerState) obj2).track().h();
                    i = 0;
                    if (contextTrack2 == null) {
                        objA = Boolean.FALSE;
                    } else {
                        if (l4o1.W(contextTrack2) || l4o1.P(contextTrack2) || l4o1.G(contextTrack2)) {
                            f771 f771Var = (f771) poj0Var.e;
                            String strUri = contextTrack2.uri();
                            f6p0Var.c = obj2;
                            f6p0Var.d = vr20Var;
                            f6p0Var.e = 0;
                            f6p0Var.b = 1;
                            objA = f771Var.a(strUri, f6p0Var);
                            if (objA != obj3) {
                            }
                            return obj3;
                        }
                        objA = Boolean.FALSE;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hm5.M(objA);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = f6p0Var.e;
                    vr20Var = f6p0Var.d;
                    Object obj4 = f6p0Var.c;
                    hm5.M(objA);
                    i = i4;
                    obj2 = obj4;
                }
                if (!((Boolean) objA).booleanValue()) {
                    return rih1Var;
                }
                f6p0Var.c = null;
                f6p0Var.d = null;
                f6p0Var.e = i;
                f6p0Var.b = 2;
                if (vr20Var.emit(obj2, f6p0Var) != obj3) {
                    return rih1Var;
                }
                return obj3;
            default:
                if (lnmVar instanceof h6p0) {
                    h6p0Var = (h6p0) lnmVar;
                    int i5 = h6p0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        h6p0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        h6p0Var = new h6p0(this, lnmVar);
                    }
                } else {
                    h6p0Var = new h6p0(this, lnmVar);
                }
                Object obj5 = h6p0Var.a;
                int i6 = h6p0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                PlayerState playerState = (PlayerState) obj2;
                playerState.getClass();
                if (l4o1.G((ContextTrack) playerState.track().b()) || l4o1.O((ContextTrack) playerState.track().b())) {
                    wa71Var = new wa71(playerState.contextUri(), (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
                } else {
                    String strUri2 = ((ContextTrack) playerState.track().b()).uri();
                    le30 le30VarA = ((me30) poj0Var.c).a((String) playerState.contextMetadata().get(Context$Metadata.KEY_FORMAT_LIST_TYPE));
                    if ((!playerState.track().c() || (contextTrack = (ContextTrack) playerState.track().h()) == null || !l4o1.S(contextTrack)) && (le30VarA == le30.d1 || le30VarA == le30.P0 || le30VarA == le30.a1)) {
                        strContextUri = playerState.contextUri();
                    }
                    wa71Var = new wa71(strUri2, strContextUri, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 124);
                }
                h6p0Var.b = 1;
                return vr20Var.emit(wa71Var, h6p0Var) == obj3 ? obj3 : rih1Var;
        }
    }
}
