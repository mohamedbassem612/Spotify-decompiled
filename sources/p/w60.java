package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w60 implements dmh1 {
    public final dmh1 a;
    public final List b;
    public final gnq0 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public w60(dmh1 dmh1Var, List list, gnq0 gnq0Var) {
        this.a = dmh1Var;
        this.b = list;
        this.c = gnq0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    @Override // p.dmh1
    public final void b(ses0 ses0Var) throws DataSourceException.UnsupportedKey {
        boolean zBooleanValue;
        int iC = ses0Var.c();
        for (int i = 0; i < iC; i++) {
            if (ses0Var.g(i)) {
                jh5 jh5VarH = ses0Var.h(i);
                jh5VarH.getClass();
                if (!ob51.f(this, jh5VarH)) {
                    throw new DataSourceException.UnsupportedKey(jh5VarH);
                }
            }
        }
        int iC2 = ses0Var.c();
        for (int i2 = 0; i2 < iC2; i2++) {
            if (ses0Var.g(i2)) {
                jh5 jh5VarH2 = ses0Var.h(i2);
                jh5VarH2.getClass();
                Object objC = this.c.c(jh5VarH2);
                if (objC != null) {
                    ses0Var.n(i2, new j3r(objC));
                }
            }
        }
        dmh1 dmh1Var = this.a;
        dmh1Var.b(ses0Var);
        wla1 wla1VarE = dmh1Var.e();
        int iC3 = ses0Var.c();
        for (int i3 = 0; i3 < iC3; i3++) {
            if (ses0Var.g(i3)) {
                jh5 jh5VarH3 = ses0Var.h(i3);
                jh5VarH3.getClass();
                zjd1 zjd1Var = jh5VarH3.a;
                if (wla1VarE instanceof wla1) {
                    zBooleanValue = u890.j(zjd1Var, wla1VarE.a());
                } else if (wla1VarE instanceof xla1) {
                    zBooleanValue = ((xla1) wla1VarE).a().m(zjd1Var);
                } else {
                    if (!(wla1VarE instanceof vla1)) {
                        eg.o();
                        return;
                    }
                    zBooleanValue = ((Boolean) ((vla1) wla1VarE).a().invoke(jh5VarH3)).booleanValue();
                }
                if (zBooleanValue) {
                    ses0Var.n(i3, i3r.a);
                }
            }
        }
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        s60 s60Var = new s60(this, iu30Var);
        this.d.add(s60Var);
        return s60Var;
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.a.e();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121 A[LOOP:5: B:53:0x011b->B:55:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0165 A[Catch: all -> 0x0171, LOOP:2: B:78:0x015f->B:80:0x0165, LOOP_END, TryCatch #7 {all -> 0x0171, blocks: (B:74:0x014f, B:76:0x0157, B:77:0x0158, B:78:0x015f, B:80:0x0165, B:83:0x0173, B:84:0x0179, B:86:0x017f, B:87:0x0196, B:89:0x0198, B:90:0x0199, B:75:0x0150), top: B:96:0x014f, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017f A[Catch: all -> 0x0171, LOOP:3: B:84:0x0179->B:86:0x017f, LOOP_END, TryCatch #7 {all -> 0x0171, blocks: (B:74:0x014f, B:76:0x0157, B:77:0x0158, B:78:0x015f, B:80:0x0165, B:83:0x0173, B:84:0x0179, B:86:0x017f, B:87:0x0196, B:89:0x0198, B:90:0x0199, B:75:0x0150), top: B:96:0x014f, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a4 A[LOOP:4: B:92:0x019e->B:94:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [p.gnq0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.gnq0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object f(List list, k2 k2Var, onm onmVar) throws Throwable {
        t60 t60Var;
        int i;
        w60 w60Var;
        Object obj;
        LinkedHashSet linkedHashSet;
        Object obj2;
        Object obj3;
        LinkedHashSet linkedHashSet2;
        Iterator it;
        ?? r4;
        ?? r2;
        ?? r5;
        ?? r1;
        ?? r3;
        mr20 mr20Var;
        u60 u60Var;
        Iterator it2;
        Iterator it3;
        int i2;
        w60 w60Var2 = this;
        if (onmVar instanceof t60) {
            t60Var = (t60) onmVar;
            i2 = t60Var.f;
            r4 = -2147483648;
            r5 = -2147483648;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = i2 - Integer.MIN_VALUE;
                t60Var.f = i3;
                i = i3;
            } else {
                t60Var = new t60(w60Var2, onmVar);
                i = i2;
            }
        } else {
            t60Var = new t60(w60Var2, onmVar);
            i = i2;
        }
        t60 t60Var2 = t60Var;
        Object objInvoke = t60Var2.d;
        d9n d9nVar = d9n.a;
        int i4 = t60Var2.f;
        if (i4 != 0) {
            try {
                if (i4 == 1) {
                    Set set = t60Var2.c;
                    Object obj4 = t60Var2.b;
                    LinkedHashSet linkedHashSet3 = t60Var2.a;
                    hm5.M(objInvoke);
                    obj = set;
                    linkedHashSet = linkedHashSet3;
                    obj2 = obj4;
                    try {
                        mr20Var = (mr20) objInvoke;
                        try {
                            u60Var = new u60(linkedHashSet, this, obj2, obj, (byte) 0);
                            w60Var = this;
                            try {
                                t60Var2.a = linkedHashSet;
                                t60Var2.b = obj2;
                                t60Var2.c = (Set) obj;
                                t60Var2.f = 2;
                                if (mr20Var.collect(u60Var, t60Var2) != d9nVar) {
                                    linkedHashSet2 = linkedHashSet;
                                    obj3 = obj2;
                                }
                                return d9nVar;
                            } catch (CancellationException e) {
                                e = e;
                                Object obj5 = obj;
                                r5 = linkedHashSet;
                                r1 = obj5;
                                r3 = obj2;
                                try {
                                    synchronized (r1) {
                                        List<jh5> listL1 = o7h.l1((Iterable) r1);
                                        it3 = listL1.iterator();
                                        while (it3.hasNext()) {
                                            w60Var.c.a((jh5) it3.next(), r3);
                                        }
                                        for (jh5 jh5Var : listL1) {
                                            gnq0 gnq0Var = w60Var.c;
                                            gnq0Var.a.computeIfPresent(jh5Var, new fnq0((Object) r3, (byte) 0));
                                            gnq0Var.b(jh5Var);
                                        }
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = r3;
                                    r4 = r5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = linkedHashSet;
                                r2 = obj2;
                                it2 = r4.iterator();
                                while (it2.hasNext()) {
                                    w60Var.c.a((jh5) it2.next(), r2);
                                }
                                throw th;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            w60Var = this;
                        } catch (Throwable th3) {
                            th = th3;
                            w60Var = this;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        w60Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        w60Var = this;
                    }
                } else {
                    if (i4 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set2 = t60Var2.c;
                    obj3 = t60Var2.b;
                    linkedHashSet2 = t60Var2.a;
                    hm5.M(objInvoke);
                    w60Var = w60Var2;
                }
                it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    w60Var.c.a((jh5) it.next(), obj3);
                }
                return rih1.a;
            } catch (CancellationException e4) {
                e = e4;
                w60Var = w60Var2;
                r1 = i4;
                r3 = i;
                synchronized (r1) {
                    List<jh5> listL2 = o7h.l1((Iterable) r1);
                    it3 = listL2.iterator();
                    while (it3.hasNext()) {
                        w60Var.c.a((jh5) it3.next(), r3);
                    }
                    while (r1.hasNext()) {
                        gnq0 gnq0Var2 = w60Var.c;
                        gnq0Var2.a.computeIfPresent(jh5Var, new fnq0((Object) r3, (byte) 0));
                        gnq0Var2.b(jh5Var);
                    }
                    throw e;
                }
            } catch (Throwable th5) {
                th = th5;
                w60Var = w60Var2;
                r2 = i;
            }
        } else {
            hm5.M(objInvoke);
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                linkedHashSet4.add((jh5) ((mmr0) it4.next()).a);
            }
            Object obj6 = new Object();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            try {
                List<mmr0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (mmr0 mmr0Var : list2) {
                    try {
                        jh5 jh5Var2 = (jh5) mmr0Var.a;
                        arrayList.add(new rfa(jh5Var2, mmr0Var.b, new y4(w60Var2, jh5Var2, (byte) 8), new v60(jh5Var2, linkedHashSet5, w60Var2, obj6, (byte) 0), new v60(jh5Var2, linkedHashSet5, this, obj6, (byte) 1)));
                        w60Var2 = this;
                    } catch (CancellationException e5) {
                        e = e5;
                        w60Var = this;
                        r1 = linkedHashSet5;
                        r3 = obj6;
                        r5 = linkedHashSet4;
                        synchronized (r1) {
                            List<jh5> listL3 = o7h.l1((Iterable) r1);
                        }
                        it3 = listL3.iterator();
                        while (it3.hasNext()) {
                            w60Var.c.a((jh5) it3.next(), r3);
                        }
                        while (r1.hasNext()) {
                            gnq0 gnq0Var3 = w60Var.c;
                            gnq0Var3.a.computeIfPresent(jh5Var, new fnq0((Object) r3, (byte) 0));
                            gnq0Var3.b(jh5Var);
                        }
                        throw e;
                    } catch (Throwable th6) {
                        th = th6;
                        w60Var = this;
                        r2 = obj6;
                        r4 = linkedHashSet4;
                        it2 = r4.iterator();
                        while (it2.hasNext()) {
                            w60Var.c.a((jh5) it2.next(), r2);
                        }
                        throw th;
                    }
                }
                t60Var2.a = linkedHashSet4;
                t60Var2.b = obj6;
                t60Var2.c = linkedHashSet5;
                t60Var2.f = 1;
                objInvoke = k2Var.invoke(arrayList, t60Var2);
                if (objInvoke != d9nVar) {
                    obj2 = obj6;
                    linkedHashSet = linkedHashSet4;
                    obj = linkedHashSet5;
                    mr20Var = (mr20) objInvoke;
                    u60Var = new u60(linkedHashSet, this, obj2, obj, (byte) 0);
                    w60Var = this;
                    t60Var2.a = linkedHashSet;
                    t60Var2.b = obj2;
                    t60Var2.c = (Set) obj;
                    t60Var2.f = 2;
                    if (mr20Var.collect(u60Var, t60Var2) != d9nVar) {
                        linkedHashSet2 = linkedHashSet;
                        obj3 = obj2;
                        it = linkedHashSet2.iterator();
                        while (it.hasNext()) {
                            w60Var.c.a((jh5) it.next(), obj3);
                        }
                        return rih1.a;
                    }
                }
                return d9nVar;
            } catch (CancellationException e6) {
                e = e6;
                w60Var = w60Var2;
            } catch (Throwable th7) {
                th = th7;
                w60Var = w60Var2;
            }
        }
        it2 = r4.iterator();
        while (it2.hasNext()) {
            w60Var.c.a((jh5) it2.next(), r2);
        }
        throw th;
    }
}
