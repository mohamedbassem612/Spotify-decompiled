package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class tx91 implements Update {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        LinkedHashSet linkedHashSet;
        i4a1 i4a1VarB;
        i4a1 i4a1VarF0;
        List listC;
        jg61 jg61Var;
        rqb1 rqb1Var;
        i4a1 i4a1Var = (i4a1) obj;
        h4a1 h4a1Var = (h4a1) obj2;
        int i = i4a1Var.F;
        boolean z = i4a1Var.i;
        boolean z2 = i4a1Var.d;
        boolean z3 = i4a1Var.h;
        boolean z4 = i4a1Var.g;
        String str = i4a1Var.c;
        boolean z5 = h4a1Var instanceof u3a1;
        w1a1 w1a1Var = w1a1.a;
        rqb1 rqb1Var2 = rqb1.a;
        if (z5) {
            i4a1 i4a1VarB2 = i4a1.b(i4a1Var, false, 0L, null, false, false, false, true, false, false, false, null, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -156610, 1);
            Set setW0 = dm61.w0(v1a1.a);
            setW0.add(w1a1Var);
            Next nextI = Next.i(i4a1VarB2, setW0);
            Arrays.copyOf(new Object[0], 0);
            return nextI;
        }
        if (h4a1Var instanceof i3a1) {
            i3a1 i3a1Var = (i3a1) h4a1Var;
            if (z4) {
                rtw0.L("Tried to obtain session while obtaining is already in progress", new Object[0]);
                return Next.j();
            }
            if (!z3) {
                return Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, true, false, false, false, null, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -17089, 1), Collections.singleton(new u1a1(i3a1Var.a)));
            }
            Arrays.copyOf(new Object[0], 0);
            return Next.j();
        }
        if (h4a1Var instanceof j3a1) {
            j3a1 j3a1Var = (j3a1) h4a1Var;
            if (!z4) {
                return Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, true, false, false, false, null, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -17089, 1), Collections.singleton(new s1a1(j3a1Var.a, j3a1Var.b)));
            }
            rtw0.L("Tried to create session while obtaining is already in progress", new Object[0]);
            return Next.j();
        }
        if (h4a1Var instanceof n3a1) {
            n3a1 n3a1Var = (n3a1) h4a1Var;
            if (str == null || str.length() == 0 || z) {
                rtw0.L("Cannot end session with current outstanding backend requests", new Object[0]);
                return Next.j();
            }
            if (z2) {
                return Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, true, false, null, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16641, 1), Effects.a(new t1a1(str), new b2a1(str, n3a1Var.a)));
            }
            rtw0.L("Cannot end session as participant", new Object[0]);
            return Next.j();
        }
        int i2 = 1;
        if (h4a1Var instanceof v3a1) {
            v3a1 v3a1Var = (v3a1) h4a1Var;
            if (z3) {
                return Next.j();
            }
            if (u890.j(v3a1Var.a, i4a1Var.k)) {
                Arrays.copyOf(new Object[0], 0);
                return Next.j();
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            i4a1 i4a1VarB3 = i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, true, false, false, v3a1Var.a, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -17537, 1);
            linkedHashSet2.add(new x1a1(v3a1Var.a, v3a1Var.b, v3a1Var.c, v3a1Var.d, v3a1Var.e));
            return Next.i(i4a1VarB3, linkedHashSet2);
        }
        if (h4a1Var instanceof z3a1) {
            hr90 hr90Var = ((z3a1) h4a1Var).a;
            if (str == null || str.length() == 0 || z) {
                rtw0.L("Cannot leave session with current outstanding backend requests", new Object[0]);
                return Next.j();
            }
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            if (z2) {
                linkedHashSet3.add(new t1a1(str));
                linkedHashSet3.add(new b2a1(str, hr90Var));
            } else {
                linkedHashSet3.add(new a2a1(str, hr90Var));
                linkedHashSet3.add(new b2a1(str, hr90Var));
            }
            return Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, true, false, null, null, null, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16641, 1), linkedHashSet3);
        }
        boolean z6 = h4a1Var instanceof c4a1;
        rqb1 rqb1Var3 = rqb1.h;
        if (!z6) {
            if (h4a1Var instanceof k3a1) {
                String str2 = i4a1Var.m;
                List list = i4a1Var.l;
                String str3 = ((k3a1) h4a1Var).a;
                if (str2 != null && str2.length() != 0 && !str2.equals(str3)) {
                    return Next.h(new i4a1(str3, -4097, false));
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                if (str == null || str.length() == 0) {
                    linkedHashSet = linkedHashSet4;
                    i4a1VarB = i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, o7h.a1(list, new hzx0(str3, (byte) 1)), str3, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -22529, 1);
                } else {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str3.equals(((a0s0) it.next()).e())) {
                                    linkedHashSet = linkedHashSet4;
                                    i4a1VarB = i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, o7h.a1(list, new hzx0(str3, (byte) 1)), str3, false, rqb1Var2, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -22529, 1);
                                }
                            }
                        }
                    }
                    i4a1VarB = i4a1.b(i4a1Var.a(), false, 0L, null, false, false, false, false, false, false, false, null, null, str3, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -4097, 1);
                    linkedHashSet = linkedHashSet4;
                }
                return Next.i(i4a1VarB, linkedHashSet);
            }
            if (h4a1Var instanceof r3a1) {
                return rtw0.C(i4a1Var, new dr91((r3a1) h4a1Var, (byte) 7));
            }
            if (h4a1Var instanceof h3a1) {
                return rtw0.C(i4a1Var, new dr91((h3a1) h4a1Var, (byte) 6));
            }
            if (h4a1Var instanceof t3a1) {
                t3a1 t3a1Var = (t3a1) h4a1Var;
                if (!z4) {
                    return Next.j();
                }
                ga61 ga61Var = t3a1Var.a;
                if (ga61Var != ga61.C) {
                    return Next.i(rtw0.f0(i4a1.b(i4a1Var, true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -66, 1), ga61Var), new LinkedHashSet());
                }
                Arrays.copyOf(new Object[0], 0);
                return Next.h(i4a1.b(i4a1Var.a(), true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -2, 1));
            }
            if (h4a1Var instanceof s3a1) {
                return Next.h(i4a1.b(i4a1Var, true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -66, 1));
            }
            if (h4a1Var instanceof w3a1) {
                w3a1 w3a1Var = (w3a1) h4a1Var;
                if (!z3) {
                    return Next.j();
                }
                sy21 sy21Var = w3a1Var.b;
                String str4 = w3a1Var.a;
                if (sy21Var != null && sy21Var.a.d == 403) {
                    rtw0.L("joining failed - session is full", new Object[0]);
                    return Next.i(rtw0.S(i4a1Var), Effects.a(new n2a1(new e2a1(new qea0(str4)))));
                }
                if (sy21Var != null && sy21Var.a.d == 404) {
                    rtw0.L("joining failed - session not found", new Object[0]);
                    return Next.i(rtw0.S(i4a1Var), Effects.a(new n2a1(new e2a1(new rea0(str4)))));
                }
                if ((sy21Var != null ? (ga61) sy21Var.b : null) == null || !sy21Var.a.Q0) {
                    rtw0.L("joining failed", new Object[0]);
                    return Next.i(rtw0.S(i4a1Var), Effects.a(new n2a1(new e2a1(new pea0(str4)))));
                }
                Arrays.copyOf(new Object[0], 0);
                ga61 ga61Var2 = (ga61) sy21Var.b;
                if (ga61Var2 == null) {
                    return Next.h(i4a1Var);
                }
                i4a1 i4a1VarB4 = i4a1.b(rtw0.f0(i4a1.b(i4a1Var, true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -130, 1), ga61Var2), false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var3, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1);
                return Next.i(i4a1VarB4, h7w.o(new k2a1(i4a1VarB4.F)));
            }
            if (h4a1Var instanceof a4a1) {
                a4a1 a4a1Var = (a4a1) h4a1Var;
                if (z4) {
                    return Next.h(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -257, 1));
                }
                return (a4a1Var.b && u890.j(a4a1Var.a, str)) ? Next.h(i4a1Var.a()) : Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -257, 1), h7w.o(p5x0.P0));
            }
            if (h4a1Var instanceof l3a1) {
                l3a1 l3a1Var = (l3a1) h4a1Var;
                if (z4) {
                    return Next.h(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -257, 1));
                }
                boolean z7 = l3a1Var.b;
                String str5 = l3a1Var.a;
                return (z7 && (str == null || str.length() == 0 || u890.j(str5, str))) ? Next.i(i4a1Var.a(), h7w.o(new j2a1(str5))) : Next.i(i4a1.b(i4a1Var, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -257, 1), h7w.o(new d2a1(str5)));
            }
            if (h4a1Var instanceof y3a1) {
                throw null;
            }
            if (h4a1Var instanceof x3a1) {
                rtw0.L(" Failed to kick all participants. ", new Object[0]);
                return Next.a(h7w.o(f4x0.N0));
            }
            if (h4a1Var instanceof e3a1) {
                return rtw0.O(i4a1Var, (e3a1) h4a1Var);
            }
            if (h4a1Var instanceof d4a1) {
                return (str == null || str.length() == 0 || i != 2) ? Next.j() : Next.a(Effects.a(new o2a1(((d4a1) h4a1Var).a)));
            }
            if (h4a1Var instanceof e4a1) {
                e4a1 e4a1Var = (e4a1) h4a1Var;
                if (e4a1Var.b) {
                    return Next.j();
                }
                rtw0.L("Failed to update participant volume control to: ".concat(e4a1Var.a), new Object[0]);
                return Next.a(h7w.o(r5x0.P0));
            }
            if (h4a1Var instanceof f4a1) {
                return (str == null || str.length() == 0 || i != 2) ? Next.j() : Next.a(Effects.a(new p2a1(((f4a1) h4a1Var).a)));
            }
            if (h4a1Var instanceof g4a1) {
                g4a1 g4a1Var = (g4a1) h4a1Var;
                if (g4a1Var.b) {
                    return Next.j();
                }
                rtw0.L("Failed to update permissions control to: " + g4a1Var, new Object[0]);
                return Next.a(h7w.o(r6x0.P0));
            }
            if (h4a1Var instanceof b4a1) {
                return rtw0.R(i4a1Var, (b4a1) h4a1Var);
            }
            if (h4a1Var instanceof o3a1) {
                return Next.j();
            }
            if (h4a1Var instanceof m3a1) {
                return rtw0.P(i4a1Var, (m3a1) h4a1Var);
            }
            if (h4a1Var.equals(c3a1.a)) {
                return Next.j();
            }
            if (h4a1Var.equals(d3a1.a)) {
                return Next.a(Effects.a(w1a1Var));
            }
            eg.o();
            return null;
        }
        si61 si61Var = ((c4a1) h4a1Var).a;
        ga61 ga61VarB = si61Var.b();
        if (ga61VarB == null) {
            ga61VarB = ga61.C;
        }
        Long l = ga61VarB.a;
        if (i4a1Var.b > (l != null ? l.longValue() : 0L)) {
            return Next.j();
        }
        if (z3 || z4) {
            return Next.j();
        }
        int iA = si61Var.a();
        if (iA != 0) {
            i2 = iA;
        }
        if (i2 != 8 && i2 != 2 && i2 != 5 && !u890.j(str, ga61VarB.b)) {
            Arrays.copyOf(new Object[0], 0);
            return Next.j();
        }
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        switch (l1d.C(i2)) {
            case 0:
                Arrays.copyOf(new Object[0], 0);
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 1:
            case 7:
                i4a1VarF0 = i4a1.b(rtw0.f0(i4a1Var, ga61VarB), true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -2, 1);
                break;
            case 2:
                List listC2 = si61Var.c();
                if (listC2 != null) {
                    linkedHashSet5.add(new n2a1(new h2a1(listC2)));
                }
                i4a1VarF0 = i4a1.b(rtw0.f0(i4a1Var, ga61VarB), true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -2, 1);
                break;
            case 3:
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 4:
                i4a1VarF0 = i4a1.b(i4a1Var.a(), false, 0L, null, false, false, false, false, false, false, true, null, null, null, false, null, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -513, 1);
                break;
            case 5:
                Arrays.copyOf(new Object[0], 0);
                i4a1VarF0 = i4a1Var.a();
                break;
            case 6:
                Arrays.copyOf(new Object[0], 0);
                i4a1VarF0 = i4a1Var.a();
                break;
            case 8:
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 9:
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 10:
                if (z2 && (listC = si61Var.c()) != null && (jg61Var = (jg61) o7h.s0(listC)) != null) {
                    linkedHashSet5.add(new n2a1(new g2a1(jg61Var)));
                }
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i4a1VarF0 = rtw0.f0(i4a1Var, ga61VarB);
                break;
            case 20:
                Arrays.copyOf(new Object[0], 0);
                i4a1VarF0 = i4a1Var.a();
                break;
            default:
                eg.o();
                return null;
        }
        i4a1 i4a1Var2 = i4a1VarF0;
        switch (l1d.C(i2)) {
            case 0:
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 1:
                rqb1Var2 = rqb1.b;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 2:
                rqb1Var2 = rqb1.c;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 3:
                rqb1Var2 = rqb1.d;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 4:
                rqb1Var2 = rqb1.e;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 5:
                rqb1Var2 = rqb1.f;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 6:
                rqb1Var2 = rqb1.g;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 7:
                rqb1Var = rqb1Var3;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 8:
                rqb1Var2 = rqb1.i;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 9:
                rqb1Var2 = rqb1.t;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 10:
                rqb1Var2 = rqb1.Y;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 11:
                rqb1Var2 = rqb1.X;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 12:
                rqb1Var2 = rqb1.Z;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 13:
                rqb1Var2 = rqb1.N0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 14:
                rqb1Var2 = rqb1.O0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 15:
                rqb1Var2 = rqb1.P0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 16:
                rqb1Var2 = rqb1.Q0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 17:
                rqb1Var2 = rqb1.R0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 18:
                rqb1Var2 = rqb1.S0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 19:
                rqb1Var2 = rqb1.T0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            case 20:
                rqb1Var2 = rqb1.U0;
                rqb1Var = rqb1Var2;
                return Next.i(i4a1.b(i4a1Var2, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, rqb1Var, 0, 0, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1), linkedHashSet5);
            default:
                eg.o();
                return null;
        }
    }
}
