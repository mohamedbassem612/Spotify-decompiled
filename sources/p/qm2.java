package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class qm2 implements Update {
    public static final qm2 a = new qm2();

    public final Next a(Object obj, Object obj2) {
        Object next;
        s2j1 s2j1Var;
        wm2 wm2Var = (wm2) obj;
        mm2 mm2Var = (mm2) obj2;
        String str = null;
        if (mm2Var instanceof jm2) {
            jm2 jm2Var = (jm2) mm2Var;
            s2j1 s2j1Var2 = jm2Var.a;
            int i = jm2Var.b;
            Iterator it = wm2Var.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                m2j1 m2j1Var = (m2j1) next;
                if (m2j1Var instanceof l2j1) {
                    s2j1Var = s2j1.a;
                } else {
                    if (!(m2j1Var instanceof k2j1)) {
                        eg.o();
                        return null;
                    }
                    s2j1Var = s2j1.b;
                }
            } while (s2j1Var != s2j1Var2);
            l2j1 l2j1Var = (m2j1) next;
            if (l2j1Var != null) {
                if (l2j1Var instanceof l2j1) {
                    str = l2j1Var.b;
                } else {
                    if (!(l2j1Var instanceof k2j1)) {
                        eg.o();
                        return null;
                    }
                    str = ((k2j1) l2j1Var).b;
                }
            }
            return str == null ? Next.j() : Next.a(Collections.singleton(new vk2(s2j1Var2, str, i)));
        }
        boolean z = mm2Var instanceof im2;
        t2j1 t2j1Var = t2j1.a;
        t2j1 t2j1Var2 = t2j1.b;
        if (z) {
            im2 im2Var = (im2) mm2Var;
            int iOrdinal = im2Var.a.ordinal();
            if (iOrdinal == 0) {
                return Next.h(wm2.a(wm2Var, false, false, t2j1Var, 63));
            }
            if (iOrdinal == 1) {
                return Next.h(wm2.a(wm2Var, false, false, t2j1Var2, 63));
            }
            if (iOrdinal == 2) {
                return Next.i(wm2.a(wm2Var, true, false, null, 119), Collections.singleton(new bl2(im2Var.b, im2Var.c)));
            }
            eg.o();
            return null;
        }
        if (mm2Var instanceof fm2) {
            return Next.a(Collections.singleton(dl2.a));
        }
        if (mm2Var instanceof zl2) {
            return Next.a(Collections.singleton(sk2.a));
        }
        if (mm2Var instanceof gm2) {
            return wm2Var.d ? Next.i(wm2.a(wm2Var, false, true, null, 103), Collections.singleton(cl2.a)) : Next.j();
        }
        boolean z2 = mm2Var instanceof lm2;
        al2 al2Var = al2.a;
        if (z2) {
            int iOrdinal2 = ((lm2) mm2Var).a.ordinal();
            if (iOrdinal2 == 0) {
                return Next.i(wm2.a(wm2Var, false, false, null, 111), Collections.singleton(al2Var));
            }
            if (iOrdinal2 == 1) {
                return Next.h(wm2.a(wm2Var, false, false, t2j1Var2, 47));
            }
            if (iOrdinal2 == 2) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (mm2Var instanceof km2) {
            return Next.i(wm2.a(wm2Var, false, false, null, 111), Collections.singleton(al2Var));
        }
        if (!(mm2Var instanceof em2)) {
            if (mm2Var instanceof bm2) {
                return Next.a(Collections.singleton(wk2.a));
            }
            if (mm2Var instanceof am2) {
                return Next.a(Collections.singleton(tk2.a));
            }
            eg.o();
            return null;
        }
        int iOrdinal3 = ((em2) mm2Var).a.ordinal();
        if (iOrdinal3 == 0) {
            return Next.h(wm2.a(wm2Var, false, false, t2j1Var, 63));
        }
        if (iOrdinal3 == 1) {
            return Next.h(wm2.a(wm2Var, false, false, t2j1Var2, 63));
        }
        if (iOrdinal3 == 2) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
