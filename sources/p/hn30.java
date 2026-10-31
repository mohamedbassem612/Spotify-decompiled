package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hn30 implements acr0 {
    public final /* synthetic */ byte a;
    public final b0a0 b;
    public final Set c;

    public hn30(b0a0 b0a0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = b0a0Var;
                this.c = Collections.singleton(blc0.e7);
                break;
            case 2:
                this.b = b0a0Var;
                this.c = Collections.singleton(blc0.k8);
                break;
            case 3:
                this.b = b0a0Var;
                this.c = Collections.singleton(blc0.x8);
                break;
            default:
                this.b = b0a0Var;
                this.c = Collections.singleton(blc0.d7);
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
                return dn30.class;
            case 1:
                return kn30.class;
            case 2:
                return aq90.class;
            default:
                return yms0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT = jhc1.t(extras, "free.user.shuffle.upsell.sheet.args", en30.class);
                if (objT != null) {
                    return new gn30((en30) objT);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            case 1:
                return aqr0.a;
            case 2:
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT2 = jhc1.t(extras2, "jam.ads.disclaimer.sheet.args", bq90.class);
                if (objT2 != null) {
                    return new dq90((bq90) objT2);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            default:
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT3 = jhc1.t(extras3, "jam.permission.upgrade.sheet.args", zms0.class);
                if (objT3 != null) {
                    return new bns0((zms0) objT3);
                }
                hhg1.n("No arguments in bundle!");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return new b6w0(false);
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page for the free user shuffle upsell bottom sheet";
            case 1:
                return "Page for the free user skip upsell bottom sheet";
            case 2:
                return "Page for the Jam ads disclaimer bottom sheet";
            default:
                return "Page for the Jam listen-along permission upgrade bottom sheet";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        b0a0 b0a0Var = this.b;
        switch (b) {
            case 0:
                return ((no4) b0a0Var.a.get()).p();
            case 1:
                return ((no4) b0a0Var.a.get()).q();
            case 2:
                return ((no4) b0a0Var.a.get()).w();
            default:
                return b0a0Var.a();
        }
    }
}
