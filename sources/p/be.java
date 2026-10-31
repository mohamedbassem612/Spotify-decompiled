package p;

import com.google.protobuf.Empty;
import com.spotify.connectivity.esperanto.proto.ForceOfflineRequest;
import com.spotify.connectivity.esperanto.proto.SubStateRequest;
import com.spotify.connectivity.hosts.esperanto.proto.EsHost;
import com.spotify.connectivity.hosts.esperanto.proto.EsServiceType;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.karaoke.esperanto.proto.KaraokePostStatusRequest;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeRequest;
import com.spotify.on_demand_set.proto.Set;
import com.spotify.prefetch_esperanto.proto.EsMediaPrefetch;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import j$.util.Base64;
import spotify.profile_esperanto.proto.GetProfilesRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class be extends ClientBase {
    public Single a(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "PerformDiscovery", empty).map(u321.S0);
    }

    public Single b(KaraokePostStatusRequest karaokePostStatusRequest) {
        return callSingle("spotify.karaoke_esperanto.proto.KaraokeService", "PostStatus", karaokePostStatusRequest).map(aj20.h);
    }

    public Single c(KaraokePostVocalVolumeRequest karaokePostVocalVolumeRequest) {
        return callSingle("spotify.karaoke_esperanto.proto.KaraokeService", "PostVocalVolume", karaokePostVocalVolumeRequest).map(bj20.h);
    }

    public Single d(PutValuesRequest putValuesRequest) {
        return callSingle("spotify.product_state.esperanto.proto.ProductState", "PutValues", putValuesRequest).map(rtw0.b);
    }

    public Single e(PutValuesSyncRequest putValuesSyncRequest) {
        return callSingle("spotify.product_state.esperanto.proto.ProductState", "PutValuesSync", putValuesSyncRequest).map(ok10.c1);
    }

    public Single f(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "RefreshCluster", empty).map(f331.i);
    }

    public Single g(Set set) {
        return callSingle("spotify.on_demand_set_esperanto.proto.OnDemandSetService", "Set", set).map(y580.m1);
    }

    public Observable h(SubValuesRequest subValuesRequest) {
        return callStream("spotify.product_state.esperanto.proto.ProductState", "SubValues", subValuesRequest).map(sl10.g1);
    }

    public Observable i(GetProfilesRequest getProfilesRequest) {
        return callStream("spotify.profile_esperanto.proto.v1.ProfileService", "SubscribeToProfiles", getProfilesRequest).map(wdx0.b);
    }

    public Single j(EsMediaPrefetch.UpdateFutureRequest updateFutureRequest) {
        return callSingle("spotify.prefetch_esperanto.proto.MediaPrefetch", "UpdateFuture", updateFutureRequest).map(mif1.i1);
    }

    public Single k(EsMediaPrefetch.SegmentProfileSelectionConfig segmentProfileSelectionConfig) {
        return callSingle("spotify.prefetch_esperanto.proto.MediaPrefetch", "UpdateSegmentProfileSelectionConfig", segmentProfileSelectionConfig).map(fj10.N0);
    }

    public Observable l(Empty empty) {
        return callStream("spotify.connect.esperanto.proto.ConnectVolumeService", "Volume", empty).map(een.Y0);
    }

    public Single m(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "WakeSleepingClusterDevices", empty).map(uh21.S0);
    }

    public Observable n(Empty empty) {
        return callStream("spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider", "getEncryptedToken", empty).map(s9w.Q0);
    }

    public Single o(Empty empty) {
        return callSingle("spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider", "getToken", empty).map(y580.i);
    }

    public EsHost.Host p(EsServiceType.ServiceType serviceType) {
        byte[] bArrCallSync = callSync("spotify.connectivity.hosts.esperanto.proto.HostsProvider", "host", serviceType);
        try {
            return EsHost.Host.p(bArrCallSync);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.hosts.esperanto.proto.EsHost.Host: '", Base64.getEncoder().encodeToString(bArrCallSync), "' (Base64)"), e);
            return null;
        }
    }

    public Observable q(Empty empty) {
        return callStream("spotify.connectivity.hosts.esperanto.proto.HostsProvider", "hosts", empty).map(f331.S0);
    }

    public Single r(ForceOfflineRequest forceOfflineRequest) {
        return callSingle("spotify.connectivity.esperanto.proto.ConnectivityPolicy", "setForceOffline", forceOfflineRequest).map(uml1.R0);
    }

    public Observable s(SubStateRequest subStateRequest) {
        return callStream("spotify.connectivity.esperanto.proto.ConnectivityPolicy", "subState", subStateRequest).map(fkj0.Y);
    }
}
