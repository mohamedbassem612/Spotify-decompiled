package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p3v0 implements tjm {
    public final h6v0 a;

    public p3v0(h6v0 h6v0Var) {
        this.a = h6v0Var;
    }

    public final Completable a() {
        return ((s8u0) this.a).b(null).ignoreElement();
    }

    public final Single d() {
        return ((s8u0) this.a).e(null).map(kc20.c1);
    }

    public final Single e(sjm sjmVar) {
        String strUri = sjmVar.b.uri();
        String str = sjmVar.a;
        return ((s8u0) this.a).c(new d6v0(strUri, str, Collections.singletonList(new b6v0(str, "")), null, gqt0.a)).map(kc20.c1);
    }
}
