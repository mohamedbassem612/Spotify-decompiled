package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7o implements acr0 {
    public final Set a = Collections.singleton(blc0.vi);

    public final Set a() {
        return this.a;
    }

    public final Class b() {
        return z6o.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        return new c7o(s4b1Var.z(), s4b1Var.r(), th61Var.a);
    }

    public final e6w0 d() {
        return new b6w0(true);
    }

    public final Set e() {
        return w7x.a;
    }

    public final String getDescription() {
        return "Page to show bottomsheet credits";
    }
}
