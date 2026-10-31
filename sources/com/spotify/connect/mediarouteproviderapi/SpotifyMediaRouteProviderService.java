package com.spotify.connect.mediarouteproviderapi;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.bn;
import p.bwh0;
import p.g3e;
import p.j1e1;
import p.pvh0;
import p.u890;
import p.zvh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/connect/mediarouteproviderapi/SpotifyMediaRouteProviderService;", "Lp/zvh0;", "<init>", "()V", "src_main_java_com_spotify_connect_mediarouteproviderapi-mediarouteproviderapi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class SpotifyMediaRouteProviderService extends zvh0 {
    public g3e g;
    public bn h;
    public bwh0 i;
    public pvh0 t;

    @Override // android.app.Service
    public final void onCreate() {
        j1e1.r(this);
        super.onCreate();
    }

    @Override // p.zvh0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        pvh0 pvh0Var = this.t;
        if (pvh0Var != null) {
            pvh0Var.j();
        }
        this.t = null;
        bwh0 bwh0Var = this.i;
        if (bwh0Var != null) {
            bwh0Var.b();
        } else {
            u890.C("servicePlugins");
            throw null;
        }
    }
}
