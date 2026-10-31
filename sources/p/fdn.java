package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fdn implements acr0 {
    public final zwa a;
    public final Set b = Collections.singleton(gxu0.e);

    public fdn(zwa zwaVar) {
        this.a = zwaVar;
    }

    public final Class b() {
        return cdn.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strZ = s4b1Var.z();
        if (strZ != null) {
            return new edn(strZ, th61Var.a);
        }
        hhg1.n("Missing spotify uri for CoverArtSnake route");
        return null;
    }

    public final e6w0 d() {
        return a6w0.a;
    }

    public final Set e() {
        return this.b;
    }

    public final String getDescription() {
        return "Cover Art Snake Game";
    }

    public final boolean isEnabled() {
        return this.a.k();
    }
}
