package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ru6 implements acr0 {
    public final /* synthetic */ byte a;
    public final f54 b;
    public final Set c;

    public ru6(f54 f54Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = f54Var;
                this.c = Collections.singleton(py6.f);
                break;
            case 2:
                this.b = f54Var;
                this.c = Collections.singleton(qy6.f);
                break;
            default:
                this.b = f54Var;
                this.c = Collections.singleton(oy6.f);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return nu6.class;
            case 1:
                return hv6.class;
            default:
                return rw6.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        qy6 qy6Var;
        byte b = this.a;
        z6x z6xVar = z6x.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Bundle extras = intent.getExtras();
                pu6 pu6Var = extras != null ? (pu6) jhc1.t(extras, "artist_releases_category_sheet_parameters", pu6.class) : null;
                if (pu6Var == null) {
                    qy6 qy6Var2 = s4b1Var.d;
                    qy6Var = qy6Var2 instanceof oy6 ? (oy6) qy6Var2 : null;
                    pu6Var = new pu6(qy6Var != null ? ((oy6) qy6Var).a : "", z6xVar, qy6Var != null ? ((oy6) qy6Var).b : "");
                }
                return pu6Var;
            case 1:
                Bundle extras2 = intent.getExtras();
                jv6 jv6Var = extras2 != null ? (jv6) jhc1.t(extras2, "artist_releases_filter_sheet_parameters", jv6.class) : null;
                if (jv6Var != null) {
                    return jv6Var;
                }
                py6 py6Var = s4b1Var.d;
                py6 py6Var2 = py6Var instanceof py6 ? py6Var : null;
                return new jv6(py6Var2 != null ? py6Var2.a : "", py6Var2 != null ? py6Var2.b : "", null, z6xVar);
            default:
                Bundle extras3 = intent.getExtras();
                tw6 tw6Var = extras3 != null ? (tw6) jhc1.t(extras3, "artist_releases_sort_sheet_parameters", tw6.class) : null;
                if (tw6Var != null) {
                    return tw6Var;
                }
                qy6 qy6Var3 = s4b1Var.d;
                qy6Var = qy6Var3 instanceof qy6 ? qy6Var3 : null;
                return new tw6(qy6Var != null ? qy6Var.a : "", qy6Var != null ? qy6Var.b : "", null, null, z6x.a);
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
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
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "Contextual category bottom sheet opened from the artist catalog page";
            case 1:
                return "Contextual filter bottom sheet opened from the artist catalog page";
            default:
                return "Contextual sort bottom sheet opened from the artist catalog page";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        f54 f54Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return f54Var.c();
    }
}
