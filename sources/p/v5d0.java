package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v5d0 implements acr0 {
    public final /* synthetic */ byte a;
    public final b0a0 b;
    public final Set c;

    public v5d0(b0a0 b0a0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = b0a0Var;
                this.c = Collections.singleton(m6a0.d);
                break;
            default:
                this.b = b0a0Var;
                this.c = Collections.singleton(l6a0.d);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return s5d0.class;
            default:
                return q6d0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                Bundle extras = intent.getExtras();
                boolean z = false;
                if (extras != null && extras.getBoolean("jam.listen.along.explainer.host.onboarding")) {
                    z = true;
                }
                return new u5d0(z);
            default:
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    Object objT = jhc1.t(extras2, "jam.listen.along.onboarding.args", r6d0.class);
                    if (objT != null) {
                        return new t6d0((r6d0) objT);
                    }
                    hhg1.n("No arguments in bundle!");
                } else {
                    hhg1.n("Intent has no extras!");
                }
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            default:
                return new b6w0(false);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.c;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Bottom sheet explaining who is listening along in the current Jam, opened from the participant list";
            default:
                return "Bottom sheet explaining listen-only mode, shown once after a listen-along join";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }
}
