package p;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bla0 extends mla0 implements q6b0, tka0, rma0, i0h1 {
    public static final HashSet d;
    public final Class b;
    public final znb0 c = dm5.S(2, new b9o(this, (byte) 5));

    static {
        LinkedHashSet linkedHashSet = loa1.a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((heg) it.next()).a().a.toString());
        }
        d = hashSet;
    }

    public bla0(Class cls) {
        this.b = cls;
    }

    public static eeg L(heg hegVar, e141 e141Var) {
        eeg eegVar = new eeg(new h7x(e141Var.b(), hegVar.a, (byte) 0), hegVar.f(), 1, 1, k4p1.x(e141Var.b().e().e().m()), e141Var.a().f());
        eegVar.r0(new mv30(eegVar, e141Var.a().f()), w7x.a, (xdg) null);
        return eegVar;
    }

    @Override // p.mla0
    public final Collection B() {
        return O().h();
    }

    @Override // p.mla0
    public final Collection C() {
        l3b0 l3b0VarP = P();
        Collection collectionD = l3b0VarP != null ? l3b0VarP.d() : null;
        if (collectionD == null) {
            collectionD = z6x.a;
        }
        return collectionD;
    }

    @Override // p.mla0
    public final Collection D(ajn0 ajn0Var) {
        return o7h.N0(O().a0().c(ajn0Var, 8), O().m().E().c(ajn0Var, 8));
    }

    @Override // p.mla0
    public final tdy0 E(int i) {
        ggy0 ggy0Var;
        wht whtVarO = O();
        wht whtVar = whtVarO instanceof wht ? whtVarO : null;
        if (whtVar == null || (ggy0Var = (ggy0) z0o1.m(whtVar.s0(), eka0.h, i)) == null) {
            return null;
        }
        return bpi1.f(this.b, new ide0(this), ggy0Var, whtVar.r0().r(), whtVar.r0().s(), whtVar.u0(), q5.S0);
    }

    @Override // p.mla0
    public final w3b0 F(int i) {
        l3b0 l3b0VarP = P();
        if (l3b0VarP != null) {
            return (w3b0) o7h.t0(i, hon1.s(l3b0VarP));
        }
        return null;
    }

    @Override // p.mla0
    public final Collection H(ajn0 ajn0Var) {
        return o7h.N0(O().a0().a(ajn0Var, 8), O().m().E().a(ajn0Var, 8));
    }

    public final heg M() {
        tnw0 tnw0VarC;
        heg hegVar = i141.a;
        Class cls = this.b;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            tnw0VarC = componentType.isPrimitive() ? nja0.b(componentType.getSimpleName()).c() : null;
            return tnw0VarC != null ? new heg(sfb1.l, tnw0VarC.b) : mka.n(rfb1.g.i());
        }
        if (cls.equals(Void.TYPE)) {
            return i141.a;
        }
        tnw0VarC = cls.isPrimitive() ? nja0.b(cls.getSimpleName()).c() : null;
        if (tnw0VarC != null) {
            return new heg(sfb1.l, tnw0VarC.a);
        }
        heg hegVarA = bb11.a(cls);
        if (!hegVarA.c) {
            String str = j8a0.a;
            heg hegVarF = j8a0.f(hegVarA.a());
            if (hegVarF != null) {
                return hegVarF;
            }
        }
        return hegVarA;
    }

    public final ieg N() {
        ieg iegVarA;
        l3b0 l3b0VarP = P();
        if (l3b0VarP != null && (iegVarA = xm7.a(l3b0VarP)) != null) {
            return iegVarA;
        }
        Class cls = this.b;
        if (cls.isAnnotation()) {
            return ieg.f;
        }
        if (cls.isInterface()) {
            return ieg.c;
        }
        if (cls.isEnum()) {
            return ieg.d;
        }
        return cls.getSuperclass().isEnum() ? ieg.e : ieg.b;
    }

    public final beg O() {
        return ((yka0) this.c.getValue()).b();
    }

    public final l3b0 P() {
        return ((yka0) this.c.getValue()).c();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    public final Collection Q(zpi0 zpi0Var, int i) {
        lft lftVar;
        ala0 ala0Var = new ala0(this, (byte) 0);
        Collection<jyc> collectionO = c8o.o(zpi0Var, (wgt) null, 3);
        ArrayList arrayList = new ArrayList();
        for (jyc jycVar : collectionO) {
            if (jycVar instanceof jyc) {
                jyc jycVar2 = jycVar;
                if (u890.j(jycVar2.getVisibility(), mht.h) || !kaa0.a(i, jycVar2)) {
                    lftVar = null;
                } else {
                    lftVar = (lft) jycVar.r(ala0Var, rih1.a);
                }
            } else {
                lftVar = null;
            }
            if (lftVar != null) {
                arrayList.add(lftVar);
            }
        }
        return o7h.l1(arrayList);
    }

    @Override // p.tka0
    public final List d() {
        mc11 mc11Var = ((yka0) this.c.getValue()).k;
        mma0 mma0Var = yka0.w[8];
        return (List) mc11Var.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bla0) && j2h1.t(this).equals(j2h1.t((tka0) obj));
    }

    @Override // p.q6b0
    public final GenericDeclaration findJavaDeclaration() {
        return this.b;
    }

    @Override // p.pka0
    public final List getAnnotations() {
        mc11 mc11Var = ((yka0) this.c.getValue()).e;
        mma0 mma0Var = yka0.w[1];
        return (List) mc11Var.invoke();
    }

    @Override // p.tka0
    public final List getTypeParameters() {
        mc11 mc11Var = ((yka0) this.c.getValue()).i;
        mma0 mma0Var = yka0.w[6];
        return (List) mc11Var.invoke();
    }

    @Override // p.tka0
    public final Collection h() {
        mc11 mc11Var = ((yka0) this.c.getValue()).h;
        mma0 mma0Var = yka0.w[4];
        return (Collection) mc11Var.invoke();
    }

    @Override // p.tka0
    public final int hashCode() {
        return j2h1.t(this).hashCode();
    }

    @Override // p.tka0
    public final boolean j() {
        l3b0 l3b0VarP = P();
        if (l3b0VarP != null) {
            return xm7.b(l3b0VarP);
        }
        Class cls = this.b;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // p.tka0
    public final boolean m(Object obj) {
        Map map = bb11.d;
        Class cls = this.b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return w0h1.y(num.intValue(), obj);
        }
        Class cls2 = (Class) bb11.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // p.wdg
    public final Class n() {
        return this.b;
    }

    @Override // p.tka0
    public final String o() {
        mc11 mc11Var = ((yka0) this.c.getValue()).g;
        mma0 mma0Var = yka0.w[3];
        return (String) mc11Var.invoke();
    }

    @Override // p.tka0
    public final boolean p() {
        l3b0 l3b0VarP = P();
        return l3b0VarP != null && xm7.c(l3b0VarP);
    }

    @Override // p.tka0
    public final String r() {
        mc11 mc11Var = ((yka0) this.c.getValue()).f;
        mma0 mma0Var = yka0.w[2];
        return (String) mc11Var.invoke();
    }

    public final String toString() {
        heg hegVarM = M();
        kf30 kf30Var = hegVarM.a;
        return "class ".concat((kf30Var.a.c() ? "" : gvg.k(new StringBuilder(), kf30Var.a.a, '.')).concat(hegVarM.b.a.a.replace('.', '$')));
    }
}
