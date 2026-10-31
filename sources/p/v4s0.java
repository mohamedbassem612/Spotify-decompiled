package p;

import com.spotify.passkeys.v1.FinishAuthenticationRequest;
import com.spotify.passkeys.v1.FinishAuthenticationResponse;
import com.spotify.passkeys.v1.FinishRegistrationRequest;
import com.spotify.passkeys.v1.FinishRegistrationResponse;
import com.spotify.passkeys.v1.StartAuthenticationRequest;
import com.spotify.passkeys.v1.StartAuthenticationResponse;
import com.spotify.passkeys.v1.StartRegistrationRequest;
import com.spotify.passkeys.v1.StartRegistrationResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/v4s0;", "", "Lcom/spotify/passkeys/v1/StartRegistrationRequest;", "request", "Lcom/spotify/passkeys/v1/StartRegistrationResponse;", "c", "(Lcom/spotify/passkeys/v1/StartRegistrationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/passkeys/v1/FinishRegistrationRequest;", "Lcom/spotify/passkeys/v1/FinishRegistrationResponse;", "b", "(Lcom/spotify/passkeys/v1/FinishRegistrationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/passkeys/v1/StartAuthenticationRequest;", "Lcom/spotify/passkeys/v1/StartAuthenticationResponse;", "a", "(Lcom/spotify/passkeys/v1/StartAuthenticationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/passkeys/v1/FinishAuthenticationRequest;", "Lcom/spotify/passkeys/v1/FinishAuthenticationResponse;", "d", "(Lcom/spotify/passkeys/v1/FinishAuthenticationRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_login_passkeysapi-passkeysapi"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface v4s0 {
    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @wyq0("passkeys/v1/authenticate/start")
    Object a(@elb StartAuthenticationRequest startAuthenticationRequest, lnm<? super StartAuthenticationResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("passkeys/v1/register/finish")
    Object b(@elb FinishRegistrationRequest finishRegistrationRequest, lnm<? super FinishRegistrationResponse> lnmVar);

    @u360({"Accept: application/protobuf"})
    @wyq0("passkeys/v1/register/start")
    Object c(@elb StartRegistrationRequest startRegistrationRequest, lnm<? super StartRegistrationResponse> lnmVar);

    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @wyq0("passkeys/v1/authenticate/finish")
    Object d(@elb FinishAuthenticationRequest finishAuthenticationRequest, lnm<? super FinishAuthenticationResponse> lnmVar);
}
