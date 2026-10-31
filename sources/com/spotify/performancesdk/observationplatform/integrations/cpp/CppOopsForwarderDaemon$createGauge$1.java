package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.x940;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/spotify/performancesdk/observationplatform/integrations/cpp/CppOopsForwarderDaemon$createGauge$1", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "", "value", "Lp/rih1;", "record", "(D)V", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class CppOopsForwarderDaemon$createGauge$1 implements OopsCppGauge {
    final /* synthetic */ x940 $gauge;

    public CppOopsForwarderDaemon$createGauge$1(x940 x940Var) {
        this.$gauge = x940Var;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppGauge
    public void record(double value) {
        this.$gauge.record(value);
    }
}
