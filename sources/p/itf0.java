package p;

import com.spotify.common.uri.SpotifyUriParserException;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class itf0 implements onf0 {
    public final ftf0 a;
    public final kly0 b;
    public final m980 c;
    public final krh d;

    public itf0(ftf0 ftf0Var, caq caqVar, m980 m980Var, krh krhVar) {
        this.a = ftf0Var;
        this.b = caqVar;
        this.c = m980Var;
        this.d = krhVar;
    }

    public final Single a(String str) {
        String str2;
        try {
            str2 = new y6b1(str, false).e;
            if (str2 == null) {
                str2 = "";
            }
        } catch (SpotifyUriParserException unused) {
        }
        return this.a.a(str2, this.c.i()).map(yb10.N0);
    }

    public final Single b(String str, String str2) {
        String str3;
        try {
            str3 = new y6b1(str, false).e;
            if (str3 == null) {
                str3 = "";
            }
        } catch (SpotifyUriParserException unused) {
        }
        return rqt0.F(o6x.a, new p6d0(this, (lnm) null, (byte) 23)).onErrorReturnItem(Boolean.FALSE).flatMap(new j2e0(this, str3, (byte) 12));
    }
}
