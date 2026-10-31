package p;

import com.spotify.lockstate.v1.proto.GetLockRequest;
import com.spotify.lockstate.v1.proto.GetLockResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/fre0;", "", "Lcom/spotify/lockstate/v1/proto/GetLockRequest;", "request", "Lcom/spotify/lockstate/v1/proto/GetLockResponse;", "a", "(Lcom/spotify/lockstate/v1/proto/GetLockRequest;Lp/lnm;)Ljava/lang/Object;", "", "path", "Lp/rih1;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_lockstate_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface fre0 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/lock-state/get-locks")
    Object a(@elb GetLockRequest getLockRequest, lnm<? super GetLockResponse> lnmVar);

    @wyq0("{path}")
    Object b(@t8s0(encoded = true, value = "path") String str, lnm<? super rih1> lnmVar);
}
