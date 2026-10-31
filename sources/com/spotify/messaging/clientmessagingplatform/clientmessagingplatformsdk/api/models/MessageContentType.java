package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType;", "", "<init>", "()V", "Html", "Native", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType$Html;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType$Native;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public abstract class MessageContentType {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType$Html;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType;", "html", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;)V", "getHtml", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final /* data */ class Html extends MessageContentType {
        public static final int $stable = 0;
        private final com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html html;

        public Html(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html html) {
            super(null);
            this.html = html;
        }

        public static /* synthetic */ Html copy$default(Html html, com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html html2, int i, Object obj) {
            if ((i & 1) != 0) {
                html2 = html.html;
            }
            return html.copy(html2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html getHtml() {
            return this.html;
        }

        public final Html copy(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html html) {
            return new Html(html);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Html) && u890.j(this.html, ((Html) other).html);
        }

        public final com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html getHtml() {
            return this.html;
        }

        public int hashCode() {
            return this.html.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType$Native;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageContentType;", "format", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;)V", "getFormat", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final /* data */ class Native extends MessageContentType {
        public static final int $stable = 0;
        private final Format format;

        public Native(Format format) {
            super(null);
            this.format = format;
        }

        public static /* synthetic */ Native copy$default(Native r0, Format format, int i, Object obj) {
            if ((i & 1) != 0) {
                format = r0.format;
            }
            return r0.copy(format);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Format getFormat() {
            return this.format;
        }

        public final Native copy(Format format) {
            return new Native(format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Native) && u890.j(this.format, ((Native) other).format);
        }

        public final Format getFormat() {
            return this.format;
        }

        public int hashCode() {
            return this.format.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ MessageContentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessageContentType() {
    }
}
