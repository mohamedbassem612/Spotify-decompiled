package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ac60 implements acr0 {
    public final of60 a;
    public final boolean b;
    public final Set c = Collections.singleton(blc0.Z9);

    public ac60(of60 of60Var, boolean z) {
        this.a = of60Var;
        this.b = z;
    }

    public final Set a() {
        return this.c;
    }

    public final Class b() {
        return xb60.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Long lD0;
        String stringExtra = intent.getStringExtra("highlight_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String strO = s4b1Var.o(2);
        Long l = null;
        if (strO != null && (lD0 = nhc1.d0(10, strO)) != null && lD0.longValue() > 0) {
            l = lD0;
        }
        return new zb60(l, stringExtra);
    }

    public final String getDescription() {
        return "Highlight Details Page (Listening Stats)";
    }

    public final boolean isEnabled() {
        return ((Boolean) this.a.b().blockingFirst()).booleanValue() && this.b;
    }
}
