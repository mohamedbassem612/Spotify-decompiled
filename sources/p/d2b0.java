package p;

import com.spotify.kidssessions.v1.GetAutoLoginTokenRequest;
import com.spotify.kidssessions.v1.GetAutoLoginTokenResponse;
import com.spotify.kidssessions.v1.GetSessionResponse;
import com.spotify.kidssessions.v1.GetTransitioningProfileResponse;
import com.spotify.kidssessions.v1.StartSessionRequest;
import com.spotify.kidssessions.v1.StartSessionResponse;
import com.spotify.kidssessions.v1.TerminateSessionRequest;
import com.spotify.kidssessions.v1.TerminateSessionResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/d2b0;", "", "Lcom/spotify/kidssessions/v1/StartSessionRequest;", "request", "Lcom/spotify/kidssessions/v1/StartSessionResponse;", "a", "(Lcom/spotify/kidssessions/v1/StartSessionRequest;Lp/lnm;)Ljava/lang/Object;", "", "sessionId", "Lcom/spotify/kidssessions/v1/GetSessionResponse;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/TerminateSessionRequest;", "Lcom/spotify/kidssessions/v1/TerminateSessionResponse;", "c", "(Ljava/lang/String;Lcom/spotify/kidssessions/v1/TerminateSessionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/GetAutoLoginTokenRequest;", "Lcom/spotify/kidssessions/v1/GetAutoLoginTokenResponse;", "e", "(Ljava/lang/String;Lcom/spotify/kidssessions/v1/GetAutoLoginTokenRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/GetTransitioningProfileResponse;", "f", "d", "src_main_java_com_spotify_genalphaauthentication_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface d2b0 {
    @u360({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    @wyq0("kids-sessions/v1/parental-consent-sessions")
    Object a(@elb StartSessionRequest startSessionRequest, lnm<? super StartSessionResponse> lnmVar);

    @ay30("kids-sessions/v1/parental-consent-sessions/{session_id}")
    @u360({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    Object b(@t8s0("session_id") String str, lnm<? super GetSessionResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    @wyq0("kids-sessions/v1/parental-consent-sessions/{session_id}/terminate")
    Object c(@t8s0("session_id") String str, @elb TerminateSessionRequest terminateSessionRequest, lnm<? super TerminateSessionResponse> lnmVar);

    @u360({"Accept: application/x-protobuf"})
    @wyq0("kids-sessions/me/v1/parental-consent-sessions")
    Object d(@elb StartSessionRequest startSessionRequest, lnm<? super StartSessionResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    @wyq0("kids-sessions/v1/parental-consent-sessions/{session_id}/token")
    Object e(@t8s0("session_id") String str, @elb GetAutoLoginTokenRequest getAutoLoginTokenRequest, lnm<? super GetAutoLoginTokenResponse> lnmVar);

    @ay30("kids-sessions/me/v1/parental-consent-sessions/{session_id}/transitioning-profile")
    @u360({"Accept: application/x-protobuf"})
    Object f(@t8s0("session_id") String str, lnm<? super GetTransitioningProfileResponse> lnmVar);
}
