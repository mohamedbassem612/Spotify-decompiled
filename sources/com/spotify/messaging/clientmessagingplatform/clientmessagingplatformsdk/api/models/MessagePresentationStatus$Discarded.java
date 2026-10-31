package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Discarded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus;", "triggerPattern", "", "triggerType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "formatType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "discardReason", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;)V", "getTriggerPattern", "()Ljava/lang/String;", "getTriggerType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "getFormatType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "getDiscardReason", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class MessagePresentationStatus$Discarded extends MessagePresentationStatus {
    public static final int $stable = 0;
    private final DiscardReason discardReason;
    private final FormatType formatType;
    private final String triggerPattern;
    private final TriggerType triggerType;

    public MessagePresentationStatus$Discarded(String str, TriggerType triggerType, FormatType formatType, DiscardReason discardReason) {
        super((DefaultConstructorMarker) null);
        this.triggerPattern = str;
        this.triggerType = triggerType;
        this.formatType = formatType;
        this.discardReason = discardReason;
    }

    public static /* synthetic */ MessagePresentationStatus$Discarded copy$default(MessagePresentationStatus$Discarded messagePresentationStatus$Discarded, String str, TriggerType triggerType, FormatType formatType, DiscardReason discardReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagePresentationStatus$Discarded.triggerPattern;
        }
        if ((i & 2) != 0) {
            triggerType = messagePresentationStatus$Discarded.triggerType;
        }
        if ((i & 4) != 0) {
            formatType = messagePresentationStatus$Discarded.formatType;
        }
        if ((i & 8) != 0) {
            discardReason = messagePresentationStatus$Discarded.discardReason;
        }
        return messagePresentationStatus$Discarded.copy(str, triggerType, formatType, discardReason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTriggerPattern() {
        return this.triggerPattern;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TriggerType getTriggerType() {
        return this.triggerType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FormatType getFormatType() {
        return this.formatType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DiscardReason getDiscardReason() {
        return this.discardReason;
    }

    public final MessagePresentationStatus$Discarded copy(String triggerPattern, TriggerType triggerType, FormatType formatType, DiscardReason discardReason) {
        return new MessagePresentationStatus$Discarded(triggerPattern, triggerType, formatType, discardReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagePresentationStatus$Discarded)) {
            return false;
        }
        MessagePresentationStatus$Discarded messagePresentationStatus$Discarded = (MessagePresentationStatus$Discarded) other;
        return u890.j(this.triggerPattern, messagePresentationStatus$Discarded.triggerPattern) && this.triggerType == messagePresentationStatus$Discarded.triggerType && this.formatType == messagePresentationStatus$Discarded.formatType && u890.j(this.discardReason, messagePresentationStatus$Discarded.discardReason);
    }

    public final DiscardReason getDiscardReason() {
        return this.discardReason;
    }

    public final FormatType getFormatType() {
        return this.formatType;
    }

    public String getTriggerPattern() {
        return this.triggerPattern;
    }

    public TriggerType getTriggerType() {
        return this.triggerType;
    }

    public int hashCode() {
        return this.discardReason.hashCode() + ((this.formatType.hashCode() + ((this.triggerType.hashCode() + (this.triggerPattern.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }
}
