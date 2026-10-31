package p;

import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesRequest;
import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/nx3;", "", "Lcom/spotify/liveroom/listeningparty/proto/GetAllowedFeaturesRequest;", "request", "Lcom/spotify/liveroom/listeningparty/proto/GetAllowedFeaturesResponse;", "a", "(Lcom/spotify/liveroom/listeningparty/proto/GetAllowedFeaturesRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_liveroom_listeningparty_allowedfeatures-allowedfeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface nx3 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("party-orchestra/spotify.party.orchestra.v1.UserService/GetAllowedFeatures")
    Object a(@elb GetAllowedFeaturesRequest getAllowedFeaturesRequest, lnm<? super GetAllowedFeaturesResponse> lnmVar);
}
