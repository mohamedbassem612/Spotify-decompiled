package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8e implements acr0 {
    public final /* synthetic */ byte a;
    public final oto0 b;
    public final Set c;

    public j8e(oto0 oto0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = oto0Var;
                this.c = Collections.singleton(blc0.Vb);
                break;
            default:
                this.b = oto0Var;
                this.c = Collections.singleton(blc0.Tb);
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
                return o7e.class;
            default:
                return rdb0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                return new i8e(intent.getParcelableExtra("SELECTED_ITEM"), s4b1Var.j());
            default:
                return feb0.a;
        }
    }

    public final e6w0 d() {
        byte b = this.a;
        return a6w0.a;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page API implementation of Category Details";
            default:
                return "Page that displays languages available for push and email notifications";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        oto0 oto0Var = this.b;
        switch (b) {
            case 0:
                return oto0Var.a.c();
            default:
                return oto0Var.a.e();
        }
    }
}
