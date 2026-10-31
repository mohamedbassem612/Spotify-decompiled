package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mq41 extends k9 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable v1(int i, izr0 izr0Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(izr0Var.y()));
        }
        if (i == 1) {
            return Boolean.valueOf(izr0Var.E() == 1);
        }
        if (i == 2) {
            return x1(izr0Var);
        }
        if (i != 3) {
            if (i == 8) {
                return w1(izr0Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(izr0Var.y()));
                izr0Var.S(2);
                return date;
            }
            int I = izr0Var.I();
            ArrayList arrayList = new ArrayList(I);
            for (int i2 = 0; i2 < I; i2++) {
                Serializable serializableV1 = v1(izr0Var.E(), izr0Var);
                if (serializableV1 != null) {
                    arrayList.add(serializableV1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strX1 = x1(izr0Var);
            int iE = izr0Var.E();
            if (iE == 9) {
                return map;
            }
            Serializable serializableV2 = v1(iE, izr0Var);
            if (serializableV2 != null) {
                map.put(strX1, serializableV2);
            }
        }
    }

    public static HashMap w1(izr0 izr0Var) {
        int I = izr0Var.I();
        HashMap map = new HashMap(I);
        for (int i = 0; i < I; i++) {
            String strX1 = x1(izr0Var);
            Serializable serializableV1 = v1(izr0Var.E(), izr0Var);
            if (serializableV1 != null) {
                map.put(strX1, serializableV1);
            }
        }
        return map;
    }

    public static String x1(izr0 izr0Var) {
        int iL = izr0Var.L();
        int i = izr0Var.b;
        izr0Var.S(iL);
        return new String(izr0Var.a, i, iL);
    }
}
