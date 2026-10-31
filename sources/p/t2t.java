package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/t2t;", "", "Lp/t8h0;", "request", "Lp/v8h0;", "a", "(Lp/t8h0;Lp/lnm;)Ljava/lang/Object;", "Lp/z8h0;", "Lp/rih1;", "b", "(Lp/z8h0;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_deeplink_deferreddeeplink-deferreddeeplink"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface t2t {
    @wyq0("url-dispenser/v1/match")
    Object a(@elb t8h0 t8h0Var, lnm<? super v8h0> lnmVar);

    @wyq0("url-dispenser/v1/match-result")
    Object b(@elb z8h0 z8h0Var, lnm<? super rih1> lnmVar);
}
