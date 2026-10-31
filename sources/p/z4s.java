package p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z4s implements nma0 {
    public static final z4s b = new z4s();
    public final j661 a = omo1.j("java.io.Serializable", new h661[0]);

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Serializable deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(this.a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        Serializable serializableV = jhc1.v(bundle, str, rc11.a.b(Serializable.class).n());
        if (serializableV != null) {
            return serializableV;
        }
        y9g1.o(str);
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(uax uaxVar, Serializable serializable) {
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, this.a.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putSerializable(de41Var.d, serializable);
        }
    }

    public final h661 getDescriptor() {
        return this.a;
    }
}
