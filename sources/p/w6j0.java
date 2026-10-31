package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6j0 extends x6j0 {
    public final MessageResponseToken a;
    public final String b;
    public final String c;
    public final String d;

    static {
        int i = MessageResponseToken.$stable;
    }

    public w6j0(MessageResponseToken messageResponseToken, String str, String str2, String str3) {
        this.a = messageResponseToken;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6j0)) {
            return false;
        }
        w6j0 w6j0Var = (w6j0) obj;
        return u890.j(this.a, w6j0Var.a) && u890.j(this.b, w6j0Var.b) && u890.j(this.c, w6j0Var.c) && u890.j(this.d, w6j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
