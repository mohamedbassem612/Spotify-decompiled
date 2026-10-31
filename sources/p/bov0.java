package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bov0 implements acr0 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final Set c;

    public bov0(thq thqVar) {
        this.a = (byte) 1;
        this.b = thqVar;
        this.c = Collections.singleton(nl0.d);
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return znv0.class;
            default:
                return e561.class;
        }
    }

    public final /* bridge */ /* synthetic */ Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        byte b = this.a;
        return aqr0.a;
    }

    public final Set e() {
        byte b = this.a;
        return this.c;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Settings page listing ad categories the user prefers to see";
            default:
                return "Settings page listing sensitive ad categories the user can opt out of";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ((Boolean) kly0Var.get()).booleanValue();
    }

    public bov0(jly0 jly0Var) {
        this.a = (byte) 0;
        this.b = jly0Var;
        this.c = Collections.singleton(ml0.d);
    }
}
