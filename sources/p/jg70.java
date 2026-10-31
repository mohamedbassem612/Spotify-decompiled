package p;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jg70 implements nma0 {
    public static final j661 a = omo1.j("android.os.IBinder", new h661[0]);

    public static IBinder a(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        y9g1.o(str);
        throw null;
    }
}
