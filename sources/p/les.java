package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class les implements nma0 {
    public static final les b = new les();
    public final j661 a = omo1.j("android.os.Parcelable", new h661[0]);

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Parcelable deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(this.a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        Parcelable parcelable = (Parcelable) jhc1.t(bundle, str, rc11.a.b(Parcelable.class).n());
        if (parcelable != null) {
            return parcelable;
        }
        y9g1.o(str);
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(uax uaxVar, Parcelable parcelable) {
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, this.a.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putParcelable(de41Var.d, parcelable);
        }
    }

    public final h661 getDescriptor() {
        return this.a;
    }
}
