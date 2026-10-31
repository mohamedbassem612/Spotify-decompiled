package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class r71 implements Update {
    public static final r71 a = new r71();

    public final Next a(Object obj, Object obj2) {
        t71 t71Var = (t71) obj;
        n71 n71Var = (n71) obj2;
        if (n71Var instanceof k71) {
            return Next.i(t71.a(t71Var, 2), Collections.singleton(new x61(((k71) n71Var).a)));
        }
        if (n71Var instanceof l71) {
            return Next.i(t71.a(t71Var, 1), Collections.singleton(b71.c));
        }
        if (!(n71Var instanceof m71)) {
            eg.o();
            return null;
        }
        m71 m71Var = (m71) n71Var;
        boolean z = m71Var.f;
        String str = m71Var.e;
        x8t0 x8t0Var = m71Var.c;
        String str2 = m71Var.b;
        String str3 = m71Var.a;
        boolean z2 = m71Var.d;
        boolean z3 = x8t0Var instanceof u8t0;
        z61 z61Var = z61.c;
        if (z3) {
            return Next.i(t71.a(t71Var, 2), Collections.singleton(z61Var));
        }
        if (x8t0Var instanceof w8t0) {
            if (z2) {
                return Next.i(t71.a(t71Var, 2), Collections.singleton(new c71(str3, str2, str)));
            }
            return Next.i(t71.a(t71Var, 2), Collections.singleton(z ? new a71(str) : new x61(str)));
        }
        if (!(x8t0Var instanceof v8t0)) {
            if (x8t0Var instanceof s8t0) {
                return z2 ? Next.i(t71.a(t71Var, 2), Collections.singleton(new c71(str3, str2, str))) : Next.i(t71.a(t71Var, 2), Collections.singleton(new y61(((s8t0) x8t0Var).a(), str)));
            }
            eg.o();
            return null;
        }
        if (((v8t0) x8t0Var).a) {
            return Next.i(t71.a(t71Var, 2), Collections.singleton(z61Var));
        }
        if (z2) {
            return Next.i(t71.a(t71Var, 2), Collections.singleton(new c71(str3, str2, str)));
        }
        return Next.i(t71.a(t71Var, 2), Collections.singleton(z ? new a71(str) : new x61(str)));
    }
}
