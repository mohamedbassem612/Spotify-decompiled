package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import p.er80;
import p.hg91;
import p.l220;
import p.oiy0;
import p.poz0;
import p.qe40;
import p.rwg;
import p.t4f0;
import p.xz00;
import p.y190;
import p.yih1;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class l {
    public static final Class a;
    public static final m b;
    public static final o c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class<qe40> cls;
        oiy0 oiy0Var = oiy0.c;
        m mVar = null;
        try {
            cls = qe40.class;
            int i = qe40.a;
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            oiy0 oiy0Var2 = oiy0.c;
            if (yih1.class != 0) {
                mVar = (m) yih1.class.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused2) {
        }
        b = mVar;
        c = new o();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof er80)) {
            int iG = 0;
            while (i < size) {
                iG += rwg.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        er80 er80Var = (er80) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += rwg.g(er80Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (rwg.e(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (rwg.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof er80)) {
            int iG = 0;
            while (i < size) {
                iG += rwg.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        er80 er80Var = (er80) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += rwg.g(er80Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t4f0)) {
            int iG = 0;
            while (i < size) {
                iG += rwg.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += rwg.g(t4f0Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof er80)) {
            int iB = 0;
            while (i < size) {
                iB += rwg.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        er80 er80Var = (er80) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += rwg.b(er80Var.e(i));
            i++;
        }
        return iB2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t4f0)) {
            int iC = 0;
            while (i < size) {
                iC += rwg.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += rwg.c(t4f0Var.e(i));
            i++;
        }
        return iC2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof er80)) {
            int iF = 0;
            while (i < size) {
                iF += rwg.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        er80 er80Var = (er80) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += rwg.f(er80Var.e(i));
            i++;
        }
        return iF2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t4f0)) {
            int iG = 0;
            while (i < size) {
                iG += rwg.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += rwg.g(t4f0Var.e(i));
            i++;
        }
        return iG2;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, y190 y190Var, Object obj2, m mVar) {
        if (y190Var == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (y190Var.findValueByNumber(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = o(obj, i, iIntValue, obj2, mVar);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i, List list, z190 z190Var, Object obj2, m mVar) {
        if (z190Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!z190Var.isInRange(iIntValue)) {
                    obj2 = o(obj, i, iIntValue, obj2, mVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (z190Var.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = o(obj, i, iIntValue2, obj2, mVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void l(xz00 xz00Var, Object obj, Object obj2) {
        hg91 hg91Var = xz00Var.c(obj2).a;
        if (hg91Var.isEmpty()) {
            return;
        }
        l220 l220VarD = xz00Var.d(obj);
        l220VarD.getClass();
        int i = hg91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l220VarD.k(hg91Var.c(i2));
        }
        Iterator it = hg91Var.d().iterator();
        while (it.hasNext()) {
            l220VarD.k((Map.Entry) it.next());
        }
    }

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
    public static void m(m mVar, Object obj, Object obj2) {
        ((o) mVar).getClass();
        h hVar = (h) obj;
        n nVarE = hVar.unknownFields;
        n nVar = ((h) obj2).unknownFields;
        n nVar2 = n.f;
        if (!nVar2.equals(nVar)) {
            if (nVar2.equals(nVarE)) {
                nVarE = n.e(nVarE, nVar);
            } else {
                nVarE.getClass();
                if (!nVar.equals(nVar2)) {
                    nVarE.a();
                    int i = nVarE.a + nVar.a;
                    nVarE.b(i);
                    System.arraycopy(nVar.b, 0, nVarE.b, nVarE.a, nVar.a);
                    System.arraycopy(nVar.c, 0, nVarE.c, nVarE.a, nVar.a);
                    nVarE.a = i;
                }
            }
        }
        hVar.unknownFields = nVarE;
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object o(Object obj, int i, int i2, Object obj2, m mVar) {
        if (obj2 == null) {
            obj2 = mVar.a(obj);
        }
        ((o) mVar).getClass();
        ((n) obj2).f(poz0.E(i, 0), Long.valueOf(i2));
        return obj2;
    }
}
