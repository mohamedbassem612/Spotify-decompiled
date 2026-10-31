package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import p.fr80;
import p.ihc;
import p.pvb0;
import p.qwg;
import p.tm41;
import p.u4f0;
import p.xih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class i {
    public static final Class a;
    public static final j b;
    public static final j c;
    public static final xih1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new xih1();
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = qwg.R0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iR0 += qwg.s0((ihc) list.get(i2));
        }
        return iR0;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV0 = 0;
        for (int i = 0; i < size; i++) {
            iV0 += qwg.v0(((Integer) list.get(i)).intValue());
        }
        return iV0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return qwg.w0(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return qwg.x0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += qwg.C0(((Integer) list.get(i)).intValue());
        }
        return iC0;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (qwg.R0(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof u4f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iE0 = 0;
        for (int i = 0; i < size; i++) {
            iE0 += qwg.E0(((Long) list.get(i)).longValue());
        }
        return iE0;
    }

    public static int l(int i, List list, tm41 tm41Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = qwg.R0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iR0 += qwg.H0((a) list.get(i2), tm41Var);
        }
        return iR0;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += qwg.M0(((Integer) list.get(i)).intValue());
        }
        return iM0;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof u4f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO0 = 0;
        for (int i = 0; i < size; i++) {
            iO0 += qwg.O0(((Long) list.get(i)).longValue());
        }
        return iO0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iR0 = qwg.R0(i) * size;
        if (!(list instanceof pvb0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iR0 = (obj instanceof ihc ? qwg.s0((ihc) obj) : qwg.Q0((String) obj)) + iR0;
                i2++;
            }
            return iR0;
        }
        pvb0 pvb0Var = (pvb0) list;
        while (i2 < size) {
            Object objJ = pvb0Var.j(i2);
            iR0 = (objJ instanceof ihc ? qwg.s0((ihc) objJ) : qwg.Q0((String) objJ)) + iR0;
            i2++;
        }
        return iR0;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT0 = 0;
        for (int i = 0; i < size; i++) {
            iT0 += qwg.T0(((Integer) list.get(i)).intValue());
        }
        return iT0;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qwg.R0(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof u4f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV0 = 0;
        for (int i = 0; i < size; i++) {
            iV0 += qwg.V0(((Long) list.get(i)).longValue());
        }
        return iV0;
    }

    public static j v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (j) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(j jVar, e eVar, Object obj) {
        ((xih1) jVar).getClass();
        k kVar = eVar.unknownFields;
        k kVar2 = ((e) obj).unknownFields;
        if (!kVar2.equals(k.f)) {
            int i = kVar.a + kVar2.a;
            int[] iArrCopyOf = Arrays.copyOf(kVar.b, i);
            System.arraycopy(kVar2.b, 0, iArrCopyOf, kVar.a, kVar2.a);
            Object[] objArrCopyOf = Arrays.copyOf(kVar.c, i);
            System.arraycopy(kVar2.c, 0, objArrCopyOf, kVar.a, kVar2.a);
            kVar = new k(i, iArrCopyOf, objArrCopyOf, true);
        }
        eVar.unknownFields = kVar;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
