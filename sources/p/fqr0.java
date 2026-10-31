package p;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fqr0 implements nma0 {
    public static final j661 a = omo1.j("kotlin.Array<android.os.Parcelable>", new h661[0]);

    public static Parcelable[] a(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) gg.q(bundle, str, rc11.a.b(Parcelable.class).n()) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        y9g1.o(str);
        throw null;
    }
}
