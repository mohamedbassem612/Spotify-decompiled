package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "", "<init>", "()V", "MessageExpired", "ParsingFailed", "ClientMessagingPlatformNotEnabled", "RequestTimedOut", "ServiceStopped", "MessageNotFound", "AppBackgrounded", "ContextSwitched", "UserLoggingOut", "CarConnected", "AdStartedPlaying", "AppIsOffline", "NowPlayingViewPresenting", "InlineCardIncorrectTriggerType", "ConflictingMessagePresenting", "DynamicTagResolutionFailed", "PresentationFailed", "DataMalformed", "InvalidClickActionIdentifier", "RequestAlreadyProcessing", "BackendError", "NoContainerFound", "NoTooltipAnchorViewFound", "RequestDismissedConflictingPresentedMessage", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$AdStartedPlaying;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$AppBackgrounded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$AppIsOffline;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$BackendError;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$CarConnected;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ClientMessagingPlatformNotEnabled;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ConflictingMessagePresenting;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ContextSwitched;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$DataMalformed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$DynamicTagResolutionFailed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$InlineCardIncorrectTriggerType;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$InvalidClickActionIdentifier;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$MessageExpired;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$MessageNotFound;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$NoContainerFound;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$NoTooltipAnchorViewFound;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$NowPlayingViewPresenting;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ParsingFailed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$PresentationFailed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$RequestAlreadyProcessing;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$RequestDismissedConflictingPresentedMessage;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$RequestTimedOut;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ServiceStopped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$UserLoggingOut;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class DiscardReason {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$ContextSwitched;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class ContextSwitched extends DiscardReason {
        public static final int $stable = 0;
        public static final ContextSwitched INSTANCE = new ContextSwitched();

        private ContextSwitched() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$MessageNotFound;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class MessageNotFound extends DiscardReason {
        public static final int $stable = 0;
        public static final MessageNotFound INSTANCE = new MessageNotFound();

        private MessageNotFound() {
            super(null);
        }
    }

    public /* synthetic */ DiscardReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DiscardReason() {
    }
}
