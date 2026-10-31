package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q8j0 extends eyo1 {
    public final String c;
    public final String d;
    public final Button e;
    public final Button f;

    static {
        Button.Companion companion = Button.Companion;
    }

    public q8j0(String str, String str2, Button button, Button button2) {
        this.c = str;
        this.d = str2;
        this.e = button;
        this.f = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8j0)) {
            return false;
        }
        q8j0 q8j0Var = (q8j0) obj;
        return u890.j(this.c, q8j0Var.c) && u890.j(this.d, q8j0Var.d) && u890.j(this.e, q8j0Var.e) && u890.j(this.f, q8j0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        Button button = this.e;
        int iHashCode = (iD + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f;
        return iHashCode + (button2 != null ? button2.hashCode() : 0);
    }
}
