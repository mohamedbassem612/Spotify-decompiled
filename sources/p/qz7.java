package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qz7 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ yqg c;

    public /* synthetic */ qz7(vr20 vr20Var, yqg yqgVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        pz7 pz7Var;
        wj9 wj9Var;
        qdu0 qdu0Var;
        n1m1 n1m1Var;
        int i;
        int i2;
        String strUri;
        j380 j380VarMetadata;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        yqg yqgVar = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof pz7) {
                    pz7Var = (pz7) lnmVar;
                    int i3 = pz7Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pz7Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        pz7Var = new pz7(this, lnmVar);
                    }
                } else {
                    pz7Var = new pz7(this, lnmVar);
                }
                Object obj2 = pz7Var.a;
                int i4 = pz7Var.b;
                if (i4 == 0) {
                    hm5.M(obj2);
                    iz7 iz7Var = new iz7((rgt0) obj, yqgVar.e());
                    pz7Var.b = 1;
                    return vr20Var.emit(iz7Var, pz7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof wj9) {
                    wj9Var = (wj9) lnmVar;
                    int i5 = wj9Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wj9Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        wj9Var = new wj9(this, lnmVar);
                    }
                } else {
                    wj9Var = new wj9(this, lnmVar);
                }
                Object obj3 = wj9Var.a;
                int i6 = wj9Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                re9 re9Var = (re9) obj;
                re9Var.getClass();
                edu eduVar = new edu(re9Var, yqgVar.e());
                wj9Var.b = 1;
                return vr20Var.emit(eduVar, wj9Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof qdu0) {
                    qdu0Var = (qdu0) lnmVar;
                    int i7 = qdu0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qdu0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        qdu0Var = new qdu0(this, lnmVar);
                    }
                } else {
                    qdu0Var = new qdu0(this, lnmVar);
                }
                Object obj4 = qdu0Var.a;
                int i8 = qdu0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (!playerState.isPaused()) {
                    if (playerState.isPlaying()) {
                        i2 = 1;
                    } else {
                        i = 3;
                    }
                    i5u0 i5u0Var = new i5u0(i2, (int) ((Number) playerState.position(yqgVar.b()).e(new Long(0L))).longValue(), (int) ((Number) playerState.duration().e(new Long(0L))).longValue(), yqgVar.e(), (String) playerState.playbackId().h());
                    if (contextTrack != null) {
                        strUri = contextTrack.uri();
                    } else {
                        strUri = null;
                    }
                    String strContextUri = playerState.contextUri();
                    if (contextTrack != null || (j380VarMetadata = contextTrack.metadata()) == null) {
                        j380VarMetadata = b7x.a;
                    }
                    n1m1Var = new n1m1(i5u0Var, new ylf1(strUri, strContextUri, j380VarMetadata));
                    qdu0Var.b = 1;
                    if (vr20Var.emit(n1m1Var, qdu0Var) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                i = 2;
                i2 = i;
                i5u0 i5u0Var2 = new i5u0(i2, (int) ((Number) playerState.position(yqgVar.b()).e(new Long(0L))).longValue(), (int) ((Number) playerState.duration().e(new Long(0L))).longValue(), yqgVar.e(), (String) playerState.playbackId().h());
                if (contextTrack != null) {
                    strUri = contextTrack.uri();
                } else {
                    strUri = null;
                }
                String strContextUri2 = playerState.contextUri();
                if (contextTrack != null) {
                    j380VarMetadata = b7x.a;
                } else {
                    j380VarMetadata = b7x.a;
                }
                n1m1Var = new n1m1(i5u0Var2, new ylf1(strUri, strContextUri2, j380VarMetadata));
                qdu0Var.b = 1;
                if (vr20Var.emit(n1m1Var, qdu0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }
}
