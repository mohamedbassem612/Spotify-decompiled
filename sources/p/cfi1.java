package p;

import android.net.Uri;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cfi1 implements afi1 {
    public final afi1 a;

    public cfi1(RetrofitMaker retrofitMaker) {
        this.a = (afi1) retrofitMaker.createWebgateService(afi1.class, "android-profile-userprofileview");
    }

    @Override // p.afi1
    public final Single a(String str) {
        return this.a.a(Uri.encode(str));
    }

    @Override // p.afi1
    public final Single b(String str) {
        return this.a.b(Uri.encode(str));
    }

    @Override // p.afi1
    public final Single c(String str) {
        return this.a.c(Uri.encode(str));
    }

    @Override // p.afi1
    public final Single d(String str) {
        return this.a.d(Uri.encode(str));
    }

    @Override // p.afi1
    public final Single e(String str, Boolean bool) {
        return this.a.e(Uri.encode(str), bool);
    }
}
