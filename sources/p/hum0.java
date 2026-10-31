package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hum0 implements acr0 {
    public final vbs a;
    public final Set b = Collections.singleton(ium0.e);

    public hum0(vbs vbsVar) {
        this.a = vbsVar;
    }

    public final Class b() {
        return c7z.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strZ = s4b1Var.z();
        if (strZ == null) {
            strZ = "";
        }
        ium0 ium0VarA = x6c0.a(strZ);
        String str = ium0VarA != null ? ium0VarA.a : null;
        String strConcat = "spotify:track:".concat(str != null ? str : "");
        Bundle bundleH = mno1.h(oqn1.n("extra_playback_context_uri", strConcat));
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundleH.putAll(extras);
        }
        return new g7z(strConcat, bundleH, th61Var.a, (Long) null, (Long) null, (Long) null, (Long) null, false, !this.a.e, false);
    }

    public final Set e() {
        return this.b;
    }

    public final String getDescription() {
        return "Route for rendering multi-song track URIs on EpisodePage";
    }
}
