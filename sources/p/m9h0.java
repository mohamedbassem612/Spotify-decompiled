package p;

import com.spotify.libraryimportservice.tmm.GetMatchReviewResponse;
import com.spotify.libraryimportservice.tmm.SubmitMatchReviewRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/m9h0;", "", "Lcom/spotify/libraryimportservice/tmm/GetMatchReviewResponse;", "b", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/libraryimportservice/tmm/SubmitMatchReviewRequest;", "request", "Lp/rih1;", "a", "(Lcom/spotify/libraryimportservice/tmm/SubmitMatchReviewRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_libraryimport_matchreview-matchreview"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface m9h0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("library-import/v1/match-review")
    Object a(@elb SubmitMatchReviewRequest submitMatchReviewRequest, lnm<? super rih1> lnmVar);

    @ay30("library-import/v1/match-review")
    @u360({"Accept: application/x-protobuf"})
    Object b(lnm<? super GetMatchReviewResponse> lnmVar);
}
