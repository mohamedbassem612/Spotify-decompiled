package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qgj0 {
    public final MessageResponseToken a;
    public final String b;
    public final List c;
    public final boolean d;

    public qgj0(MessageResponseToken messageResponseToken, String str, List list, boolean z) {
        this.a = messageResponseToken;
        this.b = str;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj0)) {
            return false;
        }
        qgj0 qgj0Var = (qgj0) obj;
        return u890.j(this.a, qgj0Var.a) && u890.j(this.b, qgj0Var.b) && u890.j(this.c, qgj0Var.c) && this.d == qgj0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
