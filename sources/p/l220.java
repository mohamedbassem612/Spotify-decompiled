package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l220 {
    public final hg91 a = hg91.f();
    public boolean b;
    public boolean c;

    static {
        new l220(0);
    }

    public l220(int i) {
        j();
        j();
    }

    public static int c(kul1 kul1Var, int i, Object obj) {
        int iE = rwg.e(i);
        if (kul1Var == kul1.h) {
            iE *= 2;
        }
        return d(kul1Var, obj) + iE;
    }

    public static int d(kul1 kul1Var, Object obj) {
        int size;
        int iF;
        switch (kul1Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = rwg.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = rwg.b;
                return 4;
            case 2:
                return rwg.g(((Long) obj).longValue());
            case 3:
                return rwg.g(((Long) obj).longValue());
            case 4:
                return rwg.g(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = rwg.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = rwg.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = rwg.b;
                return 1;
            case 8:
                if (!(obj instanceof phc)) {
                    return rwg.d((String) obj);
                }
                Logger logger6 = rwg.b;
                size = ((phc) obj).size();
                iF = rwg.f(size);
                break;
                break;
            case 9:
                return ((s2j0) obj).getSerializedSize();
            case 10:
                Logger logger7 = rwg.b;
                size = ((s2j0) obj).getSerializedSize();
                iF = rwg.f(size);
                break;
            case 11:
                if (!(obj instanceof phc)) {
                    Logger logger8 = rwg.b;
                    size = ((byte[]) obj).length;
                    iF = rwg.f(size);
                } else {
                    Logger logger9 = rwg.b;
                    size = ((phc) obj).size();
                    iF = rwg.f(size);
                }
                break;
            case 12:
                return rwg.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof v190 ? rwg.g(((v190) obj).getNumber()) : rwg.g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = rwg.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = rwg.b;
                return 8;
            case 16:
                return rwg.b(((Integer) obj).intValue());
            case 17:
                return rwg.c(((Long) obj).longValue());
            default:
                jah.g("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iF + size;
    }

    public static int e(gf40 gf40Var, Object obj) {
        kul1 kul1Var = gf40Var.c;
        int i = gf40Var.b;
        if (!gf40Var.d) {
            return c(kul1Var, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!gf40Var.e) {
            int iC = 0;
            while (i2 < size) {
                iC += c(kul1Var, i, list.get(i2));
                i2++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i2 < size) {
            iD += d(kul1Var, list.get(i2));
            i2++;
        }
        return rwg.f(iD) + rwg.e(i) + iD;
    }

    public static int f(Map.Entry entry) {
        gf40 gf40Var = (gf40) entry.getKey();
        Object value = entry.getValue();
        if (gf40Var.c.a != nul1.i || gf40Var.d || gf40Var.e) {
            return e(gf40Var, value);
        }
        int i = ((gf40) entry.getKey()).b;
        int iF = rwg.f(i) + rwg.e(2) + (rwg.e(1) * 2);
        int iE = rwg.e(3);
        int serializedSize = ((s2j0) value).getSerializedSize();
        return rwg.f(serializedSize) + serializedSize + iE + iF;
    }

    public static boolean h(Map.Entry entry) {
        gf40 gf40Var = (gf40) entry.getKey();
        if (gf40Var.c.a != nul1.i) {
            return true;
        }
        if (!gf40Var.d) {
            Object value = entry.getValue();
            if (value instanceof v2j0) {
                return ((v2j0) value).isInitialized();
            }
            hhg1.n("Wrong object type used with protocol message reflection.");
            return false;
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(obj instanceof v2j0)) {
                hhg1.n("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((v2j0) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static void m(gf40 gf40Var, Object obj) {
        kul1 kul1Var = gf40Var.c;
        Charset charset = l290.a;
        obj.getClass();
        boolean z = true;
        switch (kul1Var.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof phc) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 7:
                if (!(obj instanceof Integer) && !(obj instanceof v190)) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof s2j0)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(gf40Var.b), gf40Var.c.a, obj.getClass().getName()});
    }

    public static void n(rwg rwgVar, kul1 kul1Var, int i, Object obj) {
        if (kul1Var == kul1.h) {
            rwgVar.z(i, 3);
            ((s2j0) obj).writeTo(rwgVar);
            rwgVar.z(i, 4);
        }
        rwgVar.z(i, kul1Var.b);
        switch (kul1Var.ordinal()) {
            case 0:
                rwgVar.q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                rwgVar.o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                rwgVar.D(((Long) obj).longValue());
                break;
            case 3:
                rwgVar.D(((Long) obj).longValue());
                break;
            case 4:
                rwgVar.s(((Integer) obj).intValue());
                break;
            case 5:
                rwgVar.q(((Long) obj).longValue());
                break;
            case 6:
                rwgVar.o(((Integer) obj).intValue());
                break;
            case 7:
                rwgVar.i(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof phc)) {
                    rwgVar.y((String) obj);
                } else {
                    rwgVar.m((phc) obj);
                }
                break;
            case 9:
                ((s2j0) obj).writeTo(rwgVar);
                break;
            case 10:
                rwgVar.u((s2j0) obj);
                break;
            case 11:
                if (!(obj instanceof phc)) {
                    byte[] bArr = (byte[]) obj;
                    rwgVar.k(bArr, bArr.length);
                } else {
                    rwgVar.m((phc) obj);
                }
                break;
            case 12:
                rwgVar.B(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof v190)) {
                    rwgVar.s(((Integer) obj).intValue());
                } else {
                    rwgVar.s(((v190) obj).getNumber());
                }
                break;
            case 14:
                rwgVar.o(((Integer) obj).intValue());
                break;
            case 15:
                rwgVar.q(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                rwgVar.B((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                rwgVar.D((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(gf40 gf40Var, Object obj) {
        List arrayList;
        if (!gf40Var.d) {
            hhg1.n("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m(gf40Var, obj);
        hg91 hg91Var = this.a;
        Object obj2 = hg91Var.get(gf40Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            hg91Var.put(gf40Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l220 clone() {
        l220 l220Var = new l220();
        hg91 hg91Var = this.a;
        int i = hg91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ng91 ng91VarC = hg91Var.c(i2);
            l220Var.l((gf40) ng91VarC.a, ng91VarC.b);
        }
        for (Map.Entry entry : hg91Var.d()) {
            l220Var.l((gf40) entry.getKey(), entry.getValue());
        }
        l220Var.c = this.c;
        return l220Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l220) {
            return this.a.equals(((l220) obj).a);
        }
        return false;
    }

    public final boolean g() {
        hg91 hg91Var = this.a;
        int i = hg91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!h(hg91Var.c(i2))) {
                return false;
            }
        }
        Iterator it = hg91Var.d().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator i() {
        hg91 hg91Var = this.a;
        if (hg91Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new xob0(hg91Var.entrySet().iterator()) : hg91Var.entrySet().iterator();
    }

    public final void j() {
        if (this.b) {
            return;
        }
        hg91 hg91Var = this.a;
        int i = hg91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = hg91Var.c(i2).b;
            if (obj instanceof h) {
                ((h) obj).makeImmutable();
            }
        }
        Iterator it = hg91Var.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof h) {
                ((h) value).makeImmutable();
            }
        }
        if (!hg91Var.d) {
            for (int i3 = 0; i3 < hg91Var.b; i3++) {
                ng91 ng91VarC = hg91Var.c(i3);
                if (((gf40) ng91VarC.a).d) {
                    ng91VarC.setValue(Collections.unmodifiableList((List) ng91VarC.b));
                }
            }
            for (Map.Entry entry : hg91Var.d()) {
                if (((gf40) entry.getKey()).d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!hg91Var.d) {
            hg91Var.c = hg91Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hg91Var.c);
            hg91Var.f = hg91Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hg91Var.f);
            hg91Var.d = true;
        }
        this.b = true;
    }

    public final void k(Map.Entry entry) {
        gf40 gf40Var = (gf40) entry.getKey();
        Object value = entry.getValue();
        boolean z = gf40Var.d;
        hg91 hg91Var = this.a;
        if (z) {
            Object arrayList = hg91Var.get(gf40Var);
            List list = (List) value;
            int size = list.size();
            if (arrayList == null) {
                arrayList = new ArrayList(size);
            }
            List list2 = (List) arrayList;
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list2.add(obj);
            }
            hg91Var.put(gf40Var, arrayList);
            return;
        }
        if (gf40Var.c.a != nul1.i) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            hg91Var.put(gf40Var, value);
            return;
        }
        Object obj2 = hg91Var.get(gf40Var);
        if (obj2 != null) {
            hg91Var.put(gf40Var, ((g) ((s2j0) obj2).toBuilder()).mergeFrom((h) ((s2j0) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        hg91Var.put(gf40Var, value);
    }

    public final void l(gf40 gf40Var, Object obj) {
        if (!gf40Var.d) {
            m(gf40Var, obj);
        } else {
            if (!(obj instanceof List)) {
                hhg1.n("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m(gf40Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(gf40Var, obj);
    }

    public l220() {
    }
}
