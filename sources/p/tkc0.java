package p;

import com.spotify.kidssessions.link.v1.ParentAcceptLinkSessionRequest;
import com.spotify.kidssessions.link.v1.ParentAcceptLinkSessionResponse;
import com.spotify.kidssessions.link.v1.StartLinkSessionRequest;
import com.spotify.kidssessions.link.v1.StartLinkSessionResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/tkc0;", "", "Lcom/spotify/kidssessions/link/v1/StartLinkSessionRequest;", "request", "Lcom/spotify/kidssessions/link/v1/StartLinkSessionResponse;", "c", "(Lcom/spotify/kidssessions/link/v1/StartLinkSessionRequest;Lp/lnm;)Ljava/lang/Object;", "", "sessionId", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/link/v1/ParentAcceptLinkSessionRequest;", "Lcom/spotify/kidssessions/link/v1/ParentAcceptLinkSessionResponse;", "a", "(Ljava/lang/String;Lcom/spotify/kidssessions/link/v1/ParentAcceptLinkSessionRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphaaccountcreation_accountlinking_datasource_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface tkc0 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-sessions/v1/link-sessions/{link_session_id}/parent-accept")
    Object a(@t8s0("link_session_id") String str, @elb ParentAcceptLinkSessionRequest parentAcceptLinkSessionRequest, lnm<? super ParentAcceptLinkSessionResponse> lnmVar);

    @ay30("kids-sessions/v1/link-sessions/{link_session_id}")
    @u360({"Accept: application/x-protobuf"})
    Object b(@t8s0("link_session_id") String str, lnm<Object> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-sessions/v1/link-sessions")
    Object c(@elb StartLinkSessionRequest startLinkSessionRequest, lnm<? super StartLinkSessionResponse> lnmVar);
}
