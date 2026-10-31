package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.lexicon.dj.v2.GetAvailablePersonasResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/cpu;", "", "Lcom/spotify/lexicon/dj/v1/GetAvailablePersonasResponse;", "b", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/lexicon/dj/v2/GetAvailablePersonasResponse;", "a", "src_main_java_com_spotify_endless_personaimpl-personaimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface cpu {
    @ay30("lexicon-formatlist-provider/v2/dj/available-personas")
    @u360({"Accept: application/x-protobuf"})
    Object a(lnm<? super GetAvailablePersonasResponse> lnmVar);

    @ay30("lexicon-formatlist-provider/v1/dj/available-personas")
    @u360({"Accept: application/x-protobuf"})
    Object b(lnm<? super com.spotify.lexicon.dj.v1.GetAvailablePersonasResponse> lnmVar);
}
