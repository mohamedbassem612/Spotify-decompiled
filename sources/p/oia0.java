package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oia0 implements yz1, qct0 {
    public static final /* synthetic */ mma0[] h = {new cey0(oia0.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new cey0(oia0.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new cey0(oia0.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    public final ajm0 a;
    public final toe0 b;
    public final qx81 c;
    public final toe0 d;
    public final qoe0 e;
    public final toe0 f;
    public final qoe0 g;

    public oia0(ajm0 ajm0Var, voe0 voe0Var, x5u x5uVar) {
        this.a = ajm0Var;
        this.b = new toe0(voe0Var, x5uVar);
        eeg eegVar = new eeg(new h7x(ajm0Var, new kf30("java.io"), (byte) 1), ajn0.e("Serializable"), 4, 2, Collections.singletonList(new wvb0(voe0Var, new mia0(this, (byte) 1))), voe0Var);
        eegVar.r0(ypi0.b, w7x.a, null);
        this.c = eegVar.m();
        this.d = new toe0(voe0Var, new na(this, voe0Var, (byte) 24));
        this.e = new qoe0(voe0Var, new ConcurrentHashMap(3, 1.0f, 2), new ryq((byte) 6), (byte) 0);
        this.f = new toe0(voe0Var, new mia0(this, (byte) 0));
        this.g = voe0Var.a(new p5(this, (byte) 28));
    }

    @Override // p.yz1
    public final Collection a(beg begVar) {
        lf30 lf30VarF;
        njx0 njx0Var = njx0.U0;
        if (begVar.e0() == 1) {
            g().getClass();
            hqb0 hqb0VarD = d(begVar);
            if (hqb0VarD != null) {
                kf30 kf30VarG = kht.g(hqb0VarD);
                vh10 vh10Var = vh10.f;
                String str = j8a0.a;
                heg hegVarF = j8a0.f(kf30VarG);
                beg begVarK = hegVarF != null ? vh10Var.k(hegVarF.a()) : null;
                if (begVarK != null) {
                    l1h1 l1h1Var = new l1h1(jzn1.q(begVarK, hqb0VarD));
                    List list = (List) hqb0VarD.Q0.q.invoke();
                    ArrayList<xdg> arrayList = new ArrayList();
                    for (Object obj : list) {
                        xdg xdgVar = (xdg) obj;
                        if (xdgVar.getVisibility().a.b) {
                            Collection collectionH = begVarK.h();
                            if (!(collectionH instanceof Collection) || !collectionH.isEmpty()) {
                                Iterator it = collectionH.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        xdg xdgVar2 = (xdg) it.next();
                                        xdgVar2.getClass();
                                        if (exq0.j(xdgVar2, xdgVar.d(l1h1Var)) == 1) {
                                        }
                                    }
                                }
                            }
                            if (xdgVar.F().size() == 1) {
                                jfg jfgVarS = ((tsi1) o7h.V0(xdgVar.F())).getType().t0().s();
                                if (jfgVarS != null) {
                                    int i = kht.a;
                                    lf30VarF = iht.f(jfgVarS);
                                } else {
                                    lf30VarF = null;
                                }
                                int i2 = kht.a;
                                if (u890.j(lf30VarF, iht.f(begVar))) {
                                }
                            }
                            if (!g6b0.D(xdgVar)) {
                                LinkedHashSet linkedHashSet = ria0.f;
                                String strM = h0p1.m(xdgVar, 3);
                                String str2 = j8a0.a;
                                heg hegVarG = j8a0.g(kht.g(hqb0VarD).a);
                                if (!linkedHashSet.contains((hegVarG != null ? tia0.e(hegVarG) : si1.k(hqb0VarD, njx0Var)) + '.' + strM)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (xdg xdgVar3 : arrayList) {
                        xdgVar3.getClass();
                        pv30 pv30VarC1 = xdgVar3.C1(l1h1.b);
                        pv30VarC1.b = begVar;
                        pv30VarC1.t(begVar.m());
                        pv30VarC1.O0 = true;
                        pv30VarC1.a = l1h1Var.a;
                        LinkedHashSet linkedHashSet2 = ria0.g;
                        String strM2 = h0p1.m(xdgVar3, 3);
                        String str3 = j8a0.a;
                        heg hegVarG2 = j8a0.g(kht.g(hqb0VarD).a);
                        if (!linkedHashSet2.contains((hegVarG2 != null ? tia0.e(hegVarG2) : si1.k(hqb0VarD, njx0Var)) + '.' + strM2)) {
                            mma0 mma0Var = h[2];
                            pv30VarC1.g((fg5) this.f.invoke());
                        }
                        arrayList2.add((xdg) pv30VarC1.X0.z1(pv30VarC1));
                    }
                    return arrayList2;
                }
            }
        }
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.AbstractCollection, p.a9, p.bi91] */
    @Override // p.yz1
    public final Collection b(ajn0 ajn0Var, beg begVar) {
        w7x w7xVarSingleton;
        ve5 ve5Var;
        ve5 ve5Var2;
        fg5 fg5Var;
        boolean zEquals = ajn0Var.equals(crg.e);
        mma0[] mma0VarArr = h;
        z6x z6xVar = z6x.a;
        if (zEquals && (begVar instanceof wht) && (g6b0.b(begVar, rfb1.g) || g6b0.s(begVar) != null)) {
            wht whtVar = (wht) begVar;
            List list = whtVar.e.Q0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (dem1.y((zjn0) whtVar.Y.c, ((yfy0) it.next()).f).equals(crg.e)) {
                        return z6xVar;
                    }
                }
            }
            mma0 mma0Var = mma0VarArr[1];
            nv30 nv30VarN0 = ((xw81) o7h.U0(((qx81) this.d.invoke()).E().c(ajn0Var, 4))).n0();
            nv30VarN0.m(whtVar);
            nv30VarN0.h(mht.e);
            nv30VarN0.t(whtVar.m());
            nv30VarN0.E(whtVar.q0());
            ov30 ov30VarBuild = nv30VarN0.build();
            ov30VarBuild.getClass();
            return Collections.singletonList((xw81) ov30VarBuild);
        }
        g().getClass();
        hqb0 hqb0VarD = d(begVar);
        if (hqb0VarD == null) {
            ve5Var = null;
        } else {
            kf30 kf30VarG = kht.g(hqb0VarD);
            vh10 vh10Var = vh10.f;
            String str = j8a0.a;
            heg hegVarF = j8a0.f(kf30VarG);
            beg begVarK = hegVarF != null ? vh10Var.k(hegVarF.a()) : null;
            if (begVarK == null) {
                w7xVarSingleton = w7x.a;
            } else {
                kf30 kf30VarH = j8a0.h(iht.f(begVarK));
                w7xVarSingleton = kf30VarH == null ? Collections.singleton(begVarK) : p7h.M(new beg[]{begVarK, vh10Var.k(kf30VarH)});
            }
            Iterable iterable = (Iterable) w7xVarSingleton;
            beg begVar2 = (beg) o7h.B0(iterable);
            if (begVar2 == null) {
                ve5Var = null;
            } else {
                int i = bi91.c;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(kht.g((beg) it2.next()));
                }
                ?? bi91Var = new bi91();
                bi91Var.addAll(arrayList);
                String str2 = j8a0.a;
                boolean zContainsKey = j8a0.j.containsKey(iht.f(begVar));
                kf30 kf30VarG2 = kht.g(hqb0VarD);
                na naVar = new na(hqb0VarD, begVar2, (byte) 25);
                qoe0 qoe0Var = this.e;
                qoe0Var.getClass();
                Object objInvoke = qoe0Var.invoke(new roe0(kf30VarG2, naVar));
                if (objInvoke == null) {
                    qoe0.a(3);
                    throw null;
                }
                Collection collectionC = ((beg) objInvoke).R().c(ajn0Var, 4);
                z6x arrayList2 = new ArrayList();
                for (Object obj : collectionC) {
                    xw81 xw81Var = (xw81) obj;
                    if (xw81Var.getKind() == 1 && xw81Var.getVisibility().a.b && !g6b0.D(xw81Var)) {
                        Collection collectionL = xw81Var.l();
                        if (!(collectionL instanceof Collection) || !collectionL.isEmpty()) {
                            Iterator it3 = collectionL.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (bi91Var.contains(kht.g(((ov30) it3.next()).k()))) {
                                    }
                                }
                            }
                        }
                        beg begVar3 = (beg) xw81Var.k();
                        String strM = h0p1.m(xw81Var, 3);
                        LinkedHashSet linkedHashSet = ria0.e;
                        String str3 = j8a0.a;
                        heg hegVarG = j8a0.g(kht.g(begVar3).a);
                        StringBuilder sb = new StringBuilder(hegVarG != null ? tia0.e(hegVarG) : si1.k(begVar3, njx0.U0));
                        sb.append('.');
                        sb.append(strM);
                        if (!(linkedHashSet.contains(sb.toString()) ^ zContainsKey ? true : syo1.s(Collections.singletonList(xw81Var), xi20.h, new ryq(this, (byte) 5)).booleanValue())) {
                            arrayList2.add(obj);
                        }
                    }
                }
                ve5Var = null;
                z6xVar = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (xw81 xw81Var2 : (Iterable) z6xVar) {
            nv30 nv30VarN1 = ((xw81) xw81Var2.d(new l1h1(jzn1.q((beg) xw81Var2.k(), begVar)))).n0();
            nv30VarN1.m(begVar);
            nv30VarN1.E(begVar.q0());
            nv30VarN1.w();
            int iOrdinal = ((nia0) syo1.m(Collections.singletonList((beg) xw81Var2.k()), new ouz(this, (byte) 21), new kuo(h0p1.m(xw81Var2, 3), new p811(), (byte) 2))).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        ajn0 name = xw81Var2.getName();
                        boolean zJ = u890.j(name, pia0.a);
                        qoe0 qoe0Var2 = this.g;
                        if (zJ) {
                            fg5Var = (fg5) qoe0Var2.invoke(new mmr0(xw81Var2.getName().b(), "first"));
                        } else {
                            if (!u890.j(name, pia0.b)) {
                                bhn0.B(xw81Var2.getName(), "Unexpected name: ");
                                return ve5Var;
                            }
                            fg5Var = (fg5) qoe0Var2.invoke(new mmr0(xw81Var2.getName().b(), "last"));
                        }
                        nv30VarN1.g(fg5Var);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            eg.o();
                            return ve5Var;
                        }
                        ve5Var2 = ve5Var;
                    } else {
                        mma0 mma0Var2 = mma0VarArr[2];
                        nv30VarN1.g((fg5) this.f.invoke());
                    }
                }
                ve5 ve5VarBuild = nv30VarN1.build();
                ve5VarBuild.getClass();
                ve5Var2 = (xw81) ve5VarBuild;
            } else if (begVar.o() != 1 || begVar.e0() == 3) {
                nv30VarN1.f();
                ve5 ve5VarBuild2 = nv30VarN1.build();
                ve5VarBuild2.getClass();
                ve5Var2 = (xw81) ve5VarBuild2;
            } else {
                ve5Var2 = ve5Var;
            }
            if (ve5Var2 != null) {
                arrayList3.add(ve5Var2);
            }
        }
        return arrayList3;
    }

    @Override // p.yz1
    public final Collection c(beg begVar) {
        int i = kht.a;
        lf30 lf30VarF = iht.f(begVar);
        LinkedHashSet linkedHashSet = ria0.a;
        lf30 lf30Var = rfb1.g;
        boolean zEquals = lf30VarF.equals(lf30Var);
        boolean zIsAssignableFrom = false;
        qx81 qx81Var = this.c;
        if (!zEquals) {
            HashMap map = rfb1.g0;
            if (map.get(lf30VarF) == null) {
                if (lf30VarF.equals(lf30Var) || map.get(lf30VarF) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = j8a0.a;
                    heg hegVarG = j8a0.g(lf30VarF);
                    if (hegVarG != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(hegVarG.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? Collections.singletonList(qx81Var) : z6x.a;
            }
        }
        mma0 mma0Var = h[1];
        return p7h.M(new a8b0[]{(qx81) this.d.invoke(), qx81Var});
    }

    public final hqb0 d(beg begVar) {
        kf30 kf30VarA;
        if (begVar == null) {
            g6b0.a(108);
            throw null;
        }
        if (!g6b0.b(begVar, rfb1.a) && g6b0.K(begVar)) {
            int i = kht.a;
            lf30 lf30VarF = iht.f(begVar);
            if (lf30VarF.d()) {
                String str = j8a0.a;
                heg hegVarG = j8a0.g(lf30VarF);
                if (hegVarG != null && (kf30VarA = hegVarG.a()) != null) {
                    beg begVarR = lm5.r(g().a, kf30VarA);
                    if (begVarR instanceof hqb0) {
                        return (hqb0) begVarR;
                    }
                }
            }
        }
        return null;
    }

    @Override // p.yz1
    public final Collection e(beg begVar) {
        Set setB;
        g().getClass();
        hqb0 hqb0VarD = d(begVar);
        if (hqb0VarD == null || (setB = hqb0VarD.r0().b()) == null) {
            setB = w7x.a;
        }
        return setB;
    }

    @Override // p.qct0
    public final boolean f(beg begVar, iit iitVar) {
        hqb0 hqb0VarD = d(begVar);
        if (hqb0VarD == null || !iitVar.getAnnotations().d0(rct0.a)) {
            return true;
        }
        g().getClass();
        String strM = h0p1.m(iitVar, 3);
        Collection collectionC = hqb0VarD.r0().c(iitVar.getName(), 4);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            if (h0p1.m((xw81) it.next(), 3).equals(strM)) {
                return true;
            }
        }
        return false;
    }

    public final kia0 g() {
        mma0 mma0Var = h[0];
        return (kia0) this.b.invoke();
    }
}
