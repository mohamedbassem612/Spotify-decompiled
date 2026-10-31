package p;

import com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageRequest;
import com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageResponse;
import com.spotify.familyviewservice.v1.AddChildToPlanRequest;
import com.spotify.familyviewservice.v1.AddChildToPlanResponse;
import com.spotify.familyviewservice.v1.CreateDowngradeCheckoutRequest;
import com.spotify.familyviewservice.v1.CreateDowngradeCheckoutResponse;
import com.spotify.familyviewservice.v1.GetAddChildToPlanPageRequest;
import com.spotify.familyviewservice.v1.GetAddChildToPlanPageResponse;
import com.spotify.familyviewservice.v1.GetMemberDetailsRequest;
import com.spotify.familyviewservice.v1.GetMemberDetailsResponse;
import com.spotify.familyviewservice.v1.GetProfileRequest;
import com.spotify.familyviewservice.v1.GetProfileResponse;
import com.spotify.familyviewservice.v1.GetRegularMemberDetailsRequest;
import com.spotify.familyviewservice.v1.GetRegularMemberDetailsResponse;
import com.spotify.familyviewservice.v1.GetRemoveMemberPageRequest;
import com.spotify.familyviewservice.v1.GetRemoveMemberPageResponse;
import com.spotify.familyviewservice.v1.MarkMemberForRemovalRequest;
import com.spotify.familyviewservice.v1.RemoveMemberRequest;
import com.spotify.familyviewservice.v1.RemoveOrDeleteMemberRequest;
import com.spotify.familyviewservice.v1.RemoveOrDeleteMemberResponse;
import com.spotify.familyviewservice.v1.SetParentalControlRequest;
import com.spotify.familyviewservice.v1.SetParentalControlsRequest;
import com.spotify.familyviewservice.v1.TransitionToManagedAccountRequest;
import com.spotify.familyviewservice.v1.TransitionToManagedAccountResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107J \u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00052\b\b\u0001\u0010\u0003\u001a\u000208H§@¢\u0006\u0004\b:\u0010;ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006<À\u0006\u0001"}, d2 = {"Lp/hj10;", "", "Lcom/spotify/familyviewservice/v1/GetMemberDetailsRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/familyviewservice/v1/GetMemberDetailsResponse;", "g", "(Lcom/spotify/familyviewservice/v1/GetMemberDetailsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/GetProfileRequest;", "Lcom/spotify/familyviewservice/v1/GetProfileResponse;", "i", "(Lcom/spotify/familyviewservice/v1/GetProfileRequest;)Lio/reactivex/rxjava3/core/Single;", "d", "(Lcom/spotify/familyviewservice/v1/GetProfileRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/familyviewservice/v1/RemoveMemberRequest;", "Lio/reactivex/rxjava3/core/Completable;", "j", "(Lcom/spotify/familyviewservice/v1/RemoveMemberRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/familyviewservice/v1/TransitionToManagedAccountRequest;", "Lcom/spotify/familyviewservice/v1/TransitionToManagedAccountResponse;", "e", "(Lcom/spotify/familyviewservice/v1/TransitionToManagedAccountRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/SetParentalControlsRequest;", "c", "(Lcom/spotify/familyviewservice/v1/SetParentalControlsRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/familyviewservice/v1/SetParentalControlRequest;", "h", "(Lcom/spotify/familyviewservice/v1/SetParentalControlRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/familyviewservice/v1/MarkMemberForRemovalRequest;", "a", "(Lcom/spotify/familyviewservice/v1/MarkMemberForRemovalRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/familyviewservice/accountswitching/v1/GetAddAccountPageRequest;", "Lcom/spotify/familyviewservice/accountswitching/v1/GetAddAccountPageResponse;", "l", "(Lcom/spotify/familyviewservice/accountswitching/v1/GetAddAccountPageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/GetRemoveMemberPageRequest;", "Lcom/spotify/familyviewservice/v1/GetRemoveMemberPageResponse;", "b", "(Lcom/spotify/familyviewservice/v1/GetRemoveMemberPageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/RemoveOrDeleteMemberRequest;", "Lcom/spotify/familyviewservice/v1/RemoveOrDeleteMemberResponse;", "f", "(Lcom/spotify/familyviewservice/v1/RemoveOrDeleteMemberRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/CreateDowngradeCheckoutRequest;", "Lcom/spotify/familyviewservice/v1/CreateDowngradeCheckoutResponse;", "n", "(Lcom/spotify/familyviewservice/v1/CreateDowngradeCheckoutRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/GetAddChildToPlanPageRequest;", "Lcom/spotify/familyviewservice/v1/GetAddChildToPlanPageResponse;", "m", "(Lcom/spotify/familyviewservice/v1/GetAddChildToPlanPageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/AddChildToPlanRequest;", "Lcom/spotify/familyviewservice/v1/AddChildToPlanResponse;", "o", "(Lcom/spotify/familyviewservice/v1/AddChildToPlanRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familyviewservice/v1/GetRegularMemberDetailsRequest;", "Lcom/spotify/familyviewservice/v1/GetRegularMemberDetailsResponse;", "k", "(Lcom/spotify/familyviewservice/v1/GetRegularMemberDetailsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_premiumaccountmanagement_familyviewserviceimpl-familyviewserviceimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface hj10 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/MarkMemberForRemoval")
    Completable a(@elb MarkMemberForRemovalRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetRemoveMemberPage")
    Single<GetRemoveMemberPageResponse> b(@elb GetRemoveMemberPageRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/SetParentalControls")
    Completable c(@elb SetParentalControlsRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetProfile")
    Object d(@elb GetProfileRequest getProfileRequest, lnm<? super sy21<GetProfileResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/TransitionToManagedAccount")
    Single<TransitionToManagedAccountResponse> e(@elb TransitionToManagedAccountRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/RemoveMember")
    Single<RemoveOrDeleteMemberResponse> f(@elb RemoveOrDeleteMemberRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetMemberDetails")
    Single<sy21<GetMemberDetailsResponse>> g(@elb GetMemberDetailsRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/SetParentalControl")
    Completable h(@elb SetParentalControlRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetProfile")
    Single<GetProfileResponse> i(@elb GetProfileRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/RemoveMember")
    Completable j(@elb RemoveMemberRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetRegularMemberDetails")
    Object k(@elb GetRegularMemberDetailsRequest getRegularMemberDetailsRequest, lnm<? super sy21<GetRegularMemberDetailsResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.accountswitching.v1.AccountSwitchingService/GetAddAccountPage")
    Single<GetAddAccountPageResponse> l(@elb GetAddAccountPageRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/GetAddChildToPlanPage")
    Single<GetAddChildToPlanPageResponse> m(@elb GetAddChildToPlanPageRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/CreateDowngradeCheckout")
    Single<CreateDowngradeCheckoutResponse> n(@elb CreateDowngradeCheckoutRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familyviewservice.v1.FamilyViewService/AddChildToPlan")
    Single<AddChildToPlanResponse> o(@elb AddChildToPlanRequest request);
}
