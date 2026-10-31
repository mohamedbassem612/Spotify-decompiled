package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k9a1 implements acr0 {
    public final a7a1 a;
    public final Set b;

    public k9a1(a7a1 a7a1Var) {
        this.a = a7a1Var;
        this.b = a7a1Var.a ? Collections.singleton(blc0.Eh) : new LinkedHashSet();
    }

    public final Set a() {
        return this.b;
    }

    public final Class b() {
        return u8a1.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle extras;
        String strR = s4b1Var.r();
        String strZ = s4b1Var.z();
        if (strZ == null) {
            strZ = "";
        }
        Long lValueOf = null;
        if (intent.hasExtra("extra_background_color") && (extras = intent.getExtras()) != null) {
            lValueOf = Long.valueOf(extras.getLong("extra_background_color"));
        }
        return new i9a1(lValueOf, strR, strZ);
    }

    public final String getDescription() {
        return "Song dna page";
    }

    public final boolean isEnabled() {
        return this.a.a;
    }
}
