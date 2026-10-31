package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ic90 implements ty31 {
    public final ty31 a;

    public ic90(ty31 ty31Var) {
        this.a = ty31Var;
    }

    @Override // p.ty31
    public final rqg0 a(Message message, gmc gmcVar, klc klcVar) {
        return this.a.a(message, gmcVar, klcVar) instanceof vy31 ? new wy31() : vy31.f;
    }

    @Override // p.ty31
    public final void dispose() {
        this.a.dispose();
    }
}
