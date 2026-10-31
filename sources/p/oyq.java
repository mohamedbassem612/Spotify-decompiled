package p;

import com.spotify.graduation.v1.GetDownloadsRequest;
import com.spotify.graduation.v1.GetDownloadsResponse;
import com.spotify.graduation.v1.GraduationRequest;
import com.spotify.graduation.v1.GraduationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/oyq;", "", "Lcom/spotify/graduation/v1/GetDownloadsRequest;", "request", "Lp/sy21;", "Lcom/spotify/graduation/v1/GetDownloadsResponse;", "a", "(Lcom/spotify/graduation/v1/GetDownloadsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/graduation/v1/GraduationRequest;", "Lcom/spotify/graduation/v1/GraduationResponse;", "b", "(Lcom/spotify/graduation/v1/GraduationRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphagraduation_datadownload_page-page"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface oyq {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.graduation.v1.DownloadService/GetDownloads")
    Object a(@elb GetDownloadsRequest getDownloadsRequest, lnm<? super sy21<GetDownloadsResponse>> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.graduation.v1.DownloadService/SubmitRequest")
    Object b(@elb GraduationRequest graduationRequest, lnm<? super sy21<GraduationResponse>> lnmVar);
}
