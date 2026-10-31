package p;

import com.spotify.savetospotify.v1.HttpCreateEpisodeRequest;
import com.spotify.savetospotify.v1.HttpCreateShowRequest;
import com.spotify.savetospotify.v1.HttpGetShowResponse;
import com.spotify.savetospotify.v1.HttpUpdateEpisodeRequest;
import com.spotify.savetospotify.v1.HttpUpdateShowPlaybackControlRequest;
import com.spotify.savetospotify.v1.HttpUpdateShowRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\fH§@¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010 \u001a\u00020\u00182\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b \u0010\u0013J\u001a\u0010!\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\fH§@¢\u0006\u0004\b!\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lp/ejc1;", "", "Lp/tn21;", "body", "k", "(Lp/tn21;Lp/lnm;)Ljava/lang/Object;", "a", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpCreateShowRequest;", "request", "h", "(Lcom/spotify/savetospotify/v1/HttpCreateShowRequest;Lp/lnm;)Ljava/lang/Object;", "", "showId", "Lcom/spotify/savetospotify/v1/HttpCreateEpisodeRequest;", "e", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpCreateEpisodeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpGetShowResponse;", "f", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpUpdateShowRequest;", "b", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateShowRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpUpdateShowPlaybackControlRequest;", "Lp/rih1;", "d", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateShowPlaybackControlRequest;Lp/lnm;)Ljava/lang/Object;", "episodeId", "Lcom/spotify/savetospotify/v1/HttpUpdateEpisodeRequest;", "c", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateEpisodeRequest;Lp/lnm;)Ljava/lang/Object;", "g", "i", "j", "src_main_java_com_spotify_sts_mascotimpl-mascotimpl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface ejc1 {
    @ay30("/save-to-spotify/api/v1/shows")
    @u360({"Accept: application/x-protobuf"})
    Object a(lnm<Object> lnmVar);

    @yyq0("/save-to-spotify/api/v1/shows/{show_id}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    Object b(@t8s0("show_id") String str, @elb HttpUpdateShowRequest httpUpdateShowRequest, lnm<Object> lnmVar);

    @yyq0("/save-to-spotify/api/v1/episodes/{episode_id}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    Object c(@t8s0("episode_id") String str, @elb HttpUpdateEpisodeRequest httpUpdateEpisodeRequest, lnm<Object> lnmVar);

    @yyq0("/save-to-spotify/api/v1/shows/{show_id}/playback-control")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    Object d(@t8s0("show_id") String str, @elb HttpUpdateShowPlaybackControlRequest httpUpdateShowPlaybackControlRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("/save-to-spotify/api/v1/shows/{show_id}/episodes")
    Object e(@t8s0("show_id") String str, @elb HttpCreateEpisodeRequest httpCreateEpisodeRequest, lnm<Object> lnmVar);

    @ay30("/save-to-spotify/api/v1/shows/{show_id}")
    @u360({"Accept: application/x-protobuf"})
    Object f(@t8s0("show_id") String str, lnm<? super HttpGetShowResponse> lnmVar);

    @ay30("/save-to-spotify/api/v1/episodes/{episode_id}/readiness")
    @u360({"Accept: application/x-protobuf"})
    Object g(@t8s0("episode_id") String str, lnm<Object> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("/save-to-spotify/api/v1/shows")
    Object h(@elb HttpCreateShowRequest httpCreateShowRequest, lnm<Object> lnmVar);

    @juo("/save-to-spotify/api/v1/shows/{show_id}")
    Object i(@t8s0("show_id") String str, lnm<? super rih1> lnmVar);

    @juo("/save-to-spotify/api/v1/episodes/{episode_id}")
    Object j(@t8s0("episode_id") String str, lnm<? super rih1> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("/save-to-spotify/api/v1/images")
    Object k(@elb tn21 tn21Var, lnm<Object> lnmVar);
}
