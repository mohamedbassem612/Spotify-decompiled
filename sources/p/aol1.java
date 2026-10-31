package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/aol1;", "", "Lp/xzt;", "body", "", "correlationId", "Lp/a0u;", "b", "(Lp/xzt;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lp/ljp0;", "Lp/rih1;", "c", "(Lp/ljp0;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_devicepredictability_internal_devicesuggestionproviderimpl_sources_wheretoplay_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface aol1 {
    static /* synthetic */ Object a(aol1 aol1Var, xzt xztVar, String str, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: recommend");
            return null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return aol1Var.b(xztVar, str, lnmVar);
    }

    @u360({"Content-Type: application/json", "Content-Encoding: identity", "Accept: application/json"})
    @wyq0("where-to-play/v2/recommend")
    Object b(@elb xzt xztVar, @dv50("X-Correlation-Id") String str, lnm<? super a0u> lnmVar);

    @u360({"Content-Type: application/json", "Content-Encoding: identity", "Accept: application/json"})
    @wyq0("where-to-play/v2/observe")
    Object c(@elb ljp0 ljp0Var, lnm<? super rih1> lnmVar);
}
