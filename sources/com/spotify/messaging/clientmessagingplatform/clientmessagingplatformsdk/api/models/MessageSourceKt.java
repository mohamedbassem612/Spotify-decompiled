package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMessageSource", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 2, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MessageSourceKt {
    public static final MessageSource toMessageSource(String str) {
        return str.equals("PRE_FETCH") ? MessageSource.PREFETCHED : MessageSource.valueOf(str);
    }
}
