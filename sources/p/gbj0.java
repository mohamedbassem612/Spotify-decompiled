package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gbj0 {
    public final Signifier a;
    public final HeaderContent b;
    public final MessageText c;
    public final BackgroundColor d;
    public final MessageText e;
    public final AccessoryContent f;
    public final Button g;
    public final Button h;
    public final Button i;
    public final Button j;

    public gbj0(Signifier signifier, HeaderContent headerContent, MessageText messageText, BackgroundColor backgroundColor, MessageText messageText2, AccessoryContent accessoryContent, Button button, Button button2, Button button3, Button button4, int i) {
        signifier = (i & 1) != 0 ? null : signifier;
        headerContent = (i & 2) != 0 ? null : headerContent;
        messageText2 = (i & 16) != 0 ? null : messageText2;
        button = (i & 64) != 0 ? null : button;
        button2 = (i & 128) != 0 ? null : button2;
        button3 = (i & 256) != 0 ? null : button3;
        button4 = (i & 512) != 0 ? null : button4;
        this.a = signifier;
        this.b = headerContent;
        this.c = messageText;
        this.d = backgroundColor;
        this.e = messageText2;
        this.f = accessoryContent;
        this.g = button;
        this.h = button2;
        this.i = button3;
        this.j = button4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbj0)) {
            return false;
        }
        gbj0 gbj0Var = (gbj0) obj;
        return u890.j(this.a, gbj0Var.a) && u890.j(this.b, gbj0Var.b) && u890.j(this.c, gbj0Var.c) && u890.j(this.d, gbj0Var.d) && u890.j(this.e, gbj0Var.e) && u890.j(this.f, gbj0Var.f) && u890.j(this.g, gbj0Var.g) && u890.j(this.h, gbj0Var.h) && u890.j(this.i, gbj0Var.i) && u890.j(this.j, gbj0Var.j);
    }

    public final int hashCode() {
        Signifier signifier = this.a;
        int iHashCode = (signifier == null ? 0 : signifier.hashCode()) * 31;
        HeaderContent headerContent = this.b;
        int iHashCode2 = (this.d.hashCode() + i3a.i(this.c, (iHashCode + (headerContent == null ? 0 : headerContent.hashCode())) * 31, 31)) * 31;
        MessageText messageText = this.e;
        int iHashCode3 = (iHashCode2 + (messageText == null ? 0 : messageText.hashCode())) * 31;
        AccessoryContent accessoryContent = this.f;
        int iHashCode4 = (iHashCode3 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.g;
        int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.h;
        int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Button button3 = this.i;
        int iHashCode7 = (iHashCode6 + (button3 == null ? 0 : button3.hashCode())) * 31;
        Button button4 = this.j;
        return iHashCode7 + (button4 != null ? button4.hashCode() : 0);
    }
}
