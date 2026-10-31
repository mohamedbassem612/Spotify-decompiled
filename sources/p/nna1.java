package p;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nna1 implements nma0 {
    public static final nna1 a = new nna1();
    public static final j661 b = omo1.j("android.util.SparseArray<android.os.Parcelable>", new h661[0]);

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SparseArray deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(b.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        SparseArray sparseArrayV = Build.VERSION.SDK_INT >= 34 ? gg.v(bundle, str, rc11.a.b(Parcelable.class).n()) : bundle.getSparseParcelableArray(str);
        if (sparseArrayV != null) {
            return sparseArrayV;
        }
        y9g1.o(str);
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(uax uaxVar, SparseArray sparseArray) {
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, b.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putSparseParcelableArray(de41Var.d, sparseArray);
        }
    }

    public final h661 getDescriptor() {
        return b;
    }
}
