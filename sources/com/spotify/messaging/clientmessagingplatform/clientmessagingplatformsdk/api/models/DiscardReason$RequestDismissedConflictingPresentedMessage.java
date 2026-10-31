package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$RequestDismissedConflictingPresentedMessage;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "requestId", "", "<init>", "(Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class DiscardReason$RequestDismissedConflictingPresentedMessage extends DiscardReason {
    public static final int $stable = 0;
    private final String requestId;

    public DiscardReason$RequestDismissedConflictingPresentedMessage(String str) {
        super((DefaultConstructorMarker) null);
        this.requestId = str;
    }

    public static /* synthetic */ DiscardReason$RequestDismissedConflictingPresentedMessage copy$default(DiscardReason$RequestDismissedConflictingPresentedMessage discardReason$RequestDismissedConflictingPresentedMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discardReason$RequestDismissedConflictingPresentedMessage.requestId;
        }
        return discardReason$RequestDismissedConflictingPresentedMessage.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final DiscardReason$RequestDismissedConflictingPresentedMessage copy(String requestId) {
        return new DiscardReason$RequestDismissedConflictingPresentedMessage(requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DiscardReason$RequestDismissedConflictingPresentedMessage) && u890.j(this.requestId, ((DiscardReason$RequestDismissedConflictingPresentedMessage) other).requestId);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.requestId.hashCode();
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }
}
