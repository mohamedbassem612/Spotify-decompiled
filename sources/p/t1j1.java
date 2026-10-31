package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class t1j1 implements Update {
    public static final t1j1 a = new t1j1();

    public final Next a(Object obj, Object obj2) {
        x1j1 x1j1Var = (x1j1) obj;
        s1j1 s1j1Var = (s1j1) obj2;
        if (s1j1Var.equals(p1j1.a) || s1j1Var.equals(r1j1.a)) {
            if (x1j1Var instanceof w1j1) {
                return Next.a(Collections.singleton(f1j1.a));
            }
            if (x1j1Var instanceof v1j1) {
                return Next.a(Collections.singleton(e1j1.a));
            }
            eg.o();
            return null;
        }
        if (s1j1Var instanceof q1j1) {
            return Next.a(Collections.singleton(new g1j1(((q1j1) s1j1Var).a)));
        }
        if (s1j1Var.equals(o1j1.a)) {
            return Next.a(Collections.singleton(h1j1.a));
        }
        eg.o();
        return null;
    }
}
