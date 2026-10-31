package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class li2 implements acr0 {
    public static final lik1 b;
    public final Set a = Collections.singleton(blc0.c1);

    static {
        Parcelable.Creator creator = lik1.CREATOR;
        b = oap1.i("spotify:age-signal:blocked");
    }

    public final Set a() {
        return this.a;
    }

    public final Class b() {
        return ii2.class;
    }

    public final /* bridge */ /* synthetic */ Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        return ki2.a;
    }

    public final e6w0 d() {
        return bin.s(new c6w0(1, false, (hd5) null, 14));
    }

    public final String getDescription() {
        return "A blocking page shown when app-store age-signal verification flags the current authenticated user.";
    }
}
