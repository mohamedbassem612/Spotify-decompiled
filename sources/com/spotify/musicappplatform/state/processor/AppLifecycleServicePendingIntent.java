package com.spotify.musicappplatform.state.processor;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/spotify/musicappplatform/state/processor/AppLifecycleServicePendingIntent;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYBACK_NOTIFICATION_CLOSE", "NOTIFICATION_CHANGE_SEGMENT", "OPEN_URL", "SAVE_ENTITY", "PLAY_AND_NAVIGATE", "OPEN_PUSH_SETTINGS", "DISMISS", "EMAIL_VERIFY", "START_PLAYBACK", "ADD_TO_PLAYLIST", "ADD_TO_QUEUE", "ADD_TO_YOUR_EPISODE", "DOWNLOAD", "ADD_TO_COLLECTION", "REMOVE_FROM_COLLECTION", "BAN_FROM_COLLECTION", "UNBAN_FROM_COLLECTION", "PLAYER_SKIP_PREV", "PLAYER_PAUSE", "PLAYER_RESUME", "PLAYER_SEEK_BACK_15_SEC", "PLAYER_SEEK_FORWARD_15_SEC", "PLAYER_SKIP_NEXT", "PIP_PLAYER_PAUSE", "PIP_PLAYER_RESUME", "PIP_PLAYER_SEEK_BACK_15_SEC", "PIP_PLAYER_SEEK_FORWARD_15_SEC", "src_main_java_com_spotify_musicappplatform_state_processor-processor"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public enum AppLifecycleServicePendingIntent {
    PLAYBACK_NOTIFICATION_CLOSE,
    NOTIFICATION_CHANGE_SEGMENT,
    OPEN_URL,
    SAVE_ENTITY,
    PLAY_AND_NAVIGATE,
    OPEN_PUSH_SETTINGS,
    DISMISS,
    EMAIL_VERIFY,
    START_PLAYBACK,
    ADD_TO_PLAYLIST,
    ADD_TO_QUEUE,
    ADD_TO_YOUR_EPISODE,
    DOWNLOAD,
    ADD_TO_COLLECTION,
    REMOVE_FROM_COLLECTION,
    BAN_FROM_COLLECTION,
    UNBAN_FROM_COLLECTION,
    PLAYER_SKIP_PREV,
    PLAYER_PAUSE,
    PLAYER_RESUME,
    PLAYER_SEEK_BACK_15_SEC,
    PLAYER_SEEK_FORWARD_15_SEC,
    PLAYER_SKIP_NEXT,
    PIP_PLAYER_PAUSE,
    PIP_PLAYER_RESUME,
    PIP_PLAYER_SEEK_BACK_15_SEC,
    PIP_PLAYER_SEEK_FORWARD_15_SEC;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
