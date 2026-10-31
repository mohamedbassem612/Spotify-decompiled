package p;

import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.aipartner.aipartnerapiwrapper.events.proto.PartnerAIResolveIntentError;
import com.spotify.devicepredictability.googledevicesuggestionsimpl.events.proto.DevicePredictabilityIntentEngineError;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class by40 {
    public final t2j0 a;

    public void a(String str) {
        kut kutVarN = DevicePredictabilityIntentEngineError.n();
        kutVarN.n(str);
        this.a.a(kutVarN.build());
    }

    public void b(ResolveIntentRequest resolveIntentRequest, Throwable th) {
        String strName = resolveIntentRequest.o().q().name();
        String prompt = resolveIntentRequest.p().getPrompt();
        String strQ = resolveIntentRequest.q();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error occurred";
        }
        k0s0 k0s0VarN = PartnerAIResolveIntentError.n();
        k0s0VarN.t(strQ);
        k0s0VarN.q(strName);
        k0s0VarN.r(message);
        k0s0VarN.s(prompt);
        if (th instanceof HttpException) {
            k0s0VarN.n(((HttpException) th).a);
        }
        this.a.a(k0s0VarN.build());
    }
}
