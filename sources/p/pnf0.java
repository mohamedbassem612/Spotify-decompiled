package p;

import com.spotify.common.uri.SpotifyUriParserException;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pnf0 implements onf0 {
    public final ygf0 a;
    public final kly0 b;
    public final kly0 c;
    public final m980 d;
    public final krh e;

    public pnf0(ygf0 ygf0Var, caq caqVar, caq caqVar2, m980 m980Var, krh krhVar) {
        this.a = ygf0Var;
        this.b = caqVar;
        this.c = caqVar2;
        this.d = m980Var;
        this.e = krhVar;
    }

    @Override // p.onf0
    public final Single a(String str) {
        String str2;
        try {
            str2 = new y6b1(str, false).e;
            if (str2 == null) {
                str2 = "";
            }
        } catch (SpotifyUriParserException unused) {
        }
        return this.a.b(str2, this.d.i()).map(f610.Z);
    }

    @Override // p.onf0
    public final Single b(String str, String str2) {
        String str3;
        try {
            str3 = new y6b1(str, false).e;
            if (str3 == null) {
                str3 = "";
            }
        } catch (SpotifyUriParserException unused) {
        }
        String str4 = str3;
        jo4 jo4Var = (jo4) this.b.get();
        Single singleOnErrorReturnItem = ((rm4) this.c.get()).b() ? rqt0.G(new p6d0(this, (lnm) null, (byte) 22)).onErrorReturnItem(Boolean.FALSE) : Single.just(Boolean.FALSE);
        singleOnErrorReturnItem.getClass();
        return singleOnErrorReturnItem.flatMap(new w6e0(this, str4, jo4Var, str2, (byte) 12));
    }
}
