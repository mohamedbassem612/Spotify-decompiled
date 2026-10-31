package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.AnchorViewType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipArrowDirection;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Text;
import com.spotify.pendragon.v1.proto.Tooltip;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q4f1 implements iu30 {
    public final da a;
    public final li b;
    public final da c;
    public final ryq d;

    public q4f1(da daVar, da daVar2, li liVar, ryq ryqVar) {
        this.a = daVar;
        this.b = liVar;
        this.c = daVar2;
        this.d = ryqVar;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        AccessoryContent accessoryContent;
        Header header;
        TooltipArrowDirection tooltipArrowDirection;
        Tooltip tooltip = (Tooltip) obj;
        int iT = tooltip.t();
        if ((iT == 0 ? -1 : p4f1.a[l1d.C(iT)]) != 1) {
            throw new MessageParsingException(g4j0.e);
        }
        int iOrdinal = tooltip.r().o().ordinal();
        TooltipAlignment tooltipAlignment = (iOrdinal == 1 || iOrdinal != 2) ? TooltipAlignment.HORIZONTAL : TooltipAlignment.STACKED_VERTICAL;
        TooltipAlignment tooltipAlignment2 = tooltipAlignment;
        Text textS = tooltip.r().s();
        textS.getClass();
        MessageText messageText = (MessageText) this.d.invoke(textS);
        Button button = null;
        if (tooltip.r().t()) {
            accessoryContent = (AccessoryContent) this.b.invoke(tooltip.r().n());
        } else {
            accessoryContent = null;
        }
        if (tooltip.r().v()) {
            header = (Header) this.c.invoke(tooltip.r().r());
        } else {
            header = null;
        }
        if (tooltip.r().u()) {
            button = (Button) this.a.invoke(tooltip.r().p());
        }
        TooltipTemplate.BaseTooltip baseTooltip = new TooltipTemplate.BaseTooltip(tooltipAlignment2, messageText, accessoryContent, header, button);
        TooltipAnchorView.Type type = p4f1.b[tooltip.o().ordinal()] == 1 ? new TooltipAnchorView.Type(AnchorViewType.CONNECT_BUTTON) : new TooltipAnchorView.Type(AnchorViewType.UNKNOWN);
        int iOrdinal2 = tooltip.p().ordinal();
        if (iOrdinal2 == 1) {
            tooltipArrowDirection = TooltipArrowDirection.TOP;
        } else if (iOrdinal2 == 2) {
            tooltipArrowDirection = TooltipArrowDirection.BOTTOM;
        } else if (iOrdinal2 != 3) {
            tooltipArrowDirection = iOrdinal2 != 4 ? TooltipArrowDirection.BOTTOM : TooltipArrowDirection.TRAILING;
        } else {
            tooltipArrowDirection = TooltipArrowDirection.LEADING;
        }
        return new Format.Tooltip(baseTooltip, type, tooltipArrowDirection, tooltip.q());
    }
}
