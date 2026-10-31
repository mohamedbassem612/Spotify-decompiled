package p;

import com.spotify.listeningactivity.v1.AudienceRequest;
import com.spotify.listeningactivity.v1.AudienceResponse;
import com.spotify.listeningactivity.v1.AudienceUserRequest;
import com.spotify.listeningactivity.v1.AudienceUserResponse;
import com.spotify.listeningactivity.v1.AudienceUsersRequest;
import com.spotify.listeningactivity.v1.AudienceUsersResponse;
import com.spotify.listeningactivity.v1.GetFeedRequest;
import com.spotify.listeningactivity.v1.GetFeedResponse;
import com.spotify.listeningactivity.v1.GetMyActivityRequest;
import com.spotify.listeningactivity.v1.GetMyActivityResponse;
import com.spotify.listeningactivity.v1.GetUserHiddenStateRequest;
import com.spotify.listeningactivity.v1.GetUserHiddenStateResponse;
import com.spotify.listeningactivity.v1.HideUserActivityRequest;
import com.spotify.listeningactivity.v1.PresenceResponse;
import com.spotify.listeningactivity.v1.RestrictAudienceUserRequest;
import com.spotify.listeningactivity.v1.SubscribePresenceRequest;
import com.spotify.listeningactivity.v1.UsersActivityRequest;
import com.spotify.listeningactivity.v1.UsersActivityResponse;
import com.spotify.listeningactivity.v1.UsersSubscriptionRequest;
import com.spotify.listeningactivity.v1.UsersUnsubscriptionRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020)H§@¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lp/bed0;", "", "Lcom/spotify/listeningactivity/v1/UsersActivityRequest;", "request", "Lcom/spotify/listeningactivity/v1/UsersActivityResponse;", "g", "(Lcom/spotify/listeningactivity/v1/UsersActivityRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/GetMyActivityRequest;", "Lcom/spotify/listeningactivity/v1/GetMyActivityResponse;", "e", "(Lcom/spotify/listeningactivity/v1/GetMyActivityRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/AudienceRequest;", "Lcom/spotify/listeningactivity/v1/AudienceResponse;", "h", "(Lcom/spotify/listeningactivity/v1/AudienceRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/AudienceUserRequest;", "Lcom/spotify/listeningactivity/v1/AudienceUserResponse;", "a", "(Lcom/spotify/listeningactivity/v1/AudienceUserRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/AudienceUsersRequest;", "Lcom/spotify/listeningactivity/v1/AudienceUsersResponse;", "j", "(Lcom/spotify/listeningactivity/v1/AudienceUsersRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/RestrictAudienceUserRequest;", "Lp/rih1;", "b", "(Lcom/spotify/listeningactivity/v1/RestrictAudienceUserRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/HideUserActivityRequest;", "d", "(Lcom/spotify/listeningactivity/v1/HideUserActivityRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/GetUserHiddenStateRequest;", "Lcom/spotify/listeningactivity/v1/GetUserHiddenStateResponse;", "l", "(Lcom/spotify/listeningactivity/v1/GetUserHiddenStateRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/SubscribePresenceRequest;", "Lcom/spotify/listeningactivity/v1/PresenceResponse;", "f", "(Lcom/spotify/listeningactivity/v1/SubscribePresenceRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/UsersSubscriptionRequest;", "i", "(Lcom/spotify/listeningactivity/v1/UsersSubscriptionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/UsersUnsubscriptionRequest;", "k", "(Lcom/spotify/listeningactivity/v1/UsersUnsubscriptionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/listeningactivity/v1/GetFeedRequest;", "Lcom/spotify/listeningactivity/v1/GetFeedResponse;", "c", "(Lcom/spotify/listeningactivity/v1/GetFeedRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_listeningactivity_data_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface bed0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/audience/user")
    Object a(@elb AudienceUserRequest audienceUserRequest, lnm<? super AudienceUserResponse> lnmVar);

    @yyq0("listening-activity/v1/audience/restrict")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    Object b(@elb RestrictAudienceUserRequest restrictAudienceUserRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/feed")
    Object c(@elb GetFeedRequest getFeedRequest, lnm<? super GetFeedResponse> lnmVar);

    @yyq0("listening-activity/v1/hide")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    Object d(@elb HideUserActivityRequest hideUserActivityRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/me")
    Object e(@elb GetMyActivityRequest getMyActivityRequest, lnm<? super GetMyActivityResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/presence/subscribe")
    Object f(@elb SubscribePresenceRequest subscribePresenceRequest, lnm<? super PresenceResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/users-activity")
    Object g(@elb UsersActivityRequest usersActivityRequest, lnm<? super UsersActivityResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/audience")
    Object h(@elb AudienceRequest audienceRequest, lnm<? super AudienceResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/subscribe")
    Object i(@elb UsersSubscriptionRequest usersSubscriptionRequest, lnm<? super UsersActivityResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/audience/users")
    Object j(@elb AudienceUsersRequest audienceUsersRequest, lnm<? super AudienceUsersResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/unsubscribe")
    Object k(@elb UsersUnsubscriptionRequest usersUnsubscriptionRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    @wyq0("listening-activity/v1/hidden/state")
    Object l(@elb GetUserHiddenStateRequest getUserHiddenStateRequest, lnm<? super GetUserHiddenStateResponse> lnmVar);
}
