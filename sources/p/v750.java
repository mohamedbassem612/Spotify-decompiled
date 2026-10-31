package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class v750 implements Update {
    public static final v750 a = new v750();

    public final Next a(Object obj, Object obj2) {
        p750 p750Var = (p750) obj;
        h600 h600Var = (h600) obj2;
        boolean z = p750Var.b;
        v850 v850Var = p750Var.a;
        if (h600Var.equals(p000.a)) {
            return Next.a(Collections.singleton(t9w.b));
        }
        if (h600Var.equals(p000.b)) {
            return Next.i(new p750(v850Var, z, false), Collections.singleton(iaw.a));
        }
        if (h600Var.equals(p000.d)) {
            return Next.i(new p750(v850Var, z, true), Collections.singleton(few.a));
        }
        if (h600Var instanceof q100) {
            return Next.a(Collections.singleton(new adw(((q100) h600Var).a)));
        }
        if (h600Var.equals(p000.c)) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
