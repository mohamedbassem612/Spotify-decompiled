package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kfj0 {
    public final Header a;
    public final MessageText b;
    public final AccessoryContent c;
    public final Button d;
    public final Button e;

    public kfj0(Header header, MessageText messageText, AccessoryContent accessoryContent, Button button, Button button2) {
        this.a = header;
        this.b = messageText;
        this.c = accessoryContent;
        this.d = button;
        this.e = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfj0)) {
            return false;
        }
        kfj0 kfj0Var = (kfj0) obj;
        return u890.j(this.a, kfj0Var.a) && u890.j(this.b, kfj0Var.b) && u890.j(this.c, kfj0Var.c) && u890.j(this.d, kfj0Var.d) && u890.j(this.e, kfj0Var.e);
    }

    public final int hashCode() {
        Header header = this.a;
        int i = i3a.i(this.b, (header == null ? 0 : header.hashCode()) * 31, 31);
        AccessoryContent accessoryContent = this.c;
        int iHashCode = (i + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.d;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.e;
        return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
    }
}
