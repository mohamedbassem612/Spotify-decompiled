package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class he90 implements acr0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Set c;

    public he90(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = Collections.singleton(hwr0.d);
                break;
            default:
                this.b = z;
                this.c = Collections.singleton(da40.d);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return fe90.class;
            default:
                return la21.class;
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
                return "A page to start the flow for linking an account to a parent";
            default:
                return "Page for a managed account to remove their parent or guardian";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
