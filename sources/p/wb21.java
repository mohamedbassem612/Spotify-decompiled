package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class wb21 implements Update {
    public static final wb21 a = new wb21();

    public final Next a(Object obj, Object obj2) {
        vb21 vb21Var = (vb21) obj;
        ub21 ub21Var = (ub21) obj2;
        boolean z = vb21Var.e;
        if (ub21Var.equals(pb21.a)) {
            return z ? Next.j() : Next.a(Collections.singleton(ab21.a));
        }
        if (ub21Var.equals(qb21.a)) {
            return z ? Next.j() : Next.i(vb21.a(vb21Var, true), Collections.singleton(new eb21(vb21Var.a)));
        }
        if (ub21Var instanceof rb21) {
            return Next.a(Collections.singleton(new bb21(((rb21) ub21Var).a)));
        }
        if (ub21Var.equals(tb21.a)) {
            return Next.a(Collections.singleton(new db21(vb21Var.b)));
        }
        if (ub21Var.equals(sb21.a)) {
            return Next.i(vb21.a(vb21Var, false), Collections.singleton(cb21.a));
        }
        eg.o();
        return null;
    }
}
