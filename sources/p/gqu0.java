package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.proto.ClaimPermissionGrantResponse;
import com.spotify.playlist.proto.Permission;
import com.spotify.playlist.proto.PermissionGrant;
import com.spotify.playlist.proto.PermissionGrantDescription;
import com.spotify.playlist.proto.PermissionGrantOptions;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ.\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\rJ8\u0010\u0014\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lp/gqu0;", "", "", "uriKind", "uriId", "Lcom/spotify/playlist/proto/PermissionGrantOptions;", "grantOptions", "Lcom/spotify/playlist/proto/PermissionGrant;", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/playlist/proto/PermissionGrantOptions;Lp/lnm;)Ljava/lang/Object;", "token", "Lcom/spotify/playlist/proto/ClaimPermissionGrantResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/playlist/proto/PermissionGrantDescription;", "a", "username", "Lcom/spotify/playlist/proto/Permission;", "b", "permission", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/playlist/proto/Permission;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_listplatform_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface gqu0 {
    @ay30("playlist-permission/v1/{uri-kind}/{uri-id}/permission-grant/token/{token}/describe")
    Object a(@t8s0(encoded = true, value = "uri-kind") String str, @t8s0("uri-id") String str2, @t8s0("token") String str3, lnm<? super PermissionGrantDescription> lnmVar);

    @ay30("playlist-permission/v1/{uri-kind}/{uri-id}/permission/member/user/{username}")
    Object b(@t8s0(encoded = true, value = "uri-kind") String str, @t8s0("uri-id") String str2, @t8s0("username") String str3, lnm<? super Permission> lnmVar);

    @wyq0("playlist-permission/v1/{uri-kind}/{uri-id}/permission-grant")
    Object c(@t8s0(encoded = true, value = "uri-kind") String str, @t8s0("uri-id") String str2, @elb PermissionGrantOptions permissionGrantOptions, lnm<? super PermissionGrant> lnmVar);

    @wyq0("playlist-permission/v1/{uri-kind}/{uri-id}/permission/member/user/{username}")
    Object d(@t8s0(encoded = true, value = "uri-kind") String str, @t8s0("uri-id") String str2, @t8s0("username") String str3, @elb Permission permission, lnm<Object> lnmVar);

    @wyq0("playlist-permission/v1/{uri-kind}/{uri-id}/permission-grant/token/{token}/claim")
    Object e(@t8s0(encoded = true, value = "uri-kind") String str, @t8s0("uri-id") String str2, @t8s0("token") String str3, lnm<? super ClaimPermissionGrantResponse> lnmVar);
}
