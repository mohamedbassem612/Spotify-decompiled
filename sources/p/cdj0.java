package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cdj0 {
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

    public cdj0(BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
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
        if (!(obj instanceof cdj0)) {
            return false;
        }
        cdj0 cdj0Var = (cdj0) obj;
        return u890.j(this.a, cdj0Var.a) && u890.j(this.b, cdj0Var.b) && u890.j(this.c, cdj0Var.c) && u890.j(this.d, cdj0Var.d) && u890.j(this.e, cdj0Var.e) && u890.j(this.f, cdj0Var.f) && u890.j(this.g, cdj0Var.g) && this.h == cdj0Var.h && this.i == cdj0Var.i;
    }

    public final int hashCode() {
        BackgroundColor backgroundColor = this.a;
        int iHashCode = (backgroundColor == null ? 0 : backgroundColor.hashCode()) * 31;
        AccessoryContent accessoryContent = this.b;
        int iHashCode2 = (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        MessageText messageText = this.c;
        int i = i3a.i(this.d, (iHashCode2 + (messageText == null ? 0 : messageText.hashCode())) * 31, 31);
        Button button = this.e;
        int iHashCode3 = (i + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f;
        int iHashCode4 = (iHashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Disclaimer disclaimer = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode4 + (disclaimer != null ? disclaimer.hashCode() : 0)) * 31)) * 31);
    }
}
