package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class p3f0 {
    public static final List a = p7h.M(new u7h[]{new u7h(z4p1.g(4294933355L)), new u7h(z4p1.g(4294956636L)), new u7h(z4p1.g(4289265500L)), new u7h(z4p1.g(4283957230L)), new u7h(z4p1.g(4285568767L)), new u7h(z4p1.g(4292833535L))});
    public static final mmr0[] b;

    static {
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        int i = 0;
        while (f <= 1.000001f) {
            Float fValueOf = Float.valueOf(Math.min(f, 1.0f));
            List list = a;
            arrayList.add(new mmr0(fValueOf, list.get(i % list.size())));
            f += 0.05f;
            i++;
        }
        b = (mmr0[]) arrayList.toArray(new mmr0[0]);
    }

    public static final jm60 a(float f, float f2, float f3, float f4, float f5, Float f6, Float f7, Float f8) {
        float f9;
        float fFloatValue;
        boolean z = f7 != null;
        if (z) {
            f9 = f2 - f3;
            f5 = f7.floatValue();
        } else {
            f9 = f4 - f3;
        }
        float f10 = f9 - f5;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f6 != null) {
            fFloatValue = f6.floatValue();
        } else {
            fFloatValue = (z ? 0.33f : 0.4f) * f;
        }
        float fMin = Math.min(fFloatValue, f10);
        float f11 = fMin >= 0.0f ? fMin : 0.0f;
        if (f8 != null) {
            f = (f - f8.floatValue()) + f2;
        }
        return new jm60((f / 2.0f) - (f11 / 2.0f), f3, f11);
    }

    public static final mmr0[] b() {
        return b;
    }

    public static qim0 c(qim0 qim0Var, tob1 tob1Var, boolean z, p3v p3vVar, p3v p3vVar2, p3v p3vVar3, float f, int i) {
        if ((i & 4) != 0) {
            p3vVar = null;
        }
        if ((i & 8) != 0) {
            p3vVar2 = null;
        }
        if ((i & 16) != 0) {
            p3vVar3 = null;
        }
        if ((i & 32) != 0) {
            f = 0.6567f;
        }
        return zr7.i(qim0Var, new u8s(z, f, p3vVar, p3vVar2, p3vVar3, tob1Var));
    }
}
