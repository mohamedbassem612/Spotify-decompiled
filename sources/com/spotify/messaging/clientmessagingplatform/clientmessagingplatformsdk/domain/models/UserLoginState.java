package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/domain/models/UserLoginState;", "", "<init>", "(Ljava/lang/String;I)V", "LOGGING_OUT", "LOGGED_IN", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public enum UserLoginState {
    LOGGING_OUT,
    LOGGED_IN;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
