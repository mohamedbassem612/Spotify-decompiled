package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$Expired;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState;", "message", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;)V", "getMessage", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class SelectMessageEffectHandlerImpl$MessageState$Expired extends SelectMessageEffectHandlerImpl.MessageState {
    public static final int $stable = Message.$stable;
    private final Message message;

    public SelectMessageEffectHandlerImpl$MessageState$Expired(Message message) {
        super((DefaultConstructorMarker) null);
        this.message = message;
    }

    public static /* synthetic */ SelectMessageEffectHandlerImpl$MessageState$Expired copy$default(SelectMessageEffectHandlerImpl$MessageState$Expired selectMessageEffectHandlerImpl$MessageState$Expired, Message message, int i, Object obj) {
        if ((i & 1) != 0) {
            message = selectMessageEffectHandlerImpl$MessageState$Expired.message;
        }
        return selectMessageEffectHandlerImpl$MessageState$Expired.copy(message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final SelectMessageEffectHandlerImpl$MessageState$Expired copy(Message message) {
        return new SelectMessageEffectHandlerImpl$MessageState$Expired(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectMessageEffectHandlerImpl$MessageState$Expired) && u890.j(this.message, ((SelectMessageEffectHandlerImpl$MessageState$Expired) other).message);
    }

    public Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }
}
