package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class CppOopsForwarderDaemon$createObservableGauge$handle$1 extends hab0 implements Function0 {
    final /* synthetic */ long $pollPtr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CppOopsForwarderDaemon$createObservableGauge$handle$1(long j) {
        super(0);
        this.$pollPtr = j;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Double m391invoke() {
        return OopsBridge.INSTANCE.pollNative(this.$pollPtr);
    }
}
