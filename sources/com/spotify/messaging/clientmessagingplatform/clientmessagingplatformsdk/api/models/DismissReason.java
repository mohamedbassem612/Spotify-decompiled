package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "", "<init>", "()V", "MessageButtonTapped", "WebViewMessageNavigatedToCloseUrl", "BackgroundViewTapped", "MessageSwiped", "ProgrammaticDismissal", "FooterTapped", "ContextChanged", "MessageContentTapped", "BackButtonTapped", "AutoDismissingMessageTimerElapsed", "WebViewCloseBarButtonItemTapped", "SurfaceOvertakenOrBackgrounded", "SessionEnded", "MessageCleanup", "UserLoggingOut", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$AutoDismissingMessageTimerElapsed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$BackButtonTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$BackgroundViewTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$ContextChanged;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$FooterTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageButtonTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageCleanup;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageContentTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageSwiped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$ProgrammaticDismissal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$SessionEnded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$SurfaceOvertakenOrBackgrounded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$UserLoggingOut;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$WebViewCloseBarButtonItemTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$WebViewMessageNavigatedToCloseUrl;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public abstract class DismissReason {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$AutoDismissingMessageTimerElapsed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class AutoDismissingMessageTimerElapsed extends DismissReason {
        public static final int $stable = 0;
        public static final AutoDismissingMessageTimerElapsed INSTANCE = new AutoDismissingMessageTimerElapsed();

        private AutoDismissingMessageTimerElapsed() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$BackButtonTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class BackButtonTapped extends DismissReason {
        public static final int $stable = 0;
        public static final BackButtonTapped INSTANCE = new BackButtonTapped();

        private BackButtonTapped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$BackgroundViewTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class BackgroundViewTapped extends DismissReason {
        public static final int $stable = 0;
        public static final BackgroundViewTapped INSTANCE = new BackgroundViewTapped();

        private BackgroundViewTapped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$ContextChanged;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class ContextChanged extends DismissReason {
        public static final int $stable = 0;
        public static final ContextChanged INSTANCE = new ContextChanged();

        private ContextChanged() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$FooterTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class FooterTapped extends DismissReason {
        public static final int $stable = 0;
        public static final FooterTapped INSTANCE = new FooterTapped();

        private FooterTapped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageButtonTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "button", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "getButton", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final /* data */ class MessageButtonTapped extends DismissReason {
        public static final int $stable = 0;
        private final Button button;

        public MessageButtonTapped(Button button) {
            super(null);
            this.button = button;
        }

        public static /* synthetic */ MessageButtonTapped copy$default(MessageButtonTapped messageButtonTapped, Button button, int i, Object obj) {
            if ((i & 1) != 0) {
                button = messageButtonTapped.button;
            }
            return messageButtonTapped.copy(button);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        public final MessageButtonTapped copy(Button button) {
            return new MessageButtonTapped(button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageButtonTapped) && u890.j(this.button, ((MessageButtonTapped) other).button);
        }

        public final Button getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageCleanup;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class MessageCleanup extends DismissReason {
        public static final int $stable = 0;
        public static final MessageCleanup INSTANCE = new MessageCleanup();

        private MessageCleanup() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageContentTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class MessageContentTapped extends DismissReason {
        public static final int $stable = 0;
        public static final MessageContentTapped INSTANCE = new MessageContentTapped();

        private MessageContentTapped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$MessageSwiped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class MessageSwiped extends DismissReason {
        public static final int $stable = 0;
        public static final MessageSwiped INSTANCE = new MessageSwiped();

        private MessageSwiped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$ProgrammaticDismissal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class ProgrammaticDismissal extends DismissReason {
        public static final int $stable = 0;
        public static final ProgrammaticDismissal INSTANCE = new ProgrammaticDismissal();

        private ProgrammaticDismissal() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$SessionEnded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class SessionEnded extends DismissReason {
        public static final int $stable = 0;
        public static final SessionEnded INSTANCE = new SessionEnded();

        private SessionEnded() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$SurfaceOvertakenOrBackgrounded;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class SurfaceOvertakenOrBackgrounded extends DismissReason {
        public static final int $stable = 0;
        public static final SurfaceOvertakenOrBackgrounded INSTANCE = new SurfaceOvertakenOrBackgrounded();

        private SurfaceOvertakenOrBackgrounded() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$UserLoggingOut;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class UserLoggingOut extends DismissReason {
        public static final int $stable = 0;
        public static final UserLoggingOut INSTANCE = new UserLoggingOut();

        private UserLoggingOut() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$WebViewCloseBarButtonItemTapped;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class WebViewCloseBarButtonItemTapped extends DismissReason {
        public static final int $stable = 0;
        public static final WebViewCloseBarButtonItemTapped INSTANCE = new WebViewCloseBarButtonItemTapped();

        private WebViewCloseBarButtonItemTapped() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason$WebViewMessageNavigatedToCloseUrl;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final /* data */ class WebViewMessageNavigatedToCloseUrl extends DismissReason {
        public static final int $stable = 0;
        private final String url;

        public WebViewMessageNavigatedToCloseUrl(String str) {
            super(null);
            this.url = str;
        }

        public static /* synthetic */ WebViewMessageNavigatedToCloseUrl copy$default(WebViewMessageNavigatedToCloseUrl webViewMessageNavigatedToCloseUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewMessageNavigatedToCloseUrl.url;
            }
            return webViewMessageNavigatedToCloseUrl.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final WebViewMessageNavigatedToCloseUrl copy(String url) {
            return new WebViewMessageNavigatedToCloseUrl(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WebViewMessageNavigatedToCloseUrl) && u890.j(this.url, ((WebViewMessageNavigatedToCloseUrl) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ DismissReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DismissReason() {
    }
}
