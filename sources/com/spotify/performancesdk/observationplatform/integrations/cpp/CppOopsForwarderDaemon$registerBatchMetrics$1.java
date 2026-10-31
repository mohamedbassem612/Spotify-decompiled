package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.tga;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/spotify/performancesdk/observationplatform/integrations/cpp/CppOopsForwarderDaemon$registerBatchMetrics$1", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "Lp/rih1;", "unregister", "()V", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class CppOopsForwarderDaemon$registerBatchMetrics$1 implements OopsCppBatchObservableInstrument {
    final /* synthetic */ tga $handle;

    public CppOopsForwarderDaemon$registerBatchMetrics$1(tga tgaVar) {
        this.$handle = tgaVar;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppBatchObservableInstrument
    public void unregister() {
        this.$handle.unregister();
    }
}
