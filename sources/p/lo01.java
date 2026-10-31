package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lo01 implements ko01 {
    public final ko01 a;

    public lo01(RetrofitMaker retrofitMaker) {
        this.a = (ko01) retrofitMaker.createWebgateService(ko01.class, "android-profile-profilemainsections");
    }

    public final Single a(String str) {
        return this.a.a(str);
    }
}
