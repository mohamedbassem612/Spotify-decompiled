package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class lc2 implements Update {
    public static final lc2 a = new lc2();

    public final Next a(Object obj, Object obj2) {
        ahm0 ahm0Var = (ahm0) obj;
        f600 f600Var = (f600) obj2;
        if (f600Var.equals(r000.a)) {
            return Next.h(ahm0.a(ahm0Var, true));
        }
        if (f600Var.equals(b100.a)) {
            return Next.h(ahm0.a(ahm0Var, false));
        }
        if (f600Var instanceof o100) {
            o100 o100Var = (o100) f600Var;
            return Next.a(Collections.singleton(new tcw(o100Var.a, o100Var.b)));
        }
        if (f600Var instanceof w100) {
            return Next.a(Collections.singleton(new raw(ahm0Var.c, ((w100) f600Var).a)));
        }
        eg.o();
        return null;
    }
}
