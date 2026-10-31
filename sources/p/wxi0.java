package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wxi0 {
    public final hhy0 a;

    public wxi0() {
        int i = ghy0.a;
        kl1 kl1Var = j761.a;
        this.a = new hhy0();
    }

    public final Message a(byte[] bArr) {
        if (bArr != null) {
            try {
                hhy0 hhy0Var = this.a;
                nma0 nma0VarSerializer = Message.INSTANCE.serializer();
                return (Message) new wiy0(hhy0Var, new yiy0(new pyp0(bArr)), nma0VarSerializer.getDescriptor()).V0(nma0VarSerializer, null);
            } catch (Exception e) {
                Logger.d(l1d.m("ClientMessagingPlatform: Error decoding message: ", e.getMessage()), new Object[0]);
            }
        }
        return null;
    }
}
