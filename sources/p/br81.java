package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationRequest;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationResponse;
import com.spotify.signup.signup.v2.proto.CreateAccountRequest;
import com.spotify.signup.signup.v2.proto.CreateAccountResponse;
import com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse;
import com.spotify.signup.signup.v2.proto.ValidateAccountRequest;
import com.spotify.signup.signup.v2.proto.ValidateAccountResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lp/br81;", "", "Lcom/spotify/signup/signup/v2/proto/CreateAccountRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/signup/signup/v2/proto/CreateAccountResponse;", "d", "(Lcom/spotify/signup/signup/v2/proto/CreateAccountRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/signup/signup/v2/proto/CompleteAccountCreationRequest;", "Lcom/spotify/signup/signup/v2/proto/CompleteAccountCreationResponse;", "b", "(Lcom/spotify/signup/signup/v2/proto/CompleteAccountCreationRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/signup/signup/v2/proto/ValidateAccountRequest;", "Lcom/spotify/signup/signup/v2/proto/ValidateAccountResponse;", "a", "(Lcom/spotify/signup/signup/v2/proto/ValidateAccountRequest;)Lio/reactivex/rxjava3/core/Single;", "", "key", "Lcom/spotify/signup/signup/v2/proto/GetSignupFlagsResponse;", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_login_signupapiv2-signupapiv2"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface br81 {
    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @wyq0("signup/public/v2/account/validate")
    Single<ValidateAccountResponse> a(@elb ValidateAccountRequest request);

    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @wyq0("signup/public/v2/account/complete-creation")
    Single<CompleteAccountCreationResponse> b(@elb CompleteAccountCreationRequest request);

    @ay30("signup/public/v2/signup/flags")
    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    Single<GetSignupFlagsResponse> c(@u0z0("key") String key);

    @u360({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @wyq0("signup/public/v2/account/create")
    Single<CreateAccountResponse> d(@elb CreateAccountRequest request);
}
