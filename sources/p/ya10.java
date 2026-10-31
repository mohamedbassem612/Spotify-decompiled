package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/ya10;", "", "Lp/c841;", "request", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Lp/c841;)Lio/reactivex/rxjava3/core/Completable;", "Lio/reactivex/rxjava3/core/Single;", "Lp/xa10;", "a", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_partneraccountlinking_common-common"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface ya10 {
    @ay30("external-user-accounts/v1/status")
    Single<xa10> a();

    @wyq0("external-user-accounts/v1/link/samsung")
    Completable b(@elb c841 request);
}
