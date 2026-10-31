package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wna1 implements Function {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ t45 b;
    public final /* synthetic */ VoiceAssistantLoggingContext c;
    public final /* synthetic */ aoa1 d;
    public final /* synthetic */ SpeakeasyDualResponse e;
    public final /* synthetic */ mzr0 f;
    public final /* synthetic */ SearchEndpointRequest g;

    public wna1(Uri uri, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, aoa1 aoa1Var, SpeakeasyDualResponse speakeasyDualResponse, mzr0 mzr0Var, SearchEndpointRequest searchEndpointRequest) {
        this.a = uri;
        this.b = t45Var;
        this.c = voiceAssistantLoggingContext;
        this.d = aoa1Var;
        this.e = speakeasyDualResponse;
        this.f = mzr0Var;
        this.g = searchEndpointRequest;
    }

    public final Object apply(Object obj) {
        CommandPlayResponse commandPlayResponse = (CommandPlayResponse) obj;
        aoa1 aoa1Var = this.d;
        bmk1 bmk1Var = aoa1Var.b;
        HashMap map = aoa1Var.f;
        this.b.g(VoiceAssistantsPerformance.MEASURE_NETWORK_SPEAKEASY);
        String error = commandPlayResponse.getError();
        Uri uri = this.a;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext = this.c;
        if (error == null) {
            SpeakeasyDualResponse.FullSuccessResponse fullSuccessResponseComplete = ((SpeakeasyDualResponse.CanPrepareResponse) this.e).complete(commandPlayResponse);
            gyv0 gyv0Var = (gyv0) map.get(uri);
            if (gyv0Var != null) {
                gyv0Var.c = fullSuccessResponseComplete;
            }
            this.g.getInteractionId();
            return ((lv41) bmk1Var).b(fullSuccessResponseComplete, this.f, voiceAssistantLoggingContext);
        }
        Logger.d("Voice search error - Received error from command/play: %s. uri=%s, interactionId=%s, packageId=%s, requestedUri=%s, userId=%s", new Object[]{commandPlayResponse.getError(), this.a, voiceAssistantLoggingContext.getInteractionId(), voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), voiceAssistantLoggingContext.getUserId()});
        map.remove(uri);
        ((lv41) bmk1Var).c.c(voiceAssistantLoggingContext);
        return CompletableEmpty.a;
    }
}
