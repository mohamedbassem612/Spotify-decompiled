package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Rule;", "", "<init>", "(Ljava/lang/String;I)V", "DISALLOW_IF_CONTEXT_SWITCHED", "DISALLOW_IF_APPLICATION_BACKGROUNDED", "DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING", "DISALLOW_IF_AD_PLAYING", "DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING", "DISALLOW_IF_CAR_CONNECTED", "DISALLOW_IF_CONNECTIVITY_OFFLINE", "ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public enum Rule {
    DISALLOW_IF_CONTEXT_SWITCHED,
    DISALLOW_IF_APPLICATION_BACKGROUNDED,
    DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING,
    DISALLOW_IF_AD_PLAYING,
    DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING,
    DISALLOW_IF_CAR_CONNECTED,
    DISALLOW_IF_CONNECTIVITY_OFFLINE,
    ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
