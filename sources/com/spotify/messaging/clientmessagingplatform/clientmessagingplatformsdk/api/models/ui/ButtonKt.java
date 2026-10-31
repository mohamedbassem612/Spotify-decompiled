package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.ihc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"hasVisibleLabel", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 2, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ButtonKt {
    public static final boolean hasVisibleLabel(Button button) {
        return (button == null || ihc1.y0(button.getStyle().getText())) ? false : true;
    }
}
