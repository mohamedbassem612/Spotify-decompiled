package p;

import com.spotify.kidsaccount.api.v2.proto.CreateChildLoginTokenRequest;
import com.spotify.kidsaccount.api.v2.proto.CreateChildLoginTokenResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountEducationAttributesResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountSettingsResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildrenResponse;
import com.spotify.kidsaccount.api.v2.proto.InitChildAccountConfigResponse;
import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import com.spotify.kidsaccount.api.v2.proto.SetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.v2.proto.VerifyPinRequest;
import com.spotify.kidsaccount.api.v2.proto.VerifyPinResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001b2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\u0007J\u001a\u0010'\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\tJ\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001a\u0010,\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH'¢\u0006\u0004\b.\u0010/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lp/iza0;", "", "Lcom/spotify/kidsaccount/api/v2/proto/NotEmpty;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/kidsaccount/api/v2/proto/InitChildAccountConfigResponse;", "a", "(Lcom/spotify/kidsaccount/api/v2/proto/NotEmpty;)Lio/reactivex/rxjava3/core/Single;", "g", "(Lcom/spotify/kidsaccount/api/v2/proto/NotEmpty;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v2/proto/GetChildrenResponse;", "e", "Lp/de1;", "Lp/ge1;", "i", "(Lp/de1;)Lio/reactivex/rxjava3/core/Single;", "b", "(Lp/de1;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v2/proto/VerifyPinRequest;", "Lcom/spotify/kidsaccount/api/v2/proto/VerifyPinResponse;", "j", "(Lcom/spotify/kidsaccount/api/v2/proto/VerifyPinRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v2/proto/GetChildAccountSettingsRequest;", "Lcom/spotify/kidsaccount/api/v2/proto/GetChildAccountSettingsResponse;", "f", "(Lcom/spotify/kidsaccount/api/v2/proto/GetChildAccountSettingsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v2/proto/SetChildAccountSettingsRequest;", "Lio/reactivex/rxjava3/core/Completable;", "k", "(Lcom/spotify/kidsaccount/api/v2/proto/SetChildAccountSettingsRequest;)Lio/reactivex/rxjava3/core/Completable;", "", "kidId", "o", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lp/nao0;", "d", "(Lp/nao0;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v2/proto/GetChildAccountEducationAttributesResponse;", "c", "m", "Lcom/spotify/kidsaccount/api/v2/proto/CreateChildLoginTokenRequest;", "Lcom/spotify/kidsaccount/api/v2/proto/CreateChildLoginTokenResponse;", "h", "(Lcom/spotify/kidsaccount/api/v2/proto/CreateChildLoginTokenRequest;)Lio/reactivex/rxjava3/core/Single;", "n", "(Lcom/spotify/kidsaccount/api/v2/proto/CreateChildLoginTokenRequest;Lp/lnm;)Ljava/lang/Object;", "l", "()Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface iza0 {
    @adt
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/InitCreateChild")
    Single<InitChildAccountConfigResponse> a(@elb NotEmpty request);

    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("family/client/v2/child")
    Object b(@elb de1 de1Var, lnm<? super ge1> lnmVar);

    @adt
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/GetChildAccountEducationAttributes")
    Single<GetChildAccountEducationAttributesResponse> c(@elb NotEmpty request);

    @yyq0("kids-account/v1/parent/attributes")
    Object d(@elb nao0 nao0Var, lnm<? super nao0> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/GetChildren")
    Single<GetChildrenResponse> e(@elb NotEmpty request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/GetChildAccountSettings")
    Object f(@elb GetChildAccountSettingsRequest getChildAccountSettingsRequest, lnm<? super GetChildAccountSettingsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/InitCreateChild")
    Object g(@elb NotEmpty notEmpty, lnm<? super InitChildAccountConfigResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/CreateChildLoginToken")
    Single<CreateChildLoginTokenResponse> h(@elb CreateChildLoginTokenRequest request);

    @adt
    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("family/client/v2/child")
    Single<ge1> i(@elb de1 request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/VerifyPin")
    Object j(@elb VerifyPinRequest verifyPinRequest, lnm<? super VerifyPinResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/SetChildAccountSettings")
    Completable k(@elb SetChildAccountSettingsRequest request);

    @juo("kids-account/_internal/parent/attributes")
    Completable l();

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/GetChildAccountEducationAttributes")
    Object m(@elb NotEmpty notEmpty, lnm<? super GetChildAccountEducationAttributesResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsaccount.api.v2.KidsAccountService/CreateChildLoginToken")
    Object n(@elb CreateChildLoginTokenRequest createChildLoginTokenRequest, lnm<? super CreateChildLoginTokenResponse> lnmVar);

    @juo("family/client/v1/child/{childId}")
    Completable o(@t8s0("childId") String kidId);
}
