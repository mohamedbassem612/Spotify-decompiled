package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vza0 implements Function {
    public final /* synthetic */ String a;

    public vza0(String str) {
        this.a = str;
    }

    public final Object apply(Object obj) {
        c0b0 c0b0Var = (c0b0) obj;
        if (c0b0Var instanceof a0b0) {
            ((a0b0) c0b0Var).a.c(yg8.N0, 0);
            return Single.just(this.a);
        }
        if (c0b0Var.equals(b0b0.a)) {
            return Single.error(new KidsGraduationException.LogoutUserException("Failed to fetch logged-in dependencies", null));
        }
        eg.o();
        return null;
    }
}
