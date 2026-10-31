package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ane implements nma0 {
    public static final j661 a = omo1.j("kotlin.Array<kotlin.CharSequence>", new h661[0]);

    public static CharSequence[] a(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        y9g1.o(str);
        throw null;
    }
}
