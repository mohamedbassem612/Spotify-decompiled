package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class srr0 implements Update {
    public static final srr0 a = new srr0();

    public final Next a(Object obj, Object obj2) {
        rhm0 rhm0Var = (rhm0) obj;
        z500 z500Var = (z500) obj2;
        if (z500Var instanceof eyz) {
            return Next.h(rhm0.a(rhm0Var, ((eyz) z500Var).a, false, 23));
        }
        if (z500Var instanceof mvz) {
            mvz mvzVar = (mvz) z500Var;
            rhm0 rhm0VarA = rhm0.a(rhm0Var, null, false, 15);
            int iC = l1d.C(mvzVar.a);
            if (iC == 0) {
                return Next.i(rhm0VarA, Collections.singleton(ycw.a));
            }
            if (iC == 1) {
                return Next.i(rhm0VarA, Collections.singleton(new mdw(mvzVar.b)));
            }
            eg.o();
            return null;
        }
        if (z500Var.equals(lvz.a)) {
            return Next.h(rhm0.a(rhm0Var, null, false, 15));
        }
        if (z500Var.equals(nxz.a)) {
            e6r e6rVar = rhm0Var.d;
            return (rhm0Var.e || e6rVar == null) ? Next.j() : Next.i(rhm0.a(rhm0Var, null, true, 15), Collections.singleton(new c9w(String.format(Locale.ROOT, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(e6rVar.a), Integer.valueOf(e6rVar.b + 1), Integer.valueOf(e6rVar.c)}, 3)))));
        }
        if (z500Var.equals(gyz.a)) {
            return Next.a(Collections.singleton(v9w.a));
        }
        eg.o();
        return null;
    }
}
