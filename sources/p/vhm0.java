package p;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vhm0 {
    public static final HashMap m = sqg0.H(new mmr0[]{new mmr0("embedding.weight", "embed.weight"), new mmr0("dense1.weight", "fc1.weight"), new mmr0("dense2.weight", "fc2.weight"), new mmr0("dense3.weight", "fc3.weight"), new mmr0("dense1.bias", "fc1.bias"), new mmr0("dense2.bias", "fc2.bias"), new mmr0("dense3.bias", "fc3.bias")});
    public final guf0 a;
    public final guf0 b;
    public final guf0 c;
    public final guf0 d;
    public final guf0 e;
    public final guf0 f;
    public final guf0 g;
    public final guf0 h;
    public final guf0 i;
    public final guf0 j;
    public final guf0 k;
    public final HashMap l;

    public vhm0(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.a = (guf0) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.b = bmq0.g0((guf0) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.c = bmq0.g0((guf0) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.d = bmq0.g0((guf0) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.e = (guf0) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.f = (guf0) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.g = (guf0) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.h = bmq0.f0((guf0) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.i = bmq0.f0((guf0) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.j = (guf0) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            eg.m("Required value was null.");
            throw null;
        }
        this.k = (guf0) obj11;
        this.l = new HashMap();
        for (String str : f46.S0(new String[]{cfm0.a(1), cfm0.a(2)})) {
            String strE = f4i1.e(str, ".weight");
            String strE2 = f4i1.e(str, ".bias");
            guf0 guf0Var = (guf0) map.get(strE);
            guf0 guf0Var2 = (guf0) map.get(strE2);
            if (guf0Var != null) {
                this.l.put(strE, bmq0.f0(guf0Var));
            }
            if (guf0Var2 != null) {
                this.l.put(strE2, guf0Var2);
            }
        }
    }

    public final guf0 a(guf0 guf0Var, String[] strArr, String str) {
        HashMap map = this.l;
        Set set = dhn.a;
        if (!set.contains(this)) {
            try {
                guf0 guf0VarO = bmq0.o(bmq0.r(strArr, this.a), this.b);
                bmq0.e(guf0VarO, this.e);
                bmq0.X(guf0VarO);
                guf0 guf0VarO2 = bmq0.o(guf0VarO, this.c);
                bmq0.e(guf0VarO2, this.f);
                bmq0.X(guf0VarO2);
                guf0 guf0VarI = bmq0.I(guf0VarO2, 2);
                guf0 guf0VarO3 = bmq0.o(guf0VarI, this.d);
                bmq0.e(guf0VarO3, this.g);
                bmq0.X(guf0VarO3);
                guf0 guf0VarI2 = bmq0.I(guf0VarO, guf0VarO.a[1]);
                guf0 guf0VarI3 = bmq0.I(guf0VarI, guf0VarI.a[1]);
                guf0 guf0VarI4 = bmq0.I(guf0VarO3, guf0VarO3.a[1]);
                bmq0.s(guf0VarI2);
                bmq0.s(guf0VarI3);
                bmq0.s(guf0VarI4);
                guf0 guf0VarQ = bmq0.q(bmq0.l(new guf0[]{guf0VarI2, guf0VarI3, guf0VarI4, guf0Var}), this.h, this.j);
                bmq0.X(guf0VarQ);
                guf0 guf0VarQ2 = bmq0.q(guf0VarQ, this.i, this.k);
                bmq0.X(guf0VarQ2);
                guf0 guf0Var2 = (guf0) map.get(str.concat(".weight"));
                guf0 guf0Var3 = (guf0) map.get(str.concat(".bias"));
                if (guf0Var2 != null && guf0Var3 != null) {
                    guf0 guf0VarQ3 = bmq0.q(guf0VarQ2, guf0Var2, guf0Var3);
                    if (!set.contains(bmq0.class)) {
                        try {
                            int[] iArr = guf0VarQ3.a;
                            int i = iArr[0];
                            int i2 = iArr[1];
                            float[] fArr = guf0VarQ3.c;
                            for (int i3 = 0; i3 < i; i3++) {
                                int i4 = i3 * i2;
                                int i5 = i4 + i2;
                                float f = Float.MIN_VALUE;
                                for (int i6 = i4; i6 < i5; i6++) {
                                    float f2 = fArr[i6];
                                    if (f2 > f) {
                                        f = f2;
                                    }
                                }
                                float f3 = 0.0f;
                                for (int i7 = i4; i7 < i5; i7++) {
                                    float fExp = (float) Math.exp(fArr[i7] - f);
                                    fArr[i7] = fExp;
                                    f3 += fExp;
                                }
                                while (i4 < i5) {
                                    fArr[i4] = fArr[i4] / f3;
                                    i4++;
                                }
                            }
                        } catch (Throwable th) {
                            dhn.a(bmq0.class, th);
                        }
                    }
                    return guf0VarQ3;
                }
            } catch (Throwable th2) {
                dhn.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
