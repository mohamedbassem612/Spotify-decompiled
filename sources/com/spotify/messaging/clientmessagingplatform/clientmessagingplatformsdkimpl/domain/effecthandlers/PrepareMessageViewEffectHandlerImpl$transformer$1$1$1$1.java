package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import kotlin.Metadata;
import p.hab0;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "it", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "invoke"}, k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PrepareMessageViewEffectHandlerImpl$transformer$1$1$1$1 extends hab0 implements iu30 {
    final /* synthetic */ MessageTemplate $updatedTemplate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareMessageViewEffectHandlerImpl$transformer$1$1$1$1(MessageTemplate messageTemplate) {
        super(1);
        this.$updatedTemplate = messageTemplate;
    }

    public final MessageTemplate invoke(MessageResponseToken messageResponseToken) {
        return this.$updatedTemplate;
    }
}
