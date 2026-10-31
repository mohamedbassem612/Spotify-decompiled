package p;

import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j7b1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SpotifyWearableListenerService c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7b1(SpotifyWearableListenerService spotifyWearableListenerService, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = spotifyWearableListenerService;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        SpotifyWearableListenerService spotifyWearableListenerService = this.c;
        switch (b) {
            case 0:
                return new j7b1(spotifyWearableListenerService, str, lnmVar, (byte) 0);
            case 1:
                return new j7b1(spotifyWearableListenerService, str, lnmVar, (byte) 1);
            case 2:
                return new j7b1(spotifyWearableListenerService, str, lnmVar, (byte) 2);
            case 3:
                return new j7b1(spotifyWearableListenerService, str, lnmVar, (byte) 3);
            default:
                return new j7b1(spotifyWearableListenerService, str, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objO;
        Object objO2;
        Object objO3;
        Object objO4;
        byte b = this.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        SpotifyWearableListenerService spotifyWearableListenerService = this.c;
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
                v9u0 v9u0VarG = spotifyWearableListenerService.g();
                vy1 vy1Var = (vy1) spotifyWearableListenerService.f().a(str, m5n1.z(vy1.Companion.serializer()));
                this.b = true;
                v9u0 v9u0Var = v9u0VarG;
                if (vy1Var == null) {
                    kzq.Companion.getClass();
                    objO = jzq.a("Request sent with empty body");
                } else {
                    objO = cwl1.o(v9u0Var.a, tnt0.f, (Long) null, new gg00(v9u0Var, vy1Var, (lnm) null, (byte) 4), this);
                }
                Object obj2 = objO;
                return obj2 == d9nVar ? d9nVar : obj2;
            case 1:
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
                ix7 ix7Var = spotifyWearableListenerService.i;
                if (ix7Var == null) {
                    u890.C("authenticationController");
                    throw null;
                }
                ev8 ev8Var = (ev8) spotifyWearableListenerService.f().a(str, m5n1.z(ev8.Companion.serializer()));
                this.b = true;
                Object objG = ix7Var.g(ev8Var, this);
                return objG == d9nVar ? d9nVar : objG;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v9u0 v9u0VarG2 = spotifyWearableListenerService.g();
                ogo ogoVar = (ogo) spotifyWearableListenerService.f().a(str, m5n1.z(ogo.Companion.serializer()));
                this.b = true;
                v9u0 v9u0Var2 = v9u0VarG2;
                if (ogoVar == null) {
                    kzq.Companion.getClass();
                    objO2 = jzq.a("Request sent with empty body");
                } else {
                    String str2 = ogoVar.a;
                    if (!nhc1.Y(str2, "spotify:audiobook:", false) ? !(!nhc1.Y(str2, "spotify:show:", false) || str2.length() <= 13) : str2.length() > 18) {
                        kzq.Companion.getClass();
                        objO2 = jzq.a("Audiobook curation requires a parent book URI");
                    } else {
                        objO2 = cwl1.o(v9u0Var2.a, tnt0.g, (Long) null, new sv2(ogoVar, v9u0Var2, (lnm) null), this);
                    }
                }
                Object obj3 = objO2;
                return obj3 == d9nVar ? d9nVar : obj3;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v9u0 v9u0VarG3 = spotifyWearableListenerService.g();
                ao51 ao51Var = (ao51) spotifyWearableListenerService.f().a(str, m5n1.z(ao51.Companion.serializer()));
                this.b = true;
                v9u0 v9u0Var3 = v9u0VarG3;
                if (ao51Var == null) {
                    kzq.Companion.getClass();
                    objO3 = jzq.a("Request sent with empty body");
                } else {
                    objO3 = cwl1.o(v9u0Var3.a, tnt0.t, (Long) null, new gg00(ao51Var, v9u0Var3, (lnm) null, (byte) 5), this);
                }
                Object obj4 = objO3;
                return obj4 == d9nVar ? d9nVar : obj4;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v9u0 v9u0VarG4 = spotifyWearableListenerService.g();
                t461 t461Var = (t461) spotifyWearableListenerService.f().a(str, m5n1.z(t461.Companion.serializer()));
                this.b = true;
                v9u0 v9u0Var4 = v9u0VarG4;
                if (t461Var == null) {
                    kzq.Companion.getClass();
                    objO4 = jzq.a("Request sent with empty body");
                } else {
                    objO4 = cwl1.o(v9u0Var4.a, tnt0.X, (Long) null, new n6d(t461Var, (lnm) null, (byte) 2), this);
                }
                Object obj5 = objO4;
                return obj5 == d9nVar ? d9nVar : obj5;
        }
    }
}
