package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class de90 implements acr0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Set c;

    public de90(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = Collections.singleton(ka40.e);
                break;
            case 2:
                this.b = z;
                this.c = Collections.singleton(ja40.e);
                break;
            case 3:
                this.b = z;
                this.c = Collections.singleton(la40.e);
                break;
            default:
                this.b = z;
                this.c = Collections.singleton(ea40.d);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ae90.class;
            case 1:
                return qur0.class;
            case 2:
                return a971.class;
            default:
                return jwd1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                return aqr0.a;
            case 1:
                return new sur0(((ka40) s4b1Var.d).a);
            case 2:
                return new c971(((ja40) s4b1Var.d).a, th61Var.a);
            default:
                String str = ((la40) s4b1Var.d).a;
                Bundle extras = intent.getExtras();
                return new mwd1(str, extras != null ? extras.getString("date_of_birth") : null);
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new b6w0(true);
            case 2:
                return new b6w0(true);
            default:
                return new c6w0(1, true, (hd5) null, 12);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.c;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A page to choose an account linking invite method";
            case 1:
                return "A page to share the parental consent request for account linking";
            case 2:
                return "A page to share an account linking invite link";
            default:
                return "A page to educate parents about teen account linking";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }
}
