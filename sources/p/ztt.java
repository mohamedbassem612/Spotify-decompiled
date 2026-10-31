package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ztt implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Set c;

    public ztt(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.xi);
                this.c = Collections.singleton(heg1.d);
                break;
            default:
                this.b = Collections.singleton(blc0.g5);
                this.c = Collections.singleton(n7l.d);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return vtt.class;
            default:
                return tbb0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return null;
                }
                ytt yttVar = (ytt) jhc1.t(extras, "device.picker.bottom.sheet.args", ytt.class);
                if (yttVar == null) {
                    yttVar = new ytt((String) null, false);
                }
                return yttVar;
            default:
                String stringExtra = intent.getStringExtra("episode_uri");
                if (stringExtra != null) {
                    return new icb0(stringExtra);
                }
                hhg1.n("Missing required extra: episode_uri");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b6w0(true);
    }

    public final Set e() {
        byte b = this.a;
        return this.c;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Connect device picker";
            default:
                return "Transcript translation language picker bottom sheet";
        }
    }
}
