package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8i1 implements acr0 {
    public final kly0 a;
    public final boolean b;
    public final Set c = Collections.singleton(blc0.h8);

    public x8i1(jly0 jly0Var, boolean z) {
        this.a = jly0Var;
        this.b = z;
    }

    public final Set a() {
        return this.c;
    }

    public final Class b() {
        return u8i1.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle extras = intent.getExtras();
        return new w8i1(extras != null ? extras.getString("screenshotFilePath") : null);
    }

    public final e6w0 d() {
        return new b6w0(false);
    }

    public final String getDescription() {
        return "The bottomsheet entry point for the user feedback journey";
    }

    public final boolean isEnabled() {
        return !this.b && ((d35) this.a.get()).c();
    }
}
