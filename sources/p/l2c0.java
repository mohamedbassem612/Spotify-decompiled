package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class l2c0 implements Update {
    public static final l2c0 a = new l2c0();

    public final Next a(Object obj, Object obj2) {
        n2c0 n2c0Var = (n2c0) obj;
        b600 b600Var = (b600) obj2;
        if (b600Var instanceof m100) {
            return Next.a(Collections.singleton(new edw(n2c0Var.d)));
        }
        if (b600Var instanceof l200) {
            boolean z = ((l200) b600Var).a;
            return Next.i(n2c0.a(n2c0Var, z, false, 191), Collections.singleton(new hcw(z)));
        }
        if (b600Var instanceof t100) {
            boolean z2 = ((t100) b600Var).a;
            return Next.i(n2c0.a(n2c0Var, false, z2, 127), Collections.singleton(new jcw(z2)));
        }
        if (b600Var instanceof u100) {
            return Next.a(Collections.singleton(new rdw(((u100) b600Var).a)));
        }
        if (b600Var instanceof j200) {
            return Next.a(Collections.singleton(new rdw(((j200) b600Var).a)));
        }
        if (b600Var instanceof m200) {
            return Next.a(Collections.singleton(new rdw(((m200) b600Var).a)));
        }
        if (b600Var instanceof k000) {
            return Next.a(Collections.singleton(new rdw(((k000) b600Var).a)));
        }
        if (b600Var instanceof i100) {
            return Next.a(Collections.singleton(new rdw(((i100) b600Var).a)));
        }
        if (b600Var instanceof h200) {
            return Next.a(Collections.singleton(new rdw(((h200) b600Var).a)));
        }
        if (b600Var.equals(h100.a)) {
            return Next.h(n2c0.a(n2c0Var, false, false, 223));
        }
        if (b600Var.equals(s000.a)) {
            return Next.a(Collections.singleton(wbw.a));
        }
        if (b600Var.equals(y100.a)) {
            return Next.a(Collections.singleton(y8w.a));
        }
        eg.o();
        return null;
    }
}
