package com.spotify.platform.os;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00058Æ\u0001X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/spotify/platform/os/SteadyClock$Companion;", "", "<init>", "()V", "timeSinceEpochMs", "", "getTimeSinceEpochMs$annotations", "src_main_java_com_spotify_platform_os-os"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class SteadyClock$Companion {
    public /* synthetic */ SteadyClock$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getTimeSinceEpochMs$annotations() {
    }

    public final long getTimeSinceEpochMs() {
        return SteadyClock.getTimeSinceEpochMs();
    }

    private SteadyClock$Companion() {
    }
}
