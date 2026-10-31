package p;

import com.spotify.idj.v1.GetPermissionRequest;
import com.spotify.idj.v1.GetPermissionResponse;
import com.spotify.idj.v1.MicPermissionPageRequest;
import com.spotify.idj.v1.MicPermissionPageResponse;
import com.spotify.idj.v1.SetPermissionRequest;
import com.spotify.idj.v1.SetPermissionResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/jmk1;", "", "Lcom/spotify/idj/v1/GetPermissionRequest;", "request", "Lcom/spotify/idj/v1/GetPermissionResponse;", "a", "(Lcom/spotify/idj/v1/GetPermissionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/idj/v1/SetPermissionRequest;", "Lcom/spotify/idj/v1/SetPermissionResponse;", "c", "(Lcom/spotify/idj/v1/SetPermissionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/idj/v1/MicPermissionPageRequest;", "Lcom/spotify/idj/v1/MicPermissionPageResponse;", "b", "(Lcom/spotify/idj/v1/MicPermissionPageRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_endless_voicedata_api-api"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface jmk1 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("idj-state-manager/spotify.idj.v1.PermissionService/GetRecordingStoragePermission")
    Object a(@elb GetPermissionRequest getPermissionRequest, lnm<? super GetPermissionResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("idj-state-manager/spotify.idj.v1.PermissionService/MicPermissionPage")
    Object b(@elb MicPermissionPageRequest micPermissionPageRequest, lnm<? super MicPermissionPageResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("idj-state-manager/spotify.idj.v1.PermissionService/SetRecordingStoragePermission")
    Object c(@elb SetPermissionRequest setPermissionRequest, lnm<? super SetPermissionResponse> lnmVar);
}
