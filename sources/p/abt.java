package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class abt implements vdh {
    public final xap a;

    public abt(xap xapVar) {
        this.a = xapVar;
    }

    public static eeh d(String str) {
        return new eeh(2, str != null ? cy30.g("com.spotify.music.extra.ERROR_MESSAGE", str) : null);
    }

    public final boolean a(String str) {
        return "check_denied".equals(str);
    }

    public final Single b(Bundle bundle) {
        if (bundle == null) {
            return Single.just(d("Extras are null"));
        }
        String string = bundle.getString("com.spotify.music.extra.PACKAGE_NAME", null);
        return string == null ? Single.just(d("Missing package name extra")) : this.a.d(string).map(new ofr((byte) 21)).onErrorReturn(new ofr((byte) 22));
    }

    public final String c() {
        return "check_denied";
    }
}
