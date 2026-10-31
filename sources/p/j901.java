package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class j901 implements Update {
    public static final j901 a = new j901();

    public final Next a(Object obj, Object obj2) {
        m901 m901Var = (m901) obj;
        i901 i901Var = (i901) obj2;
        if (i901Var instanceof b901) {
            return Next.a(Collections.singleton(x801.a));
        }
        if (i901Var.equals(c901.a)) {
            return Next.a(Collections.singleton(y801.a));
        }
        if (i901Var instanceof g901) {
            g901 g901Var = (g901) i901Var;
            return Next.h(m901.a(m901Var, null, null, 0, 0, 0, u2p1.k(m901Var.i, g901Var.a), false, g901Var.b ? 4 : 1, false, false, 6911));
        }
        if (i901Var instanceof h901) {
            return Next.h(m901.a(m901Var, null, null, 0, 0, 0, null, false, ((h901) i901Var).a, false, false, 7167));
        }
        if (i901Var instanceof e901) {
            return Next.h(m901.a(m901Var, null, null, 0, 0, 0, null, false, 0, ((e901) i901Var).a, false, 6143));
        }
        if (i901Var instanceof d901) {
            return Next.a(Collections.singleton(new z801(m901Var.a, m901Var.b)));
        }
        if (i901Var instanceof f901) {
            f901 f901Var = (f901) i901Var;
            return Next.h(m901.a(m901Var, f901Var.a, f901Var.b, f901Var.c, f901Var.d, f901Var.e, f901Var.f, f901Var.g, f901Var.h, false, f901Var.i, 2061));
        }
        eg.o();
        return null;
    }
}
