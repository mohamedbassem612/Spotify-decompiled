package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.userinteractivityservice.usercomments.v1.proto.CreateCommentRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.CreateReplyRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.CreateReplyResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.DeleteCommentRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.DeleteReactionRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentDisplayRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentDisplayResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetReactionsCountRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetReactionsCountResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListCommentsRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListCommentsResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListReactionsRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListReactionsResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListRepliesRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListRepliesResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.PutReactionRequest;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H'¢\u0006\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Lp/ldi1;", "", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentCardRequest;", "body", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentCardResponse;", "b", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentCardRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentDisplayRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentDisplayResponse;", "e", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetCommentDisplayRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListCommentsRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListCommentsResponse;", "f", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListCommentsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListRepliesRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListRepliesResponse;", "h", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListRepliesRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/CreateCommentRequest;", "Lp/sy21;", "Lp/rih1;", "d", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/CreateCommentRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/CreateReplyRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/CreateReplyResponse;", "a", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/CreateReplyRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/DeleteCommentRequest;", "i", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/DeleteCommentRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetReactionsCountRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetReactionsCountResponse;", "k", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/GetReactionsCountRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListReactionsRequest;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListReactionsResponse;", "g", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/ListReactionsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/PutReactionRequest;", "c", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/PutReactionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/userinteractivityservice/usercomments/v1/proto/DeleteReactionRequest;", "j", "(Lcom/spotify/userinteractivityservice/usercomments/v1/proto/DeleteReactionRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_podcastinteractivity_commentsdataimpl-commentsdataimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface ldi1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: irrelevant"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsWriteHandler/CreateReply")
    Single<CreateReplyResponse> a(@elb CreateReplyRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsReadHandler/GetCommentCard")
    Single<GetCommentCardResponse> b(@elb GetCommentCardRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.ReactionsWriteHandler/PutReaction")
    Single<sy21<rih1>> c(@elb PutReactionRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: irrelevant"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsWriteHandler/CreateComment")
    Single<sy21<rih1>> d(@elb CreateCommentRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsReadHandler/GetCommentDisplay")
    Single<GetCommentDisplayResponse> e(@elb GetCommentDisplayRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsReadHandler/ListComments")
    Single<ListCommentsResponse> f(@elb ListCommentsRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.ReactionsReadHandler/ListReaction")
    Single<ListReactionsResponse> g(@elb ListReactionsRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsReadHandler/ListReplies")
    Single<ListRepliesResponse> h(@elb ListRepliesRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.CommentsWriteHandler/DeleteComment")
    Single<sy21<rih1>> i(@elb DeleteCommentRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.ReactionsWriteHandler/DeleteReaction")
    Single<sy21<rih1>> j(@elb DeleteReactionRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.userinteractivityservice.usercomments.v1.ReactionsReadHandler/GetReactionsCount")
    Single<GetReactionsCountResponse> k(@elb GetReactionsCountRequest body);
}
