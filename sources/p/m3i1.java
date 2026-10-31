package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlRequest;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlResponse;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlRequest;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/m3i1;", "", "Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlRequest;", "requestBody", "Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlResponse;", "a", "(Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlRequest;", "Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlResponse;", "b", "(Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlRequest;Lp/lnm;)Ljava/lang/Object;", "p/l3i1", "src_main_java_com_spotify_share_linkgeneration_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface m3i1 {
    public static final l3i1 a = l3i1.a;
    public static final String b = "https";

    @u360({"Accept: application/protobuf"})
    @wyq0("url-dispenser/v1/generate-url")
    Object a(@elb GenerateUrlRequest generateUrlRequest, lnm<? super GenerateUrlResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("url-dispenser/v1/unshorten-url")
    Object b(@elb UnshortenUrlRequest unshortenUrlRequest, lnm<? super UnshortenUrlResponse> lnmVar);
}
