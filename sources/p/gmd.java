package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H'¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H'¢\u0006\u0004\b\u0007\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/gmd;", "", "Lio/reactivex/rxjava3/core/Single;", "c", "()Lio/reactivex/rxjava3/core/Single;", "Lp/hp40;", "b", "a", "src_main_java_com_spotify_audiobookpremium_cappingdatasource-cappingdatasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface gmd {
    @ay30("audiobook-capping-view/v1/getQuotas/android")
    Single<hp40> a();

    @ay30("audiobook-capping-view/v0/getQuotas/android")
    Single<hp40> b();

    @ay30("audiobook-capping-view/v0/getCap")
    Single<Object> c();
}
