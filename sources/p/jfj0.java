package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jfj0 {
    public final MessageResponseToken a;
    public final boolean b;
    public final boolean c;
    public final Set d;

    public jfj0(MessageResponseToken messageResponseToken, boolean z, boolean z2, Set set) {
        this.a = messageResponseToken;
        this.b = z;
        this.c = z2;
        this.d = set;
    }

    public static jfj0 a(jfj0 jfj0Var, MessageResponseToken messageResponseToken, boolean z, Set set, int i) {
        if ((i & 1) != 0) {
            messageResponseToken = jfj0Var.a;
        }
        if ((i & 2) != 0) {
            z = jfj0Var.b;
        }
        boolean z2 = (i & 4) != 0 ? jfj0Var.c : false;
        if ((i & 8) != 0) {
            set = jfj0Var.d;
        }
        return new jfj0(messageResponseToken, z, z2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj0)) {
            return false;
        }
        jfj0 jfj0Var = (jfj0) obj;
        return u890.j(this.a, jfj0Var.a) && this.b == jfj0Var.b && this.c == jfj0Var.c && u890.j(this.d, jfj0Var.d);
    }

    public final int hashCode() {
        MessageResponseToken messageResponseToken = this.a;
        int iG = xcg1.g(xcg1.g((messageResponseToken == null ? 0 : messageResponseToken.hashCode()) * 31, 31, this.b), 31, this.c);
        Set set = this.d;
        return iG + (set != null ? set.hashCode() : 0);
    }
}
