package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qv91 implements Set, ama0 {
    public final dw91 a;
    public final /* synthetic */ byte b;

    public qv91(dw91 dw91Var, byte b) {
        this.b = b;
        this.a = dw91Var;
    }

    private final boolean b(Collection collection) {
        eps0 eps0Var;
        int i;
        jv91 jv91VarH;
        boolean zA;
        Set setP1 = o7h.p1(collection);
        dw91 dw91Var = this.a;
        boolean z = false;
        do {
            synchronized (oho1.a) {
                cw91 cw91Var = (cw91) pv91.f(dw91Var.a);
                eps0Var = cw91Var.c;
                i = cw91Var.d;
            }
            eps0Var.getClass();
            ips0 ips0VarF = eps0Var.f();
            y6 it = dw91Var.b.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) ((tpb1) it).next();
                if (!setP1.contains(entry.getKey())) {
                    ips0VarF.remove(entry.getKey());
                    z = true;
                }
            }
            eps0 eps0VarF = ips0VarF.f();
            if (u890.j(eps0VarF, eps0Var)) {
                break;
            }
            cw91 cw91Var2 = dw91Var.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zA = dw91.a((cw91) pv91.u(cw91Var2, dw91Var, jv91VarH), i, eps0VarF);
            }
            pv91.l(jv91VarH, dw91Var);
        } while (!zA);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                oho1.z();
                throw null;
            case 1:
                oho1.z();
                throw null;
            default:
                oho1.z();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                oho1.z();
                throw null;
            case 1:
                oho1.z();
                throw null;
            default:
                oho1.z();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.b;
        dw91 dw91Var = this.a;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof ola0) && !(obj instanceof rla0))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return u890.j(dw91Var.get(entry.getKey()), entry.getValue());
            case 1:
                return dw91Var.containsKey(obj);
            default:
                return dw91Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.b;
        dw91 dw91Var = this.a;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!dw91Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!dw91Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        dw91 dw91Var = this.a;
        switch (b) {
            case 0:
                return new tpb1(dw91Var, dw91Var.b().c.a().iterator(), (byte) 0);
            case 1:
                return new tpb1(dw91Var, dw91Var.b().c.a().iterator(), (byte) 1);
            default:
                return new tpb1(dw91Var, dw91Var.b().c.a().iterator(), (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.b
            r1 = 0
            r2 = 1
            p.dw91 r5 = r5.a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            p.qv91 r0 = r5.b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            p.y6 r3 = (p.y6) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            p.tpb1 r3 = (p.tpb1) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = p.u890.j(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof p.ola0
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof p.rla0
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qv91.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        eps0 eps0Var;
        int i;
        jv91 jv91VarH;
        boolean zA;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setP1 = o7h.p1(collection);
                dw91 dw91Var = this.a;
                do {
                    synchronized (oho1.a) {
                        cw91 cw91Var = (cw91) pv91.f(dw91Var.a);
                        eps0Var = cw91Var.c;
                        i = cw91Var.d;
                    }
                    eps0Var.getClass();
                    ips0 ips0VarF = eps0Var.f();
                    y6 it3 = dw91Var.b.iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) ((tpb1) it3).next();
                        if (setP1.contains(entry.getValue())) {
                            ips0VarF.remove(entry.getKey());
                            z = true;
                        }
                    }
                    eps0 eps0VarF = ips0VarF.f();
                    if (!u890.j(eps0VarF, eps0Var)) {
                        cw91 cw91Var2 = dw91Var.a;
                        synchronized (pv91.c) {
                            jv91VarH = pv91.h();
                            zA = dw91.a((cw91) pv91.u(cw91Var2, dw91Var, jv91VarH), i, eps0VarF);
                        }
                        pv91.l(jv91VarH, dw91Var);
                    }
                    return z;
                } while (!zA);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        eps0 eps0Var;
        int i;
        jv91 jv91VarH;
        boolean zA;
        eps0 eps0Var2;
        int i2;
        jv91 jv91VarH2;
        boolean zA2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iS = zno1.s(q7h.U(collection2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                dw91 dw91Var = this.a;
                do {
                    synchronized (oho1.a) {
                        cw91 cw91Var = (cw91) pv91.f(dw91Var.a);
                        eps0Var = cw91Var.c;
                        i = cw91Var.d;
                    }
                    eps0Var.getClass();
                    ips0 ips0VarF = eps0Var.f();
                    y6 it = dw91Var.b.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((tpb1) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !u890.j(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            ips0VarF.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    eps0 eps0VarF = ips0VarF.f();
                    if (!u890.j(eps0VarF, eps0Var)) {
                        cw91 cw91Var2 = dw91Var.a;
                        synchronized (pv91.c) {
                            jv91VarH = pv91.h();
                            zA = dw91.a((cw91) pv91.u(cw91Var2, dw91Var, jv91VarH), i, eps0VarF);
                        }
                        pv91.l(jv91VarH, dw91Var);
                    }
                    return z;
                } while (!zA);
                return z;
            case 1:
                return b(collection);
            default:
                Set setP1 = o7h.p1(collection);
                dw91 dw91Var2 = this.a;
                do {
                    synchronized (oho1.a) {
                        cw91 cw91Var3 = (cw91) pv91.f(dw91Var2.a);
                        eps0Var2 = cw91Var3.c;
                        i2 = cw91Var3.d;
                    }
                    eps0Var2.getClass();
                    ips0 ips0VarF2 = eps0Var2.f();
                    y6 it2 = dw91Var2.b.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((tpb1) it2).next();
                        if (!setP1.contains(entry3.getValue())) {
                            ips0VarF2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    eps0 eps0VarF2 = ips0VarF2.f();
                    if (!u890.j(eps0VarF2, eps0Var2)) {
                        cw91 cw91Var4 = dw91Var2.a;
                        synchronized (pv91.c) {
                            jv91VarH2 = pv91.h();
                            zA2 = dw91.a((cw91) pv91.u(cw91Var4, dw91Var2, jv91VarH2), i2, eps0VarF2);
                        }
                        pv91.l(jv91VarH2, dw91Var2);
                    }
                    return z;
                } while (!zA2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
