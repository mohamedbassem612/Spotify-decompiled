package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pwj implements acr0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Set c;

    public pwj(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = Collections.singleton(blc0.Tg);
                break;
            case 2:
                this.b = z;
                this.c = Collections.singleton(blc0.Sg);
                break;
            case 3:
                this.b = z;
                this.c = Collections.singleton(blc0.Tg);
                break;
            default:
                this.b = z;
                this.c = Collections.singleton(blc0.Sg);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return gwj.class;
            case 1:
                return ayj.class;
            case 2:
                return u801.class;
            default:
                return lz51.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                p901 p901Var = (p901) ila0.s(intent, "readAlongFullScreen", p901.class);
                return p901Var == null ? new p901("", true) : p901Var;
            case 1:
                c061 c061Var = (c061) ila0.s(intent, "selectionParams", c061.class);
                return c061Var == null ? new c061() : c061Var;
            case 2:
                p901 p901Var2 = (p901) ila0.s(intent, "readAlongFullScreen", p901.class);
                return p901Var2 == null ? new p901("", true) : p901Var2;
            default:
                c061 c061Var2 = (c061) ila0.s(intent, "selectionParams", c061.class);
                return c061Var2 == null ? new c061() : c061Var2;
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Compose page which shows the page transcription";
            case 1:
                return "Compose page that allows the user to select lines to share";
            case 2:
                return "Page which shows the page transcription";
            default:
                return "Page that allows the user to select lines to share";
        }
    }

    public final boolean isEnabled() {
        boolean z;
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                z = this.b;
                break;
            default:
                z = this.b;
                break;
        }
        return !z;
    }
}
