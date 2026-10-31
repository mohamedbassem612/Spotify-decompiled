package p;

import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/ao;", "", "Lp/owf0;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "", "b", "(Lp/owf0;)Lio/reactivex/rxjava3/core/Single;", "Lp/oji1;", "Lp/rji1;", "a", "(Lp/oji1;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_login_magiclinkapi-magiclinkapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface ao {
    @u360({"No-Webgate-Authentication: true"})
    @wyq0("accountrecovery/v1/username-login-hint")
    Object a(@elb oji1 oji1Var, lnm<? super rji1> lnmVar);

    @u360({"No-Webgate-Authentication: true"})
    @wyq0("accountrecovery/v3/magiclink/")
    Single<sy21<String>> b(@elb owf0 request);
}
