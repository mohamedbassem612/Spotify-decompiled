package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class kwo0 implements Update {
    public static final kwo0 a = new kwo0();

    public final Next a(Object obj, Object obj2) {
        List list;
        boolean z;
        gob1 gob1Var = (gob1) obj;
        w600 w600Var = (w600) obj2;
        if (w600Var instanceof mwz) {
            mwz mwzVar = (mwz) w600Var;
            if (gob1Var instanceof lmb1) {
                lmb1 lmb1Var = (lmb1) gob1Var;
                Set setE = lmb1Var.e();
                tka0 tka0Var = mwzVar.a;
                if (!setE.contains(tka0Var)) {
                    List data = lmb1Var.getData();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : data) {
                        if (!tka0Var.m((eyo0) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.size() == lmb1Var.getData().size()) {
                        return Next.j();
                    }
                    LinkedHashSet linkedHashSetX0 = dm61.x0(tka0Var, lmb1Var.e());
                    if (lmb1Var instanceof wlb1) {
                        wlb1 wlb1Var = (wlb1) gob1Var;
                        return Next.h(new tmb1(wlb1Var.a, arrayList, wlb1Var.c, linkedHashSetX0, wlb1Var.e, wlb1Var.f));
                    }
                    if (lmb1Var instanceof tmb1) {
                        tmb1 tmb1Var = (tmb1) gob1Var;
                        return Next.h(new tmb1(tmb1Var.a, arrayList, tmb1Var.c, linkedHashSetX0, tmb1Var.e, tmb1Var.f));
                    }
                    eg.o();
                    return null;
                }
            }
            return Next.j();
        }
        boolean z2 = true;
        if (w600Var instanceof q400) {
            q400 q400Var = (q400) w600Var;
            ContextTrack contextTrack = q400Var.a;
            rbw rbwVar = new rbw(contextTrack, q400Var.c, q400Var.d, q400Var.e, q400Var.f, q400Var.g, q400Var.h);
            if (q400Var.b) {
                return Next.i(new qmb1(contextTrack.uri()), f46.S0(new l0o1[]{sgw.g, rbwVar}));
            }
            return gob1Var instanceof lmb1 ? Next.a(Collections.singleton(rbwVar)) : Next.j();
        }
        if (!(w600Var instanceof b500)) {
            if (!(w600Var instanceof b400)) {
                eg.o();
                return null;
            }
            b400 b400Var = (b400) w600Var;
            if (gob1Var instanceof lmb1) {
                lmb1 lmb1Var2 = (lmb1) gob1Var;
                if (!lmb1Var2.d().isEmpty()) {
                    ae21 ae21VarR = p8p1.r(lmb1Var2.getData(), lmb1Var2.d(), lmb1Var2.c(), b400Var.a);
                    Set set = ae21VarR.b;
                    if (!set.isEmpty()) {
                        return fno1.l(new tmb1(lmb1Var2.a(), ae21VarR.a, lmb1Var2.b(), lmb1Var2.e(), lmb1Var2.d(), dm61.y0(lmb1Var2.c(), set)));
                    }
                    List listD = lmb1Var2.d();
                    Set setC = lmb1Var2.c();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : listD) {
                        if (!setC.contains(((vd21) obj4).a)) {
                            arrayList2.add(obj4);
                        }
                    }
                    ce21 ce21Var = arrayList2.isEmpty() ? null : new ce21(arrayList2);
                    return ce21Var != null ? Next.a(Collections.singleton(new tgw(ce21Var))) : Next.j();
                }
            }
            return Next.j();
        }
        b500 b500Var = (b500) w600Var;
        if (b500Var instanceof z400) {
            if (gob1Var instanceof lmb1) {
                return Next.j();
            }
            z400 z400Var = (z400) b500Var;
            return Next.h(new slb1(z400Var.a.uri(), z400Var.b));
        }
        if (!(b500Var instanceof a500)) {
            eg.o();
            return null;
        }
        a500 a500Var = (a500) b500Var;
        ContextTrack contextTrack2 = a500Var.a;
        List list2 = a500Var.d;
        String strUri = contextTrack2.uri();
        if (!u890.j(gob1Var.a(), strUri)) {
            return Next.j();
        }
        kp80 kp80Var = new kp80(strUri, a500Var.b);
        boolean z3 = gob1Var instanceof lmb1;
        Set setY0 = w7x.a;
        Set setE2 = z3 ? ((lmb1) gob1Var).e() : setY0;
        if (z3) {
            setY0 = ((lmb1) gob1Var).c();
        }
        List list3 = a500Var.c;
        if (!setY0.isEmpty()) {
            for (vd21 vd21Var : o7h.a1(list2, new ktg0((byte) 29))) {
                if (setY0.contains(vd21Var.a)) {
                    if (list3.isEmpty()) {
                        z = z2;
                    } else {
                        Iterator it = list3.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                z = z2;
                                i = -1;
                                break;
                            }
                            z = z2;
                            if (vd21Var.a.m((eyo0) it.next())) {
                                break;
                            }
                            i++;
                            z2 = z;
                        }
                        int iP = yoi1.p(vd21Var.b, 0, list3.size() - 1);
                        if (i != -1 && i != iP) {
                            ArrayList arrayList3 = new ArrayList(list3);
                            arrayList3.add(iP, arrayList3.remove(i));
                            list3 = arrayList3;
                        }
                    }
                    z2 = z;
                }
            }
        }
        if (!setE2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : list3) {
                eyo0 eyo0Var = (eyo0) obj5;
                Set set2 = setE2;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (!((tka0) it2.next()).m(eyo0Var));
                }
                arrayList4.add(obj5);
            }
            list3 = arrayList4;
        }
        qtf1 qtf1Var = a500Var.e;
        if (qtf1Var == null || list2.isEmpty()) {
            list = list3;
        } else {
            ae21 ae21VarR2 = p8p1.r(list3, list2, setY0, qtf1Var);
            List list4 = ae21VarR2.a;
            setY0 = dm61.y0(setY0, ae21VarR2.b);
            list = list4;
        }
        Set set3 = setY0;
        List list5 = a500Var.d;
        return fno1.l(z3 ? new tmb1(strUri, list, kp80Var, setE2, list5, set3) : new wlb1(strUri, list, kp80Var, setE2, list5, set3));
    }
}
