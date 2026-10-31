package p;

import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l7b1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SpotifyWearableListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7b1(SpotifyWearableListenerService spotifyWearableListenerService, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = spotifyWearableListenerService;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        SpotifyWearableListenerService spotifyWearableListenerService = this.c;
        switch (b) {
            case 0:
                return new l7b1(spotifyWearableListenerService, lnmVar, (byte) 0);
            default:
                return new l7b1(spotifyWearableListenerService, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        SpotifyWearableListenerService spotifyWearableListenerService = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ix7 ix7Var = spotifyWearableListenerService.i;
                if (ix7Var == null) {
                    u890.C("authenticationController");
                    throw null;
                }
                this.b = true;
                Object objM = ix7Var.m(this);
                return objM == d9nVar ? d9nVar : objM;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v9u0 v9u0VarG = spotifyWearableListenerService.g();
                this.b = true;
                v9u0 v9u0Var = v9u0VarG;
                Object objO = cwl1.o(v9u0Var.a, tnt0.i, (Long) null, new sv2(v9u0Var, (lnm) null), this);
                return objO == d9nVar ? d9nVar : objO;
        }
    }
}
