package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s8j0 extends eyo1 {
    public final Signifier c;
    public final AccessoryImage d;
    public final String e;
    public final String f;
    public final Button g;
    public final Button h;

    static {
        Button.Companion companion = Button.Companion;
        AccessoryImage.Companion companion2 = AccessoryImage.Companion;
        Signifier.Companion companion3 = Signifier.Companion;
    }

    public s8j0(Signifier signifier, AccessoryImage accessoryImage, String str, String str2, Button button, Button button2) {
        this.c = signifier;
        this.d = accessoryImage;
        this.e = str;
        this.f = str2;
        this.g = button;
        this.h = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8j0)) {
            return false;
        }
        s8j0 s8j0Var = (s8j0) obj;
        return u890.j(this.c, s8j0Var.c) && u890.j(this.d, s8j0Var.d) && u890.j(this.e, s8j0Var.e) && u890.j(this.f, s8j0Var.f) && u890.j(this.g, s8j0Var.g) && u890.j(this.h, s8j0Var.h);
    }

    public final int hashCode() {
        Signifier signifier = this.c;
        int iHashCode = (signifier == null ? 0 : signifier.hashCode()) * 31;
        AccessoryImage accessoryImage = this.d;
        int iD = cy30.d(cy30.d((iHashCode + (accessoryImage == null ? 0 : accessoryImage.hashCode())) * 31, 31, this.e), 31, this.f);
        Button button = this.g;
        int iHashCode2 = (iD + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.h;
        return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
    }
}
