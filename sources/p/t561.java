package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t561 {
    public final ld00 a;
    public final HashMap b = new HashMap();

    public t561(ld00 ld00Var) {
        this.a = ld00Var;
    }

    public final long a(int i, String str, byte[] bArr) {
        int iC = l1d.C(i);
        if (iC == 0) {
            long jC = c(str, bArr);
            kd00 kd00Var = new kd00();
            kd00Var.a = str;
            kd00Var.c = 1 + jC;
            kd00Var.b = bArr;
            ld00 ld00Var = this.a;
            qyo1.x(ld00Var.a, false, true, new f0z(ld00Var, kd00Var, (byte) 13));
            return jC;
        }
        if (iC != 1) {
            eg.o();
            return 0L;
        }
        String strConcat = str.concat(new String(bArr, nne.a));
        HashMap map = this.b;
        Object obj = map.get(strConcat);
        if (obj == null) {
            obj = 1L;
        }
        long jLongValue = ((Number) obj).longValue();
        map.put(strConcat, Long.valueOf(1 + jLongValue));
        return jLongValue;
    }

    public final long b(String str, byte[] bArr) {
        int iC = l1d.C(1);
        if (iC == 0) {
            return c(str, bArr);
        }
        if (iC != 1) {
            eg.o();
            return 0L;
        }
        Object obj = this.b.get(str.concat(new String(bArr, nne.a)));
        if (obj == null) {
            obj = 1L;
        }
        return ((Number) obj).longValue();
    }

    public final long c(String str, byte[] bArr) {
        long jLongValue = ((Number) qyo1.x(this.a.a, true, false, new f0z(str, bArr, (byte) 12))).longValue();
        if (jLongValue == 0) {
            return 1L;
        }
        return jLongValue;
    }
}
