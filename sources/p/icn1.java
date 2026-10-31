package p;

import android.graphics.Rect;
import java.security.Provider;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class icn1 implements ufp1, bgp1, zgn1, acp1 {
    public static final /* synthetic */ icn1 a = new icn1();
    public static final /* synthetic */ icn1 b = new icn1();

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return ugn1.b((kcn1) pno1Var);
    }

    public Object zza(Object obj) {
        nso1 nso1Var = (nso1) obj;
        a7o1 a7o1Var = nso1Var.b;
        String str = nso1Var.g;
        List listP = l0o1.p(a7o1Var);
        String str2 = nso1Var.e;
        if (upo1.K(str2)) {
            str2 = "";
        }
        String str3 = str2;
        Rect rectO = l0o1.o(listP);
        if (upo1.K(str)) {
            str = "und";
        }
        String str4 = str;
        AbstractList abstractListI = l6o1.I(Arrays.asList(nso1Var.a), new gen1());
        float f = nso1Var.b.e;
        return new qzd1(str3, rectO, listP, str4, abstractListI);
    }
}
