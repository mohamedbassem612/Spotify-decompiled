package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class re41 implements nma0 {
    public static final re41 a = new re41();
    public static final j661 b = omo1.j("androidx.savedstate.SavedState", new h661[0]);

    public final Object deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(b.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        boolean zJ = u890.j(ce41Var.d, "");
        Bundle bundle = ce41Var.b;
        if (zJ) {
            return bundle;
        }
        String str = ce41Var.d;
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        y9g1.o(str);
        throw null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, b.a));
            return;
        }
        de41 de41Var = (de41) uaxVar;
        boolean zJ = u890.j(de41Var.d, "");
        Bundle bundle2 = de41Var.b;
        if (zJ) {
            bundle2.putAll(bundle);
        } else {
            bundle2.putBundle(de41Var.d, bundle);
        }
    }
}
