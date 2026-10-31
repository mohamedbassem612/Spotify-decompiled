package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dne implements nma0 {
    public static final j661 a = omo1.j("kotlin.CharSequence", new h661[0]);

    public static CharSequence a(dar darVar) {
        if (!(darVar instanceof ce41)) {
            hhg1.f(i541.y(a.a, darVar));
            return null;
        }
        ce41 ce41Var = (ce41) darVar;
        Bundle bundle = ce41Var.b;
        String str = ce41Var.d;
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        y9g1.o(str);
        throw null;
    }

    public static void b(uax uaxVar, CharSequence charSequence) {
        if (!(uaxVar instanceof de41)) {
            hhg1.f(i541.z(uaxVar, a.a));
        } else {
            de41 de41Var = (de41) uaxVar;
            de41Var.b.putCharSequence(de41Var.d, charSequence);
        }
    }

    public final /* bridge */ /* synthetic */ Object deserialize(dar darVar) {
        return a(darVar);
    }

    public final h661 getDescriptor() {
        return a;
    }

    public final /* bridge */ /* synthetic */ void serialize(uax uaxVar, Object obj) {
        b(uaxVar, (CharSequence) obj);
    }
}
