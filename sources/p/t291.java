package p;

import android.os.Bundle;
import android.util.SizeF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t291 implements nma0 {
    public static final t291 a = new t291();
    public static final j661 b = omo1.j("android.util.SizeF", new h661[0]);

    public final Object deserialize(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(b.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
        }
        y9g1.o(str);
        throw null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        SizeF sizeF = (SizeF) obj;
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, b.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putSizeF(de41Var.d, sizeF);
        }
    }
}
