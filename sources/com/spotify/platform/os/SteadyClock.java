package com.spotify.platform.os;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/platform/os/SteadyClock;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_platform_os-os"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class SteadyClock {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long timeSinceEpochMs = 0;

    public static final native long getTimeSinceEpochMs();
}
