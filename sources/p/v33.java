package p;

import com.spotify.user_prompts.v1.CreatePromptRequest;
import com.spotify.user_prompts.v1.CreatePromptResponse;
import com.spotify.user_prompts.v1.GetStatusRequest;
import com.spotify.user_prompts.v1.GetStatusResponse;
import com.spotify.watchfeedentrypoints.api.v1.CreateSessionRequest;
import com.spotify.watchfeedentrypoints.api.v1.CreateSessionResponse;
import com.spotify.watchfeedentrypoints.api.v1.GetMessageRequest;
import com.spotify.watchfeedentrypoints.api.v1.GetMessageResponse;
import com.spotify.watchfeedentrypoints.api.v1.SubmitMessageRequest;
import com.spotify.watchfeedentrypoints.api.v1.SubmitMessageResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0012\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lp/v33;", "", "Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionRequest;", "createSessionRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionResponse;", "d", "(Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageRequest;", "submitMessageRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageResponse;", "c", "(Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageRequest;", "getMessageRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageResponse;", "b", "(Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/user_prompts/v1/CreatePromptRequest;", "request", "Lcom/spotify/user_prompts/v1/CreatePromptResponse;", "a", "(Lcom/spotify/user_prompts/v1/CreatePromptRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/user_prompts/v1/GetStatusRequest;", "Lcom/spotify/user_prompts/v1/GetStatusResponse;", "e", "(Lcom/spotify/user_prompts/v1/GetStatusRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_watchfeed_pivotspage-pivotspage"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface v33 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("/user-prompts/spotify.user_prompts.v1.UserPromptsService/CreatePrompt")
    Object a(@elb CreatePromptRequest createPromptRequest, lnm<? super CreatePromptResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetMessage")
    Object b(@elb GetMessageRequest getMessageRequest, lnm<? super GetMessageResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/SubmitMessage")
    Object c(@elb SubmitMessageRequest submitMessageRequest, lnm<? super SubmitMessageResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/CreateSession")
    Object d(@elb CreateSessionRequest createSessionRequest, lnm<? super CreateSessionResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("/user-prompts/spotify.user_prompts.v1.UserPromptsService/GetStatus")
    Object e(@elb GetStatusRequest getStatusRequest, lnm<? super GetStatusResponse> lnmVar);
}
