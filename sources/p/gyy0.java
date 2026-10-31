package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/gyy0;", "", "Lp/nxy0;", "registrationData", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Lp/nxy0;)Lio/reactivex/rxjava3/core/Completable;", "", "Lp/eyy0;", "unregisterData", "a", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_notifications_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface gyy0 {
    @wyq0("pushka-tokens/delete")
    Completable a(@elb List<eyy0> unregisterData);

    @wyq0("pushka-tokens/register/v3")
    Completable b(@elb nxy0 registrationData);
}
