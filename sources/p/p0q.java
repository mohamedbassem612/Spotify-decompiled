package p;

import com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback;
import com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0q implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ p0q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                r380 r380VarL = t380.l(2);
                Set setSingleton = Collections.singleton((hgb) ((gwo) daqVar.ve.get()).h.get());
                c8o.m(setSingleton);
                r380VarL.h(setSingleton);
                r380VarL.g(new cy40((t961) daqVar.J2.get()));
                ((BluetoothConnectionStateReceiver) obj).b = r380VarL.i();
                break;
            case 5:
                ShareSheetCallback shareSheetCallback = (ShareSheetCallback) obj;
                shareSheetCallback.c = (yqg) daqVar.J1.get();
                shareSheetCallback.b = (t2j0) daqVar.f2.get();
                break;
            default:
                SpotifyWearableListenerService spotifyWearableListenerService = (SpotifyWearableListenerService) obj;
                spotifyWearableListenerService.Y = new n3t((xm41) daqVar.Yl.get());
                y610 y610Var = (y610) daqVar.Tf.get();
                v5n v5nVar = (v5n) daqVar.Pb.get();
                xj8 xj8Var = (xj8) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(xj8.class, "android-wear-wearabledatalayer");
                c8o.m(xj8Var);
                spotifyWearableListenerService.i = new ix7(y610Var, v5nVar, xj8Var, (byte) 4);
                spotifyWearableListenerService.Z = (oo70) daqVar.M2.get();
                spotifyWearableListenerService.N0 = (q8n) daqVar.E1.get();
                spotifyWearableListenerService.O0 = (nfa0) daqVar.b2.get();
                spotifyWearableListenerService.X = new szc0((xrc0) daqVar.f5.get(), (iyc0) daqVar.g5.get(), (y610) daqVar.Tf.get(), (g510) daqVar.L5.get(), (g0l) daqVar.E5.get());
                spotifyWearableListenerService.t = new v9u0((y610) daqVar.Tf.get(), (g510) daqVar.L5.get(), (g0l) daqVar.E5.get(), (agc0) daqVar.B7.get(), (zor) daqVar.V6.get(), (iyc0) daqVar.g5.get(), (ccc0) daqVar.y8.get(), (Flowable) daqVar.D5.get());
                break;
        }
    }

    public /* synthetic */ p0q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
