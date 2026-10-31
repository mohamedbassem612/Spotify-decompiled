package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class z4d0 implements Update {
    public final Next a(Object obj, Object obj2) {
        d5d0 d5d0Var = (d5d0) obj;
        x4d0 x4d0Var = (x4d0) obj2;
        Set set = d5d0Var.e;
        if (x4d0Var instanceof w4d0) {
            Set setV0 = dm61.v0(((w4d0) x4d0Var).a, d5d0Var.d);
            d5d0 d5d0VarA = d5d0.a(d5d0Var, false, false, null, dm61.y0(set, setV0), 111);
            if (setV0.isEmpty()) {
                return Next.j();
            }
            return (d5d0Var.c || d5d0Var.b) ? Next.h(d5d0VarA) : yi20.j(d5d0VarA);
        }
        boolean z = x4d0Var instanceof u4d0;
        if (z || (x4d0Var instanceof v4d0)) {
            d5d0 d5d0VarA2 = d5d0.a(d5d0Var, false, false, null, null, 123);
            if (z) {
                d5d0VarA2 = d5d0.a(d5d0VarA2, false, false, dm61.y0(d5d0VarA2.d, ((u4d0) x4d0Var).a), null, 119);
            }
            return (d5d0VarA2.b || d5d0VarA2.e.isEmpty()) ? Next.h(d5d0VarA2) : yi20.j(d5d0VarA2);
        }
        if (x4d0Var instanceof s4d0) {
            d5d0 d5d0VarA3 = d5d0.a(d5d0Var, false, false, null, null, 125);
            return (d5d0VarA3.c || d5d0VarA3.e.isEmpty()) ? Next.h(d5d0VarA3) : yi20.j(d5d0VarA3);
        }
        if (x4d0Var instanceof t4d0) {
            return Next.h(d5d0.a(d5d0Var, false, false, w7x.a, null, 119));
        }
        if (x4d0Var instanceof r4d0) {
            return Next.h(d5d0.a(d5d0Var, false, false, null, dm61.v0(set, ((r4d0) x4d0Var).a), 111));
        }
        eg.o();
        return null;
    }
}
