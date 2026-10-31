package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bay implements acr0 {
    public final boolean a;
    public final boolean b;
    public final Set c = Collections.singleton(blc0.Vh);

    public bay(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final Set a() {
        return this.c;
    }

    public final Class b() {
        return d9y.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String stringExtra = intent.getStringExtra("trackURI");
        String str = stringExtra == null ? "" : stringExtra;
        long longExtra = intent.getLongExtra("timestamp", 0L);
        String stringExtra2 = intent.getStringExtra("cacheId");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        List integerArrayListExtra = intent.getIntegerArrayListExtra("selectedLineIndices");
        if (integerArrayListExtra == null) {
            integerArrayListExtra = z6x.a;
        }
        return new aay(str, longExtra, str2, integerArrayListExtra);
    }

    public final e6w0 d() {
        return new c6w0(1, false, (hd5) null, 14);
    }

    public final String getDescription() {
        return "Enhanced Share Card page";
    }

    public final boolean isEnabled() {
        return this.a || this.b;
    }
}
