package p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponse;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yna1 implements Function {
    public static final yna1 a = new yna1();

    public final Object apply(Object obj) {
        SearchEndpointResponse searchEndpointResponse = (SearchEndpointResponse) obj;
        String action = searchEndpointResponse.getAction();
        return (!u890.j(searchEndpointResponse.getResult(), SearchEndpointResponseKt.RESULT_SUCCESS) || action == null) ? new SpeakeasyDualResponse.FailedResponse(searchEndpointResponse.getResult(), searchEndpointResponse, searchEndpointResponse.getError()) : new SpeakeasyDualResponse.CanPrepareResponse.PartialResponse(action, searchEndpointResponse);
    }
}
