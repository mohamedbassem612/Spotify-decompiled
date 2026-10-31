package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import p.dr80;
import p.mvb0;
import p.ohc;
import p.rm41;
import p.s4f0;
import p.u8;
import p.wih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class i {
    public static final Class a;
    public static final j b;
    public static final j c;
    public static final wih1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new wih1();
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = c.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += c.b((ohc) list.get(i2));
        }
        return iH;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dr80)) {
            int iF = 0;
            while (i < size) {
                iF += c.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        dr80 dr80Var = (dr80) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += c.f(dr80Var.d(i));
            i++;
        }
        return iF2;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dr80)) {
            int iF = 0;
            while (i < size) {
                iF += c.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        dr80 dr80Var = (dr80) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += c.f(dr80Var.d(i));
            i++;
        }
        return iF2;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (c.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s4f0)) {
            int iJ = 0;
            while (i < size) {
                iJ += c.j(((Long) list.get(i)).longValue());
                i++;
            }
            return iJ;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += c.j(s4f0Var.d(i));
            i++;
        }
        return iJ2;
    }

    public static int l(int i, List list, rm41 rm41Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = c.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            u8 u8Var = (u8) list.get(i2);
            u8Var.getClass();
            e eVar = (e) u8Var;
            int iG = eVar.memoizedSerializedSize;
            if (iG == -1) {
                iG = rm41Var.g(u8Var);
                eVar.memoizedSerializedSize = iG;
            }
            iH += c.i(iG) + iG;
        }
        return iH;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dr80)) {
            int i2 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                i2 += c.i((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return i2;
        }
        dr80 dr80Var = (dr80) list;
        int i3 = 0;
        while (i < size) {
            int iD = dr80Var.d(i);
            i3 += c.i((iD >> 31) ^ (iD << 1));
            i++;
        }
        return i3;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s4f0)) {
            int iJ = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iJ += c.j((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iJ;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iJ2 = 0;
        while (i < size) {
            long jD = s4f0Var.d(i);
            iJ2 += c.j((jD >> 63) ^ (jD << 1));
            i++;
        }
        return iJ2;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH = c.h(i) * size;
        if (!(list instanceof mvb0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ohc) {
                    int size2 = ((ohc) obj).size();
                    iH = c.i(size2) + size2 + iH;
                } else {
                    iH = c.g((String) obj) + iH;
                }
                i2++;
            }
            return iH;
        }
        mvb0 mvb0Var = (mvb0) list;
        while (i2 < size) {
            Object objJ = mvb0Var.j(i2);
            if (objJ instanceof ohc) {
                int size3 = ((ohc) objJ).size();
                iH = c.i(size3) + size3 + iH;
            } else {
                iH = c.g((String) objJ) + iH;
            }
            i2++;
        }
        return iH;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dr80)) {
            int i2 = 0;
            while (i < size) {
                i2 += c.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        dr80 dr80Var = (dr80) list;
        int i3 = 0;
        while (i < size) {
            i3 += c.i(dr80Var.d(i));
            i++;
        }
        return i3;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (c.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s4f0)) {
            int iJ = 0;
            while (i < size) {
                iJ += c.j(((Long) list.get(i)).longValue());
                i++;
            }
            return iJ;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += c.j(s4f0Var.d(i));
            i++;
        }
        return iJ2;
    }

    public static j v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
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
        ((wih1) jVar).getClass();
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
