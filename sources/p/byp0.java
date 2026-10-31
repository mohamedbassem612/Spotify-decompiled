package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$DeviceKey;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class byp0 {
    public final vpp0 a;

    public byp0(vpp0 vpp0Var) {
        this.a = vpp0Var;
    }

    public final Completable a(String str, ept eptVar) {
        toz tozVarO = EsOffline.DownloadRequest.o();
        tozVarO.r(str);
        roz rozVarO = EsOffline$DeviceKey.o();
        rozVarO.q(eptVar.b());
        rozVarO.n(eptVar.a());
        tozVarO.q(rozVarO);
        return this.a.a(tozVarO.build()).flatMapCompletable(sa20.U0);
    }

    public final Object b(String str, onm onmVar) {
        zoz zozVarN = EsOffline.GetListsContainingItemRequest.n();
        zozVarN.n(str);
        return fc11.j(this.a.callSingle("spotify.offline_esperanto.proto.Offline", "GetListsContainingItem", zozVarN.build()).map(zz10.S0).map(kc20.U0), onmVar);
    }

    public final Completable c(String str, ept eptVar) {
        toz tozVarO = EsOffline.DownloadRequest.o();
        tozVarO.r(str);
        roz rozVarO = EsOffline$DeviceKey.o();
        rozVarO.q(eptVar.b());
        rozVarO.n(eptVar.a());
        tozVarO.q(rozVarO);
        return this.a.callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", tozVarO.build()).map(kc20.T0).flatMapCompletable(xi20.V0);
    }

    public final Observable d(String str) {
        soz sozVarN = EsOffline.DevicesWithContextRequest.n();
        sozVarN.n(str);
        return this.a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeDevicesWithContext", sozVarN.build()).map(zi20.Q0).map(aj20.U0);
    }
}
