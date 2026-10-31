package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class y240 implements Update {
    public final Next a(Object obj, Object obj2) {
        e340 e340Var = (e340) obj;
        x240 x240Var = (x240) obj2;
        long j = e340Var.h;
        int i = e340Var.d;
        int i2 = e340Var.e;
        Object obj3 = null;
        int i3 = 0;
        if (!(x240Var instanceof r240)) {
            boolean z = x240Var instanceof t240;
            h240 h240Var = h240.a;
            if (z) {
                t240 t240Var = (t240) x240Var;
                List list = e340Var.b;
                if (i2 != 3) {
                    return Next.j();
                }
                int i4 = i + 1;
                return i4 < list.size() ? Next.i(e340.a(e340Var, i4, 2, t240Var.a, null, 455), f46.S0(new i240[]{new d240(((l1z0) list.get(i4)).b), new g240(j, i4)})) : Next.a(f46.S0(new i240[]{h240Var, new f240(e340Var.a, e340Var.i, t240Var.b)}));
            }
            if (x240Var instanceof w240) {
                return (i2 == 3 || i != ((w240) x240Var).a) ? Next.j() : bk20.c(e340Var, null, j, 0);
            }
            if (x240Var instanceof u240) {
                return i2 != 1 ? Next.j() : Next.i(e340.a(e340Var, 0, 2, ((u240) x240Var).a, null, 463), f46.S0(new i240[]{new d240(e340Var.b().b), new g240(j, i)}));
            }
            if (x240Var instanceof v240) {
                String str = e340Var.g.g;
                return ihc1.y0(str) ? Next.j() : Next.a(Collections.singleton(new e240(str)));
            }
            if (x240Var instanceof s240) {
                return Next.a(f46.S0(new i240[]{h240Var, c240.a}));
            }
            eg.o();
            return null;
        }
        r240 r240Var = (r240) x240Var;
        String str2 = r240Var.a;
        int iC = l1d.C(i2);
        if (iC != 0) {
            if (iC == 1) {
                long jR = yoi1.r(r240Var.b - e340Var.f, 0L, e340Var.h);
                if (str2.equals(e340Var.b().d)) {
                    for (Object obj4 : o7h.a1(e340Var.c, new cvt((byte) 9))) {
                        if (jR < ((mo41) obj4).c) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    mo41 mo41Var = (mo41) obj3;
                    if (mo41Var != null) {
                        i3 = mo41Var.b;
                    }
                }
                return bk20.c(e340Var, str2, jR, i3);
            }
            if (iC != 2) {
                eg.o();
                return null;
            }
        }
        return Next.j();
    }
}
