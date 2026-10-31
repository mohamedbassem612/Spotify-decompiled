package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.nan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/spotify/performancesdk/observationplatform/integrations/cpp/CppOopsForwarderDaemon$createCounter$1", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "", "delta", "Lp/rih1;", "increment", "(D)V", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class CppOopsForwarderDaemon$createCounter$1 implements OopsCppCounter {
    final /* synthetic */ nan $counter;

    public CppOopsForwarderDaemon$createCounter$1(nan nanVar) {
        this.$counter = nanVar;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppCounter
    public void increment(double delta) {
        this.$counter.increment(delta);
    }
}
