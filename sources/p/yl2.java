package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/yl2;", "", "", "entityURI", "", "staging", "Lio/reactivex/rxjava3/core/Single;", "Lp/pk2;", "a", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_ageverification_dialog-dialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface yl2 {
    @ay30("age-verification/v1/dialog/{entityURI}")
    Single<pk2> a(@t8s0("entityURI") String entityURI, @u0z0("staging") boolean staging);
}
