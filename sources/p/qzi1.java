package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class qzi1 implements Update {
    public static final qzi1 a = new qzi1();

    public final Next a(Object obj, Object obj2) {
        pzi1 pzi1Var = (pzi1) obj2;
        wzi1 wzi1Var = ((xzi1) obj).a;
        if (!pzi1Var.equals(ozi1.a)) {
            if (!pzi1Var.equals(lzi1.a) && !pzi1Var.equals(mzi1.a)) {
                if (pzi1Var instanceof nzi1) {
                    return Next.a(Collections.singleton(new dzi1(((nzi1) pzi1Var).a)));
                }
                eg.o();
                return null;
            }
            if (wzi1Var instanceof uzi1) {
                return Next.a(Collections.singleton(bzi1.a));
            }
            if (wzi1Var instanceof vzi1) {
                return Next.a(Collections.singleton(czi1.a));
            }
            eg.o();
            return null;
        }
        if (!(wzi1Var instanceof uzi1)) {
            if (wzi1Var instanceof vzi1) {
                eg.m("Next button can not be clicked in first step");
                return null;
            }
            eg.o();
            return null;
        }
        uzi1 uzi1Var = (uzi1) wzi1Var;
        int iOrdinal = uzi1Var.a.ordinal();
        if (iOrdinal == 0) {
            return Next.i(new xzi1(new uzi1(tzi1.c, uzi1Var.b, uzi1Var.c, uzi1Var.d)), Collections.singleton(ezi1.a));
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        eg.m("Next button can not be clicked in first step");
        return null;
    }
}
