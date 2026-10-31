package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qza0 implements Function {
    public static final qza0 a = new qza0();

    public final Object apply(Object obj) {
        g950 g950Var = (g950) obj;
        String str = g950Var.a;
        if (g950Var.b) {
            return Single.error(new KidsGraduationException.GraduationGeoIpMismatchException("GeoIP mismatch", null));
        }
        return str.length() == 0 ? Single.error(new KidsGraduationException.GraduationTokenFetchException("Graduation token is empty", null)) : Single.just(str);
    }
}
