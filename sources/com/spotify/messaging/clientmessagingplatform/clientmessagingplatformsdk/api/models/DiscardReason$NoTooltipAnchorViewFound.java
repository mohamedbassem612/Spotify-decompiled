package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason$NoTooltipAnchorViewFound;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "activityName", "", "anchorView", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityName", "()Ljava/lang/String;", "getAnchorView", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class DiscardReason$NoTooltipAnchorViewFound extends DiscardReason {
    public static final int $stable = 0;
    private final String activityName;
    private final String anchorView;

    public DiscardReason$NoTooltipAnchorViewFound(String str, String str2) {
        super((DefaultConstructorMarker) null);
        this.activityName = str;
        this.anchorView = str2;
    }

    public static /* synthetic */ DiscardReason$NoTooltipAnchorViewFound copy$default(DiscardReason$NoTooltipAnchorViewFound discardReason$NoTooltipAnchorViewFound, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discardReason$NoTooltipAnchorViewFound.activityName;
        }
        if ((i & 2) != 0) {
            str2 = discardReason$NoTooltipAnchorViewFound.anchorView;
        }
        return discardReason$NoTooltipAnchorViewFound.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnchorView() {
        return this.anchorView;
    }

    public final DiscardReason$NoTooltipAnchorViewFound copy(String activityName, String anchorView) {
        return new DiscardReason$NoTooltipAnchorViewFound(activityName, anchorView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscardReason$NoTooltipAnchorViewFound)) {
            return false;
        }
        DiscardReason$NoTooltipAnchorViewFound discardReason$NoTooltipAnchorViewFound = (DiscardReason$NoTooltipAnchorViewFound) other;
        return u890.j(this.activityName, discardReason$NoTooltipAnchorViewFound.activityName) && u890.j(this.anchorView, discardReason$NoTooltipAnchorViewFound.anchorView);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getAnchorView() {
        return this.anchorView;
    }

    public int hashCode() {
        return this.anchorView.hashCode() + (this.activityName.hashCode() * 31);
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }
}
