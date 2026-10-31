package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nok0 extends hab0 implements iu30 {
    public static final nok0 N0;
    public static final nok0 O0;
    public static final nok0 P0;
    public static final nok0 Q0;
    public static final nok0 R0;
    public static final nok0 S0;
    public static final nok0 T0;
    public static final nok0 U0;
    public static final nok0 V0;
    public static final nok0 W0;
    public static final nok0 X;
    public static final nok0 X0;
    public static final nok0 Y;
    public static final nok0 Y0;
    public static final nok0 Z;
    public static final nok0 Z0;
    public static final nok0 a1;
    public static final nok0 b;
    public static final nok0 b1;
    public static final nok0 c;
    public static final nok0 c1;
    public static final nok0 d;
    public static final nok0 d1;
    public static final nok0 e;
    public static final nok0 e1;
    public static final nok0 f;
    public static final nok0 g;
    public static final nok0 h;
    public static final nok0 i;
    public static final nok0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nok0(i2, (byte) 0);
        c = new nok0(i2, (byte) 1);
        d = new nok0(i2, (byte) 2);
        e = new nok0(i2, (byte) 3);
        f = new nok0(i2, (byte) 4);
        g = new nok0(i2, (byte) 5);
        h = new nok0(i2, (byte) 6);
        i = new nok0(i2, (byte) 7);
        t = new nok0(i2, (byte) 8);
        X = new nok0(i2, (byte) 9);
        Y = new nok0(i2, (byte) 10);
        Z = new nok0(i2, (byte) 11);
        N0 = new nok0(i2, (byte) 12);
        O0 = new nok0(i2, (byte) 13);
        P0 = new nok0(i2, (byte) 14);
        Q0 = new nok0(i2, (byte) 15);
        R0 = new nok0(i2, (byte) 16);
        S0 = new nok0(i2, (byte) 17);
        T0 = new nok0(i2, (byte) 18);
        U0 = new nok0(i2, (byte) 19);
        V0 = new nok0(i2, (byte) 20);
        W0 = new nok0(i2, (byte) 21);
        X0 = new nok0(i2, (byte) 22);
        Y0 = new nok0(i2, (byte) 23);
        Z0 = new nok0(i2, (byte) 24);
        a1 = new nok0(i2, (byte) 25);
        b1 = new nok0(i2, (byte) 26);
        c1 = new nok0(i2, (byte) 27);
        d1 = new nok0(i2, (byte) 28);
        e1 = new nok0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nok0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((cok0) obj).a.b.c;
            case 1:
                return ((cok0) obj).a.b.d;
            case 2:
                cok0 cok0Var = (cok0) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : duk1.O0) {
                    if (((duk1) obj2) != duk1.Unknown) {
                        arrayList.add(obj2);
                    }
                }
                return new snk0(cok0Var.a.b.N0, arrayList);
            case 3:
                cok0 cok0Var2 = (cok0) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : jez.Z) {
                    if (((jez) obj3) != jez.Unknown) {
                        arrayList2.add(obj3);
                    }
                }
                return new q1k0(cok0Var2.a.b.N0, arrayList2);
            case 4:
                cok0 cok0Var3 = (cok0) obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : ha20.O0) {
                    if (((ha20) obj4) != ha20.Unknown) {
                        arrayList3.add(obj4);
                    }
                }
                return new b6k0(cok0Var3.a.b.N0, arrayList3);
            case 5:
                cok0 cok0Var4 = (cok0) obj;
                ruq0 ruq0Var = cok0Var4.a.b;
                float f2 = ruq0Var.P0;
                Float fValueOf = f2 > 0.0f ? Float.valueOf(f2) : null;
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : jch0.t(ruq0Var, cok0Var4.B);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : rx30.P0) {
                    if (((rx30) obj5) != rx30.Unknown) {
                        arrayList4.add(obj5);
                    }
                }
                return new f6k0(arrayList4, fFloatValue, ruq0Var.N0);
            case 6:
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : b8w0.N0) {
                    if (((b8w0) obj6) != b8w0.Unknown) {
                        arrayList5.add(obj6);
                    }
                }
                return arrayList5;
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vjk0) obj;
            case 8:
                if (!(obj instanceof vjk0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vjk0) obj;
            case 10:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            case 12:
                if (!(obj instanceof cw21) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cw21) obj;
            case 14:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case 16:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case 18:
                if (!(obj instanceof vjk0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vjk0) obj;
            case 20:
                if (!(obj instanceof vjk0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vjk0) obj;
            case 22:
                if (!(obj instanceof vjk0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                return Boolean.valueOf(obj instanceof hll);
            case 24:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof hll);
            case 26:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 27:
                return Boolean.valueOf(obj instanceof zge1);
            case 28:
                return (k1r) obj;
            default:
                return Boolean.valueOf(obj instanceof zge1);
        }
    }
}
