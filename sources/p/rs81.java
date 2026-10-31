package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsRequest;
import com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsResponse;
import com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequest;
import com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsResponse;
import com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequest;
import com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsResponse;
import com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest;
import com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponse;
import com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequest;
import com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/rs81;", "", "Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextRequest;", "request", "Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextResponse;", "d", "(Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsResponse;", "a", "(Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsResponse;", "e", "(Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsResponse;", "c", "(Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackRequest;", "Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackResponse;", "b", "(Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_endless_sillywalk_network-network"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface rs81 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GetAckCommentaryAndPrepareRecs")
    Object a(@elb GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest, lnm<? super GetAckCommentaryAndPrepareRecsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/SubmitFeedback")
    Object b(@elb SubmitFeedbackRequest submitFeedbackRequest, lnm<? super SubmitFeedbackResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GetSuggestedPrompts")
    Object c(@elb GetSuggestedPromptsRequest getSuggestedPromptsRequest, lnm<? super GetSuggestedPromptsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/ResolveInteractiveContext")
    Object d(@elb ResolveInteractiveContextRequest resolveInteractiveContextRequest, lnm<? super ResolveInteractiveContextResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GenerateAndPlayRecs")
    Object e(@elb GenerateAndPlayRecsRequest generateAndPlayRecsRequest, lnm<? super GenerateAndPlayRecsResponse> lnmVar);
}
