package p;

import com.spotify.campfire.contribution.proto.v1.BatchCreateContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchCreateContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchDeleteContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchDeleteContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionSummariesRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionSummariesResponse;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.BatchUpdateContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchUpdateContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionFeatureControlRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionFeatureControlResponse;
import com.spotify.campfire.contribution.proto.v1.SetContributionFeatureControlRequest;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lp/cqm;", "", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsRequest;", "request", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsResponse;", "d", "(Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionSummariesRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionSummariesResponse;", "f", "(Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionSummariesRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsResponse;", "a", "(Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsResponse;", "g", "(Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsResponse;", "h", "(Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesResponse;", "e", "(Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/GetContributionFeatureControlRequest;", "Lcom/spotify/campfire/contribution/proto/v1/GetContributionFeatureControlResponse;", "b", "(Lcom/spotify/campfire/contribution/proto/v1/GetContributionFeatureControlRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/SetContributionFeatureControlRequest;", "c", "(Lcom/spotify/campfire/contribution/proto/v1/SetContributionFeatureControlRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface cqm {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchCreateContributions")
    Object a(@elb BatchCreateContributionsRequest batchCreateContributionsRequest, lnm<? super BatchCreateContributionsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/GetContributionFeatureControl")
    Object b(@elb GetContributionFeatureControlRequest getContributionFeatureControlRequest, lnm<? super GetContributionFeatureControlResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/SetContributionFeatureControl")
    Object c(@elb SetContributionFeatureControlRequest setContributionFeatureControlRequest, lnm<Object> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchGetContributions")
    Object d(@elb BatchGetContributionsRequest batchGetContributionsRequest, lnm<? super BatchGetContributionsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchGetContributionCapabilities")
    Object e(@elb BatchGetContributionCapabilitiesRequest batchGetContributionCapabilitiesRequest, lnm<? super BatchGetContributionCapabilitiesResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchGetContributionSummaries")
    Object f(@elb BatchGetContributionSummariesRequest batchGetContributionSummariesRequest, lnm<? super BatchGetContributionSummariesResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchUpdateContributions")
    Object g(@elb BatchUpdateContributionsRequest batchUpdateContributionsRequest, lnm<? super BatchUpdateContributionsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("contribution/v1/contributions/BatchDeleteContributions")
    Object h(@elb BatchDeleteContributionsRequest batchDeleteContributionsRequest, lnm<? super BatchDeleteContributionsResponse> lnmVar);
}
