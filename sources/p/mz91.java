package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse;
import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameRequest;
import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse;
import com.spotify.profile.socialgraphimpl.proto.CountResponse$GetCountUsernameRequest;
import com.spotify.profile.socialgraphimpl.proto.FriendRequestResponse$FriendResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\tJ;\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0015\u0010\u0014J0\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0016\u0010\u0014J0\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0017\u0010\u0014J0\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0018\u0010\u0014J0\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001b\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J*\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b$\u0010%J*\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010%J*\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010%J*\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010%J*\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010%J*\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010%J*\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b,\u0010%J*\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010%J$\u0010.\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010%J$\u0010/\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010%J$\u00100\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u0010%J$\u00101\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u0010%J$\u00102\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b2\u0010%J$\u00103\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Lp/mz91;", "", "", "currentUser", "username", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/uz21;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/profile/socialgraphimpl/proto/ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse;", "v", "y", "pageToken", "", "limit", "Lcom/spotify/profile/socialgraphimpl/proto/BlockedlistResponse$RelationsUsernameResponse;", "r", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/rxjava3/core/Single;", "x", "(Ljava/lang/String;Ljava/lang/String;ILp/lnm;)Ljava/lang/Object;", "l", "j", "h", "f", "w", "Lcom/spotify/profile/socialgraphimpl/proto/CountResponse$GetCountUsernameRequest;", "request", "A", "(Lcom/spotify/profile/socialgraphimpl/proto/CountResponse$GetCountUsernameRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/profile/socialgraphimpl/proto/ContainsRelationsResponse$ContainRelationsUsernameRequest;", "Lcom/spotify/profile/socialgraphimpl/proto/ContainsRelationsResponse$ContainRelationsUsernameResponse;", "z", "(Lcom/spotify/profile/socialgraphimpl/proto/ContainsRelationsResponse$ContainRelationsUsernameRequest;Lp/lnm;)Ljava/lang/Object;", "targetUser", "Lp/rih1;", "i", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "o", "q", "u", "t", "k", "Lcom/spotify/profile/socialgraphimpl/proto/FriendRequestResponse$FriendResponse;", "a", "b", "s", "d", "p", "c", "n", "g", "src_main_java_com_spotify_profile_socialgraphimpl-socialgraphimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface mz91 {
    static /* synthetic */ Single m(mz91 mz91Var, String str, String str2, int i, int i2, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getBlockedUsers");
            return null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return mz91Var.r(str, str2, i);
    }

    @wyq0("socialgraph/v4/count")
    Object A(@elb CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest, lnm<Object> lnmVar);

    @wyq0("socialgraph/v4/{currentUser}/is-friend/{targetUser}")
    Object a(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<FriendRequestResponse$FriendResponse>> lnmVar);

    @wyq0("socialgraph/v4/{currentUser}/invite-accepted/{targetUser}")
    Object b(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<Object>> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/invite-received/{targetUser}")
    Object c(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/invite-sent/{targetUser}")
    Object d(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/is-followed-by/{username}")
    Single<sy21<uz21>> e(@t8s0("currentUser") String currentUser, @t8s0("username") String username);

    @ay30("socialgraph/v4/{username}/friend-request-received")
    Object f(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/invite-accepted/{targetUser}")
    Object g(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @ay30("socialgraph/v4/{username}/invite-sent")
    Object h(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/is-friend/{targetUser}")
    Object i(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @ay30("socialgraph/v4/{username}/friend-request-sent")
    Object j(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/invite-sent/{targetUser}")
    Object k(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @ay30("socialgraph/v4/{username}/invite-accepted")
    Object l(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/is-friend/{targetUser}")
    Object n(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/invite-accepted/{targetUser}")
    Object o(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/friend-request-received/{targetUser}")
    Object p(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/friend-request-received/{targetUser}")
    Object q(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/is-blocking")
    Single<sy21<BlockedlistResponse.RelationsUsernameResponse>> r(@t8s0("currentUser") String currentUser, @u0z0("pageToken") String pageToken, @u0z0("limit") int limit);

    @ay30("socialgraph/v4/{currentUser}/friend-request-sent/{targetUser}")
    Object s(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse> lnmVar);

    @juo("socialgraph/v4/{currentUser}/friend-request-sent/{targetUser}")
    Object t(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @juo("socialgraph/v4/{currentUser}/invite-received/{targetUser}")
    Object u(@t8s0("currentUser") String str, @t8s0("targetUser") String str2, lnm<? super sy21<rih1>> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/is-followed-by/{username}")
    Single<sy21<ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse>> v(@t8s0("currentUser") String currentUser, @t8s0("username") String username);

    @ay30("socialgraph/v4/{username}/invite-received")
    Object w(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @ay30("socialgraph/v4/{username}/is-friend")
    Object x(@t8s0("username") String str, @u0z0("pageToken") String str2, @u0z0("limit") int i, lnm<? super BlockedlistResponse.RelationsUsernameResponse> lnmVar);

    @ay30("socialgraph/v4/{currentUser}/is-blocking/{username}")
    Single<sy21<ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse>> y(@t8s0("currentUser") String currentUser, @t8s0("username") String username);

    @wyq0("socialgraph/v4/contains")
    Object z(@elb ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest, lnm<? super ContainsRelationsResponse$ContainRelationsUsernameResponse> lnmVar);
}
