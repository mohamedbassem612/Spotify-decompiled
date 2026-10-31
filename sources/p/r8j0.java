package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8j0 extends eyo1 {
    public final String c;
    public final String d;
    public final AccessoryImage e;
    public final Button f;
    public final Button g;

    static {
        Button.Companion companion = Button.Companion;
        AccessoryImage.Companion companion2 = AccessoryImage.Companion;
    }

    public r8j0(String str, String str2, AccessoryImage accessoryImage, Button button, Button button2) {
        this.c = str;
        this.d = str2;
        this.e = accessoryImage;
        this.f = button;
        this.g = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8j0)) {
            return false;
        }
        r8j0 r8j0Var = (r8j0) obj;
        return u890.j(this.c, r8j0Var.c) && u890.j(this.d, r8j0Var.d) && this.e.equals(r8j0Var.e) && u890.j(this.f, r8j0Var.f) && u890.j(this.g, r8j0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d)) * 31;
        Button button = this.f;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.g;
        return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
    }
}
