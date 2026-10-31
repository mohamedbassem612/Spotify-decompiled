package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cgf implements acr0 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final Set c;

    public cgf(caq caqVar, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = caqVar;
                this.c = Collections.singleton(blc0.Nj);
                break;
            default:
                this.b = caqVar;
                this.c = Collections.singleton(blc0.W9);
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
                return tff.class;
            case 1:
                return y4j1.class;
            default:
                return i4m1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                if (strZ == null) {
                    strZ = "";
                }
                String strJ = s4b1Var.j();
                return new agf(strZ, strJ != null ? strJ : "", intent.getBooleanExtra("com.spotify.liveroom.listeningpartychat.SHOW_ENHANCED_CHAT", false));
            case 1:
                Bundle extras = intent.getExtras();
                return new z4j1(extras != null ? extras.getBoolean("has_expired") : false);
            default:
                Uri uri = s4b1Var.a;
                String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
                return new k4m1("spotify:playlist:".concat(lastPathSegment != null ? lastPathSegment : ""), th61Var.a);
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new b6w0(false);
            default:
                return new b6w0(true);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Listening party chat sheet";
            case 1:
                return "Non-blocking dialog to inform users about expired app versions";
            default:
                return "Bottom sheet for configuring workout playlist settings";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return ((qq4) kly0Var.get()).a();
            case 1:
                return ((Boolean) kly0Var.get()).booleanValue();
            default:
                return ((fj4) kly0Var.get()).b();
        }
    }

    public cgf(gbp gbpVar) {
        this.a = (byte) 1;
        this.b = gbpVar;
        this.c = Collections.singleton(blc0.kj);
    }
}
