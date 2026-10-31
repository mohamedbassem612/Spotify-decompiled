package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rpz0 implements acr0 {
    public final Set a = Collections.singleton(blc0.RADIO_ROOT);

    @Override // p.acr0
    public final Set a() {
        return this.a;
    }

    @Override // p.acr0
    public final Class b() {
        return jpz0.class;
    }

    @Override // p.acr0
    public final /* bridge */ /* synthetic */ Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        return aqr0.a;
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Displays Radio Hub page.";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return true;
    }
}
