package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lbh {
    public final n511 a;
    public final int b;
    public final ArrayList c;
    public final ps6 d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final n511 k;

    public lbh(n511 n511Var, int i, int i2, float f, long j) {
        this.a = n511Var;
        this.b = i;
        this.d = new ps6(i2, i);
        this.e = f / hlb0.a;
        int i3 = 1;
        this.f = i2 % 2 == 0 ? (-(i2 / 2)) + 1 : -(i2 / 2);
        this.g = Float.MAX_VALUE;
        this.h = Float.MIN_VALUE;
        this.i = Float.MAX_VALUE;
        this.j = Float.MIN_VALUE;
        if (i2 < 0) {
            hhg1.n("rowCount must be > 0");
            throw null;
        }
        if (f <= 0.0f) {
            hhg1.n("distanceBetweenHexCenters must be > 0");
            throw null;
        }
        this.c = new ArrayList();
        if (i > 0) {
            int i4 = 0;
            while (i4 < i) {
                List list = this.d.b;
                if (i4 < 0 || i4 >= list.size()) {
                    hhg1.f(gvg.e(list.size(), "index must be in range [0, ", ")"));
                    throw null;
                }
                z760 z760Var = (z760) list.get(i4);
                float f2 = this.e;
                int i5 = this.f;
                int i6 = z760Var.b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c13.p(hlb0.a, z760Var.a, (i6 - i5) % 2 == i3 ? hlb0.a / 2.0f : 0.0f, f2))) << 32) | (((long) Float.floatToRawIntBits(i6 * 1.5f * f2)) & 4294967295L);
                int i7 = (int) (jFloatToRawIntBits >> 32);
                int i8 = (int) (j >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i7) - (Float.intBitsToFloat(i8) / 2.0f);
                int i9 = (int) (jFloatToRawIntBits & 4294967295L);
                int i10 = (int) (j & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i9) - (Float.intBitsToFloat(i10) / 2.0f);
                float fIntBitsToFloat3 = (Float.intBitsToFloat(i8) / 2.0f) + Float.intBitsToFloat(i7);
                float fIntBitsToFloat4 = (Float.intBitsToFloat(i10) / 2.0f) + Float.intBitsToFloat(i9);
                n511 n511Var2 = new n511(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
                this.g = Math.min(this.g, fIntBitsToFloat);
                this.h = Math.max(this.h, fIntBitsToFloat3);
                this.i = Math.min(this.i, fIntBitsToFloat2);
                this.j = Math.max(this.j, fIntBitsToFloat4);
                this.c.add(n511Var2);
                i4++;
                i3 = 1;
            }
        } else {
            this.g = 0.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
        }
        float f3 = this.g;
        float f4 = this.i;
        float f5 = this.h;
        float f6 = this.j;
        n511 n511Var3 = this.a;
        this.k = new n511(f3 - n511Var3.a, f4 - n511Var3.b, f5 + n511Var3.c, f6 + n511Var3.d);
    }

    public final LinkedHashMap a(n511 n511Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n511 n511Var2 = (n511) arrayList.get(i);
            if (n511Var.l(n511Var2)) {
                linkedHashMap.put(Integer.valueOf(i), n511Var2);
            }
        }
        return linkedHashMap;
    }
}
