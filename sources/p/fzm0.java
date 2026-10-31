package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzm0 {
    public final xov0 a;
    public final String b;

    public fzm0(xov0 xov0Var, String str) {
        this.a = xov0Var;
        this.b = str;
    }

    public final Single a() {
        String str = this.b;
        if ("com.android.vending".equals(str) || "com.google.android.feedback".equals(str)) {
            Single singleJust = Single.just(Boolean.TRUE);
            singleJust.getClass();
            return singleJust;
        }
        Single map = this.a.a().map(dj20.d);
        map.getClass();
        return map;
    }
}
