package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus;", "", "<init>", "()V", "triggerPattern", "", "getTriggerPattern", "()Ljava/lang/String;", "triggerType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "getTriggerType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "Presented", "PendingPresentation", "Discarded", "Dismissed", "Processing", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Discarded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Dismissed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$PendingPresentation;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Presented;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Processing;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class MessagePresentationStatus {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$PendingPresentation;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus;", "triggerPattern", "", "triggerType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "formatType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;)V", "getTriggerPattern", "()Ljava/lang/String;", "getTriggerType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "getFormatType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class PendingPresentation extends MessagePresentationStatus {
        public static final int $stable = 0;
        private final FormatType formatType;
        private final String triggerPattern;
        private final TriggerType triggerType;

        public PendingPresentation(String str, TriggerType triggerType, FormatType formatType) {
            super(null);
            this.triggerPattern = str;
            this.triggerType = triggerType;
            this.formatType = formatType;
        }

        public static /* synthetic */ PendingPresentation copy$default(PendingPresentation pendingPresentation, String str, TriggerType triggerType, FormatType formatType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingPresentation.triggerPattern;
            }
            if ((i & 2) != 0) {
                triggerType = pendingPresentation.triggerType;
            }
            if ((i & 4) != 0) {
                formatType = pendingPresentation.formatType;
            }
            return pendingPresentation.copy(str, triggerType, formatType);
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

        public final PendingPresentation copy(String triggerPattern, TriggerType triggerType, FormatType formatType) {
            return new PendingPresentation(triggerPattern, triggerType, formatType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingPresentation)) {
                return false;
            }
            PendingPresentation pendingPresentation = (PendingPresentation) other;
            return u890.j(this.triggerPattern, pendingPresentation.triggerPattern) && this.triggerType == pendingPresentation.triggerType && this.formatType == pendingPresentation.formatType;
        }

        public final FormatType getFormatType() {
            return this.formatType;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public String getTriggerPattern() {
            return this.triggerPattern;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public TriggerType getTriggerType() {
            return this.triggerType;
        }

        public int hashCode() {
            return this.formatType.hashCode() + ((this.triggerType.hashCode() + (this.triggerPattern.hashCode() * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Presented;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus;", "triggerPattern", "", "triggerType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "formatType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;)V", "getTriggerPattern", "()Ljava/lang/String;", "getTriggerType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "getFormatType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class Presented extends MessagePresentationStatus {
        public static final int $stable = 0;
        private final FormatType formatType;
        private final String triggerPattern;
        private final TriggerType triggerType;

        public Presented(String str, TriggerType triggerType, FormatType formatType) {
            super(null);
            this.triggerPattern = str;
            this.triggerType = triggerType;
            this.formatType = formatType;
        }

        public static /* synthetic */ Presented copy$default(Presented presented, String str, TriggerType triggerType, FormatType formatType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presented.triggerPattern;
            }
            if ((i & 2) != 0) {
                triggerType = presented.triggerType;
            }
            if ((i & 4) != 0) {
                formatType = presented.formatType;
            }
            return presented.copy(str, triggerType, formatType);
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

        public final Presented copy(String triggerPattern, TriggerType triggerType, FormatType formatType) {
            return new Presented(triggerPattern, triggerType, formatType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Presented)) {
                return false;
            }
            Presented presented = (Presented) other;
            return u890.j(this.triggerPattern, presented.triggerPattern) && this.triggerType == presented.triggerType && this.formatType == presented.formatType;
        }

        public final FormatType getFormatType() {
            return this.formatType;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public String getTriggerPattern() {
            return this.triggerPattern;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public TriggerType getTriggerType() {
            return this.triggerType;
        }

        public int hashCode() {
            return this.formatType.hashCode() + ((this.triggerType.hashCode() + (this.triggerPattern.hashCode() * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus$Processing;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessagePresentationStatus;", "triggerPattern", "", "triggerType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;)V", "getTriggerPattern", "()Ljava/lang/String;", "getTriggerType", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class Processing extends MessagePresentationStatus {
        public static final int $stable = 0;
        private final String triggerPattern;
        private final TriggerType triggerType;

        public Processing(String str, TriggerType triggerType) {
            super(null);
            this.triggerPattern = str;
            this.triggerType = triggerType;
        }

        public static /* synthetic */ Processing copy$default(Processing processing, String str, TriggerType triggerType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processing.triggerPattern;
            }
            if ((i & 2) != 0) {
                triggerType = processing.triggerType;
            }
            return processing.copy(str, triggerType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTriggerPattern() {
            return this.triggerPattern;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TriggerType getTriggerType() {
            return this.triggerType;
        }

        public final Processing copy(String triggerPattern, TriggerType triggerType) {
            return new Processing(triggerPattern, triggerType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Processing)) {
                return false;
            }
            Processing processing = (Processing) other;
            return u890.j(this.triggerPattern, processing.triggerPattern) && this.triggerType == processing.triggerType;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public String getTriggerPattern() {
            return this.triggerPattern;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus
        public TriggerType getTriggerType() {
            return this.triggerType;
        }

        public int hashCode() {
            return this.triggerType.hashCode() + (this.triggerPattern.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ MessagePresentationStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getTriggerPattern();

    public abstract TriggerType getTriggerType();

    private MessagePresentationStatus() {
    }
}
