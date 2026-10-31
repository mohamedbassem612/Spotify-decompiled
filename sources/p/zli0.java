package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class zli0 implements Update {
    public static final zli0 a = new zli0();

    public final Next a(Object obj, Object obj2) {
        bmi0 bmi0Var = (bmi0) obj;
        xli0 xli0Var = (xli0) obj2;
        boolean z = xli0Var instanceof vli0;
        ygk1 ygk1Var = ogk1.a;
        if (z) {
            if (((vli0) xli0Var).a.length() == 0) {
                ygk1Var = gfk1.a;
            }
            return Next.h(bmi0.a(bmi0Var, ygk1Var));
        }
        if (xli0Var instanceof uli0) {
            uli0 uli0Var = (uli0) xli0Var;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = uli0Var.a;
            if (i == 1) {
                linkedHashSet.add(new qli0(bmi0Var.a, uli0Var.b));
            }
            if (yli0.a[l1d.C(i)] != 1) {
                ygk1Var = sfk1.a;
            }
            return Next.i(bmi0.a(bmi0Var, ygk1Var), linkedHashSet);
        }
        if (xli0Var instanceof wli0) {
            return Next.i(bmi0.a(bmi0Var, ugk1.a), Collections.singleton(new rli0(((wli0) xli0Var).a, bmi0Var.b, bmi0Var.c)));
        }
        if (xli0Var instanceof tli0) {
            return Next.h(bmi0.a(bmi0Var, tgk1.a));
        }
        if (xli0Var.equals(sli0.b)) {
            return Next.h(bmi0.a(bmi0Var, qgk1.a));
        }
        if (xli0Var.equals(sli0.a)) {
            return Next.h(bmi0.a(bmi0Var, efk1.a));
        }
        eg.o();
        return null;
    }
}
