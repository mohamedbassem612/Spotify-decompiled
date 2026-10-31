package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.AnchorViewType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipArrowDirection;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"emptyModal", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;", "emptyFullscreen", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;", "emptyBanner", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;", "emptyTooltip", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "emptySnackBar", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;", "emptyBottomSheet", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;", "emptyInlineCard", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 2, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class FormatKt {
    public static final Format.Banner emptyBanner() {
        return new Format.Banner(BannerTemplate.Undefined.INSTANCE);
    }

    public static final Format.BottomSheet emptyBottomSheet() {
        return new Format.BottomSheet(BottomSheetTemplate.Undefined.INSTANCE);
    }

    public static final Format.Fullscreen emptyFullscreen() {
        return new Format.Fullscreen(FullscreenTemplate.Undefined.INSTANCE);
    }

    public static final Format.InlineCard emptyInlineCard() {
        return new Format.InlineCard(InlineCardTemplate.Undefined.INSTANCE);
    }

    public static final Format.Modal emptyModal() {
        return new Format.Modal(ModalTemplate.Undefined.INSTANCE);
    }

    public static final Format.SnackBar emptySnackBar() {
        return new Format.SnackBar(SnackBarTemplate.Undefined.INSTANCE, false, 2, (DefaultConstructorMarker) null);
    }

    public static final Format.Tooltip emptyTooltip() {
        return new Format.Tooltip(TooltipTemplate.Undefined.INSTANCE, new TooltipAnchorView.Type(AnchorViewType.UNKNOWN), (TooltipArrowDirection) null, 0L, 12, (DefaultConstructorMarker) null);
    }
}
