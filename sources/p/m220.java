package p;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m220 {
    public static final m220 c = new m220(0);
    public final ig91 a = new ig91(16);
    public boolean b;

    public m220(int i) {
        f();
    }

    public static int c(lul1 lul1Var, Object obj) {
        switch (lul1Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return w4c0.l(((Long) obj).longValue());
            case 3:
                return w4c0.l(((Long) obj).longValue());
            case 4:
                return w4c0.h(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return w4c0.k(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    bhn0.o("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((t8) obj).a();
            case 10:
                return w4c0.j((t8) obj);
            case 11:
                if (obj instanceof qhc) {
                    qhc qhcVar = (qhc) obj;
                    return qhcVar.size() + w4c0.k(qhcVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return w4c0.k(bArr.length) + bArr.length;
            case 12:
                return w4c0.k(((Integer) obj).intValue());
            case 13:
                return obj instanceof w190 ? w4c0.h(((w190) obj).getNumber()) : w4c0.h(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return w4c0.k((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return w4c0.l((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                jah.g("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(ff40 ff40Var, Object obj) {
        lul1 lul1Var = ff40Var.b;
        short s = ff40Var.a;
        if (!ff40Var.c) {
            int iM = w4c0.m(s);
            if (lul1Var == lul1.e) {
                iM *= 2;
            }
            return c(lul1Var, obj) + iM;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iM2 = w4c0.m(s);
            if (lul1Var == lul1.e) {
                iM2 *= 2;
            }
            iC += c(lul1Var, obj2) + iM2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        ff40 ff40Var = (ff40) entry.getKey();
        if (ff40Var.b.a != oul1.MESSAGE) {
            return true;
        }
        if (ff40Var.c) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((t8) it.next()).isInitialized()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof t8)) {
            hhg1.n("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((t8) value).isInitialized()) {
            return true;
        }
        return false;
    }

    public static Object h(mwg mwgVar, lul1 lul1Var) {
        switch (lul1Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(mwgVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(mwgVar.i()));
            case 2:
                return Long.valueOf(mwgVar.l());
            case 3:
                return Long.valueOf(mwgVar.l());
            case 4:
                return Integer.valueOf(mwgVar.k());
            case 5:
                return Long.valueOf(mwgVar.j());
            case 6:
                return Integer.valueOf(mwgVar.i());
            case 7:
                return Boolean.valueOf(mwgVar.l() != 0);
            case 8:
                int iK = mwgVar.k();
                int i = mwgVar.b;
                int i2 = mwgVar.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(mwgVar.h(iK), "UTF-8");
                }
                String str = new String(mwgVar.a, i2, iK, "UTF-8");
                mwgVar.d += iK;
                return str;
            case 9:
                hhg1.n("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                hhg1.n("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return mwgVar.f();
            case 12:
                return Integer.valueOf(mwgVar.k());
            case 13:
                hhg1.n("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(mwgVar.i());
            case 15:
                return Long.valueOf(mwgVar.j());
            case 16:
                int iK2 = mwgVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = mwgVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                jah.g("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(lul1 lul1Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (lul1Var.a) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof qhc) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof w190)) {
                    z = false;
                }
                z2 = z;
                break;
            case MESSAGE:
                z2 = obj instanceof t8;
                break;
        }
        if (z2) {
            return;
        }
        hhg1.n("Wrong object type used with protocol message reflection.");
    }

    public static void k(w4c0 w4c0Var, lul1 lul1Var, Object obj) throws UnsupportedEncodingException {
        switch (lul1Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                w4c0Var.getClass();
                w4c0Var.X(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                w4c0Var.getClass();
                w4c0Var.W(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                w4c0Var.Z(((Long) obj).longValue());
                break;
            case 3:
                w4c0Var.Z(((Long) obj).longValue());
                break;
            case 4:
                w4c0Var.Q(((Integer) obj).intValue());
                break;
            case 5:
                w4c0Var.X(((Long) obj).longValue());
                break;
            case 6:
                w4c0Var.W(((Integer) obj).intValue());
                break;
            case 7:
                w4c0Var.T(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                w4c0Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                w4c0Var.Y(bytes.length);
                w4c0Var.V(bytes);
                break;
            case 9:
                w4c0Var.getClass();
                ((t8) obj).d(w4c0Var);
                break;
            case 10:
                w4c0Var.S((t8) obj);
                break;
            case 11:
                if (!(obj instanceof qhc)) {
                    byte[] bArr = (byte[]) obj;
                    w4c0Var.getClass();
                    w4c0Var.Y(bArr.length);
                    w4c0Var.V(bArr);
                } else {
                    qhc qhcVar = (qhc) obj;
                    w4c0Var.getClass();
                    w4c0Var.Y(qhcVar.size());
                    w4c0Var.U(qhcVar);
                }
                break;
            case 12:
                w4c0Var.Y(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof w190)) {
                    w4c0Var.Q(((Integer) obj).intValue());
                } else {
                    w4c0Var.Q(((w190) obj).getNumber());
                }
                break;
            case 14:
                w4c0Var.W(((Integer) obj).intValue());
                break;
            case 15:
                w4c0Var.X(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                w4c0Var.Y((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                w4c0Var.Z((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(ff40 ff40Var, Object obj) {
        List arrayList;
        if (!ff40Var.c) {
            hhg1.n("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(ff40Var.b, obj);
        ig91 ig91Var = this.a;
        Object obj2 = ig91Var.get(ff40Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            ig91Var.put(ff40Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m220 clone() {
        ig91 ig91Var;
        m220 m220Var = new m220();
        int i = 0;
        while (true) {
            ig91Var = this.a;
            if (i >= ig91Var.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ig91Var.b.get(i);
            m220Var.i((ff40) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : ig91Var.c()) {
            m220Var.i((ff40) entry2.getKey(), entry2.getValue());
        }
        return m220Var;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        ig91 ig91Var = this.a;
        if (!ig91Var.d) {
            for (int i = 0; i < ig91Var.b.size(); i++) {
                Map.Entry entry = (Map.Entry) ig91Var.b.get(i);
                if (((ff40) entry.getKey()).c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : ig91Var.c()) {
                if (((ff40) entry2.getKey()).c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!ig91Var.d) {
            ig91Var.c = ig91Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ig91Var.c);
            ig91Var.d = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        ff40 ff40Var = (ff40) entry.getKey();
        Object value = entry.getValue();
        boolean z = ff40Var.c;
        ig91 ig91Var = this.a;
        if (z) {
            Object arrayList = ig91Var.get(ff40Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            ig91Var.put(ff40Var, arrayList);
            return;
        }
        if (ff40Var.b.a != oul1.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            ig91Var.put(ff40Var, value);
            return;
        }
        Object obj2 = ig91Var.get(ff40Var);
        if (obj2 != null) {
            ig91Var.put(ff40Var, ((t8) obj2).c().d((kf40) ((t8) value)).a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        ig91Var.put(ff40Var, value);
    }

    public final void i(ff40 ff40Var, Object obj) {
        boolean z = ff40Var.c;
        lul1 lul1Var = ff40Var.b;
        if (!z) {
            j(lul1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                hhg1.n("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(lul1Var, it.next());
            }
            obj = arrayList;
        }
        this.a.put(ff40Var, obj);
    }

    public m220() {
    }
}
