package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esg0 implements acr0 {
    public static final Pattern b;
    public final Set a = Collections.singleton(blc0.SHOW_MARK_AS_PLAYED);

    static {
        new ulc((byte) 15);
        b = Pattern.compile("spotify:show:[a-zA-Z0-9]{22}:markasplayed");
    }

    @Override // p.acr0
    public final Set a() {
        return this.a;
    }

    @Override // p.acr0
    public final Class b() {
        return bsg0.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strZ = s4b1Var.z();
        if (strZ == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String strI = ulc.i(strZ);
        Bundle extras = intent.getExtras();
        return new dsg0(strI, th61Var.a, extras != null ? extras.getBoolean("fromPodcastSettingsPage") : false);
    }

    @Override // p.acr0
    public final e6w0 d() {
        return a6w0.a;
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Page API implementation of Mark as Played";
    }
}
