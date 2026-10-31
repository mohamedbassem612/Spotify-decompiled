package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pza0 implements Function {
    public static final pza0 a = new pza0();

    public final Object apply(Object obj) {
        return Single.error(new KidsGraduationException.GraduationTokenFetchException("Failed to fetch graduation token", (Throwable) obj));
    }
}
