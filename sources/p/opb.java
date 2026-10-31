package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/opb;", "", "Lcom/spotify/rcs/resolver/grpc/v0/ResolveRequest;", "request", "Lp/sy21;", "Lp/uz21;", "a", "(Lcom/spotify/rcs/resolver/grpc/v0/ResolveRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/remoteconfig/commons/nebula/GetAttributesResponse;", "b", "(Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_remoteconfig_bootstrapservice-bootstrapservice"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface opb {
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @wyq0("remote-config-resolver/v3/configuration")
    Object a(@elb ResolveRequest resolveRequest, lnm<? super sy21<uz21>> lnmVar);

    @ay30("nebula/v1/configuration/attributes")
    @u360({"Accept: application/x-protobuf", "Cache-Control: no-cache"})
    Object b(lnm<? super sy21<GetAttributesResponse>> lnmVar);
}
