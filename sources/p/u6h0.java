package p;

import android.net.Uri;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class u6h0 {
    public static final se11 a = new se11("[^\\p{L}\\p{M}\\p{N}]+");

    public static final Next A(a6h0 a6h0Var, k3h0 k3h0Var) {
        boolean z = a6h0Var.f;
        boolean z2 = k3h0Var.a;
        return z == z2 ? Next.j() : Next.h(a6h0.a(a6h0Var, null, null, false, false, null, z2, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -33));
    }

    public static final Next B(a6h0 a6h0Var, l3h0 l3h0Var) {
        return a6h0Var.c ? Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, l3h0Var.a, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8193)) : Next.j();
    }

    public static final Next C(a6h0 a6h0Var, m3h0 m3h0Var) {
        int iHashCode = a6h0Var.hashCode();
        String str = m3h0Var.a;
        g5h0 g5h0Var = new g5h0(null, ab80.m(iHashCode, str.hashCode(), ":"), str);
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            h5h0 h5h0Var = (h5h0) obj;
            if (!(h5h0Var instanceof e5h0) && !(h5h0Var instanceof x4h0)) {
                arrayList.add(obj);
            }
        }
        c380 c380VarA = mqo1.A(o7h.O0(g5h0Var, arrayList));
        String lowerCase = a6h0Var.b == null ? UUID.randomUUID().toString().toLowerCase(Locale.ROOT) : null;
        long j = a6h0Var.E + 1;
        a6h0 a6h0VarA = a6h0.a(a6h0Var, c380VarA, null, true, false, null, false, null, m3h0Var.b, false, null, null, false, null, null, null, false, false, null, fg91.b, false, 0L, null, null, lowerCase, j, null, -1778917638);
        String str2 = m3h0Var.a;
        String str3 = a6h0Var.b;
        tv80 tv80Var = m3h0Var.b;
        boolean z = a6h0Var.j;
        e0h0 e0h0Var = new e0h0(str2, c380VarA, str3, lowerCase, tv80Var, z, "suggested_prompt", j);
        rzg0 rzg0Var = new rzg0(str2, str3, z);
        izg0 izg0Var = new izg0(a6h0Var.A);
        if (!a6h0Var.z) {
            izg0Var = null;
        }
        return Next.i(a6h0VarA, dm61.B0(new k0h0[]{e0h0Var, rzg0Var, izg0Var}));
    }

    public static final Next D(a6h0 a6h0Var) {
        String str = a6h0Var.b;
        if (str == null) {
            return Next.h(a6h0Var);
        }
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!(((h5h0) obj) instanceof b5h0)) {
                arrayList.add(obj);
            }
        }
        return Next.i(a6h0.a(a6h0Var, mqo1.A(arrayList), null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -6), Collections.singleton(new qzg0(str)));
    }

    public static final Next E(a6h0 a6h0Var, o3h0 o3h0Var) {
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!(((h5h0) obj) instanceof b5h0)) {
                arrayList.add(obj);
            }
        }
        c380 c380VarA = mqo1.A(arrayList);
        tv80 tv80Var = a6h0Var.i;
        long j = a6h0Var.E + 1;
        String lowerCase = a6h0Var.b == null ? UUID.randomUUID().toString().toLowerCase(Locale.ROOT) : null;
        a6h0 a6h0VarA = a6h0.a(a6h0Var, c380VarA, null, true, false, null, false, null, tv80Var, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, lowerCase, j, null, -1610621190);
        String str = o3h0Var.a;
        String str2 = a6h0Var.b;
        boolean z = a6h0Var.j;
        return Next.i(a6h0VarA, f46.S0(new k0h0[]{new e0h0(str, c380VarA, str2, lowerCase, tv80Var, z, j), new rzg0(str, str2, z)}));
    }

    public static final Next F(a6h0 a6h0Var, p3h0 p3h0Var) {
        String string = ihc1.e1(p3h0Var.a).toString();
        Uri uri = a6h0Var.C;
        if (uri == null) {
            return ihc1.y0(string) ? Next.j() : P(a6h0Var, string, p3h0Var.b, 8);
        }
        g5h0 g5h0Var = new g5h0(uri, String.valueOf(string.hashCode() + uri.hashCode() + a6h0Var.hashCode()), ihc1.y0(string) ? "" : string);
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            h5h0 h5h0Var = (h5h0) obj;
            if (!(h5h0Var instanceof e5h0) && !(h5h0Var instanceof x4h0) && !(h5h0Var instanceof b5h0)) {
                arrayList.add(obj);
            }
        }
        c380 c380VarA = mqo1.A(o7h.O0(g5h0Var, arrayList));
        long j = a6h0Var.E + 1;
        return Next.i(a6h0.a(a6h0Var, c380VarA, null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, fg91.b, false, 0L, null, null, a6h0Var.b == null ? UUID.randomUUID().toString().toLowerCase(Locale.ROOT) : null, j, null, -2047352838), dm61.B0(new k0h0[]{new d0h0(uri, string, c380VarA, a6h0Var.b, j), a6h0Var.z ? new izg0(a6h0Var.A) : null}));
    }

    public static final Next G(a6h0 a6h0Var) {
        mmr0 mmr0VarN = N(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, zh80.a, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -1025));
        return Next.i((a6h0) mmr0VarN.a, dm61.x0(j0h0.a, (Set) mmr0VarN.b));
    }

    public static final Next H(a6h0 a6h0Var) {
        boolean z = a6h0Var.c;
        String str = a6h0Var.b;
        if (!z) {
            return Next.j();
        }
        String str2 = str == null ? a6h0Var.D : str;
        boolean z2 = str == null || a6h0Var.r;
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!(((h5h0) obj) instanceof y4h0)) {
                arrayList.add(obj);
            }
        }
        c380 c380VarA = mqo1.A(o7h.O0(c5h0.a, arrayList));
        if (z2) {
            str = null;
        }
        return Next.i(a6h0.a(a6h0Var, c380VarA, str, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, a6h0Var.E + 1, null, -1610817544), dm61.B0(new k0h0[]{str2 == null ? null : z2 ? new h0h0(str2) : new i0h0(str2), z2 ? lzg0.a : null, a6h0Var.q ? jzg0.a : null}));
    }

    public static final Next I(a6h0 a6h0Var, v3h0 v3h0Var) {
        c380 c380VarA;
        c380 c380Var = v3h0Var.a;
        boolean zIsEmpty = c380Var.isEmpty();
        c380 c380Var2 = a6h0Var.a;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c380Var2) {
                if (!(((h5h0) obj) instanceof e5h0)) {
                    arrayList.add(obj);
                }
            }
            c380VarA = mqo1.A(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c380Var2) {
                if (!(((h5h0) obj2) instanceof e5h0)) {
                    arrayList2.add(obj2);
                }
            }
            c380VarA = mqo1.A(o7h.O0(new e5h0(c380Var), arrayList2));
        }
        return Next.h(a6h0.a(a6h0Var, c380VarA, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2));
    }

    public static final Next J(a6h0 a6h0Var, x3h0 x3h0Var) {
        String str = x3h0Var.a;
        c380<h5h0> c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (h5h0 a5h0Var : c380Var) {
            if (a5h0Var instanceof a5h0) {
                a5h0 a5h0Var2 = (a5h0) a5h0Var;
                c380<Object> c380Var2 = a5h0Var2.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
                for (Object objA : c380Var2) {
                    if (objA instanceof qx01) {
                        qx01 qx01Var = (qx01) objA;
                        if (u890.j(qx01Var.a, str)) {
                            objA = qx01.a(qx01Var, null, false, false, 47);
                        }
                    }
                    arrayList2.add(objA);
                }
                a5h0Var = new a5h0(a5h0Var2.a, mqo1.A(arrayList2));
            }
            arrayList.add(a5h0Var);
        }
        return Next.i(a6h0.a(a6h0Var, mqo1.A(arrayList), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2), Collections.singleton(new vzg0(str)));
    }

    public static final Next K(a6h0 a6h0Var, y3h0 y3h0Var) {
        zh80 zh80Var = a6h0Var.k;
        zh80 zh80Var2 = zh80.b;
        boolean z = zh80Var == zh80Var2;
        boolean z2 = y3h0Var.a;
        if (z2 == z) {
            return Next.j();
        }
        if (z2) {
            return Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, zh80Var2, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -1025));
        }
        mmr0 mmr0VarN = N(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, zh80.a, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -1025));
        return Next.i((a6h0) mmr0VarN.a, (Set) mmr0VarN.b);
    }

    public static final Next L(a6h0 a6h0Var, z3h0 z3h0Var) {
        return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, z3h0Var.a, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -513), Collections.singleton(new wzg0(z3h0Var.a)));
    }

    public static final Next M(a6h0 a6h0Var, d4h0 d4h0Var) {
        String string = ihc1.e1(d4h0Var.a).toString();
        a6h0 a6h0VarA = a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, d4h0Var.b, zh80.a, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -3585);
        return ihc1.y0(string) ? Next.h(a6h0VarA) : P(a6h0VarA, string, null, 4);
    }

    public static final mmr0 N(a6h0 a6h0Var) {
        ehv0 ehv0Var = a6h0Var.l;
        if (ehv0Var == null) {
            return new mmr0(a6h0Var, w7x.a);
        }
        a6h0 a6h0VarA = a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2049);
        if (ehv0Var instanceof dhv0) {
            return new mmr0(a6h0VarA, Collections.singleton(b0h0.a));
        }
        if (ehv0Var instanceof chv0) {
            return new mmr0(a6h0VarA, Collections.singleton(((chv0) ehv0Var).a));
        }
        eg.o();
        return null;
    }

    public static final ArrayList O(String str) {
        List listH = a.h(str.toLowerCase(Locale.ROOT));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Next P(a6h0 a6h0Var, String str, tv80 tv80Var, int i) {
        i28 i28Var;
        tv80 tv80Var2 = (i & 4) != 0 ? null : tv80Var;
        String str2 = (i & 8) != 0 ? "text" : "voice";
        int iHashCode = a6h0Var.hashCode();
        long j = a6h0Var.A;
        boolean z = a6h0Var.z;
        g5h0 g5h0Var = new g5h0(null, String.valueOf(str.hashCode() + iHashCode), str);
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            h5h0 h5h0Var = (h5h0) obj;
            if (!(h5h0Var instanceof e5h0) && !(h5h0Var instanceof x4h0) && !(h5h0Var instanceof b5h0)) {
                arrayList.add(obj);
            }
        }
        c380 c380VarA = mqo1.A(o7h.O0(g5h0Var, arrayList));
        boolean z2 = a6h0Var.w;
        fg91 fg91Var = fg91.b;
        if (z2 && (nhc1.S(ihc1.e1(str).toString(), "/recognize", true) || nhc1.S(ihc1.e1(str).toString(), "/listen", true))) {
            if (z && (i28Var = a6h0Var.B) != null && i28Var.a()) {
                return Next.j();
            }
            long j2 = j + 1;
            a6h0 a6h0VarA = a6h0.a(a6h0Var, c380VarA, null, true, false, null, false, null, tv80Var2, false, null, null, false, null, null, null, false, false, null, fg91Var, true, j2, i28.a, null, null, 0L, null, -235413766);
            kzg0 kzg0Var = new kzg0(j2);
            izg0 izg0Var = new izg0(j);
            if (!z) {
                izg0Var = null;
            }
            return Next.i(a6h0VarA, dm61.B0(new k0h0[]{kzg0Var, izg0Var}));
        }
        String lowerCase = a6h0Var.b == null ? UUID.randomUUID().toString().toLowerCase(Locale.ROOT) : null;
        long j3 = a6h0Var.E + 1;
        a6h0 a6h0VarA2 = a6h0.a(a6h0Var, c380VarA, null, true, false, null, false, null, tv80Var2, false, null, null, false, null, null, null, false, false, null, fg91Var, false, 0L, null, null, lowerCase, j3, null, -1778917638);
        String str3 = a6h0Var.b;
        boolean z3 = a6h0Var.j;
        e0h0 e0h0Var = new e0h0(str, c380VarA, str3, lowerCase, tv80Var2, z3, str2, j3);
        rzg0 rzg0Var = new rzg0(str, str3, z3);
        izg0 izg0Var2 = new izg0(j);
        if (!z) {
            izg0Var2 = null;
        }
        return Next.i(a6h0VarA2, dm61.B0(new k0h0[]{e0h0Var, rzg0Var, izg0Var2}));
    }

    public static final List Q(xv2 xv2Var) {
        int iNextIndex;
        String str = xv2Var.a;
        if (ihc1.y0(k1o1.i(xv2Var)) && k1o1.g(xv2Var).isEmpty() && k1o1.j(xv2Var).isEmpty()) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = xv2Var.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(c(xv2Var, arrayList2, i));
                    i++;
                }
                int i2 = i;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (((h5h0) listIterator.previous()) instanceof z4h0) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                int i3 = iNextIndex;
                if (i3 < 0) {
                    return arrayList;
                }
                z4h0 z4h0Var = (z4h0) arrayList.get(i3);
                arrayList.set(i3, z4h0.a(z4h0Var, xv2.a(z4h0Var.a, str, null, false, xv2Var.d, 0L, 54), i2 > 1 ? k1o1.i(xv2Var) : null, 2));
                return arrayList;
            }
            grl grlVar = (grl) it.next();
            if ((grlVar instanceof drl) || (grlVar instanceof crl)) {
                arrayList2.add(grlVar);
            } else if (grlVar instanceof frl) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(c(xv2Var, arrayList2, i));
                    arrayList2 = new ArrayList();
                    i++;
                }
                frl frlVar = (frl) grlVar;
                c380 c380Var = frlVar.a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = c380Var.iterator();
                while (it2.hasNext()) {
                    ux01 ux01VarS = f3o1.s((String) it2.next(), frlVar.c, frlVar.b);
                    if (ux01VarS != null) {
                        arrayList3.add(ux01VarS);
                    }
                }
                arrayList.add(new a5h0(str, mqo1.A(arrayList3)));
            } else {
                if (!(grlVar instanceof erl)) {
                    eg.o();
                    return null;
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(c(xv2Var, arrayList2, i));
                    arrayList2 = new ArrayList();
                    i++;
                }
                erl erlVar = (erl) grlVar;
                arrayList.add(new f5h0(str, i, erlVar.a, erlVar.b, erlVar.c, erlVar.d, erlVar.e, erlVar.f));
                i++;
                arrayList2 = arrayList2;
            }
        }
    }

    public static final xzg0 R(String str, ls50 ls50Var) {
        String str2 = ls50Var.a;
        String str3 = ls50Var.b;
        String str4 = null;
        if (str3 != null && !ihc1.y0(str3)) {
            str4 = str3;
        }
        return new xzg0(str2, str4, null, ls50Var.c, str, null, ls50Var.d, ls50Var.e, ls50Var.f, 0, 548);
    }

    public static final String S(h5h0 h5h0Var) {
        if (h5h0Var instanceof g5h0) {
            return ((g5h0) h5h0Var).a;
        }
        if (h5h0Var instanceof z4h0) {
            return ((z4h0) h5h0Var).a.a;
        }
        if (h5h0Var instanceof a5h0) {
            return ((a5h0) h5h0Var).a;
        }
        if (h5h0Var instanceof f5h0) {
            return ((f5h0) h5h0Var).a;
        }
        return null;
    }

    public static final String T(h5h0 h5h0Var) {
        String strS = S(h5h0Var);
        if (strS != null) {
            String strH0 = ihc1.H0(strS, "voice-transcript:");
            if (!strH0.equals(strS)) {
                return strH0;
            }
        }
        return null;
    }

    public static final ppk1 U(h5h0 h5h0Var) {
        if (h5h0Var instanceof g5h0) {
            return new npk1(true, ((g5h0) h5h0Var).b);
        }
        if (h5h0Var instanceof z4h0) {
            return new npk1(false, k1o1.i(((z4h0) h5h0Var).a));
        }
        if (!(h5h0Var instanceof a5h0)) {
            if (!(h5h0Var instanceof f5h0)) {
                return null;
            }
            f5h0 f5h0Var = (f5h0) h5h0Var;
            return new opk1(f5h0Var.g, f5h0Var.e);
        }
        c380 c380Var = ((a5h0) h5h0Var).b;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((ux01) it.next()).getUri());
        }
        return new mpk1(arrayList);
    }

    public static final a6h0 V(a6h0 a6h0Var) {
        Object objPrevious;
        c380 c380Var = a6h0Var.a;
        if (!(o7h.C0(c380Var) instanceof b5h0)) {
            ListIterator listIterator = c380Var.listIterator(c380Var.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!(((h5h0) objPrevious) instanceof g5h0));
            g5h0 g5h0Var = objPrevious instanceof g5h0 ? (g5h0) objPrevious : null;
            if (g5h0Var != null) {
                return a6h0.a(a6h0Var, mqo1.A(o7h.O0(new b5h0(g5h0Var.b, false), c380Var)), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2);
            }
        }
        return a6h0Var;
    }

    public static final a6h0 W(a6h0 a6h0Var) {
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!(((h5h0) obj) instanceof b5h0)) {
                arrayList.add(obj);
            }
        }
        return a6h0.a(a6h0Var, mqo1.A(arrayList), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0302  */
    public static final Next a(a6h0 a6h0Var, o7h0 o7h0Var, String str, String str2, Long l, ijg1 ijg1Var, List list, int i, Set set) {
        c380 c380VarN0;
        boolean z;
        c380 c380VarO0;
        xzg0 xzg0Var;
        Iterable iterableY0;
        a6h0 a6h0VarA;
        ou80 ou80Var;
        boolean z2;
        boolean z3;
        int iNextIndex;
        ArrayList arrayList;
        xv2 xv2Var = o7h0Var.a;
        String str3 = xv2Var.a;
        List listQ = Q(xv2Var);
        List list2 = listQ;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof a5h0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r7h.W(((a5h0) it.next()).b, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof qx01) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str4 = ((qx01) next).a;
            Set set2 = s4b1.f;
            if (!(uic.x(str4).c == blc0.x4)) {
                arrayList5.add(next);
            }
        }
        int i2 = 10;
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((qx01) it3.next()).a);
        }
        List listJ0 = o7h.j0(arrayList6);
        c380<h5h0> c380Var = a6h0Var.a;
        if (c380Var.isEmpty() || k1o1.i(xv2Var).length() <= 0 || (c380Var != null && c380Var.isEmpty())) {
            c380VarN0 = o7h.N0(list2, c380Var);
            h5h0 h5h0Var = (h5h0) o7h.C0(c380VarN0);
            if (ihc1.y0(k1o1.i(xv2Var)) || !(h5h0Var instanceof z4h0)) {
                z = true;
                c380VarO0 = c380VarN0;
            } else {
                z = true;
                z4h0 z4h0Var = (z4h0) h5h0Var;
                c380VarO0 = o7h.O0(z4h0.a(z4h0Var, xv2.a(z4h0Var.a, str3, null, false, xv2Var.d, 0L, 54), null, 6), o7h.l0(1, c380VarN0));
            }
        } else {
            Iterator it4 = c380Var.iterator();
            while (true) {
                if (it4.hasNext()) {
                    h5h0 h5h0Var2 = (h5h0) it4.next();
                    if ((h5h0Var2 instanceof z4h0) && str3.equals(((z4h0) h5h0Var2).a.a)) {
                        if (c380Var.isEmpty()) {
                            c380VarO0 = mqo1.A(Q(xv2Var));
                            z3 = true;
                        } else {
                            if (c380Var.isEmpty()) {
                                z2 = false;
                                break;
                            }
                            Iterator it5 = c380Var.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                h5h0 h5h0Var3 = (h5h0) it5.next();
                                if ((h5h0Var3 instanceof a5h0) && ((a5h0) h5h0Var3).a.equals(str3)) {
                                    z2 = true;
                                    break;
                                }
                            }
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : c380Var) {
                                if (obj3 instanceof f5h0) {
                                    arrayList7.add(obj3);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj4 : arrayList7) {
                                if (((f5h0) obj4).a.equals(str3)) {
                                    arrayList8.add(obj4);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, i2));
                            Iterator it6 = arrayList8.iterator();
                            while (it6.hasNext()) {
                                arrayList9.add(Integer.valueOf(((f5h0) it6.next()).b));
                            }
                            Set setP1 = o7h.p1(arrayList9);
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = z6x.a;
                            ArrayList arrayList12 = arrayList11;
                            for (h5h0 h5h0Var4 : c380Var) {
                                if (h5h0Var4 instanceof z4h0) {
                                    z4h0 z4h0Var2 = (z4h0) h5h0Var4;
                                    xv2 xv2Var2 = z4h0Var2.a;
                                    if (xv2Var2.a.equals(str3)) {
                                        arrayList = arrayList11;
                                        xv2 xv2VarA = xv2.a(xv2Var2, xv2Var2.a, mqo1.A(o7h.N0(xv2Var.b, xv2Var2.b)), xv2Var.c, xv2Var.d, xv2Var.f, 16);
                                        List listQ2 = Q(xv2VarA);
                                        arrayList10.add(z4h0.a(z4h0Var2, xv2VarA, null, 6));
                                        if (!z2 && !k1o1.g(xv2VarA).isEmpty()) {
                                            ArrayList arrayList13 = new ArrayList();
                                            for (Object obj5 : listQ2) {
                                                if (obj5 instanceof a5h0) {
                                                    arrayList13.add(obj5);
                                                }
                                            }
                                            arrayList10.addAll(arrayList13);
                                        }
                                        ArrayList arrayList14 = new ArrayList();
                                        for (Object obj6 : listQ2) {
                                            if (obj6 instanceof f5h0) {
                                                arrayList14.add(obj6);
                                            }
                                        }
                                        arrayList12 = new ArrayList();
                                        for (Object obj7 : arrayList14) {
                                            if (!setP1.contains(Integer.valueOf(((f5h0) obj7).b))) {
                                                arrayList12.add(obj7);
                                            }
                                        }
                                        if (setP1.isEmpty()) {
                                            arrayList10.addAll(arrayList12);
                                            arrayList11 = arrayList;
                                            arrayList12 = arrayList11;
                                        }
                                    }
                                    arrayList11 = arrayList;
                                }
                                arrayList = arrayList11;
                                arrayList10.add(h5h0Var4);
                                arrayList11 = arrayList;
                            }
                            z3 = true;
                            ArrayList arrayList15 = arrayList12;
                            if (!arrayList15.isEmpty()) {
                                ListIterator listIterator = arrayList10.listIterator(arrayList10.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        iNextIndex = -1;
                                        break;
                                    }
                                    h5h0 h5h0Var5 = (h5h0) listIterator.previous();
                                    if ((h5h0Var5 instanceof f5h0) && ((f5h0) h5h0Var5).a.equals(str3)) {
                                        iNextIndex = listIterator.nextIndex();
                                        break;
                                    }
                                }
                                if (iNextIndex >= 0) {
                                    arrayList10.addAll(iNextIndex + 1, arrayList15);
                                } else {
                                    arrayList10.addAll(arrayList15);
                                }
                            }
                            c380VarO0 = mqo1.A(arrayList10);
                        }
                        z = z3;
                    } else {
                        i2 = 10;
                    }
                } else {
                    c380VarN0 = o7h.N0(list2, c380Var);
                    h5h0 h5h0Var6 = (h5h0) o7h.C0(c380VarN0);
                    if (ihc1.y0(k1o1.i(xv2Var))) {
                        z = true;
                        c380VarO0 = c380VarN0;
                    } else {
                        z = true;
                        c380VarO0 = c380VarN0;
                    }
                }
            }
        }
        boolean z4 = listQ.isEmpty() ? a6h0Var.c : false;
        boolean z5 = z;
        a6h0 a6h0VarA2 = a6h0.a(a6h0Var, mqo1.A((Iterable) c380VarO0), null, z4, false, null, false, null, null, false, null, null, false, z4 ? a6h0Var.n : null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8198);
        List list3 = listJ0;
        ArrayList arrayList16 = new ArrayList(q7h.U(list3, 10));
        Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            arrayList16.add(new vzg0((String) it7.next()));
        }
        Set setP2 = o7h.p1(arrayList16);
        String str5 = o7h0Var.a.e;
        if (str5 == null || !a6h0Var.j) {
            str5 = null;
        }
        String str6 = (str == null || ihc1.y0(str)) ? null : str;
        if (str6 != null) {
            String str7 = (str2 == null || ihc1.y0(str2)) ? null : str2;
            String str8 = a6h0Var.b;
            tv80 tv80Var = a6h0Var.i;
            xzg0Var = new xzg0(str6, str7, null, l, str8, (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a, ijg1Var, list, o7h0Var.c, i, 4);
        } else {
            xzg0Var = null;
        }
        if (str5 != null) {
            a6h0VarA = a6h0.a(a6h0VarA2, null, null, false, false, null, false, null, null, false, zh80.b, xzg0Var != null ? new chv0(xzg0Var) : a6h0VarA2.l, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -3073);
            k0h0[] k0h0VarArr = new k0h0[2];
            k0h0VarArr[0] = new zzg0(str5);
            k0h0VarArr[z5 ? 1 : 0] = a0h0.a;
            iterableY0 = f46.S0(k0h0VarArr);
        } else {
            mmr0 mmr0VarN = N(a6h0VarA2);
            a6h0 a6h0Var2 = (a6h0) mmr0VarN.a;
            iterableY0 = dm61.y0((Set) mmr0VarN.b, dm61.A0(xzg0Var));
            a6h0VarA = a6h0Var2;
        }
        return Next.i(a6h0VarA, dm61.y0(dm61.y0(setP2, iterableY0), set));
    }

    public static /* synthetic */ Next b(a6h0 a6h0Var, o7h0 o7h0Var, String str, String str2, Long l, ijg1 ijg1Var, List list, int i, int i2) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            ijg1Var = null;
        }
        if ((i2 & 64) != 0) {
            list = z6x.a;
        }
        if ((i2 & 128) != 0) {
            i = 0;
        }
        return a(a6h0Var, o7h0Var, str, str2, l, ijg1Var, list, i, w7x.a);
    }

    public static final z4h0 c(xv2 xv2Var, ArrayList arrayList, int i) {
        return new z4h0(new xv2(l1d.k(i, xv2Var.a, ":seg:"), mqo1.A(arrayList), xv2Var.c, true, xv2Var.e, xv2Var.f), null);
    }

    public static final mmr0 d(a6h0 a6h0Var) {
        h5h0 h5h0VarF = f(a6h0Var);
        if (h5h0VarF != null) {
            return new mmr0(a6h0.a(a6h0Var, mqo1.s(new h5h0[]{h5h0VarF}), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8216), w7x.a);
        }
        a6h0 a6h0VarA = a6h0.a(a6h0Var, j(a6h0Var), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8216);
        return new mmr0(a6h0VarA, dm61.A0(a6h0Var.y ? null : new szg0(a6h0VarA.j)));
    }

    public static final String e(a6h0 a6h0Var, String str, String str2) {
        Object next;
        c380 c380Var;
        Object next2;
        c380 c380Var2 = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var2) {
            if (obj instanceof a5h0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((a5h0) it.next()).b, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof qx01) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!u890.j(((qx01) next).a, str2));
        qx01 qx01Var = (qx01) next;
        if (qx01Var != null && (c380Var = qx01Var.c) != null) {
            Iterator it3 = c380Var.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!u890.j(((eof1) next2).a, str));
            eof1 eof1Var = (eof1) next2;
            if (eof1Var != null) {
                return eof1Var.b;
            }
        }
        return null;
    }

    public static final h5h0 f(a6h0 a6h0Var) {
        Object obj;
        Object next;
        c380 c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c380Var) {
            if (obj2 instanceof x4h0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((x4h0) next).a.isEmpty());
        x4h0 x4h0Var = (x4h0) next;
        if (x4h0Var != null) {
            return x4h0Var;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : c380Var) {
            if (obj3 instanceof e5h0) {
                arrayList2.add(obj3);
            }
        }
        loop3: for (Object obj4 : arrayList2) {
            c380 c380Var2 = ((e5h0) obj4).a;
            if (c380Var2 == null || !c380Var2.isEmpty()) {
                Iterator it2 = c380Var2.iterator();
                while (it2.hasNext()) {
                    if (!ihc1.y0(((iys0) it2.next()).e)) {
                        obj = obj4;
                        break loop3;
                    }
                }
            }
        }
        return (h5h0) obj;
    }

    public static final boolean g(a6h0 a6h0Var) {
        if (a6h0Var.b != null) {
            return true;
        }
        c380<h5h0> c380Var = a6h0Var.a;
        if (c380Var != null && c380Var.isEmpty()) {
            return false;
        }
        for (h5h0 h5h0Var : c380Var) {
            if (!(h5h0Var instanceof e5h0) && !(h5h0Var instanceof x4h0)) {
                return true;
            }
        }
        return false;
    }

    public static final First h(a6h0 a6h0Var) {
        boolean z = a6h0Var.v;
        long j = a6h0Var.A;
        if (!a6h0Var.z) {
            if (z && !g(a6h0Var)) {
                mmr0 mmr0VarD = d(a6h0Var);
                return First.c((a6h0) mmr0VarD.a, (Set) mmr0VarD.b);
            }
            if (g(a6h0Var)) {
                return First.b(z ? a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2097153) : a6h0Var);
            }
            return First.c(a6h0.a(a6h0Var, null, null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -5), Collections.singleton(pzg0.a));
        }
        i28 i28Var = a6h0Var.B;
        int i = i28Var == null ? -1 : t6h0.a[i28Var.ordinal()];
        if (i == 1) {
            return First.c(a6h0Var, Collections.singleton(new kzg0(j)));
        }
        if (i == 2 || i == 3) {
            return First.b(a6h0Var);
        }
        return First.c(a6h0Var, Collections.singleton(new c0h0(j, a28.a, l1d.l(j, "audio-recognition:"))));
    }

    public static final boolean i(a6h0 a6h0Var, long j, i28 i28Var) {
        return a6h0Var.z && a6h0Var.A == j && a6h0Var.B == i28Var;
    }

    public static final c9 j(a6h0 a6h0Var) {
        if (a6h0Var.y) {
            return fg91.b;
        }
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new iys0(urx.c, 0L, u7h.k, "", (String) null, false, false, false, (String) null, 2022));
        }
        return mqo1.s(new e5h0[]{new e5h0(mqo1.A(arrayList))});
    }

    public static final Next k(a6h0 a6h0Var, e2h0 e2h0Var) {
        long j = e2h0Var.a;
        if (i(a6h0Var, j, i28.a)) {
            return e2h0Var.b ? Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.d, null, null, 0L, null, -134217729), Collections.singleton(new g0h0(j))) : Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.b, null, null, 0L, null, -134217729));
        }
        return Next.j();
    }

    public static final Next l(a6h0 a6h0Var, g2h0 g2h0Var) {
        long j = g2h0Var.a;
        if (i(a6h0Var, j, i28.c)) {
            return g2h0Var.b ? Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.d, null, null, 0L, null, -134217729), Collections.singleton(new g0h0(j))) : m(a6h0Var, new i2h0(j, d28.a));
        }
        return Next.j();
    }

    public static final Next m(a6h0 a6h0Var, i2h0 i2h0Var) {
        if (a6h0Var.z) {
            long j = a6h0Var.A;
            long j2 = i2h0Var.a;
            if (j == j2) {
                l28 l28Var = i2h0Var.b;
                if (l28Var.equals(y18.a)) {
                    return Next.i(a6h0.a(a6h0Var, mqo1.A(o7h.O0(new w4h0(j2), a6h0Var.a)), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -167780358), Collections.singleton(new izg0(j2)));
                }
                if (l28Var.equals(k28.a)) {
                    return Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.d, null, null, 0L, null, -134217729));
                }
                if (l28Var.equals(j28.a)) {
                    return Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.e, null, null, 0L, null, -134217729));
                }
                if (l28Var instanceof e28) {
                    return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, l28Var instanceof b28 ? i28.f : null, null, null, 0L, null, -134217729), Collections.singleton(new c0h0(j2, (e28) l28Var, l1d.l(j2, "audio-recognition:"))));
                }
                eg.o();
                return null;
            }
        }
        return Next.j();
    }

    public static final Next n(a6h0 a6h0Var, j2h0 j2h0Var) {
        c380<h5h0> c380Var = a6h0Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (h5h0 a5h0Var : c380Var) {
            if (a5h0Var instanceof a5h0) {
                a5h0 a5h0Var2 = (a5h0) a5h0Var;
                c380<Object> c380Var2 = a5h0Var2.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
                for (Object objA : c380Var2) {
                    if (objA instanceof qx01) {
                        qx01 qx01Var = (qx01) objA;
                        if (u890.j(qx01Var.a, j2h0Var.a)) {
                            objA = qx01.a(qx01Var, null, !qx01Var.d, false, 55);
                        }
                    }
                    arrayList2.add(objA);
                }
                a5h0Var = new a5h0(a5h0Var2.a, mqo1.A(arrayList2));
            }
            arrayList.add(a5h0Var);
        }
        return Next.h(a6h0.a(a6h0Var, mqo1.A(arrayList), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2));
    }

    public static final Next o(a6h0 a6h0Var, k2h0 k2h0Var) {
        ehv0 ehv0Var = a6h0Var.l;
        if (k2h0Var.a && ehv0Var == null) {
            return Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, dhv0.a, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2049));
        }
        return (k2h0Var.b || !(ehv0Var instanceof chv0)) ? Next.j() : Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2049), Collections.singleton(((chv0) ehv0Var).a));
    }

    public static final Next p(a6h0 a6h0Var) {
        return a6h0Var.k != zh80.b ? Next.j() : Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, zh80.a, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -3073), Collections.singleton(j0h0.a));
    }

    public static final Next q(a6h0 a6h0Var, n2h0 n2h0Var) {
        zzm zzmVar = n2h0Var.a;
        String str = zzmVar.a;
        Uri uri = a6h0Var.C;
        Set setSingleton = uri != null ? Collections.singleton(new nzg0(Collections.singletonList(uri))) : w7x.a;
        a6h0 a6h0VarA = a6h0.a(a6h0Var, fg91.b, str, true, false, zzmVar.b, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -436215840);
        qzg0 qzg0Var = new qzg0(str);
        izg0 izg0Var = new izg0(a6h0Var.A);
        if (!a6h0Var.z) {
            izg0Var = null;
        }
        return Next.i(a6h0VarA, dm61.y0(dm61.B0(new k0h0[]{qzg0Var, izg0Var}), setSingleton));
    }

    public static final Next r(a6h0 a6h0Var) {
        return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -16385), Collections.singleton(f0h0.a));
    }

    public static final Next s(a6h0 a6h0Var, p2h0 p2h0Var) {
        return a6h0Var.o != null ? Next.j() : Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, p2h0Var.a, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -16385), Collections.singleton(new mzg0(p2h0Var.a)));
    }

    public static final Next t(a6h0 a6h0Var, q2h0 q2h0Var) {
        return Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, sqg0.P(a6h0Var.f3p, new mmr0(q2h0Var.a, q2h0Var.b)), false, false, null, null, false, 0L, null, null, null, 0L, null, -49153));
    }

    public static final Next u(a6h0 a6h0Var, t2h0 t2h0Var) {
        return a6h0Var.h.equals(t2h0Var.a) ? Next.j() : Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, t2h0Var.a, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -129));
    }

    public static final Next v(a6h0 a6h0Var, u2h0 u2h0Var) {
        mmr0 mmr0Var;
        Long lD0;
        String str = u2h0Var.a;
        int iV0 = ihc1.v0(str, '?', 0, 6);
        Long lValueOf = null;
        b7x b7xVar = b7x.a;
        if (iV0 < 0) {
            mmr0Var = new mmr0(str, b7xVar);
        } else {
            String strSubstring = str.substring(0, iV0);
            String strSubstring2 = str.substring(iV0 + 1);
            if (strSubstring2.length() == 0) {
                mmr0Var = new mmr0(strSubstring, b7xVar);
            } else {
                List<String> listP0 = ihc1.P0(strSubstring2, new char[]{'&'}, 6);
                ArrayList arrayList = new ArrayList();
                for (String str2 : listP0) {
                    int iV1 = ihc1.v0(str2, '=', 0, 6);
                    mmr0 mmr0Var2 = (iV1 <= 0 || iV1 == ihc1.q0(str2)) ? null : new mmr0(str2.substring(0, iV1), str2.substring(iV1 + 1));
                    if (mmr0Var2 != null) {
                        arrayList.add(mmr0Var2);
                    }
                }
                mmr0Var = new mmr0(strSubstring, sqg0.T(arrayList));
            }
        }
        String str3 = (String) mmr0Var.a;
        Map map = (Map) mmr0Var.b;
        a6h0 a6h0VarA = a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, true, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -4097);
        String str4 = (String) map.get(ContextTrack$Metadata.KEY_CONTEXT_URI);
        String str5 = (String) map.get("t");
        if (str5 != null && (lD0 = nhc1.d0(10, str5)) != null) {
            lValueOf = Long.valueOf(lD0.longValue() * 1000);
        }
        return Next.i(a6h0VarA, Collections.singleton(new yzg0(str3, str4, lValueOf, a6h0Var.b, u2h0Var.b, u2h0Var.c)));
    }

    public static final Next w(a6h0 a6h0Var, e3h0 e3h0Var) {
        c380 c380Var = e3h0Var.a;
        if (c380Var.isEmpty() || !a6h0Var.x) {
            return Next.j();
        }
        c380 c380Var2 = a6h0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var2) {
            h5h0 h5h0Var = (h5h0) obj;
            if (!(h5h0Var instanceof e5h0) && !(h5h0Var instanceof x4h0)) {
                arrayList.add(obj);
            }
        }
        return Next.h(a6h0.a(a6h0Var, mqo1.A(o7h.O0(new x4h0(c380Var), arrayList)), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, e3h0Var.a, false, 0L, null, null, null, 0L, null, -524290));
    }

    public static final Next x(a6h0 a6h0Var) {
        Uri uri = a6h0Var.C;
        return Next.i(a6h0.a(a6h0Var, j(a6h0Var), null, false, false, null, false, null, null, false, zh80.a, null, false, null, null, b7x.a, false, false, null, fg91.b, false, 0L, null, null, null, 0L, null, -973663264), dm61.y0(dm61.B0(new k0h0[]{lzg0.a, a6h0Var.y ? null : new szg0(a6h0Var.j), j0h0.a, a6h0Var.z ? new izg0(a6h0Var.A) : null}), uri != null ? Collections.singleton(new nzg0(Collections.singletonList(uri))) : w7x.a));
    }

    public static final Next y(a6h0 a6h0Var) {
        Uri uri = a6h0Var.C;
        return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -268435457), uri != null ? Collections.singleton(new nzg0(Collections.singletonList(uri))) : w7x.a);
    }

    public static final Next z(a6h0 a6h0Var, j3h0 j3h0Var) {
        Uri uri = a6h0Var.C;
        return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, j3h0Var.a, null, 0L, null, -268435457), uri != null ? Collections.singleton(new nzg0(Collections.singletonList(uri))) : w7x.a);
    }
}
