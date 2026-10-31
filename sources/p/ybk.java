package p;

import com.spotify.concertcampaignview.v1.CampaignActionRequest;
import com.spotify.concertcampaignview.v1.CampaignActionResponse;
import com.spotify.concertcampaignview.v1.CampaignCard;
import com.spotify.concertcampaignview.v1.CampaignCardRequest;
import com.spotify.concertcampaignview.v1.CampaignRoutingCardRequest;
import com.spotify.concertcampaignview.v1.ConcertCampaignPage;
import com.spotify.concertcampaignview.v1.ConcertCampaignPageRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/ybk;", "", "Lcom/spotify/concertcampaignview/v1/ConcertCampaignPageRequest;", "request", "Lcom/spotify/concertcampaignview/v1/ConcertCampaignPage;", "e", "(Lcom/spotify/concertcampaignview/v1/ConcertCampaignPageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignCardRequest;", "Lcom/spotify/concertcampaignview/v1/CampaignCard;", "c", "(Lcom/spotify/concertcampaignview/v1/CampaignCardRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignRoutingCardRequest;", "b", "(Lcom/spotify/concertcampaignview/v1/CampaignRoutingCardRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignActionRequest;", "Lcom/spotify/concertcampaignview/v1/CampaignActionResponse;", "d", "(Lcom/spotify/concertcampaignview/v1/CampaignActionRequest;Lp/lnm;)Ljava/lang/Object;", "a", "src_main_java_com_spotify_liveevents_concertcampaignpagedata-concertcampaignpagedata"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface ybk {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignUpdateService/CantAttend")
    Object a(@elb CampaignActionRequest campaignActionRequest, lnm<? super CampaignActionResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignRoutingCardService/GetCampaignRoutingCard")
    Object b(@elb CampaignRoutingCardRequest campaignRoutingCardRequest, lnm<? super CampaignCard> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignCardService/GetCampaignCard")
    Object c(@elb CampaignCardRequest campaignCardRequest, lnm<? super CampaignCard> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignUpdateService/JoinWaitlist")
    Object d(@elb CampaignActionRequest campaignActionRequest, lnm<? super CampaignActionResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignPageService/GetConcertCampaignPage")
    Object e(@elb ConcertCampaignPageRequest concertCampaignPageRequest, lnm<? super ConcertCampaignPage> lnmVar);
}
