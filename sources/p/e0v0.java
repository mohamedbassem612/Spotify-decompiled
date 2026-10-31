package p;

import android.net.Uri;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e0v0 implements yzu0 {
    public final yzu0 a;

    public e0v0(RetrofitMaker retrofitMaker) {
        this.a = (yzu0) retrofitMaker.createWebgateService(yzu0.class, "android-profile-profilemainsections");
    }

    @Override // p.yzu0
    public final Single a(String str) {
        return this.a.a(Uri.encode(str));
    }
}
