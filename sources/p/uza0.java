package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uza0 implements Function {
    public static final uza0 a = new uza0();

    public final Object apply(Object obj) {
        return Single.error(new KidsGraduationException.LogoutUserException("Failed to fetch logged-in dependencies", (Throwable) obj));
    }
}
