package p;

import android.os.Bundle;
import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b391 implements nma0 {
    public static final b391 a = new b391();
    public static final j661 b = omo1.j("android.util.Size", new h661[0]);

    public final Object deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(b.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        y9g1.o(str);
        throw null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Size size = (Size) obj;
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, b.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putSize(de41Var.d, size);
        }
    }
}
