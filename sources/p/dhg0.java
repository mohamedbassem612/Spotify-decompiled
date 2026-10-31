package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dhg0 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public dhg0(mr4 mr4Var) {
        this.a = (byte) 2;
        this.c = mr4Var;
        this.b = Collections.singleton(i03.d);
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ahg0.class;
            case 1:
                return can0.class;
            default:
                return hmk1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        switch (b) {
            case 0:
                return aqr0Var;
            case 1:
                String strZ = s4b1Var.z();
                if (strZ == null) {
                    strZ = "";
                }
                return new ean0("spotify:track:".concat(ihc1.H0(strZ, "spotify:internal:music-video-prerelease:")));
            default:
                return aqr0Var;
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A page for managing request settings across managed accounts";
            case 1:
                return "Music Video Prerelease Page";
            default:
                return "Page where the user picks the AI agent's voice character";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((sb40) obj).b.h();
            case 1:
                return ((ug4) ((d4e0) obj).b).a();
            default:
                return ((mr4) obj).z();
        }
    }

    public dhg0(sb40 sb40Var) {
        this.a = (byte) 0;
        this.c = sb40Var;
        this.b = Collections.singleton(sc40.d);
    }

    public dhg0(d4e0 d4e0Var) {
        this.a = (byte) 1;
        this.c = d4e0Var;
        this.b = Collections.singleton(jan0.e);
    }
}
