package p;

import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w860 implements shm {
    public final z0t a;
    public final agc0 b;
    public final xrm1 c;
    public final vwm1 d;
    public final t0t e;
    public final z6c f;

    public w860(z0t z0tVar, agc0 agc0Var, xrm1 xrm1Var, vwm1 vwm1Var, t0t t0tVar, z6c z6cVar) {
        this.a = z0tVar;
        this.b = agc0Var;
        this.c = xrm1Var;
        this.d = vwm1Var;
        this.e = t0tVar;
        this.f = z6cVar;
    }

    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        if (!d(hti0Var)) {
            return new huz((Object) null, (byte) 10);
        }
        return new ipr(this.d.e(c(hti0Var.a)), this, hti0Var, (byte) 21);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        u860 u860Var;
        if (lnmVar instanceof u860) {
            u860Var = (u860) lnmVar;
            int i = u860Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u860Var.d = i - Integer.MIN_VALUE;
            } else {
                u860Var = new u860(this, (onm) lnmVar);
            }
        } else {
            u860Var = new u860(this, (onm) lnmVar);
        }
        Object objK = u860Var.b;
        int i2 = u860Var.d;
        if (i2 == 0) {
            hm5.M(objK);
            if (d(hti0Var)) {
                dbs dbsVar = new dbs(this.d.e(c(hti0Var.a)), (byte) 3);
                u860Var.a = hti0Var;
                u860Var.d = 1;
                objK = b5p1.k(dbsVar, u860Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hti0Var = u860Var.a;
        hm5.M(objK);
        YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) objK;
        if (yourLibraryDecorateResponse != null) {
            String str = hti0Var.a;
            if (yourLibraryDecorateResponse.o().isEmpty()) {
                return this.f.a(str);
            }
            return null;
        }
        return null;
    }

    public final YourLibraryDecorateRequest c(String str) {
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs;
        zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
        zsm1VarP.q(str);
        this.b.getClass();
        boolean zEquals = str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
        osm1 osm1Var = osm1.INCLUDE_ALWAYS;
        if (zEquals || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
            psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
            nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO.q(osm1Var);
            psm1VarP.v((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO.build());
            yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) psm1VarP.build();
        } else {
            this.c.getClass();
            if (xrm1.a(str)) {
                psm1 psm1VarP2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO2.q(osm1Var);
                psm1VarP2.A((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO2.build());
                yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) psm1VarP2.build();
            } else {
                yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p().build();
            }
        }
        zsm1VarP.r(yourLibraryPredefinedPlaylistConfigs);
        return (YourLibraryDecorateRequest) zsm1VarP.build();
    }

    public final boolean d(hti0 hti0Var) {
        boolean zA;
        String str = hti0Var.a;
        this.b.getClass();
        boolean zEquals = str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
        t0t t0tVar = this.e;
        if (zEquals || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
            zA = t0tVar.a(fsm1.a);
        } else {
            this.c.getClass();
            zA = xrm1.a(str) ? t0tVar.a(gsm1.a) : true;
        }
        if (!zA && this.a.a.a()) {
            lik1 lik1Var = hti0Var.b;
            if (u890.j(lik1Var, nik1.p2) || u890.j(lik1Var, nik1.A2)) {
                return true;
            }
        }
        return false;
    }
}
