package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bvo1 extends px40 {
    public final boolean E() {
        return false;
    }

    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return iInterfaceQueryLocalInterface instanceof b7o1 ? (b7o1) iInterfaceQueryLocalInterface : new b7o1(iBinder);
    }

    public final pl10[] e() {
        return fqo1.c;
    }

    public final int l() {
        return 17895000;
    }

    public final String o() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    public final String p() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    public final boolean s() {
        return true;
    }
}
