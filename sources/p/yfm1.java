package p;

import com.spotify.wrapped.v1.proto.ConsumerShareRequest;
import com.spotify.wrapped.v1.proto.ShareAssetResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/yfm1;", "", "Lcom/spotify/wrapped/v1/proto/ConsumerShareRequest;", "shareRequest", "", "overrideImage", "", "dataOverridePartial", "Lcom/spotify/wrapped/v1/proto/ShareAssetResponse;", "b", "(Lcom/spotify/wrapped/v1/proto/ConsumerShareRequest;ZLjava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campaigns_wrappedendpoint-wrappedendpoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface yfm1 {
    static /* synthetic */ Object a(yfm1 yfm1Var, ConsumerShareRequest consumerShareRequest, boolean z, String str, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: share");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return yfm1Var.b(consumerShareRequest, z, str, lnmVar);
    }

    @u360({"Accept: application/protobuf", "Content-Type: application/protobuf"})
    @wyq0("campaigns-service/v1/campaigns/wrapped/consumer/share")
    Object b(@elb ConsumerShareRequest consumerShareRequest, @u0z0("override-image") boolean z, @u0z0("data_override_partial") String str, lnm<? super ShareAssetResponse> lnmVar);
}
