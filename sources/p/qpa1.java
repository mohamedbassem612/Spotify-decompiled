package p;

import com.spotify.campfire.elements.sharedbychip.impl.proto.RetrieveNudgeDataRequest;
import com.spotify.campfire.elements.sharedbychip.impl.proto.RetrieveNudgeDataResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/qpa1;", "", "Lcom/spotify/campfire/elements/sharedbychip/impl/proto/RetrieveNudgeDataRequest;", "request", "Lcom/spotify/campfire/elements/sharedbychip/impl/proto/RetrieveNudgeDataResponse;", "a", "(Lcom/spotify/campfire/elements/sharedbychip/impl/proto/RetrieveNudgeDataRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_elements_sharedbychip_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface qpa1 {
    @wyq0("speechless-sharing/v1/retrieve/nudge-data")
    Object a(@elb RetrieveNudgeDataRequest retrieveNudgeDataRequest, lnm<? super RetrieveNudgeDataResponse> lnmVar);
}
