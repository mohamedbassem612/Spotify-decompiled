package p;

import com.spotify.authentication.login5esperanto.EsAccessToken;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$AccessTokenResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ee implements Function {
    public final /* synthetic */ d520 a;

    public ee(d520 d520Var) {
        this.a = d520Var;
    }

    public final Object apply(Object obj) {
        ii8 gi8Var;
        ii8 fi8Var;
        EsAccessTokenClient$AccessTokenResponse esAccessTokenClient$AccessTokenResponse = (EsAccessTokenClient$AccessTokenResponse) obj;
        boolean zP = esAccessTokenClient$AccessTokenResponse.p();
        d520 d520Var = this.a;
        if (zP) {
            EsAccessToken.AccessToken accessTokenO = esAccessTokenClient$AccessTokenResponse.o();
            d520Var.getClass();
            tg8 tg8Var = (tg8) d520Var.c;
            gi8Var = new ii8(new di8(tg8Var.a.a, new wd(accessTokenO.r(), accessTokenO.q(), new Date(accessTokenO.p().q() * 1000)), tg8Var.a.c));
        } else {
            if (esAccessTokenClient$AccessTokenResponse.n().s()) {
                ug8 ug8Var = new ug8(Integer.valueOf(esAccessTokenClient$AccessTokenResponse.n().p().o()), esAccessTokenClient$AccessTokenResponse.n().p().p());
                d520Var.getClass();
                fi8Var = new fi8(ug8Var);
            } else if (esAccessTokenClient$AccessTokenResponse.n().t()) {
                d520Var.getClass();
                int i = de.a[esAccessTokenClient$AccessTokenResponse.n().q().ordinal()];
                ii8 ii8Var = ei8.a;
                if (i == 1 || i == 2 || i == 3) {
                    gi8Var = ii8Var;
                } else if (i == 4) {
                    fi8Var = new fi8(new ug8((Integer) null, "http_error"));
                } else if (i != 5) {
                    gi8Var = new fi8(new ug8((Integer) null, "Unrecognized error"));
                } else {
                    fi8Var = new fi8(new ug8((Integer) null, "offline"));
                }
            } else {
                gi8Var = new gi8(new ug8((Integer) null, "Received access token response without token or error"));
            }
            gi8Var = fi8Var;
        }
        d520Var.e = gi8Var;
        return gi8Var;
    }
}
