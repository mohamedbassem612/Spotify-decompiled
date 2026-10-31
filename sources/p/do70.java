package p;

import android.net.Uri;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.identity.proto.v3.Identity$KidProfileUpdateRequest;
import com.spotify.identity.proto.v3.Identity$SocialHandleRequest;
import com.spotify.identity.proto.v3.Identity$UserProfileUpdateRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class do70 implements co70 {
    public final co70 a;

    public do70(RetrofitMaker retrofitMaker) {
        this.a = (co70) retrofitMaker.createWebgateService(co70.class, "android-profile-identity");
    }

    @Override // p.co70
    public final Single a(String str, Identity$SocialHandleRequest identity$SocialHandleRequest) {
        return this.a.a(Uri.encode(str), identity$SocialHandleRequest);
    }

    @Override // p.co70
    public final Object b(String str, String str2, lnm lnmVar) {
        return this.a.b(Uri.encode(str), Uri.encode(str2), lnmVar);
    }

    @Override // p.co70
    public final Completable c(String str, Identity$KidProfileUpdateRequest identity$KidProfileUpdateRequest) {
        return this.a.c(Uri.encode(str), identity$KidProfileUpdateRequest);
    }

    @Override // p.co70
    public final Completable d(String str, String str2) {
        return this.a.d(Uri.encode(str), str2);
    }

    @Override // p.co70
    public final Completable e(String str) {
        return this.a.e(Uri.encode(str));
    }

    @Override // p.co70
    public final Completable f() {
        return this.a.f();
    }

    @Override // p.co70
    public final Single g(String str, Identity$SocialHandleRequest identity$SocialHandleRequest) {
        return this.a.g(Uri.encode(str), identity$SocialHandleRequest);
    }

    @Override // p.co70
    public final Single h(String str) {
        return this.a.h(Uri.encode(str));
    }

    @Override // p.co70
    public final Completable i(String str, Identity$UserProfileUpdateRequest identity$UserProfileUpdateRequest) {
        return this.a.i(Uri.encode(str), identity$UserProfileUpdateRequest);
    }
}
