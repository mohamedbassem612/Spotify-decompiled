package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.Alignment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g8j0 {
    public final Alignment a;
    public final Signifier b;
    public final HeaderContent c;
    public final AccessoryContent d;
    public final BackgroundColor e;
    public final MessageText f;
    public final MessageText g;
    public final Button h;
    public final Button i;
    public final Button j;
    public final Button k;
    public final Disclaimer l;

    public g8j0(Alignment alignment, Signifier signifier, HeaderContent headerContent, AccessoryContent accessoryContent, BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer, int i) {
        alignment = (i & 1) != 0 ? null : alignment;
        signifier = (i & 2) != 0 ? null : signifier;
        headerContent = (i & 4) != 0 ? null : headerContent;
        accessoryContent = (i & 8) != 0 ? null : accessoryContent;
        button4 = (i & 1024) != 0 ? null : button4;
        disclaimer = (i & 2048) != 0 ? null : disclaimer;
        this.a = alignment;
        this.b = signifier;
        this.c = headerContent;
        this.d = accessoryContent;
        this.e = backgroundColor;
        this.f = messageText;
        this.g = messageText2;
        this.h = button;
        this.i = button2;
        this.j = button3;
        this.k = button4;
        this.l = disclaimer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8j0)) {
            return false;
        }
        g8j0 g8j0Var = (g8j0) obj;
        return this.a == g8j0Var.a && u890.j(this.b, g8j0Var.b) && u890.j(this.c, g8j0Var.c) && u890.j(this.d, g8j0Var.d) && u890.j(this.e, g8j0Var.e) && u890.j(this.f, g8j0Var.f) && u890.j(this.g, g8j0Var.g) && u890.j(this.h, g8j0Var.h) && u890.j(this.i, g8j0Var.i) && u890.j(this.j, g8j0Var.j) && u890.j(this.k, g8j0Var.k) && u890.j(this.l, g8j0Var.l);
    }

    public final int hashCode() {
        Alignment alignment = this.a;
        int iHashCode = (alignment == null ? 0 : alignment.hashCode()) * 31;
        Signifier signifier = this.b;
        int iHashCode2 = (iHashCode + (signifier == null ? 0 : signifier.hashCode())) * 31;
        HeaderContent headerContent = this.c;
        int iHashCode3 = (iHashCode2 + (headerContent == null ? 0 : headerContent.hashCode())) * 31;
        AccessoryContent accessoryContent = this.d;
        int iHashCode4 = (iHashCode3 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        BackgroundColor backgroundColor = this.e;
        int i = i3a.i(this.g, i3a.i(this.f, (iHashCode4 + (backgroundColor == null ? 0 : backgroundColor.hashCode())) * 31, 31), 31);
        Button button = this.h;
        int iHashCode5 = (i + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.i;
        int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Button button3 = this.j;
        int iHashCode7 = (iHashCode6 + (button3 == null ? 0 : button3.hashCode())) * 31;
        Button button4 = this.k;
        int iHashCode8 = (iHashCode7 + (button4 == null ? 0 : button4.hashCode())) * 31;
        Disclaimer disclaimer = this.l;
        return iHashCode8 + (disclaimer != null ? disclaimer.hashCode() : 0);
    }
}
