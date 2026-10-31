package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ja21 implements Update {
    public static final ja21 a = new ja21();

    public final Next a(Object obj, Object obj2) {
        ia21 ia21Var = (ia21) obj;
        ha21 ha21Var = (ha21) obj2;
        String str = ia21Var.a;
        boolean z = ia21Var.b;
        boolean zEquals = ha21Var.equals(ca21.a);
        q921 q921Var = q921.a;
        if (zEquals) {
            return Next.a(Collections.singleton(q921Var));
        }
        if (ha21Var.equals(da21.a)) {
            return z ? Next.j() : Next.a(Collections.singleton(q921Var));
        }
        if (ha21Var.equals(ea21.a)) {
            return !z ? Next.i(new ia21(str, true), Collections.singleton(t921.a)) : Next.j();
        }
        if (ha21Var.equals(ga21.a)) {
            return Next.a(Collections.singleton(s921.a));
        }
        if (ha21Var.equals(fa21.a)) {
            return Next.i(new ia21(str, false), Collections.singleton(r921.a));
        }
        eg.o();
        return null;
    }
}
