package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sza0 implements Function {
    public final /* synthetic */ wza0 a;
    public final /* synthetic */ String b;

    public sza0(wza0 wza0Var, String str) {
        this.a = wza0Var;
        this.b = str;
    }

    public final Object apply(Object obj) {
        p941 p941Var = (p941) obj;
        boolean z = p941Var instanceof l941;
        String str = this.b;
        if (z) {
            wza0 wza0Var = this.a;
            return wza0Var.e.a().concatMapCompletable(new bm00((Object) wza0Var, (byte) 24)).o(Functions.h).e(wza0Var.h.firstOrError().onErrorResumeNext(uza0.a).flatMap(new vza0(str)));
        }
        if (p941Var instanceof j941) {
            return Single.error(new KidsGraduationException.SaveCurrentUserException("Failed to save current user", null));
        }
        if (!(p941Var instanceof n941)) {
            eg.o();
            return null;
        }
        Single singleJust = Single.just(str);
        singleJust.getClass();
        return singleJust;
    }
}
