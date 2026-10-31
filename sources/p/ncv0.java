package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollsForEntityResponse;
import com.spotify.music.podcastinteractivity.polls.proto.GetPollsForEntityRequest;
import com.spotify.music.podcastinteractivity.polls.proto.PollVoteRequest;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/ncv0;", "", "Lcom/spotify/music/podcastinteractivity/polls/proto/GetPollsForEntityRequest;", "getPollForEntityRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/music/podcastinteractivity/polls/proto/ClientPollsForEntityResponse;", "a", "(Lcom/spotify/music/podcastinteractivity/polls/proto/GetPollsForEntityRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/music/podcastinteractivity/polls/proto/PollVoteRequest;", "voteRequest", "Lcom/spotify/music/podcastinteractivity/polls/proto/ClientPollResponse;", "b", "(Lcom/spotify/music/podcastinteractivity/polls/proto/PollVoteRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_podcastinteractivity_polls-polls"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface ncv0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.podcastcreatorinteractivity.v2.polls.PollsReadService/GetPollsForEntity")
    Single<ClientPollsForEntityResponse> a(@elb GetPollsForEntityRequest getPollForEntityRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.podcastcreatorinteractivity.v2.polls.PollsWriteService/SubmitPollVote")
    Single<ClientPollResponse> b(@elb PollVoteRequest voteRequest);
}
