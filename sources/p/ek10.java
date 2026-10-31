package p;

import com.spotify.fanevents.v1.VerifyRedemptionCodeRequest;
import com.spotify.fanevents.v1.VerifyRedemptionCodeResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/ek10;", "", "Lcom/spotify/fanevents/v1/VerifyRedemptionCodeRequest;", "request", "Lcom/spotify/fanevents/v1/VerifyRedemptionCodeResponse;", "a", "(Lcom/spotify/fanevents/v1/VerifyRedemptionCodeRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_culturalmoments_faneventredemption-faneventredemption"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ek10 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("fan-events/spotify.fanevents.v1.FanEventsService/VerifyRedemptionCode")
    Object a(@elb VerifyRedemptionCodeRequest verifyRedemptionCodeRequest, lnm<? super VerifyRedemptionCodeResponse> lnmVar);
}
