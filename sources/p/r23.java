package p;

import com.spotify.playlist.ai.creation.v2.CloneSessionByMessageIdRequest;
import com.spotify.playlist.ai.creation.v2.CreateSessionRequest;
import com.spotify.playlist.ai.creation.v2.CreateSessionResponse;
import com.spotify.playlist.ai.creation.v2.GetMessageHistoryRequest;
import com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponse;
import com.spotify.playlist.ai.creation.v2.GetMessageRequest;
import com.spotify.playlist.ai.creation.v2.GetMessageResponse;
import com.spotify.playlist.ai.creation.v2.GetSessionByMessageIdRequest;
import com.spotify.playlist.ai.creation.v2.GetSessionRequest;
import com.spotify.playlist.ai.creation.v2.GetSessionResponse;
import com.spotify.playlist.ai.creation.v2.ListSessionsRequest;
import com.spotify.playlist.ai.creation.v2.ListSessionsResponse;
import com.spotify.playlist.ai.creation.v2.PlaylistSavedRequest;
import com.spotify.playlist.ai.creation.v2.PlaylistSavedResponse;
import com.spotify.playlist.ai.creation.v2.SubmitMessageRequest;
import com.spotify.playlist.ai.creation.v2.SubmitMessageResponse;
import com.spotify.playlist.ai.creation.v2.UpdateChatMessagePreferencesRequest;
import com.spotify.playlist.ai.creation.v2.UpdateChatMessagePreferencesResponse;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00042\b\b\u0001\u0010/\u001a\u00020.H'¢\u0006\u0004\b1\u00102ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lp/r23;", "", "Lcom/spotify/playlist/ai/creation/v2/CreateSessionRequest;", "createSessionRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/CreateSessionResponse;", "e", "(Lcom/spotify/playlist/ai/creation/v2/CreateSessionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/ListSessionsRequest;", "listSessionRequest", "Lcom/spotify/playlist/ai/creation/v2/ListSessionsResponse;", "d", "(Lcom/spotify/playlist/ai/creation/v2/ListSessionsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/GetSessionRequest;", "getSessionRequest", "Lcom/spotify/playlist/ai/creation/v2/GetSessionResponse;", "h", "(Lcom/spotify/playlist/ai/creation/v2/GetSessionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/GetSessionByMessageIdRequest;", "getSessionByMessageIdRequest", "g", "(Lcom/spotify/playlist/ai/creation/v2/GetSessionByMessageIdRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/SubmitMessageRequest;", "submitMessageRequest", "Lcom/spotify/playlist/ai/creation/v2/SubmitMessageResponse;", "f", "(Lcom/spotify/playlist/ai/creation/v2/SubmitMessageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/GetMessageRequest;", "getMessageRequest", "Lcom/spotify/playlist/ai/creation/v2/GetMessageResponse;", "j", "(Lcom/spotify/playlist/ai/creation/v2/GetMessageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/GetMessageHistoryRequest;", "getMessageHistoryRequest", "Lcom/spotify/playlist/ai/creation/v2/GetMessageHistoryResponse;", "a", "(Lcom/spotify/playlist/ai/creation/v2/GetMessageHistoryRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/UpdateChatMessagePreferencesRequest;", "updateChatMessagePreferencesRequest", "Lcom/spotify/playlist/ai/creation/v2/UpdateChatMessagePreferencesResponse;", "i", "(Lcom/spotify/playlist/ai/creation/v2/UpdateChatMessagePreferencesRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/CloneSessionByMessageIdRequest;", "cloneSessionByMessageIdRequest", "b", "(Lcom/spotify/playlist/ai/creation/v2/CloneSessionByMessageIdRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist/ai/creation/v2/PlaylistSavedRequest;", "playlistSavedRequest", "Lcom/spotify/playlist/ai/creation/v2/PlaylistSavedResponse;", "c", "(Lcom/spotify/playlist/ai/creation/v2/PlaylistSavedRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_aiplaylist_networkimpl-networkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface r23 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetMessageHistory")
    Single<GetMessageHistoryResponse> a(@elb GetMessageHistoryRequest getMessageHistoryRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/CloneSessionByMessageId")
    Single<GetSessionResponse> b(@elb CloneSessionByMessageIdRequest cloneSessionByMessageIdRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/PlaylistSaved")
    Single<PlaylistSavedResponse> c(@elb PlaylistSavedRequest playlistSavedRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/ListSessions")
    Single<ListSessionsResponse> d(@elb ListSessionsRequest listSessionRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/CreateSession")
    Single<CreateSessionResponse> e(@elb CreateSessionRequest createSessionRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/SubmitMessage")
    Single<SubmitMessageResponse> f(@elb SubmitMessageRequest submitMessageRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetSessionByMessageId")
    Single<GetSessionResponse> g(@elb GetSessionByMessageIdRequest getSessionByMessageIdRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetSession")
    Single<GetSessionResponse> h(@elb GetSessionRequest getSessionRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/UpdateChatMessagePreferences")
    Single<UpdateChatMessagePreferencesResponse> i(@elb UpdateChatMessagePreferencesRequest updateChatMessagePreferencesRequest);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetMessage")
    Single<GetMessageResponse> j(@elb GetMessageRequest getMessageRequest);
}
