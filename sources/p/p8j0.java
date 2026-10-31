package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p8j0 extends eyo1 {
    public final HeaderContent c;
    public final AccessoryContent d;
    public final MessageText e;
    public final MessageText f;
    public final Button g;
    public final Button h;
    public final Disclaimer i;

    static {
        Disclaimer.Companion companion = Disclaimer.INSTANCE;
        Button.Companion companion2 = Button.Companion;
        MessageText.Companion companion3 = MessageText.Companion;
        AccessoryContent.Companion companion4 = AccessoryContent.Companion;
        HeaderContent.Companion companion5 = HeaderContent.Companion;
    }

    public p8j0(HeaderContent headerContent, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer) {
        this.c = headerContent;
        this.d = accessoryContent;
        this.e = messageText;
        this.f = messageText2;
        this.g = button;
        this.h = button2;
        this.i = disclaimer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8j0)) {
            return false;
        }
        p8j0 p8j0Var = (p8j0) obj;
        return u890.j(this.c, p8j0Var.c) && u890.j(this.d, p8j0Var.d) && u890.j(this.e, p8j0Var.e) && u890.j(this.f, p8j0Var.f) && u890.j(this.g, p8j0Var.g) && u890.j(this.h, p8j0Var.h) && u890.j(this.i, p8j0Var.i);
    }

    public final int hashCode() {
        HeaderContent headerContent = this.c;
        int iHashCode = (headerContent == null ? 0 : headerContent.hashCode()) * 31;
        AccessoryContent accessoryContent = this.d;
        int i = i3a.i(this.f, i3a.i(this.e, (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31, 31), 31);
        Button button = this.g;
        int iHashCode2 = (i + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.h;
        int iHashCode3 = (iHashCode2 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Disclaimer disclaimer = this.i;
        return iHashCode3 + (disclaimer != null ? disclaimer.hashCode() : 0);
    }
}
