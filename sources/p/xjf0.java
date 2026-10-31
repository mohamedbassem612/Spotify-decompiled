package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xjf0 implements acr0 {
    public final kly0 a;

    public xjf0(gbp gbpVar) {
        this.a = gbpVar;
    }

    @Override // p.acr0
    public final Set a() {
        return Collections.singleton(blc0.LYRICS_FULLSCREEN_CURRENT_TRACK);
    }

    @Override // p.acr0
    public final Class b() {
        return qjf0.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle extras = intent.getExtras();
        return extras != null ? i1k0.y(extras) : new wjf0();
    }

    @Override // p.acr0
    public final e6w0 d() {
        return a6w0.a;
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Lyrics fullscreen page";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        cr4 cr4Var = (cr4) this.a.get();
        return cr4Var.a() || cr4Var.b();
    }
}
