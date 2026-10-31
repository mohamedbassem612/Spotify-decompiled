package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zaj0 {
    public final BackgroundColor a;
    public final AccessoryContent b;
    public final MessageText c;
    public final MessageText d;
    public final Button e;
    public final Button f;
    public final Disclaimer g;
    public final AccessoryContentSize h;
    public final ContentAlignment i;

    static {
        Disclaimer.Companion companion = Disclaimer.INSTANCE;
        Button.Companion companion2 = Button.Companion;
        MessageText.Companion companion3 = MessageText.Companion;
        AccessoryContent.Companion companion4 = AccessoryContent.Companion;
        BackgroundColor.Companion companion5 = BackgroundColor.Companion;
    }

    public zaj0(BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
        this.a = backgroundColor;
        this.b = accessoryContent;
        this.c = messageText;
        this.d = messageText2;
        this.e = button;
        this.f = button2;
        this.g = disclaimer;
        this.h = accessoryContentSize;
        this.i = contentAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaj0)) {
            return false;
        }
        zaj0 zaj0Var = (zaj0) obj;
        return u890.j(this.a, zaj0Var.a) && u890.j(this.b, zaj0Var.b) && u890.j(this.c, zaj0Var.c) && u890.j(this.d, zaj0Var.d) && u890.j(this.e, zaj0Var.e) && u890.j(this.f, zaj0Var.f) && u890.j(this.g, zaj0Var.g) && this.h == zaj0Var.h && this.i == zaj0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        AccessoryContent accessoryContent = this.b;
        int iHashCode2 = (this.e.hashCode() + i3a.i(this.d, i3a.i(this.c, (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31, 31), 31)) * 31;
        Button button = this.f;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Disclaimer disclaimer = this.g;
        int iHashCode4 = disclaimer != null ? disclaimer.hashCode() : 0;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }
}
