package p;

import com.spotify.agentgateway.v1.CreateConversationRequest;
import com.spotify.agentgateway.v1.CreateConversationResponse;
import com.spotify.agentgateway.v1.CreatePlaylistFromListRequest;
import com.spotify.agentgateway.v1.CreatePlaylistFromListResponse;
import com.spotify.agentgateway.v1.DeleteConversationRequest;
import com.spotify.agentgateway.v1.GetAvailablePersonasRequest;
import com.spotify.agentgateway.v1.GetAvailablePersonasResponse;
import com.spotify.agentgateway.v1.GetConversationListResponse;
import com.spotify.agentgateway.v1.GetConversationRequest;
import com.spotify.agentgateway.v1.GetConversationResponse;
import com.spotify.agentgateway.v1.GetConversationStartersRequest;
import com.spotify.agentgateway.v1.GetConversationStartersResponse;
import com.spotify.agentgateway.v1.GetProgressStagesRequest;
import com.spotify.agentgateway.v1.GetProgressStagesResponse;
import com.spotify.agentgateway.v1.RecordEventInConversationRequest;
import com.spotify.agentgateway.v1.SendMessageInConversationRequest;
import com.spotify.agentgateway.v1.SendMessageRequest;
import com.spotify.agentgateway.v1.SendMessageResponse;
import com.spotify.agentgateway.v1.SendMessageWithImageRequest;
import com.spotify.agentgateway.v1.StopGenerationRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,J \u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020-H§@¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\b\u0001\u0010\u0003\u001a\u000200H§@¢\u0006\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Lp/vt2;", "", "Lcom/spotify/agentgateway/v1/CreateConversationRequest;", "request", "Lcom/spotify/agentgateway/v1/CreateConversationResponse;", "h", "(Lcom/spotify/agentgateway/v1/CreateConversationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/SendMessageRequest;", "Lcom/spotify/agentgateway/v1/SendMessageResponse;", "g", "(Lcom/spotify/agentgateway/v1/SendMessageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/SendMessageInConversationRequest;", "a", "(Lcom/spotify/agentgateway/v1/SendMessageInConversationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/SendMessageWithImageRequest;", "k", "(Lcom/spotify/agentgateway/v1/SendMessageWithImageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/GetConversationStartersRequest;", "Lcom/spotify/agentgateway/v1/GetConversationStartersResponse;", "d", "(Lcom/spotify/agentgateway/v1/GetConversationStartersRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/GetConversationRequest;", "Lcom/spotify/agentgateway/v1/GetConversationResponse;", "l", "(Lcom/spotify/agentgateway/v1/GetConversationRequest;Lp/lnm;)Ljava/lang/Object;", "Lp/tn21;", "Lcom/spotify/agentgateway/v1/GetConversationListResponse;", "c", "(Lp/tn21;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/DeleteConversationRequest;", "Lp/sy21;", "Ljava/lang/Void;", "b", "(Lcom/spotify/agentgateway/v1/DeleteConversationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/GetProgressStagesRequest;", "Lcom/spotify/agentgateway/v1/GetProgressStagesResponse;", "f", "(Lcom/spotify/agentgateway/v1/GetProgressStagesRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/CreatePlaylistFromListRequest;", "Lcom/spotify/agentgateway/v1/CreatePlaylistFromListResponse;", "m", "(Lcom/spotify/agentgateway/v1/CreatePlaylistFromListRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/RecordEventInConversationRequest;", "j", "(Lcom/spotify/agentgateway/v1/RecordEventInConversationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/StopGenerationRequest;", "e", "(Lcom/spotify/agentgateway/v1/StopGenerationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/agentgateway/v1/GetAvailablePersonasRequest;", "Lcom/spotify/agentgateway/v1/GetAvailablePersonasResponse;", "i", "(Lcom/spotify/agentgateway/v1/GetAvailablePersonasRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_martini_martinidataimpl-martinidataimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface vt2 {
    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/SendMessageInConversation")
    Object a(@elb SendMessageInConversationRequest sendMessageInConversationRequest, lnm<? super SendMessageResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/DeleteConversation")
    Object b(@elb DeleteConversationRequest deleteConversationRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/GetConversationList")
    Object c(@elb tn21 tn21Var, lnm<? super GetConversationListResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/GetConversationStarters")
    Object d(@elb GetConversationStartersRequest getConversationStartersRequest, lnm<? super GetConversationStartersResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/StopGeneration")
    Object e(@elb StopGenerationRequest stopGenerationRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/GetProgressStages")
    Object f(@elb GetProgressStagesRequest getProgressStagesRequest, lnm<? super GetProgressStagesResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/SendMessage")
    Object g(@elb SendMessageRequest sendMessageRequest, lnm<? super SendMessageResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/CreateConversation")
    Object h(@elb CreateConversationRequest createConversationRequest, lnm<? super CreateConversationResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/GetAvailablePersonas")
    Object i(@elb GetAvailablePersonasRequest getAvailablePersonasRequest, lnm<? super GetAvailablePersonasResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/RecordEventInConversation")
    Object j(@elb RecordEventInConversationRequest recordEventInConversationRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/SendMessageWithImage")
    Object k(@elb SendMessageWithImageRequest sendMessageWithImageRequest, lnm<? super SendMessageResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/GetConversation")
    Object l(@elb GetConversationRequest getConversationRequest, lnm<? super GetConversationResponse> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("agent-gateway/spotify.agentgateway.v1.AgentGatewayService/CreatePlaylistFromList")
    Object m(@elb CreatePlaylistFromListRequest createPlaylistFromListRequest, lnm<? super CreatePlaylistFromListResponse> lnmVar);
}
