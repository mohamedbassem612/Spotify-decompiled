package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/qw21;", "", "Lcom/spotify/rcs/resolver/grpc/v0/ResolveRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/rcs/resolver/grpc/v0/ResolveResponse;", "c", "(Lcom/spotify/rcs/resolver/grpc/v0/ResolveRequest;)Lio/reactivex/rxjava3/core/Single;", "", "etag", "b", "(Lcom/spotify/rcs/resolver/grpc/v0/ResolveRequest;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/remoteconfig/commons/nebula/GetAttributesResponse;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "p/pw21", "src_main_java_com_spotify_remoteconfig_fetcherimpl-fetcherimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface qw21 {
    public static final pw21 a = pw21.a;

    @ay30("nebula/v1/configuration/attributes")
    @u360({"Accept: application/x-protobuf", "Cache-Control: no-cache"})
    Object a(@dv50("if-none-match") String str, lnm<? super sy21<GetAttributesResponse>> lnmVar);

    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @wyq0("remote-config-resolver/v3/configuration")
    Object b(@elb ResolveRequest resolveRequest, @dv50("if-none-match") String str, lnm<? super sy21<ResolveResponse>> lnmVar);

    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf", "No-Webgate-Authentication: true"})
    @wyq0("remote-config-resolver/v3/unauth/configuration/")
    Single<sy21<ResolveResponse>> c(@elb ResolveRequest request);
}
