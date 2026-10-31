package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tqr0 implements nma0 {
    public static final tqr0 a = new tqr0();
    public static final j661 b = omo1.j("kotlin.collections.List<android.os.Parcelable>", new h661[0]);

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(b.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        ArrayList arrayListU = jhc1.u(bundle, str, rc11.a.b(Parcelable.class).n());
        if (arrayListU != null) {
            return arrayListU;
        }
        y9g1.o(str);
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(uax uaxVar, List list) {
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, b.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putParcelableArrayList(de41Var.d, mth1.H(list));
        }
    }

    public final h661 getDescriptor() {
        return b;
    }
}
