package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9n1 extends px40 {
    public final boolean E() {
        return true;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        z7n1 z7n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return z7n1VarQueryLocalInterface instanceof y8n1 ? (y8n1) z7n1VarQueryLocalInterface : new y8n1(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final pl10[] e() {
        return upo1.b;
    }

    public final int l() {
        return 17895000;
    }

    public final String o() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    public final String p() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    public final boolean s() {
        return true;
    }
}
