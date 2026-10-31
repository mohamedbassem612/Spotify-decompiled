package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ljc implements kjc {
    public final MobiusLoop.Builder a;
    public final gx5 b;
    public final ifl1 c;
    public final yqg d;
    public final gjc e;
    public final vlc f;
    public final ric g;
    public final kly0 h;
    public final kly0 i;
    public final llm j;
    public MobiusLoop k;

    public ljc(MobiusLoop.Builder builder, gx5 gx5Var, ifl1 ifl1Var, yqg yqgVar, gjc gjcVar, vlc vlcVar, ric ricVar, dsp dspVar, dsp dspVar2, q8n q8nVar) {
        this.a = builder;
        this.b = gx5Var;
        this.c = ifl1Var;
        this.d = yqgVar;
        this.e = gjcVar;
        this.f = vlcVar;
        this.g = ricVar;
        this.h = dspVar;
        this.i = dspVar2;
        this.j = smo1.e(ha71.A(guo1.B(), q8nVar).y(new v62((byte) 2)));
    }

    public final void a(gmc gmcVar, LoggingData loggingData) {
        gjc gjcVar = this.e;
        if (loggingData == null) {
            gjcVar.b(yhm0.q(gmcVar), DiscardReason.ServiceStopped.INSTANCE);
        } else {
            gjcVar.a(yhm0.q(gmcVar), loggingData, DiscardReason.ServiceStopped.INSTANCE);
        }
    }
}
