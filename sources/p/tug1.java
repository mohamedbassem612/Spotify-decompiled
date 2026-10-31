package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tug1 {
    public final String a;
    public final long b;
    public final Message c;

    static {
        Message.Companion companion = Message.INSTANCE;
    }

    public tug1(String str, long j, Message message) {
        this.a = str;
        this.b = j;
        this.c = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tug1)) {
            return false;
        }
        tug1 tug1Var = (tug1) obj;
        return u890.j(this.a, tug1Var.a) && this.b == tug1Var.b && u890.j(this.c, tug1Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        Message message = this.c;
        return iF + (message == null ? 0 : message.hashCode());
    }
}
