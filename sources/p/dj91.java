package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class dj91 implements Update {
    public final Next a(Object obj, Object obj2) {
        ij91 ij91Var = (ij91) obj;
        wi91 wi91Var = (zi91) obj2;
        String str = ij91Var.a;
        Set set = ij91Var.c;
        nl91 nl91Var = ij91Var.d;
        boolean z = wi91Var instanceof wi91;
        w7x w7xVar = w7x.a;
        if (z) {
            return Next.i(ij91.a(ij91Var, null, wi91Var.a, 7), w7xVar);
        }
        if (wi91Var instanceof vi91) {
            tl91 tl91Var = ((vi91) wi91Var).a;
            if (tl91Var instanceof pl91) {
                return Next.i(ij91Var, Collections.singleton(new ni91(((pl91) tl91Var).a)));
            }
            if (tl91Var instanceof rl91) {
                rl91 rl91Var = (rl91) tl91Var;
                return Next.i(ij91Var, Collections.singleton(new pi91(rl91Var.a, rl91Var.b)));
            }
            if (tl91Var instanceof ql91) {
                return Next.i(ij91Var, Collections.singleton(new oi91(((ql91) tl91Var).a)));
            }
            if (tl91Var instanceof sl91) {
                return Next.i(ij91Var, Collections.singleton(new qi91(((sl91) tl91Var).a)));
            }
            eg.o();
            return null;
        }
        if (wi91Var instanceof ti91) {
            ti91 ti91Var = (ti91) wi91Var;
            int i = ti91Var.a;
            if (nl91Var != null) {
                return Next.i(ij91.a(ij91Var, dm61.x0(Integer.valueOf(i), set), null, 11), Collections.singleton(new mi91(nl91Var.a, new cl91(str, ti91Var.b), Integer.valueOf(i))));
            }
            return Next.j();
        }
        if (wi91Var instanceof si91) {
            si91 si91Var = (si91) wi91Var;
            int i2 = si91Var.a;
            if (nl91Var != null) {
                return Next.i(ij91.a(ij91Var, dm61.x0(Integer.valueOf(i2), set), null, 11), Collections.singleton(new mi91(nl91Var.a, new bl91(str, si91Var.b, si91Var.c), Integer.valueOf(i2))));
            }
            return Next.j();
        }
        if (wi91Var instanceof xi91) {
            xi91 xi91Var = (xi91) wi91Var;
            return nl91Var != null ? Next.a(Collections.singleton(new mi91(nl91Var.a, new al91(xi91Var.a, str, xi91Var.b), null))) : Next.j();
        }
        if (wi91Var instanceof yi91) {
            return Next.i(ij91.a(ij91Var, dm61.v0(set, dm61.A0(((yi91) wi91Var).b.g)), null, 11), w7xVar);
        }
        eg.o();
        return null;
    }
}
