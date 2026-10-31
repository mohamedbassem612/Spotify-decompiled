package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class nk81 implements Update {
    public static final nk81 a = new nk81();

    public final Next a(Object obj, Object obj2) {
        bhm0 bhm0Var = (bhm0) obj;
        g600 g600Var = (g600) obj2;
        String str = bhm0Var.c;
        if (g600Var.equals(q000.a)) {
            return Next.h(bhm0.a(bhm0Var, null, true, 5));
        }
        if (g600Var.equals(a100.a)) {
            return Next.h(bhm0.a(bhm0Var, null, false, 5));
        }
        if (g600Var.equals(n100.a)) {
            return Next.a(Collections.singleton(ucw.c));
        }
        if (g600Var.equals(v100.a)) {
            if (str == null) {
                str = "";
            }
            return Next.a(Collections.singleton(new qaw(str)));
        }
        if (g600Var.equals(e200.a)) {
            return Next.i(bhm0.a(bhm0Var, ndh1.f, false, 6), Collections.singleton(waw.c));
        }
        if (g600Var.equals(e100.a)) {
            if (str == null) {
                str = "";
            }
            return Next.a(Collections.singleton(new qaw(str)));
        }
        if (g600Var instanceof g200) {
            return Next.h(new bhm0(pdh1.f, false, ((g200) g600Var).a));
        }
        if (g600Var.equals(f200.a)) {
            return Next.h(bhm0.a(bhm0Var, jdh1.f, false, 6));
        }
        eg.o();
        return null;
    }
}
