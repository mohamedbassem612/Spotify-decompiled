package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState", "", "<init>", "()V", "", "priority", "()I", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "getMessage", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "message", "ValidationPassed", "ValidationFailed", "Expired", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$Expired;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$ValidationFailed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$ValidationPassed;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
abstract class SelectMessageEffectHandlerImpl$MessageState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$ValidationPassed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState;", "message", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;)V", "getMessage", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class ValidationPassed extends SelectMessageEffectHandlerImpl$MessageState {
        public static final int $stable = Message.$stable;
        private final Message message;

        public ValidationPassed(Message message) {
            super(null);
            this.message = message;
        }

        public static /* synthetic */ ValidationPassed copy$default(ValidationPassed validationPassed, Message message, int i, Object obj) {
            if ((i & 1) != 0) {
                message = validationPassed.message;
            }
            return validationPassed.copy(message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final ValidationPassed copy(Message message) {
            return new ValidationPassed(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationPassed) && u890.j(this.message, ((ValidationPassed) other).message);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SelectMessageEffectHandlerImpl$MessageState
        public Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ SelectMessageEffectHandlerImpl$MessageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Message getMessage();

    public final int priority() {
        if (this instanceof Expired) {
            return 3;
        }
        if (this instanceof ValidationFailed) {
            return 2;
        }
        if (this instanceof ValidationPassed) {
            return 1;
        }
        eg.o();
        return 0;
    }

    private SelectMessageEffectHandlerImpl$MessageState() {
    }
}
