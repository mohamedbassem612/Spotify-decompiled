package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAlignment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vfj0 {
    public final MessageText a;
    public final Header b;
    public final AccessoryContent c;
    public final Button d;
    public final TooltipAlignment e;

    public vfj0(TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button) {
        this.a = messageText;
        this.b = header;
        this.c = accessoryContent;
        this.d = button;
        this.e = tooltipAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfj0)) {
            return false;
        }
        vfj0 vfj0Var = (vfj0) obj;
        return u890.j(this.a, vfj0Var.a) && u890.j(this.b, vfj0Var.b) && u890.j(this.c, vfj0Var.c) && u890.j(this.d, vfj0Var.d) && this.e == vfj0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Header header = this.b;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        AccessoryContent accessoryContent = this.c;
        int iHashCode3 = (iHashCode2 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.d;
        return this.e.hashCode() + ((iHashCode3 + (button != null ? button.hashCode() : 0)) * 31);
    }
}
