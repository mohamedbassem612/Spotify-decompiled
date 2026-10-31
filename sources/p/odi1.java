package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/odi1;", "", "", "", "languages", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Completable;", "Lio/reactivex/rxjava3/core/Single;", "b", "()Lio/reactivex/rxjava3/core/Single;", "selectedLanguages", "src_main_java_com_spotify_language_musiclanguage-musiclanguagedata"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface odi1 {
    @yyq0("language-onboarding/v1/user/languages")
    Completable a(@elb List<String> languages);

    @ay30("language-onboarding/v1/user/languages")
    Single<List<String>> b();
}
