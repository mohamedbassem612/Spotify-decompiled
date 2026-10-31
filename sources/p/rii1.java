package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rii1 implements acr0 {
    public final boolean a;
    public final boolean b;
    public final Set c = Collections.singleton(blc0.LISTENING_STATS);

    public rii1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // p.acr0
    public final Set a() {
        return this.c;
    }

    @Override // p.acr0
    public final Class b() {
        return oii1.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        return new qii1();
    }

    @Override // p.acr0
    public final String getDescription() {
        return "User Timeline (Listening Stats)";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return this.a && !this.b;
    }
}
