package p;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class sh10 {
    public static final yxh a = pap1.s(new iu30[]{aht.t, aht.X});

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (p.d4o1.i(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p.oma0 a(p.oma0 r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof p.b7
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            p.b7 r0 = (p.b7) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            p.jla0 r2 = r0.k()
            boolean r2 = r2 instanceof p.akz
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof p.rgt
            if (r2 == 0) goto L1b
            p.rgt r0 = (p.rgt) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            p.a8b0 r0 = r0.b
            if (r0 == 0) goto L2a
            boolean r0 = p.d4o1.i(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            p.jla0 r0 = r7.k()
            if (r0 == 0) goto L70
            java.util.List r2 = r7.v()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p.q7h.U(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r2.next()
            p.tma0 r4 = (p.tma0) r4
            p.oma0 r5 = r4.b
            if (r5 == 0) goto L5a
            p.oma0 r5 = a(r5, r8)
            goto L5b
        L5a:
            r5 = r1
        L5b:
            int r4 = r4.a
            p.tma0 r6 = new p.tma0
            r6.<init>(r4, r5)
            r3.add(r6)
            goto L45
        L66:
            java.util.List r7 = r7.getAnnotations()
            r8 = 0
            p.b7 r7 = p.anm1.v(r0, r3, r8, r7, r1)
            return r7
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            p.jd11 r2 = p.rc11.a
            p.tka0 r7 = r2.b(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sh10.a(p.oma0, java.lang.String):p.oma0");
    }

    public static final Collection b(tka0 tka0Var) {
        mc11 mc11Var = ((yka0) ((bla0) tka0Var).c.getValue()).s;
        mma0 mma0Var = yka0.w[16];
        return (Collection) mc11Var.invoke();
    }

    public static final qh10 c(tka0 tka0Var) {
        if (tka0Var instanceof bla0) {
            mc11 mc11Var = ((yka0) ((bla0) tka0Var).c.getValue()).u;
            mma0 mma0Var = yka0.w[18];
            return (qh10) mc11Var.invoke();
        }
        if (tka0Var instanceof ucn0) {
            return c(((ucn0) tka0Var).a);
        }
        bhn0.B(rc11.a.b(tka0Var.getClass()), "Unknown type ");
        return null;
    }

    public static final boolean d(lft lftVar) {
        return bpi1.g(lftVar) == null;
    }

    public static final void e(Object obj) {
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    public static final vma0 f(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return vma0.b;
        }
        ArrayList<mmr0> arrayListV1 = o7h.v1(list, list2);
        int iS = zno1.s(q7h.U(arrayListV1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (mmr0 mmr0Var : arrayListV1) {
            qma0 qma0Var = (qma0) mmr0Var.a;
            qma0 qma0Var2 = (qma0) mmr0Var.b;
            tma0 tma0Var = tma0.c;
            linkedHashMap.put(qma0Var, bqn1.y(anm1.u(qma0Var2, (ArrayList) null, 7)));
        }
        return new vma0(linkedHashMap);
    }

    public static final jfz g(lft lftVar, crn1 crn1Var) {
        int i;
        Field fieldX;
        Class<?> declaringClass;
        List parameters = lftVar.getParameters();
        ArrayList arrayList = new ArrayList();
        Iterator it = parameters.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((hc11) next).s() != 1) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hc11) it2.next()).t());
        }
        boolean z = lftVar instanceof mma0;
        if (z && (fieldX = m5n1.x((mma0) lftVar)) != null && (declaringClass = fieldX.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            i = 3;
        } else if (z) {
            i = 2;
        } else if (!(lftVar instanceof nla0)) {
            bhn0.B(rc11.a.b(lftVar.getClass()), "Unknown kind for ");
            return null;
        }
        int i2 = i;
        nla0 nla0Var = lftVar instanceof nla0 ? (nla0) lftVar : null;
        Method methodY = nla0Var != null ? m5n1.y(nla0Var) : null;
        Type[] genericParameterTypes = methodY != null ? methodY.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listQ0 = f46.Q0(genericParameterTypes);
        Class<?>[] parameterTypes = methodY != null ? methodY.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new jfz(i2, lftVar.getName(), methodY != null ? methodY.getName() : null, lftVar.getTypeParameters(), arrayList2, f46.Q0(parameterTypes), listQ0, d(lftVar), crn1Var);
    }
}
