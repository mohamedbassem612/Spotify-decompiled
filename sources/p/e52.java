package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e52 implements Update {
    public final Next a(Object obj, Object obj2) {
        h52 h52Var = (h52) obj;
        c52 c52Var = (c52) obj2;
        if (!(c52Var instanceof y42)) {
            if (c52Var instanceof x42) {
                return Next.h(h52.a(h52Var, null, null, null, false, false, true, 3071));
            }
            if (c52Var instanceof z42) {
                return Next.i(h52.a(h52Var, null, null, null, true, false, false, 7167), Effects.a(new s42[]{new s42("https://www.spotify.com/account/profile")}));
            }
            if (c52Var instanceof w42) {
                return Next.i(h52.a(h52Var, null, null, null, true, false, false, 7167), Effects.a(new s42[]{new s42("https://www.spotify.com/account/privacy/#tailored-ads")}));
            }
            if (c52Var instanceof b52) {
                return Next.i(h52.a(h52Var, null, null, null, false, false, false, 7167), Effects.a(new r42[]{new r42(((b52) c52Var).a)}));
            }
            if (c52Var instanceof a52) {
                return Next.a(Collections.singleton(p42.a));
            }
            eg.o();
            return null;
        }
        y42 y42Var = (y42) c52Var;
        String str = y42Var.b;
        boolean z = y42Var.c;
        ArrayList arrayList = y42Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            wrd1 wrd1Var = (wrd1) obj3;
            if (wrd1Var == wrd1.AGE || wrd1Var == wrd1.GENDER) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            wrd1 wrd1Var2 = (wrd1) obj4;
            if (wrd1Var2 == wrd1.GEO || wrd1Var2 == wrd1.INTEREST) {
                arrayList3.add(obj4);
            }
        }
        return Next.h(h52.a(h52Var, str, arrayList2, arrayList3, false, z, false, 4223));
    }
}
