package p;

import android.net.Uri;
import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionsRow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n4 implements Update {
    public final /* synthetic */ byte a;
    public static final n4 b = new n4(0);
    public static final n4 c = new n4(1);
    public static final n4 d = new n4(2);
    public static final n4 e = new n4(3);
    public static final n4 f = new n4(4);
    public static final n4 g = new n4(5);
    public static final n4 h = new n4(6);
    public static final n4 i = new n4(7);
    public static final n4 j = new n4(8);
    public static final n4 k = new n4(9);
    public static final n4 l = new n4(10);
    public static final n4 m = new n4(11);
    public static final n4 n = new n4(12);
    public static final n4 o = new n4(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n4 f54p = new n4(14);
    public static final n4 q = new n4(15);
    public static final n4 r = new n4(16);
    public static final n4 s = new n4(17);
    public static final n4 t = new n4(18);
    public static final n4 u = new n4(19);
    public static final n4 v = new n4(20);
    public static final n4 w = new n4(21);
    public static final n4 x = new n4(22);
    public static final n4 y = new n4(23);
    public static final n4 z = new n4(24);
    public static final n4 A = new n4(25);
    public static final n4 B = new n4(26);
    public static final n4 C = new n4(27);
    public static final n4 D = new n4(28);
    public static final n4 E = new n4(29);

    public /* synthetic */ n4(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:244:0x0739  */
    /* JADX WARN: Code duplicated, block: B:246:0x0747  */
    /* JADX WARN: Code duplicated, block: B:249:0x075d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0765  */
    /* JADX WARN: Code duplicated, block: B:252:0x076b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0771  */
    /* JADX WARN: Code duplicated, block: B:397:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:399:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:401:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:403:0x0c45  */
    private final Next b(Object obj, Object obj2) {
        ww1 ww1Var;
        Next nextJ;
        Next nextI;
        Object obj3;
        Set setP1;
        fo1 fo1Var;
        boolean z2;
        xj61 xj61Var;
        xj61 xj61VarJ;
        fu1 fu1VarB;
        mmr0 mmr0Var;
        Next nextT;
        ww1 ww1Var2 = (ww1) obj;
        ks1 ks1Var = (bt1) obj2;
        mj11 mj11Var = nw1.a;
        fu1 fu1Var = ww1Var2.a;
        boolean z3 = fu1Var.j;
        wka1 wka1Var = fu1Var.r;
        fo1 fo1Var2 = fu1Var.b;
        Map map = fo1Var2.b;
        by1 by1Var = fu1Var.m;
        int i2 = fu1Var.e;
        ma61 ma61Var = fu1Var.h;
        hlg1 hlg1Var = ma61Var.c;
        Set set = ma61Var.g;
        Set set2 = ma61Var.f;
        i031 i031Var = ma61Var.e;
        ttu0 ttu0Var = ma61Var.b;
        stu0 stu0Var = ma61Var.a;
        if (ks1Var instanceof ks1) {
            nextJ = Next.a(Collections.singleton(new ep1(ks1Var.a)));
        } else if (ks1Var instanceof ds1) {
            ds1 ds1Var = (ds1) ks1Var;
            String str = fu1Var.a;
            go1 go1Var = ds1Var.a;
            if (fu1Var.c || str.length() <= 0) {
                boolean z4 = !z3 && fo1Var2.b() && str.length() == 0 && !ds1Var.b.isEmpty() && go1Var.d.size() + go1Var.c.size() == 0 && ((yv51) map.get("atp")) == null && i2 == 1;
                xj61 xj61Var2 = new xj61();
                if (z4) {
                    xj61Var2.add(new cp1(6, (String) null, (tv80) null));
                }
                xj61 xj61VarJ2 = cwl1.j(xj61Var2);
                fu1 fu1VarJ = fu1Var.j(go1Var);
                if (z4) {
                    fu1VarJ = fu1.b(fu1VarJ, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2096639);
                }
                nextJ = Next.i(fu1VarJ, xj61VarJ2);
            } else {
                nextJ = Next.j();
            }
        } else {
            boolean z5 = ks1Var instanceof gs1;
            gv1 gv1Var = fv1.a;
            gv1 gv1Var2 = cv1.a;
            if (z5) {
                nextJ = Next.i(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2064383), Collections.singleton(fu1.a(fu1Var, false, ma61Var.h() ? gv1Var2 : gv1Var, 4)));
            } else if (ks1Var instanceof hs1) {
                if (i2 != 1) {
                    nextJ = Next.j();
                } else {
                    Set setSingleton = Collections.singleton(fu1.a(fu1Var, false, ma61Var.h() ? gv1Var2 : gv1Var, 4));
                    fu1 fu1VarB2 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                    nextJ = !fu1VarB2.equals(fu1Var) ? Next.i(fu1VarB2, setSingleton) : Next.a(setSingleton);
                }
            } else if (ks1Var instanceof as1) {
                Set set3 = ma61Var.d;
                cq1 jp1Var = new jp1(set2, set);
                if (ma61Var.h()) {
                    xj61 xj61Var3 = new xj61();
                    xj61Var3.add(jp1Var);
                    if (by1Var instanceof fy1) {
                        cq1 cq1VarA = fu1.a(fu1Var, false, (gv1) null, 6);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Set<af41> set4 = hlg1Var.b;
                        ArrayList arrayList = new ArrayList(q7h.U(set4, 10));
                        Iterator it = set4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((af41) it.next()).a);
                        }
                        if (!o7h.p1(arrayList).isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : set4) {
                                if (((af41) obj4).c) {
                                    arrayList2.add(obj4);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((af41) it2.next()).a);
                            }
                            Set setP2 = o7h.p1(arrayList3);
                            int iS = zno1.s(q7h.U(set4, 10));
                            if (iS < 16) {
                                iS = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                            for (af41 af41Var : set4) {
                                linkedHashMap.put(af41Var.a, af41Var.b);
                            }
                            linkedHashSet.add(new kp1(ttu0Var.a, stu0Var.a, setP2, linkedHashMap));
                        }
                        Iterator it3 = hlg1Var.a.iterator();
                        while (it3.hasNext()) {
                            linkedHashSet.add(new ap1((String) it3.next()));
                        }
                        Iterator it4 = hlg1Var.d.iterator();
                        while (it4.hasNext()) {
                            linkedHashSet.add(new zo1((String) it4.next()));
                        }
                        Iterator it5 = hlg1Var.e.iterator();
                        while (it5.hasNext()) {
                            linkedHashSet.add(new lp1((String) it5.next(), false));
                        }
                        linkedHashSet.add(cq1VarA);
                        xj61Var3.addAll(linkedHashSet);
                    } else if ((by1Var instanceof zx1) && !set3.isEmpty()) {
                        xj61Var3.add(new hp1(ttu0Var.a, stu0Var.a, set3));
                        xj61Var3.add(fu1.a(fu1Var, false, (gv1) null, 6));
                    } else if (!stu0Var.a.isEmpty() || !ttu0Var.a.isEmpty()) {
                        xj61Var3.add(new xo1(ttu0Var.a, stu0Var.a));
                    }
                    nextJ = c97.l(fu1Var, cwl1.j(xj61Var3), jpc.e1);
                } else {
                    Set setS0 = f46.S0(new cq1[]{fu1.a(fu1Var, false, (gv1) null, 6), jp1Var});
                    fu1 fu1VarB3 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                    nextJ = !fu1VarB3.equals(fu1Var) ? Next.i(fu1VarB3, setS0) : Next.a(setS0);
                }
            } else if (ks1Var instanceof ws1) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if (ma61Var.h() && !(by1Var instanceof by1)) {
                    linkedHashSet2.add(new mp1(stu0Var.a, ttu0Var.a));
                }
                nextJ = c97.l(fu1Var, linkedHashSet2, qi71.e1);
            } else {
                if (!(ks1Var instanceof ss1)) {
                    boolean z6 = ks1Var instanceof zs1;
                    uka1 uka1Var = tka1.a;
                    if (z6) {
                        Set set5 = ((zs1) ks1Var).a;
                        if (u890.j(wka1Var, vka1.a)) {
                            if (!set5.isEmpty()) {
                                uka1Var = new uka1(set5);
                            }
                            ww1Var = ww1Var2;
                            fu1 fu1VarB4 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, uka1Var, (Set) null, 1572863);
                            fu1 fu1VarB5 = fu1.b(fu1VarB4, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(fu1VarB4.h, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                            if (i031Var == null) {
                                nextI = Next.h(fu1VarB5);
                            } else {
                                if (i031Var instanceof i031) {
                                    nextT = e6p1.r(fu1VarB5, new ss1(i031Var.a));
                                } else {
                                    if (!(i031Var instanceof j031)) {
                                        eg.o();
                                        return null;
                                    }
                                    tv80 tv80Var = ((j031) i031Var).a;
                                    if (fu1VarB5.e != 1) {
                                        nextT = Next.j();
                                    } else {
                                        by1 by1Var2 = fu1VarB5.m;
                                        if (by1Var2 instanceof by1) {
                                            ak3 ak3Var = by1Var2.a;
                                            yv51 yv51VarA = fo1.a(fu1VarB5.b);
                                            nextT = Next.a(Collections.singleton(new bq1(ak3Var, yv51VarA != null ? yv51VarA.a : null, tv80Var)));
                                        } else {
                                            nextT = c97.t(fu1VarB5, new j031(tv80Var));
                                        }
                                    }
                                }
                                nextI = Next.i(nextT.f(fu1VarB5), nextT.b());
                            }
                        } else {
                            nextJ = Next.j();
                        }
                    } else {
                        ww1Var = ww1Var2;
                        if (ks1Var instanceof fs1) {
                            fs1 fs1Var = (fs1) ks1Var;
                            nextI = u890.j(fu1Var.s, fs1Var.a) ? Next.j() : Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, fs1Var.a, 1048575));
                        } else if (ks1Var instanceof ys1) {
                            ys1 ys1Var = (ys1) ks1Var;
                            uka1 uka1Var2 = wka1Var instanceof uka1 ? (uka1) wka1Var : null;
                            if (uka1Var2 == null) {
                                nextI = Next.j();
                            } else {
                                Set set6 = uka1Var2.a;
                                if (i031Var == null) {
                                    nextI = Next.j();
                                } else {
                                    ma61 ma61VarA = ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111);
                                    int iC = l1d.C(ys1Var.a);
                                    if (iC == 0) {
                                        mmr0Var = new mmr0(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61VarA, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, uka1Var2.a, (LinkedHashSet) null, 95), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, uka1Var, (Set) null, 1572735), new fp1(set6));
                                    } else if (iC == 1) {
                                        mmr0Var = new mmr0(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61VarA, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023), (Object) null);
                                    } else {
                                        if (iC != 2) {
                                            eg.o();
                                            return null;
                                        }
                                        fu1 fu1VarB6 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61VarA, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                                        i031 i031Var2 = i031Var instanceof i031 ? i031Var : null;
                                        mmr0Var = new mmr0(fu1VarB6, i031Var2 != null ? new np1(i031Var2.a.a, set6) : null);
                                    }
                                    fu1 fu1Var2 = (fu1) mmr0Var.a;
                                    cq1 cq1Var = (cq1) mmr0Var.b;
                                    Next nextJ2 = c97.j(fu1Var2, i031Var);
                                    nextI = Next.i(nextJ2.f(fu1Var2), dm61.y0(nextJ2.b(), dm61.A0(cq1Var)));
                                }
                            }
                        } else if (ks1Var instanceof ms1) {
                            nextI = i031Var != null ? Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023)) : Next.j();
                        } else if (ks1Var instanceof ts1) {
                            nextI = wka1Var instanceof uka1 ? Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, ((uka1) wka1Var).a, (LinkedHashSet) null, 95), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, uka1Var, (Set) null, 1572735)) : Next.j();
                        } else {
                            if (!(ks1Var instanceof ls1)) {
                                if (ks1Var instanceof at1) {
                                    nextJ = Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, dm61.y0(set, ((at1) ks1Var).a), 63), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                } else if (ks1Var instanceof us1) {
                                    us1 us1Var = (us1) ks1Var;
                                    xj61 xj61Var4 = new xj61();
                                    xj61Var4.add(fu1.a(fu1Var, true, ma61Var.h() ? gv1Var2 : gv1Var, 4));
                                    if (us1Var.a && ma61Var.h() && !(by1Var instanceof by1)) {
                                        xj61Var4.add(new mp1(stu0Var.a, ttu0Var.a));
                                    }
                                    xj61 xj61VarJ3 = cwl1.j(xj61Var4);
                                    fu1 fu1VarB7 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                                    nextI = !fu1VarB7.equals(fu1Var) ? Next.i(fu1VarB7, xj61VarJ3) : Next.a(xj61VarJ3);
                                } else if (ks1Var instanceof os1) {
                                    fo1 fo1Var3 = ((os1) ks1Var).a;
                                    ru1 ru1Var = fo1Var3.a;
                                    if (ru1Var != null) {
                                        String str2 = ru1Var.a;
                                        fo1Var = fo1Var2;
                                        if (!ru1Var.equals(fo1Var.a)) {
                                            String str3 = ru1Var.b;
                                            yv51 yv51Var = (yv51) map.get(str2);
                                            z2 = (u890.j(str3, yv51Var != null ? yv51Var.a : null) && map.containsKey(str2)) ? false : true;
                                        }
                                        xj61Var = new xj61();
                                        if (ru1Var != null) {
                                            xj61Var.add(new yp1(ru1Var.b, ru1Var.a));
                                        }
                                        if (z2) {
                                            xj61Var.add(new xp1("", ru1Var.a));
                                        }
                                        xj61VarJ = cwl1.j(xj61Var);
                                        if (fo1Var3.equals(fo1Var)) {
                                            fu1VarB = fu1.b(fu1Var, (String) null, fo1Var3, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097149);
                                            if (z2 && u890.j(ru1Var.a, "atp")) {
                                                fu1VarB = fu1.b(fu1VarB, "", (fo1) null, true, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097146);
                                            }
                                            nextI = Next.i(fu1VarB, xj61VarJ);
                                        } else if (xj61VarJ.a.isEmpty()) {
                                            nextI = Next.j();
                                        } else {
                                            nextI = Next.a(xj61VarJ);
                                        }
                                    } else {
                                        fo1Var = fo1Var2;
                                    }
                                    xj61Var = new xj61();
                                    if (ru1Var != null) {
                                        xj61Var.add(new yp1(ru1Var.b, ru1Var.a));
                                    }
                                    if (z2) {
                                        xj61Var.add(new xp1("", ru1Var.a));
                                    }
                                    xj61VarJ = cwl1.j(xj61Var);
                                    if (fo1Var3.equals(fo1Var)) {
                                        fu1VarB = fu1.b(fu1Var, (String) null, fo1Var3, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097149);
                                        if (z2) {
                                            fu1VarB = fu1.b(fu1VarB, "", (fo1) null, true, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097146);
                                        }
                                        nextI = Next.i(fu1VarB, xj61VarJ);
                                    } else if (xj61VarJ.a.isEmpty()) {
                                        nextI = Next.j();
                                    } else {
                                        nextI = Next.a(xj61VarJ);
                                    }
                                } else if (ks1Var instanceof js1) {
                                    String str4 = ((js1) ks1Var).a;
                                    nextI = i2 != 1 ? Next.j() : Next.i(fu1.b(fu1Var, str4, (fo1) null, true, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097146), Collections.singleton(new xp1(str4, "atp")));
                                } else if (ks1Var instanceof xs1) {
                                    pia1 pia1Var = ((xs1) ks1Var).a;
                                    nextJ = Next.i(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, pia1Var, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2096895), Collections.singleton(new aq1(pia1Var)));
                                } else if (ks1Var instanceof cs1) {
                                    tv80 tv80Var2 = ((cs1) ks1Var).a;
                                    if (i2 != 1) {
                                        nextI = Next.j();
                                    } else if (by1Var instanceof by1) {
                                        ak3 ak3Var2 = by1Var.a;
                                        yv51 yv51VarA2 = fo1.a(fo1Var2);
                                        nextI = Next.a(Collections.singleton(new bq1(ak3Var2, yv51VarA2 != null ? yv51VarA2.a : null, tv80Var2)));
                                    } else {
                                        nextI = c97.t(fu1Var, new j031(tv80Var2));
                                    }
                                } else if (ks1Var instanceof ps1) {
                                    ps1 ps1Var = (ps1) ks1Var;
                                    String str5 = ps1Var.a;
                                    nextI = by1Var instanceof by1 ? Next.a(Collections.singleton(new zp1(by1Var.a, str5, false))) : fu1Var.g ? Next.a(Collections.singleton(new up1(new dv1(str5, ps1Var.b)))) : Next.j();
                                } else if (ks1Var instanceof bs1) {
                                    nextI = z3 ? Next.a(Collections.singleton(fu1.a(fu1Var, false, (gv1) null, 6))) : Next.j();
                                } else if (ks1Var instanceof qs1) {
                                    nextJ = Next.a(Collections.singleton(pp1.a));
                                } else {
                                    boolean z7 = ks1Var instanceof vs1;
                                    List list = z6x.a;
                                    if (z7) {
                                        vs1 vs1Var = (vs1) ks1Var;
                                        String str6 = vs1Var.a;
                                        if (i2 == 3) {
                                            nextI = Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 1, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097135));
                                        } else {
                                            Set set7 = hlg1Var.a;
                                            Set set8 = hlg1Var.c;
                                            LinkedHashSet linkedHashSetU0 = dm61.u0(str6, set7);
                                            yc41 yc41Var = vs1Var.b;
                                            if (yc41Var instanceof xc41) {
                                                xc41 xc41Var = (xc41) yc41Var;
                                                List list2 = (List) xc41Var.a.get(str6);
                                                if (list2 == null) {
                                                    list2 = list;
                                                }
                                                nextI = Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, hlg1.a(hlg1Var, linkedHashSetU0, dm61.x0(new af41(str6, list2, xc41Var.b), hlg1Var.b), dm61.u0(str6, set8), (LinkedHashSet) null, (LinkedHashSet) null, 24), (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                            } else {
                                                if (!(yc41Var instanceof vc41) && !(yc41Var instanceof wc41)) {
                                                    eg.o();
                                                    return null;
                                                }
                                                boolean zContains = hlg1Var.a.contains(str6);
                                                hlg1 hlg1VarA = hlg1.a(hlg1Var, linkedHashSetU0, (Set) null, dm61.u0(str6, set8), (LinkedHashSet) null, (LinkedHashSet) null, 26);
                                                if (zContains) {
                                                    fu1 fu1VarC = fu1Var.c(new sc21(str6, (byte) 17), o641.S0);
                                                    nextI = Next.h(fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(fu1VarC.h, (stu0) null, (ttu0) null, hlg1VarA, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                                } else {
                                                    nextI = Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, hlg1VarA, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                                }
                                            }
                                        }
                                    } else if (ks1Var instanceof rs1) {
                                        rs1 rs1Var = (rs1) ks1Var;
                                        gy1 gy1Var = fu1Var.m;
                                        String str7 = rs1Var.b;
                                        fu1 fu1VarB8 = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 1, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097135);
                                        ma61 ma61Var2 = fu1VarB8.h;
                                        if (fu1Var.e == 3) {
                                            nextI = Next.h(fu1VarB8);
                                        } else {
                                            bum0 bum0Var = rs1Var.a;
                                            if (bum0Var instanceof aum0) {
                                                Map map2 = ((aum0) bum0Var).d;
                                                boolean z8 = fu1VarB8.m instanceof zx1;
                                                hlg1 hlg1VarA2 = ma61Var2.c;
                                                if (z8) {
                                                    Set set9 = ma61Var2.d;
                                                    List list3 = (List) map2.get(str7);
                                                    if (list3 == null) {
                                                        list3 = list;
                                                    }
                                                    if (list3.isEmpty()) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        for (Object obj5 : set9) {
                                                            if (!u890.j(((hmg) obj5).a, str7)) {
                                                                arrayList4.add(obj5);
                                                            }
                                                        }
                                                        setP1 = o7h.p1(arrayList4);
                                                    } else {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        for (Object obj6 : set9) {
                                                            if (!u890.j(((hmg) obj6).a, str7)) {
                                                                arrayList5.add(obj6);
                                                            }
                                                        }
                                                        setP1 = dm61.x0(new hmg(str7, list3), o7h.p1(arrayList5));
                                                    }
                                                    Set set10 = setP1;
                                                    nextI = set10.equals(set9) ? Next.h(fu1VarB8) : Next.h(fu1.b(fu1VarB8, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var2, (stu0) null, (ttu0) null, (hlg1) null, set10, (k031) null, (Set) null, (LinkedHashSet) null, 119), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                                } else {
                                                    boolean zContains2 = hlg1VarA2.d.contains(str7);
                                                    boolean zIsEmpty = map2.isEmpty();
                                                    if (zContains2 || !zIsEmpty) {
                                                        if (zContains2) {
                                                            hlg1VarA2 = hlg1.a(hlg1VarA2, (LinkedHashSet) null, (Set) null, (LinkedHashSet) null, dm61.u0(str7, hlg1VarA2.d), dm61.x0(str7, hlg1VarA2.e), 7);
                                                        }
                                                        hlg1 hlg1VarA3 = hlg1VarA2;
                                                        if (!zIsEmpty) {
                                                            List list4 = (List) map2.get(str7);
                                                            if (list4 == null) {
                                                                list4 = list;
                                                            }
                                                            hlg1VarA3 = hlg1.a(hlg1VarA3, (LinkedHashSet) null, dm61.x0(new af41(str7, list4, false), hlg1VarA3.b), (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, 29);
                                                        }
                                                        nextI = Next.h(fu1.b(fu1VarB8, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var2, (stu0) null, (ttu0) null, hlg1VarA3, (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                                                    } else {
                                                        nextI = Next.h(fu1VarB8);
                                                    }
                                                }
                                            } else {
                                                boolean z9 = bum0Var instanceof ytm0;
                                                Object obj7 = sp1.a;
                                                rp1 rp1Var = rp1.a;
                                                if (z9) {
                                                    if (gy1Var instanceof fy1) {
                                                        obj7 = rp1Var;
                                                    }
                                                    nextI = iho1.q(fu1VarB8, str7, Collections.singleton(obj7));
                                                } else if (bum0Var instanceof ztm0) {
                                                    if (((ztm0) bum0Var).a instanceof ey21) {
                                                        obj3 = qp1.a;
                                                    } else {
                                                        if (gy1Var instanceof fy1) {
                                                            obj7 = rp1Var;
                                                        }
                                                        obj3 = obj7;
                                                    }
                                                    nextI = iho1.q(fu1VarB8, str7, Collections.singleton(obj3));
                                                } else {
                                                    eg.o();
                                                    nextJ = null;
                                                }
                                            }
                                        }
                                    } else if (ks1Var instanceof ns1) {
                                        nextJ = lmt0.x(fu1Var, (ns1) ks1Var);
                                    } else if (ks1Var instanceof es1) {
                                        cwo cwoVar = ((es1) ks1Var).a;
                                        Set setSingleton2 = Collections.singleton(vp1.a);
                                        nextI = cwoVar.a != null ? Next.i(fu1Var.c(new vas((Object) cwoVar, (byte) 13), mls.O0), setSingleton2) : Next.a(setSingleton2);
                                    } else {
                                        if (!(ks1Var instanceof is1)) {
                                            eg.o();
                                            return null;
                                        }
                                        nextJ = Next.j();
                                    }
                                }
                                if (nextJ.d()) {
                                    return Next.i(new ww1((fu1) nextJ.g(), ww1Var.b), nextJ.b());
                                }
                                return nextJ.c() ? Next.a(nextJ.b()) : Next.j();
                            }
                            Set set11 = ((ls1) ks1Var).a;
                            nextI = !u890.j(set2, set11) ? Next.j() : Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, (stu0) null, (ttu0) null, (hlg1) null, (Set) null, (k031) null, w7x.a, (LinkedHashSet) null, 95), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, new uka1(set11), (Set) null, 1572735));
                        }
                    }
                    nextJ = nextI;
                    if (nextJ.d()) {
                        return Next.i(new ww1((fu1) nextJ.g(), ww1Var.b), nextJ.b());
                    }
                    if (nextJ.c()) {
                    }
                }
                nextJ = e6p1.r(fu1Var, (ss1) ks1Var);
            }
        }
        ww1Var = ww1Var2;
        if (nextJ.d()) {
            return Next.i(new ww1((fu1) nextJ.g(), ww1Var.b), nextJ.b());
        }
        if (nextJ.c()) {
        }
    }

    private final Next c(Object obj, Object obj2) {
        hhm0 hhm0Var = (hhm0) obj;
        e300 e300Var = (a700) obj2;
        if (e300Var instanceof izz) {
            hhm0Var.getClass();
            Uri uri = ((izz) e300Var).a;
            hhm0 hhm0VarA = hhm0.a(hhm0Var, uri, null, null, 123);
            xj61 xj61Var = new xj61();
            if (hhm0Var.d) {
                xj61Var.add(new qgw(uri, hhm0Var.a));
            } else {
                xj61Var.add(new cbw(uri));
            }
            return Next.i(hhm0VarA, cwl1.j(xj61Var));
        }
        if (e300Var instanceof e300) {
            hhm0Var.getClass();
            Set set = hhm0Var.g;
            String str = e300Var.a;
            return Next.i(hhm0.a(hhm0Var, null, null, dm61.x0(str, set), 63), Collections.singleton(new qew(str)));
        }
        if (e300Var instanceof o200) {
            return Next.a(Collections.singleton(new ofw(false, ((o200) e300Var).a)));
        }
        if (e300Var instanceof c300) {
            hhm0Var.getClass();
            String str2 = ((c300) e300Var).a;
            if (!u890.j(str2, "android.permission.CAMERA")) {
                return Next.j();
            }
            boolean zContains = hhm0Var.g.contains(str2);
            hhm0 hhm0VarA2 = hhm0.a(hhm0Var, null, null, null, 111);
            xj61 xj61Var2 = new xj61();
            if (!zContains) {
                xj61Var2.add(new ifw(str2, true));
            }
            return Next.i(hhm0VarA2, cwl1.j(xj61Var2));
        }
        if (e300Var instanceof d300) {
            hhm0Var.getClass();
            return !u890.j(((d300) e300Var).a, "android.permission.CAMERA") ? Next.j() : Next.i(hhm0.a(hhm0Var, null, null, null, 111), Collections.singleton(new ofw(true, hhm0Var.e)));
        }
        if (e300Var instanceof n200) {
            hhm0Var.getClass();
            n200 n200Var = (n200) e300Var;
            String str3 = n200Var.a;
            if (n200Var.c) {
                return n200Var.b ? Next.a(Collections.singleton(new ifw("android.permission.CAMERA", false))) : Next.i(hhm0.a(hhm0Var, null, str3, dm61.u0("android.permission.CAMERA", hhm0Var.g), 47), Collections.singleton(new qew("android.permission.CAMERA")));
            }
            return Next.a(Collections.singleton(new ofw(true, str3)));
        }
        if (e300Var instanceof twz) {
            hhm0Var.getClass();
            return Next.a(Collections.singleton(new jfw(hhm0Var.f)));
        }
        if (!(e300Var instanceof a400)) {
            if (!(e300Var instanceof jzz)) {
                return Next.j();
            }
            hhm0Var.getClass();
            return Next.a(Collections.singleton(new cbw(hhm0Var.c)));
        }
        hhm0Var.getClass();
        Uri uri2 = Uri.EMPTY;
        hhm0 hhm0VarA3 = hhm0.a(hhm0Var, uri2, null, null, 123);
        xj61 xj61Var3 = new xj61();
        if (hhm0Var.d) {
            xj61Var3.add(new pew(hhm0Var.a));
        } else {
            xj61Var3.add(new cbw(uri2));
        }
        return Next.i(hhm0VarA3, cwl1.j(xj61Var3));
    }

    private final Next d(Object obj, Object obj2) {
        t7q0 h7q0Var;
        tv80 tv80Var;
        r6f b6fVar;
        tv80 tv80VarY;
        r6f g6fVar;
        String str;
        t6f t6fVar = (t6f) obj;
        tq80 tq80Var = (tq80) obj2;
        t6fVar.getClass();
        m6f m6fVar = (r6f) tq80Var.a;
        tqw tqwVar = tq80Var.b;
        f7q0 f7q0Var = t6fVar.a;
        if (m6fVar instanceof q6f) {
            return t6fVar.e ? Next.a(Effects.a(new q5f[]{new q5f(((q6f) m6fVar).a)})) : Next.j();
        }
        if (m6fVar instanceof d6f) {
            d6f d6fVar = (d6f) m6fVar;
            return Next.i(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, d6fVar.b, (String) null, (bc71) null, 1279), Effects.a(new s5f[]{new p5f(new n6f(d6fVar.a), (tv80) null), new o5f(1)}));
        }
        if (m6fVar instanceof l6f) {
            String str2 = t6fVar.j;
            l6f l6fVar = (l6f) m6fVar;
            String str3 = l6fVar.a;
            return u890.j(str2, str3) ? Next.j() : Next.i(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, l6fVar.a, (bc71) null, 1535), Effects.a(new r5f[]{new r5f(str3)}));
        }
        if (m6fVar instanceof m6f) {
            m6f m6fVar2 = m6fVar;
            return Next.i(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, m6fVar2.b, (String) null, (bc71) null, 1279), Effects.a(new s5f[]{new p5f(new n6f(m6fVar2.a), (tv80) null), new o5f(2)}));
        }
        if (m6fVar instanceof k6f) {
            return Next.h(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 1535));
        }
        if (m6fVar instanceof j6f) {
            f7q0 f7q0Var2 = f7q0Var instanceof f7q0 ? f7q0Var : null;
            String strK = (f7q0Var2 == null || (str = f7q0Var2.a) == null) ? null : nzy.k(str);
            if (u890.j(t6fVar.k, kb71.a)) {
                j6f j6fVar = (j6f) m6fVar;
                if (u890.j(strK, j6fVar.a) && u890.j(f7q0Var2.c, j6fVar.b)) {
                    return Next.h(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, j6fVar.c, 1023));
                }
            }
            return Next.j();
        }
        if (m6fVar instanceof f6f) {
            String str4 = ((f6f) m6fVar).a;
            tv80 tv80VarY2 = tqwVar != null ? n3o1.y(tqwVar) : null;
            if (!ihc1.y0(str4) && f7q0Var == null) {
                g6fVar = new h6f(str4);
            } else if (ihc1.y0(str4) && f7q0Var != null) {
                g6fVar = new i6f(f7q0Var);
            } else {
                if (ihc1.y0(str4) || f7q0Var == null) {
                    return Next.j();
                }
                g6fVar = new g6f(str4, f7q0Var);
            }
            return Next.i(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 1279), Effects.a(new p5f[]{new p5f(g6fVar, tv80VarY2)}));
        }
        if (m6fVar.equals(w5f.a)) {
            return Next.h(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 1791));
        }
        e6f e6fVar = e6f.a;
        if (m6fVar.equals(e6fVar)) {
            return Next.a(Effects.a(new p5f[]{new p5f(e6fVar, tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        r6f r6fVar = y5f.a;
        if (m6fVar.equals(r6fVar)) {
            return Next.a(Effects.a(new p5f[]{new p5f(r6fVar, tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        c6f c6fVar = c6f.a;
        if (m6fVar.equals(c6fVar)) {
            return Next.a(Effects.a(new p5f[]{new p5f(c6fVar, tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        if (m6fVar.equals(t5f.a)) {
            return Next.h(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, !t6fVar.h, (String) null, (String) null, (bc71) null, 1919));
        }
        if (m6fVar.equals(u5f.a)) {
            return Next.h(t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 1919));
        }
        boolean z2 = m6fVar instanceof v5f;
        r6f r6fVar2 = a6f.a;
        r6f r6fVar3 = z5f.a;
        if (z2) {
            t6f t6fVarA = t6f.a(t6fVar, (t7q0) null, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 1919);
            int iOrdinal = ((v5f) m6fVar).a.ordinal();
            if (iOrdinal == 0) {
                tv80Var = null;
                b6fVar = r6fVar;
            } else if (iOrdinal == 1) {
                tv80Var = null;
                b6fVar = new b6f(t6fVar.f == 2);
            } else if (iOrdinal == 2) {
                tv80Var = null;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                b6fVar = r6fVar3;
                tv80Var = null;
            }
            if (tqwVar != null) {
                b6fVar = r6fVar2;
                tv80VarY = n3o1.y(tqwVar);
            } else {
                b6fVar = r6fVar2;
                tv80VarY = tv80Var;
            }
            return Next.i(t6fVarA, Effects.a(new p5f[]{new p5f(b6fVar, tv80VarY)}));
        }
        if (m6fVar instanceof b6f) {
            return Next.a(Effects.a(new p5f[]{new p5f(m6fVar, tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        p6f p6fVar = p6f.a;
        if (m6fVar.equals(p6fVar)) {
            return Next.a(Effects.a(new p5f[]{new p5f(p6fVar, tqwVar != null ? n3o1.y(tqwVar) : null)}));
        }
        if (m6fVar instanceof o6f) {
            return Next.a(Effects.a(new p5f[]{new p5f(m6fVar, (tv80) null)}));
        }
        if (!(m6fVar instanceof x5f)) {
            if ((m6fVar instanceof h6f) || (m6fVar instanceof i6f) || (m6fVar instanceof g6f) || m6fVar.equals(r6fVar2) || m6fVar.equals(r6fVar3) || (m6fVar instanceof n6f)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        h7q0 h7q0Var2 = f7q0Var instanceof h7q0 ? (h7q0) f7q0Var : null;
        apl aplVar = h7q0Var2 != null ? h7q0Var2.a : null;
        ppl pplVar = aplVar instanceof ppl ? (ppl) aplVar : null;
        if (pplVar == null) {
            return Next.j();
        }
        List list = pplVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            mg31 mg31Var = ((opl) obj3).c;
            if (!u890.j(mg31Var != null ? mg31Var.b : null, ((x5f) m6fVar).a)) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            h7q0Var = null;
        } else {
            ppl pplVarA = ppl.a(pplVar, arrayList, 5);
            h7q0Var2.getClass();
            h7q0Var = new h7q0(pplVarA);
        }
        return Next.i(t6f.a(t6fVar, h7q0Var, false, false, false, false, 0, (c380) null, false, (String) null, (String) null, (bc71) null, 2046), Effects.a(new p5f[]{new p5f(m6fVar, (tv80) null)}));
    }

    private final Next e(Object obj, Object obj2) {
        wpf wpfVar = (wpf) obj;
        ppf ppfVar = (ppf) obj2;
        List list = wpfVar.d;
        if (ppfVar.equals(opf.a)) {
            if (wpfVar.e || wpfVar.f) {
                return Next.j();
            }
            return Next.i(wpf.a(wpfVar, null, true, false, 111), Collections.singleton(new gpf(wpfVar.b, wpfVar.a, ((vpf) o7h.A0(list)).a)));
        }
        if (ppfVar instanceof npf) {
            npf npfVar = (npf) ppfVar;
            return Next.h(wpf.a(wpfVar, o7h.N0(upf.l(npfVar.a), list), false, !npfVar.b, 71));
        }
        if (ppfVar.equals(mpf.a)) {
            return Next.i(wpf.a(wpfVar, null, false, false, 111), Collections.singleton(new hpf()));
        }
        eg.o();
        return null;
    }

    private final Next f(Object obj, Object obj2) {
        int i2;
        cuu0 cuu0Var;
        q6h q6hVar = (s6h) obj;
        l6h l6hVar = (n6h) obj2;
        int iP = 0;
        cuu0 cuu0VarK = null;
        if (!(l6hVar instanceof i6h)) {
            if (l6hVar instanceof l6h) {
                if (q6hVar instanceof r6h) {
                    return Next.h(r6h.l((r6h) q6hVar, 0, l6hVar.a, 31));
                }
                if (q6hVar instanceof p6h) {
                    return Next.h(p6h.l((p6h) q6hVar, 0, l6hVar.a, 31));
                }
                if (q6hVar instanceof q6h) {
                    return Next.h(q6h.l(q6hVar, 0, l6hVar.a, (String) null, (String) null, (String) null, 0, (llw0) null, (ilw0) null, (List) null, 0, (ArrayList) null, (sxq0) null, (cuu0) null, 131039));
                }
                eg.o();
                return null;
            }
            if (l6hVar instanceof j6h) {
                if (!(q6hVar instanceof q6h)) {
                    return Next.j();
                }
                q6h q6hVar2 = q6hVar;
                j6h j6hVar = (j6h) l6hVar;
                return Next.i(q6h.l(q6hVar2, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ilw0) null, (List) null, 0, (ArrayList) null, (sxq0) null, (cuu0) null, 131039), Collections.singleton(new f6h(q6hVar2, j6hVar.a, j6hVar.b, j6hVar.c)));
            }
            if (l6hVar instanceof m6h) {
                m6h m6hVar = (m6h) l6hVar;
                if (!(q6hVar instanceof q6h)) {
                    return Next.j();
                }
                q6h q6hVar3 = q6hVar;
                x8d1 x8d1Var = (x8d1) o7h.t0(m6hVar.a, q6hVar3.Z);
                return x8d1Var == null ? Next.j() : Next.h(q6h.l(q6hVar3, 0, (wkt) null, (String) null, (String) null, (String) null, 0, x8d1Var.a(), (ilw0) null, (List) null, m6hVar.a, (ArrayList) null, (sxq0) null, (cuu0) null, 121855));
            }
            if (l6hVar instanceof g6h) {
                if (!(q6hVar instanceof q6h)) {
                    return Next.j();
                }
                q6h q6hVar4 = q6hVar;
                cuu0 cuu0Var2 = q6hVar4.Q0;
                return Next.h(q6h.l(q6hVar4, 0, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ilw0) null, (List) null, 0, (ArrayList) null, (sxq0) null, cuu0Var2 != null ? cuu0Var2.j(((g6h) l6hVar).a) : null, 65535));
            }
            if (l6hVar instanceof h6h) {
                return q6hVar instanceof q6h ? Next.j() : Next.h(new p6h(q6hVar.h(), q6hVar.g(), q6hVar.b(), q6hVar.a(), q6hVar.j(), (wkt) null));
            }
            if (l6hVar instanceof k6h) {
                return Next.h(new r6h(q6hVar.h(), q6hVar.g(), q6hVar.b(), q6hVar.a(), q6hVar.j(), (wkt) null));
            }
            eg.o();
            return null;
        }
        if (!(q6hVar instanceof q6h)) {
            i6h i6hVar = (i6h) l6hVar;
            List list = i6hVar.f;
            cuu0 cuu0Var3 = i6hVar.i;
            q6h q6hVar5 = new q6h(q6hVar.h(), q6hVar.g(), q6hVar.b(), q6hVar.a(), q6hVar.j(), q6hVar.k(), i6hVar.a, i6hVar.b, i6hVar.c, i6hVar.d, ((x8d1) list.get(0)).a(), i6hVar.e, list, 0, i6hVar.g, i6hVar.h, cuu0Var3 != null ? cuu0Var3.j(q6hVar.j().g.getBoolean("playlist.share.is_inviting_contributors", false)) : null);
            return Next.i(q6hVar5, a4p1.x(q6hVar5, dxo1.w(q6hVar.h())));
        }
        q6h q6hVar6 = q6hVar;
        List list2 = q6hVar6.Z;
        i6h i6hVar2 = (i6h) l6hVar;
        List list3 = i6hVar2.f;
        auu0 auu0Var = q6hVar6.Q0;
        int i3 = q6hVar6.N0;
        x8d1 x8d1Var2 = (x8d1) o7h.t0(i3, list2);
        if (x8d1Var2 != null) {
            int iIndexOf = list3.indexOf(x8d1Var2);
            if (iIndexOf >= 0) {
                i2 = iIndexOf;
            } else if (i3 <= p7h.L(list3)) {
                i2 = i3;
            } else {
                iP = yoi1.p(0, 0, p7h.L(list3));
                i2 = iP;
            }
        } else {
            i2 = iP;
        }
        llw0 llw0VarA = ((x8d1) list3.get(i2)).a();
        String str = i6hVar2.a;
        String str2 = i6hVar2.b;
        String str3 = i6hVar2.c;
        int i4 = i6hVar2.d;
        ilw0 ilw0Var = i6hVar2.e;
        ArrayList arrayList = i6hVar2.g;
        sxq0 sxq0Var = i6hVar2.h;
        cuu0 cuu0Var4 = i6hVar2.i;
        if (cuu0Var4 == null) {
            cuu0Var = cuu0VarK;
        } else if ((auu0Var instanceof auu0) && (cuu0Var4 instanceof auu0)) {
            cuu0VarK = auu0.k((auu0) cuu0Var4, auu0Var.d);
            cuu0Var = cuu0VarK;
        } else {
            cuu0Var = cuu0Var4;
        }
        q6h q6hVarL = q6h.l(q6hVar6, 0, (wkt) null, str, str2, str3, i4, llw0VarA, ilw0Var, list3, i2, arrayList, sxq0Var, cuu0Var, 63);
        return Next.i(q6hVarL, (list3.equals(list2) && (auu0Var instanceof auu0) == (q6hVarL.Q0 instanceof auu0)) ? w7x.a : a4p1.x(q6hVarL, dxo1.w(q6hVar6.a)));
    }

    private final Next g(Object obj, Object obj2) {
        tfh tfhVar = (tfh) obj;
        sfh sfhVar = (sfh) obj2;
        boolean z2 = sfhVar instanceof pfh;
        qmh qmhVar = qmh.c;
        if (z2) {
            GetCommentCardResponse getCommentCardResponse = ((pfh) sfhVar).a;
            return getCommentCardResponse.q() == tuw.d ? Next.h(tfh.a(tfhVar, (String) null, qmhVar, (bce0) null, 5)) : Next.h(tfh.a(tfhVar, (String) null, new smh(getCommentCardResponse), (bce0) null, 5));
        }
        if (sfhVar instanceof ofh) {
            return Next.h(tfh.a(tfhVar, (String) null, qmhVar, (bce0) null, 5));
        }
        if (!(sfhVar instanceof rfh)) {
            if (sfhVar instanceof qfh) {
                return Next.h(tfh.a(tfhVar, (String) null, (k8p1) null, ((qfh) sfhVar).a, 3));
            }
            eg.o();
            return null;
        }
        rfh rfhVar = (rfh) sfhVar;
        String str = rfhVar.a;
        k8p1 k8p1Var = tfhVar.b;
        if (k8p1Var instanceof smh) {
            GetCommentCardResponse getCommentCardResponse2 = ((smh) k8p1Var).c;
            h290 h290VarT = getCommentCardResponse2.t();
            if (!h290VarT.isEmpty()) {
                Iterator it = h290VarT.iterator();
                while (it.hasNext()) {
                    if (u890.j(((Comment) it.next()).r(), str)) {
                        h290<Comment> h290VarT2 = getCommentCardResponse2.t();
                        ArrayList arrayList = new ArrayList(q7h.U(h290VarT2, 10));
                        for (Comment comment : h290VarT2) {
                            comment.getClass();
                            String str2 = rfhVar.b;
                            if (u890.j(comment.r(), str)) {
                                neh builder = comment.toBuilder();
                                ReactionsRow reactionsRowA = comment.A();
                                a301 builder2 = reactionsRowA.toBuilder();
                                builder2.n((reactionsRowA.r().length() != 0 || str2.length() <= 0) ? (reactionsRowA.r().length() <= 0 || str2.length() != 0) ? reactionsRowA.p() : reactionsRowA.p() - 1 : reactionsRowA.p() + 1);
                                builder2.q(str2);
                                builder.t(builder2.build());
                                h hVarBuild = builder.build();
                                hVarBuild.getClass();
                                comment = (Comment) hVarBuild;
                            }
                            arrayList.add(comment);
                        }
                        ql40 builder3 = getCommentCardResponse2.toBuilder();
                        builder3.q();
                        builder3.n(arrayList);
                        return Next.h(tfh.a(tfhVar, (String) null, new smh(builder3.build()), (bce0) null, 5));
                    }
                }
            }
        }
        return Next.j();
    }

    private final Next h(Object obj, Object obj2) {
        ulh ulhVar = (ulh) obj;
        olh olhVar = (slh) obj2;
        String str = ulhVar.d;
        String str2 = ulhVar.a;
        int i2 = ulhVar.e;
        int i3 = ulhVar.g;
        if (olhVar instanceof qlh) {
            qlh qlhVar = (qlh) olhVar;
            if (qlhVar.c != i3) {
                return Next.j();
            }
            c380 c380Var = qlhVar.a;
            ArrayList arrayList = new ArrayList();
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                mlh mlhVarZ = h7p1.z((som) it.next());
                if (mlhVarZ != null) {
                    arrayList.add(mlhVarZ);
                }
            }
            c380 c380VarA = mqo1.A(arrayList);
            if (i2 != 2) {
                c380VarA = mqo1.A(o7h.N0(c380VarA, ulhVar.c));
            }
            return Next.h(ulh.a(ulhVar, c380VarA, qlhVar.b, 1, null, 0, 67));
        }
        if (olhVar instanceof olh) {
            olh olhVar2 = olhVar;
            return olhVar2.b != i3 ? Next.j() : Next.h(ulh.a(ulhVar, null, null, 4, olhVar2.a, 0, 79));
        }
        if (olhVar instanceof rlh) {
            if (i2 != 4) {
                return Next.j();
            }
            int i4 = i3 + 1;
            return Next.i(ulh.a(ulhVar, null, null, str == null ? 2 : 3, null, i4, 15), Collections.singleton(new ilh(i4, str2, str)));
        }
        if (olhVar instanceof nlh) {
            if (str == null || i2 != 1) {
                return Next.j();
            }
            int i5 = i3 + 1;
            return Next.i(ulh.a(ulhVar, null, null, 3, null, i5, 47), Collections.singleton(new ilh(i5, str2, str)));
        }
        if (olhVar instanceof plh) {
            int i6 = i3 + 1;
            return Next.i(ulh.a(ulhVar, null, null, 2, null, i6, 7), Collections.singleton(new ilh(i6, str2, (String) null)));
        }
        eg.o();
        return null;
    }

    private final Next i(Object obj, Object obj2) {
        q5d q5dVar;
        a9k a9kVar = (a9k) obj;
        tq80 tq80Var = (tq80) obj2;
        String str = a9kVar.c;
        String str2 = a9kVar.b;
        i5d i5dVar = a9kVar.g;
        String str3 = a9kVar.a;
        j8k j8kVar = (z8k) tq80Var.a;
        tqw tqwVar = tq80Var.b;
        n5d n5dVar = null;
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        if (u890.j(j8kVar, m8k.a)) {
            return Next.a(Collections.singleton(new y6k(str3, str2, str)));
        }
        if (u890.j(j8kVar, x8k.a)) {
            if (i5dVar != null) {
                ArrayList arrayList = i5dVar.g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof n5d) {
                        arrayList2.add(obj3);
                    }
                }
                n5dVar = (n5d) o7h.s0(arrayList2);
            }
            return n5dVar != null ? Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, new f8k(n5dVar.b, n5dVar.c), false, false, (u7h) null, (u7h) null, (wr21) null, 32255)) : Next.j();
        }
        if (u890.j(j8kVar, h8k.a)) {
            return Next.i(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, false, false, (u7h) null, (u7h) null, (wr21) null, 32255), Collections.singleton(new x6k(str3, str2, str)));
        }
        if (u890.j(j8kVar, k8k.a)) {
            return Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, false, false, (u7h) null, (u7h) null, (wr21) null, 32255));
        }
        if (j8kVar instanceof j8k) {
            j8k j8kVar2 = j8kVar;
            i5d i5dVar2 = j8kVar2.d;
            if (!e9k.x(a9kVar, j8kVar2.a, j8kVar2.b, j8kVar2.c)) {
                return Next.j();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Long l2 = i5dVar2.h;
            if (l2 != null) {
                linkedHashSet.add(new e7k(l2.longValue(), a9kVar.a, a9kVar.b, a9kVar.c));
            }
            linkedHashSet.add(new a7k(str3, i5dVar2.k));
            ArrayList arrayList3 = i5dVar2.g;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (obj4 instanceof s5d) {
                    arrayList4.add(obj4);
                }
            }
            n5d n5dVar2 = (s5d) o7h.s0(arrayList4);
            if (n5dVar2 != null) {
                n5dVar = i5dVar2.l.equals("purchased") ? n5dVar2 : null;
                if (n5dVar != null) {
                    linkedHashSet.add(new b7k(((s5d) n5dVar).b));
                }
            }
            return Next.i(a9k.a(a9kVar, (String) null, (List) null, 0, i5dVar2, false, (String) null, (f8k) null, false, false, (u7h) null, (u7h) null, (wr21) null, 15935), linkedHashSet);
        }
        if (j8kVar instanceof l8k) {
            l8k l8kVar = (l8k) j8kVar;
            return Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, false, false, l8kVar.a, l8kVar.b, (wr21) null, 20479));
        }
        if (j8kVar instanceof v8k) {
            if (i5dVar != null) {
                if (!i5dVar.l.equals("purchased")) {
                    i5dVar = null;
                }
                if (i5dVar != null) {
                    ArrayList arrayList5 = i5dVar.g;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList5) {
                        if (obj5 instanceof s5d) {
                            arrayList6.add(obj5);
                        }
                    }
                    s5d s5dVar = (s5d) o7h.s0(arrayList6);
                    if (s5dVar != null) {
                        n5dVar = s5dVar.b;
                    }
                }
            }
            v8k v8kVar = (v8k) j8kVar;
            return u890.j(n5dVar, v8kVar.a) ? Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, false, false, (u7h) null, (u7h) null, v8kVar.b, 16383)) : Next.j();
        }
        if (j8kVar instanceof i8k) {
            i8k i8kVar = (i8k) j8kVar;
            if (e9k.x(a9kVar, i8kVar.a, i8kVar.b, i8kVar.c)) {
                return ihc1.y0(str3) ? Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, true, (String) null, (f8k) null, false, false, (u7h) null, (u7h) null, (wr21) null, 32383)) : Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, i8kVar.d, (f8k) null, false, false, (u7h) null, (u7h) null, (wr21) null, 32383));
            }
            return Next.j();
        }
        if (j8kVar instanceof n8k) {
            return Next.a(Collections.singleton(new g7k(((n8k) j8kVar).a)));
        }
        if (j8kVar instanceof o8k) {
            return Next.a(Collections.singleton(new g7k(((o8k) j8kVar).a)));
        }
        if (u890.j(j8kVar, p8k.a)) {
            return Next.a(Collections.singleton(new c7k(str3, a9kVar.e)));
        }
        if (j8kVar instanceof q8k) {
            return Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, ((q8k) j8kVar).a, false, (u7h) null, (u7h) null, (wr21) null, 31743));
        }
        if (u890.j(j8kVar, t8k.a)) {
            if (i5dVar != null) {
                ArrayList arrayList7 = i5dVar.g;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : arrayList7) {
                    if (obj6 instanceof q5d) {
                        arrayList8.add(obj6);
                    }
                }
                q5dVar = (q5d) o7h.s0(arrayList8);
            } else {
                q5dVar = null;
            }
            return Next.a(Collections.singleton(new j7k(a9kVar.a, a9kVar.b, q5dVar != null ? q5dVar.d : null, q5dVar != null ? q5dVar.e : null, a9kVar.l, a9kVar.d)));
        }
        if (j8kVar instanceof u8k) {
            return Next.h(a9k.a(a9kVar, (String) null, (List) null, 0, (i5d) null, false, (String) null, (f8k) null, false, ((u8k) j8kVar).a, (u7h) null, (u7h) null, (wr21) null, 30719));
        }
        if (j8kVar instanceof g8k) {
            return Next.a(Collections.singleton(new d7k(((g8k) j8kVar).a, tv80VarY)));
        }
        if (j8kVar instanceof y8k) {
            return Next.a(Collections.singleton(new d7k(((y8k) j8kVar).a, tv80VarY)));
        }
        if (j8kVar instanceof w8k) {
            return Next.a(Collections.singleton(new f7k(((w8k) j8kVar).a, tv80VarY)));
        }
        if (j8kVar instanceof r8k) {
            r8k r8kVar = (r8k) j8kVar;
            return Next.a(Collections.singleton(new f7k(r8kVar.a, r8kVar.b)));
        }
        if (!(j8kVar instanceof s8k)) {
            eg.o();
            return null;
        }
        s8k s8kVar = (s8k) j8kVar;
        String str4 = s8kVar.c;
        String str5 = s8kVar.b;
        String str6 = s8kVar.a;
        return e9k.x(a9kVar, str6, str5, str4) ? Next.a(Collections.singleton(new z6k(str6, str5, str4))) : Next.j();
    }

    public final Next a(Object obj, Object obj2) {
        ou80 ou80Var;
        byte b2 = this.a;
        Set setO = w7x.a;
        String str = null;
        switch (b2) {
            case 0:
                m4 m4Var = (m4) obj;
                k4 k4Var = (k4) obj2;
                if (k4Var instanceof i4) {
                    return Next.h(m4.a(m4Var, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0, 0, ((i4) k4Var).a, 255));
                }
                if (k4Var instanceof h4) {
                    h4 h4Var = (h4) k4Var;
                    return Next.i(m4.a(m4Var, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0, 0, (wkt) null, 255), Collections.singleton(new g4(h4Var.b, m4Var.a, h4Var.a)));
                }
                if (k4Var instanceof j4) {
                    j4 j4Var = (j4) k4Var;
                    return Next.h(m4.a(m4Var, (String) null, (String) null, (List) null, j4Var.a, j4Var.b, j4Var.c, j4Var.d, j4Var.e, (wkt) null, 263));
                }
                eg.o();
                return null;
            case 1:
                izd izdVar = (tj0) obj2;
                mj0 mj0Var = ((jk0) obj).a;
                List list = mj0Var.c;
                ji0 ji0Var = mj0Var.a;
                if (izdVar instanceof izd) {
                    int i2 = izdVar.a;
                    return Next.a(Effects.a(new vi0[]{new ojb0(((hj0) list.get(i2)).d), new nny0(ji0Var.a, ((hj0) list.get(i2)).a, i2, 1)}));
                }
                if (izdVar instanceof ozd) {
                    int i3 = ((ozd) izdVar).a;
                    return Next.a(Effects.a(new nny0[]{new nny0(ji0Var.a, ((hj0) list.get(i3)).a, i3, 2)}));
                }
                if (izdVar instanceof sdo) {
                    return Next.a(Effects.a(new ojb0[]{new ojb0(((hj0) mj0Var.c.get(((sdo) izdVar).a)).d)}));
                }
                if (izdVar instanceof ta30) {
                    return Next.a(Effects.a(new ojb0[]{new ojb0(((hj0) mj0Var.c.get(((ta30) izdVar).a)).d)}));
                }
                if (!(izdVar instanceof wr10)) {
                    if ((izdVar instanceof x9d1) || (izdVar instanceof gad1)) {
                        return Next.j();
                    }
                    if (izdVar instanceof mk20) {
                        return Next.a(Effects.a(new x57[]{new x57(ji0Var.a)}));
                    }
                    if (izdVar instanceof dkk1) {
                        return Next.a(Effects.a(new bm21[]{new bm21(((dkk1) izdVar).a, ji0Var.a)}));
                    }
                    eg.o();
                    return null;
                }
                xx10 xx10Var = ((wr10) izdVar).a;
                if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
                    return Next.a(Effects.a(new jeu[]{new jeu(ji0Var.a)}));
                }
                if ((xx10Var instanceof tx10) || (xx10Var instanceof ux10) || (xx10Var instanceof rx10)) {
                    return Next.j();
                }
                eg.o();
                return null;
            case 2:
                gj1 gj1Var = (ij1) obj;
                dj1 dj1Var = (ej1) obj2;
                if (!(gj1Var instanceof gj1)) {
                    return Next.j();
                }
                if (dj1Var instanceof aj1) {
                    gj1 gj1Var2 = gj1Var;
                    aj1 aj1Var = (aj1) dj1Var;
                    ArrayList arrayList = new ArrayList();
                    for (d6q0 d6q0Var : aj1Var.a) {
                        if (d6q0Var instanceof h6q0) {
                            arrayList.add(((h6q0) d6q0Var).a.a);
                        } else if (d6q0Var instanceof d6q0) {
                            Iterator it = d6q0Var.a.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((w4i1) it.next()).a);
                            }
                        }
                    }
                    Map map = gj1Var2.h;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (arrayList.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return Next.h(gj1.d(gj1Var2, 2, aj1Var.c, aj1Var.b, linkedHashMap, aj1Var.a, false, 613));
                }
                if (dj1Var.equals(zi1.a)) {
                    return Next.h(gj1.d(gj1Var, 3, (w4i1) null, 0, (Map) null, (List) null, false, 1021));
                }
                if (dj1Var.equals(bj1.a)) {
                    gj1 gj1Var3 = gj1Var;
                    return Next.i(gj1.d(gj1Var3, 1, (w4i1) null, 0, (Map) null, (List) null, false, 1021), Effects.a(new vi1[]{new ui1(gj1Var3.a)}));
                }
                if (dj1Var instanceof dj1) {
                    gj1 gj1Var4 = gj1Var;
                    dj1 dj1Var2 = dj1Var;
                    boolean z2 = dj1Var2.b;
                    w4i1 w4i1Var = dj1Var2.a;
                    Map map2 = gj1Var4.h;
                    return Next.h(gj1.d(gj1Var4, 0, (w4i1) null, 0, z2 ? sqg0.P(map2, new mmr0(w4i1Var.a, w4i1Var)) : sqg0.K(w4i1Var.a, map2), (List) null, false, 895));
                }
                if (dj1Var instanceof cj1) {
                    gj1 gj1Var5 = gj1Var;
                    return Next.h(gj1.d(gj1Var5, 0, (w4i1) null, 0, sqg0.K(((cj1) dj1Var).a.a, gj1Var5.h), (List) null, false, 895));
                }
                if (dj1Var.equals(yi1.a)) {
                    return Next.h(gj1.d(gj1Var, 0, (w4i1) null, 0, (Map) null, (List) null, true, 511));
                }
                if (dj1Var.equals(wi1.a)) {
                    return Next.h(gj1.d(gj1Var, 0, (w4i1) null, 0, (Map) null, (List) null, false, 511));
                }
                if (dj1Var.equals(xi1.a)) {
                    gj1 gj1Var6 = gj1Var;
                    return Next.i(gj1.d(gj1Var6, 4, (w4i1) null, 0, (Map) null, (List) null, false, 509), Effects.a(new ti1[]{new ti1(gj1Var6.a, o7h.l1(gj1Var6.h.values()))}));
                }
                eg.o();
                return null;
            case 3:
                nu1 nu1Var = (nu1) obj;
                hu1 hu1Var = (iu1) obj2;
                tu1 tu1Var = nu1Var.a;
                if (hu1Var instanceof hu1) {
                    tu1 tu1VarN = nu1Var.b ? hu1Var.a.N(tu1Var) : tu1Var;
                    return tu1VarN.equals(tu1Var) ? Next.j() : Next.h(nu1.a(nu1Var, tu1VarN, false, false, 14));
                }
                if (hu1Var.equals(gu1.a)) {
                    return tu1Var.b().size() > 1 ? Next.h(nu1.a(nu1Var, tu1Var.a().b.e0(tu1Var), false, false, 14)) : Next.a(Collections.singleton(lu1.a));
                }
                eg.o();
                return null;
            case 4:
                return b(obj, obj2);
            case 5:
                gb2 gb2Var = (gb2) obj2;
                boolean z3 = gb2Var.a;
                Integer num = gb2Var.b;
                ((tb2) obj).getClass();
                return Next.h(new tb2(num, z3));
            case 6:
                hb51 hb51Var = (hb51) obj;
                u051 u051Var = (r151) ((tq80) obj2).a;
                se11 se11Var = gt3.a;
                boolean z4 = hb51Var.h;
                List list2 = hb51Var.e;
                String str2 = hb51Var.a;
                String str3 = hb51Var.b;
                int i4 = hb51Var.f;
                boolean z5 = u051Var instanceof m051;
                by41 by41Var = ay41.a;
                if (z5) {
                    String str4 = ((m051) u051Var).a;
                    if (ihc1.y0(str4) || str4.length() > 500) {
                        return Next.h(hb51.a(hb51Var, str4, null, 0, 0, false, false, false, false, 0, 7293));
                    }
                    int i5 = i4 + 1;
                    return Next.i(hb51.a(hb51Var, str4, null, i5, 0, true, false, false, false, hb51Var.m + 1, 3165), f46.S0(new by41[]{new xx41(str2, str4, 0, i5), by41Var}));
                }
                boolean zEquals = u051Var.equals(n051.a);
                List list3 = z6x.a;
                if (zEquals) {
                    return Next.h(hb51.a(hb51Var, "", list3, 0, 0, false, false, false, false, 0, 7277));
                }
                if (u051Var instanceof d151) {
                    d151 d151Var = (d151) u051Var;
                    List list4 = d151Var.b;
                    int i6 = d151Var.a;
                    if (i6 != i4) {
                        return Next.j();
                    }
                    if (i6 != hb51Var.g || list2.isEmpty()) {
                        list2 = list3;
                    }
                    ArrayList arrayListN0 = o7h.N0(list4, list2);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayListN0) {
                        if (hashSet.add(((h951) obj3).c)) {
                            arrayList2.add(obj3);
                        }
                    }
                    return Next.h(hb51.a(hb51Var, null, arrayList2, 0, d151Var.a, false, false, false, list4.size() >= 10, 0, 6191));
                }
                if (u051Var instanceof f151) {
                    return ((f151) u051Var).a != i4 ? Next.j() : Next.h(hb51.a(hb51Var, null, null, 0, 0, false, false, true, false, 0, 7295));
                }
                if (u051Var.equals(zz41.a)) {
                    return z4 ? Next.h(hb51.a(hb51Var, null, null, 0, 0, false, true, false, false, 0, 7935)) : Next.j();
                }
                if (u051Var.equals(c151.a)) {
                    return (!hb51Var.k || z4 || ihc1.y0(str3)) ? Next.j() : Next.i(hb51.a(hb51Var, null, null, 0, 0, true, false, false, false, 0, 8063), Collections.singleton(new xx41(str2, str3, list2.size(), i4)));
                }
                if (u051Var.equals(a151.a)) {
                    if (ihc1.y0(str3)) {
                        return Next.j();
                    }
                    int i7 = i4 + 1;
                    return Next.i(hb51.a(hb51Var, null, list3, i7, 0, true, false, false, false, 0, 7503), f46.S0(new by41[]{new xx41(str2, str3, 0, i7), by41Var}));
                }
                if (u051Var instanceof u051) {
                    h951 h951Var = u051Var.b;
                    return Next.a(Collections.singleton(new zx41(h951Var, h951Var.g)));
                }
                if (u051Var.equals(iz41.a)) {
                    return Next.a(Collections.singleton(jx41.a));
                }
                if (u051Var.equals(hz41.a)) {
                    return Next.a(Collections.singleton(ix41.a));
                }
                eg.o();
                return null;
            case 7:
                u04 u04Var = (u04) obj;
                s04 s04Var = (s04) obj2;
                if (u890.j(s04Var, s04.b)) {
                    return Next.j();
                }
                if (u890.j(s04Var, s04.e)) {
                    return Next.j();
                }
                boolean zJ = u890.j(s04Var, s04.c);
                w04 w04Var = w04.a;
                if (zJ) {
                    u04Var.getClass();
                    return Next.h(new u04(w04Var));
                }
                if (u890.j(s04Var, s04.d)) {
                    u04Var.getClass();
                    return Next.h(new u04(w04Var));
                }
                if (u890.j(s04Var, s04.f)) {
                    u04Var.getClass();
                    return Next.h(new u04(v04.a));
                }
                if (u890.j(s04Var, s04.a)) {
                    return Next.a(Collections.singleton(r04.a));
                }
                eg.o();
                return null;
            case 8:
                co7 co7Var = (co7) obj;
                tq80 tq80Var = (tq80) obj2;
                String str5 = co7Var.a;
                wn7 wn7Var = (ao7) tq80Var.a;
                if (wn7Var instanceof xn7) {
                    return Next.a(Collections.singleton(new xcw(str5, tq80Var.b)));
                }
                if (wn7Var instanceof wn7) {
                    boolean z6 = wn7Var.a;
                    return Next.i(co7.a(co7Var, (String) null, (String) null, (String) null, !z6, false, 0, 55), Collections.singleton(new sew(str5, z6)));
                }
                if (wn7Var instanceof vn7) {
                    return Next.h(co7.a(co7Var, (String) null, (String) null, (String) null, false, ((vn7) wn7Var).a, 0, 47));
                }
                if (wn7Var instanceof un7) {
                    Logger.d(ktd.i("AudienceUserRowElement: Restrict user failed: ", ((un7) wn7Var).a), new Object[0]);
                    return Next.i(co7.a(co7Var, (String) null, (String) null, (String) null, !co7Var.e, false, 0, 55), Collections.singleton(ffw.a));
                }
                if (wn7Var instanceof zn7) {
                    zn7 zn7Var = (zn7) wn7Var;
                    return Next.h(co7.a(co7Var, (String) null, zn7Var.a, zn7Var.b, false, false, 0, 57));
                }
                if (wn7Var instanceof yn7) {
                    Logger.d(l1d.m("AudienceUserRowElement: User metadata loading failed with error: ", ((yn7) wn7Var).a.getMessage()), new Object[0]);
                    return Next.j();
                }
                eg.o();
                return null;
            case 9:
                pr7 pr7Var = (pr7) obj;
                jr7 jr7Var = (jr7) obj2;
                String str6 = pr7Var.a;
                u771 u771Var = pr7Var.g;
                if (jr7Var instanceof ir7) {
                    return Next.h(pr7.a(pr7Var, null, null, null, ((ir7) jr7Var).a, 255));
                }
                if (jr7Var instanceof cr7) {
                    pr7 pr7VarA = pr7.a(pr7Var, null, null, null, null, 255);
                    cr7 cr7Var = (cr7) jr7Var;
                    wkt wktVar = cr7Var.a;
                    int i8 = pr7Var.e;
                    return Next.i(pr7VarA, Collections.singleton(new hew(u771Var, wktVar, new ant(i8, i8), cr7Var.b)));
                }
                if (jr7Var instanceof hr7) {
                    hr7 hr7Var = (hr7) jr7Var;
                    return Next.i(pr7Var, Collections.singleton(new xaw(hr7Var.b, hr7Var.c, hr7Var.d)));
                }
                if (jr7Var instanceof er7) {
                    er7 er7Var = (er7) jr7Var;
                    return Next.h(pr7.a(pr7Var, er7Var.a, u771.a(u771Var, t771.a(u771Var.a, wa71.a(u771Var.a.a, er7Var.a, (cqs0) null, (String) null, 126), (z771) null, 2), (pz61) null, (bj71) null, 6), new lr7(er7Var.b, er7Var.c), null, 317));
                }
                if (jr7Var instanceof dr7) {
                    return Next.h(pr7.a(pr7Var, null, null, kr7.a, null, 383));
                }
                boolean z7 = jr7Var instanceof gr7;
                mr7 mr7Var = mr7.a;
                if (z7) {
                    return Next.i(pr7.a(pr7Var, null, null, mr7Var, null, 383), Collections.singleton(new gbw(str6, pr7Var.b)));
                }
                if (!(jr7Var instanceof fr7)) {
                    eg.o();
                    return null;
                }
                xj61 xj61Var = new xj61();
                String str7 = ((fr7) jr7Var).a;
                xj61Var.add(new gbw(str6, str7));
                if (u771Var.b.d) {
                    xj61Var.add(new vgw(str6, str7));
                }
                return Next.i(pr7.a(pr7Var, str7, null, mr7Var, null, 381), cwl1.j(xj61Var));
            case 10:
                an8 an8Var = (an8) obj2;
                if (an8Var instanceof zm8) {
                    zm8 zm8Var = (zm8) an8Var;
                    return Next.h(new cn8(zm8Var.a, zm8Var.b));
                }
                if (u890.j(an8Var, ym8.a)) {
                    return Next.h(bn8.a);
                }
                eg.o();
                return null;
            case 11:
                bu8 bu8Var = (bu8) obj;
                if (((yt8) obj2) instanceof yt8) {
                    bu8Var.getClass();
                    return Next.h(new bu8());
                }
                eg.o();
                return null;
            case 12:
                b0a b0aVar = (b0a) obj;
                zz9 zz9Var = (zz9) obj2;
                if (zz9Var instanceof xz9) {
                    return Next.h(b0a.a(b0aVar, 0, ((xz9) zz9Var).a, 262143));
                }
                if (zz9Var instanceof wz9) {
                    wz9 wz9Var = (wz9) zz9Var;
                    return Next.i(b0a.a(b0aVar, 0, (wkt) null, 262143), Collections.singleton(new ez9(b0aVar, wz9Var.a, wz9Var.b, wz9Var.c)));
                }
                if (zz9Var instanceof yz9) {
                    return Next.h(b0a.a(b0aVar, ((yz9) zz9Var).a, (wkt) null, 524285));
                }
                eg.o();
                return null;
            case 13:
                wba wbaVar = (wba) obj2;
                if (wbaVar != null) {
                    return Next.h(new aca(wbaVar.a));
                }
                eg.o();
                return null;
            case 14:
                lqa lqaVar = (nqa) obj;
                iqa iqaVar = (iqa) obj2;
                if (iqaVar instanceof dqa) {
                    if (!(lqaVar instanceof lqa)) {
                        dqa dqaVar = (dqa) iqaVar;
                        cuu0 cuu0Var = dqaVar.h;
                        cuu0 cuu0VarJ = cuu0Var != null ? cuu0Var.j(lqaVar.k().g.getBoolean("playlist.share.is_inviting_contributors", false)) : null;
                        return Next.i(new lqa(lqaVar.j(), lqaVar.h(), lqaVar.a(), lqaVar.k(), dqaVar.f, lqaVar.getDescription(), lqaVar.b(), lqaVar.l(), dqaVar.a, dqaVar.b, dqaVar.c, dqaVar.d, dqaVar.e, dqaVar.g, cuu0VarJ), r2p1.o(cuu0VarJ, xqa.a, (on71) null));
                    }
                    lqa lqaVar2 = lqaVar;
                    cuu0 cuu0Var2 = lqaVar2.O0;
                    dqa dqaVar2 = (dqa) iqaVar;
                    lqa lqaVarN = lqa.n(lqaVar2, 0, dqaVar2.f, (wkt) null, dqaVar2.a, dqaVar2.b, dqaVar2.c, dqaVar2.d, dqaVar2.e, dqaVar2.g, r2p1.l(cuu0Var2, dqaVar2.h), 239);
                    boolean z8 = cuu0Var2 instanceof auu0;
                    cuu0 cuu0Var3 = lqaVarN.O0;
                    if (z8 != (cuu0Var3 instanceof auu0)) {
                        setO = r2p1.o(cuu0Var3, wqa.a, (on71) null);
                    }
                    return Next.i(lqaVarN, setO);
                }
                if (iqaVar instanceof gqa) {
                    if (lqaVar instanceof mqa) {
                        return Next.h(mqa.n((mqa) lqaVar, 0, ((gqa) iqaVar).a, 127));
                    }
                    if (lqaVar instanceof kqa) {
                        return Next.h(kqa.n((kqa) lqaVar, 0, ((gqa) iqaVar).a, 127));
                    }
                    if (lqaVar instanceof lqa) {
                        return Next.h(lqa.n(lqaVar, 0, (String) null, ((gqa) iqaVar).a, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 32639));
                    }
                    eg.o();
                    return null;
                }
                if (iqaVar instanceof eqa) {
                    if (!(lqaVar instanceof lqa)) {
                        return Next.j();
                    }
                    lqa lqaVar3 = lqaVar;
                    eqa eqaVar = (eqa) iqaVar;
                    return Next.i(lqa.n(lqaVar3, 0, (String) null, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 32639), Collections.singleton(new aqa(lqaVar3, eqaVar.a, eqaVar.b)));
                }
                if (iqaVar instanceof hqa) {
                    return Next.j();
                }
                if (iqaVar instanceof bqa) {
                    if (!(lqaVar instanceof lqa)) {
                        return Next.j();
                    }
                    lqa lqaVar4 = lqaVar;
                    cuu0 cuu0Var4 = lqaVar4.O0;
                    return Next.h(lqa.n(lqaVar4, 0, (String) null, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, cuu0Var4 != null ? cuu0Var4.j(((bqa) iqaVar).a) : null, 16383));
                }
                if (iqaVar instanceof cqa) {
                    return lqaVar instanceof lqa ? Next.j() : Next.h(new kqa(lqaVar.j(), lqaVar.h(), lqaVar.a(), lqaVar.k(), lqaVar.g(), lqaVar.getDescription(), lqaVar.b(), (wkt) null));
                }
                if (iqaVar instanceof fqa) {
                    return Next.h(oap1.I(lqaVar));
                }
                eg.o();
                return null;
            case 15:
                roc rocVar = (roc) obj;
                ooc oocVar = (qoc) obj2;
                if (oocVar instanceof moc) {
                    return Next.j();
                }
                if (oocVar instanceof noc) {
                    return Next.i(rocVar, setO);
                }
                if (oocVar instanceof ooc) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    long j2 = rocVar.b;
                    long j3 = rocVar.a;
                    if (j2 == 0) {
                        linkedHashSet.add(new loc(j3, oocVar.b - j3));
                    }
                    long j4 = rocVar.b;
                    if (j4 == 0) {
                        j4 = oocVar.b;
                    }
                    return Next.i(new roc(j3, j4), linkedHashSet);
                }
                if (!(oocVar instanceof poc)) {
                    eg.o();
                    return null;
                }
                rocVar.getClass();
                long j5 = rocVar.a;
                if (j5 == 0) {
                    j5 = ((poc) oocVar).b;
                    tif1.a(!ihc1.h0("profile", "release", false) ? xco0.a : e95.a, "row_hydration", "cwp", 4);
                }
                return Next.h(new roc(j5, rocVar.b));
            case 16:
                t6e t6eVar = (t6e) obj;
                m6e m6eVar = (q6e) obj2;
                if (m6eVar instanceof m6e) {
                    j6e j6eVar = m6eVar.a;
                    return Next.i(t6e.a(t6eVar, (String) null, (r6e) null, 0, 0, j6eVar, (ArrayList) null, (List) null, 447), Collections.singleton(new k6e(j6eVar)));
                }
                if (!(m6eVar instanceof o6e)) {
                    if (m6eVar instanceof n6e) {
                        return Next.j();
                    }
                    if (m6eVar instanceof p6e) {
                        return Next.a(Collections.singleton(new l6e(((p6e) m6eVar).a)));
                    }
                    eg.o();
                    return null;
                }
                b6e b6eVar = ((o6e) m6eVar).a;
                String str8 = b6eVar.a;
                ArrayList arrayList3 = b6eVar.b;
                if (str8.length() == 0) {
                    str8 = t6eVar.a;
                }
                String str9 = t6eVar.g;
                if (str9 == null) {
                    i6e i6eVar = (i6e) o7h.s0(arrayList3);
                    if (i6eVar != null) {
                        str = i6eVar.a;
                    }
                } else {
                    str = str9;
                }
                return Next.h(t6e.a(t6eVar, str8, (r6e) null, 0, 0, str, arrayList3, b6eVar.c, 62));
            case 17:
                return c(obj, obj2);
            case 18:
                ale aleVar = (ale) obj;
                tq80 tq80Var2 = (tq80) obj2;
                if (!(((zke) tq80Var2.a) instanceof zke)) {
                    eg.o();
                    return null;
                }
                q1f1 q1f1Var = aleVar.c;
                if (!(q1f1Var instanceof q1f1)) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                wke wkeVar = q1f1Var.a.a;
                tqw tqwVar = tq80Var2.b;
                if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                    str = ou80Var.a;
                }
                return Next.a(Collections.singleton(new xke(wkeVar, str)));
            case 19:
                return d(obj, obj2);
            case 20:
                return e(obj, obj2);
            case 21:
                return f(obj, obj2);
            case 22:
                return g(obj, obj2);
            case 23:
                return h(obj, obj2);
            case 24:
                return s8p1.i((rph) obj, (iph) obj2);
            case 25:
                return y9g1.z((q9g1) obj, (d9g1) obj2);
            case 26:
                return i(obj, obj2);
            case 27:
                return rwq.t((gok) obj, (snk) obj2);
            case 28:
                ybl yblVar = (ybl) obj2;
                if (yblVar != null) {
                    return Next.h(yblVar.a);
                }
                eg.o();
                return null;
            default:
                w0m w0mVar = (w0m) obj;
                w0mVar.getClass();
                r0m r0mVar = (v0m) ((tq80) obj2).a;
                c380 c380Var = w0mVar.b;
                boolean z9 = w0mVar.e;
                if (r0mVar instanceof r0m) {
                    c380 c380Var2 = r0mVar.a;
                    return Next.h(w0m.a(w0mVar, null, c380Var2, false, false, false, c380Var2.size() >= 30, 17));
                }
                if (r0mVar instanceof n0m) {
                    return Next.a(Effects.a(new m0m[]{new m0m(((n0m) r0mVar).a)}));
                }
                if (r0mVar instanceof t0m) {
                    String string = ihc1.e1(((t0m) r0mVar).a).toString();
                    return Next.i(w0m.a(w0mVar, string, null, true, false, false, false, 2), Effects.a(new l0m[]{new l0m(string)}));
                }
                if (r0mVar instanceof u0m) {
                    return Next.i(w0m.a(w0mVar, "", null, true, false, false, false, 2), Effects.a(new l0m[]{new l0m("")}));
                }
                if (r0mVar instanceof p0m) {
                    return Next.h(w0m.a(w0mVar, null, null, false, true, false, false, 51));
                }
                if (r0mVar instanceof s0m) {
                    return (z9 || !w0mVar.f) ? Next.j() : Next.i(w0m.a(w0mVar, null, null, false, false, true, false, 47), Effects.a(new k0m[]{new k0m(w0mVar.a, c380Var.size())}));
                }
                if (!(r0mVar instanceof o0m)) {
                    if (r0mVar instanceof q0m) {
                        return !z9 ? Next.j() : Next.h(w0m.a(w0mVar, null, null, false, false, false, false, 47));
                    }
                    eg.o();
                    return null;
                }
                if (!z9) {
                    return Next.j();
                }
                c380 c380Var3 = ((o0m) r0mVar).a;
                ArrayList arrayListN1 = o7h.N0(c380Var3, c380Var);
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayListN1) {
                    if (hashSet2.add(((wol) obj4).a)) {
                        arrayList4.add(obj4);
                    }
                }
                return Next.h(w0m.a(w0mVar, null, mqo1.A(arrayList4), false, false, false, c380Var3.size() >= 30, 13));
        }
    }
}
