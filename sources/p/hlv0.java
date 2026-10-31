package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hlv0 extends hab0 implements iu30 {
    public static final hlv0 N0;
    public static final hlv0 O0;
    public static final hlv0 P0;
    public static final hlv0 Q0;
    public static final hlv0 R0;
    public static final hlv0 S0;
    public static final hlv0 T0;
    public static final hlv0 U0;
    public static final hlv0 V0;
    public static final hlv0 W0;
    public static final hlv0 X;
    public static final hlv0 X0;
    public static final hlv0 Y;
    public static final hlv0 Y0;
    public static final hlv0 Z;
    public static final hlv0 Z0;
    public static final hlv0 a1;
    public static final hlv0 b;
    public static final hlv0 b1;
    public static final hlv0 c;
    public static final hlv0 c1;
    public static final hlv0 d;
    public static final hlv0 d1;
    public static final hlv0 e;
    public static final hlv0 e1;
    public static final hlv0 f;
    public static final hlv0 g;
    public static final hlv0 h;
    public static final hlv0 i;
    public static final hlv0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hlv0(i2, (byte) 0);
        c = new hlv0(i2, (byte) 1);
        d = new hlv0(i2, (byte) 2);
        e = new hlv0(i2, (byte) 3);
        f = new hlv0(i2, (byte) 4);
        g = new hlv0(i2, (byte) 5);
        h = new hlv0(i2, (byte) 6);
        i = new hlv0(i2, (byte) 7);
        t = new hlv0(i2, (byte) 8);
        X = new hlv0(i2, (byte) 9);
        Y = new hlv0(i2, (byte) 10);
        Z = new hlv0(i2, (byte) 11);
        N0 = new hlv0(i2, (byte) 12);
        O0 = new hlv0(i2, (byte) 13);
        P0 = new hlv0(i2, (byte) 14);
        Q0 = new hlv0(i2, (byte) 15);
        R0 = new hlv0(i2, (byte) 16);
        S0 = new hlv0(i2, (byte) 17);
        T0 = new hlv0(i2, (byte) 18);
        U0 = new hlv0(i2, (byte) 19);
        V0 = new hlv0(i2, (byte) 20);
        W0 = new hlv0(i2, (byte) 21);
        X0 = new hlv0(i2, (byte) 22);
        Y0 = new hlv0(i2, (byte) 23);
        Z0 = new hlv0(i2, (byte) 24);
        a1 = new hlv0(i2, (byte) 25);
        b1 = new hlv0(i2, (byte) 26);
        c1 = new hlv0(i2, (byte) 27);
        d1 = new hlv0(i2, (byte) 28);
        e1 = new hlv0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hlv0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                b261.f((e261) obj);
                return rih1Var;
            case 4:
                hqv0 hqv0Var = ((gqv0) obj).a;
                ArrayList<mja> arrayList = hqv0Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (mja mjaVar : arrayList) {
                    arrayList2.add(new fqv0(mjaVar.a, mjaVar.b));
                }
                return new eqv0(hqv0Var.b, arrayList2);
            case 5:
                return rih1Var;
            case 6:
                ysv0 ysv0Var = (ysv0) obj;
                return new mtv0(ysv0Var.a, ysv0Var.b);
            case 7:
                return Integer.valueOf(((ysv0) obj).b);
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                if (ctv0.a[((itv0) obj).ordinal()] == 1) {
                    return atv0.a;
                }
                eg.o();
                return null;
            case 10:
                etv0 etv0Var = ((ftv0) obj).a;
                String str = etv0Var.b;
                String str2 = etv0Var.c;
                if (str2 == null || str2.length() == 0) {
                    str2 = "#FFFFFF";
                }
                return new otv0(etv0Var.d != 1 ? 2 : 1, str, str2);
            case 11:
                return rih1Var;
            case 12:
                int iOrdinal = ((utv0) obj).ordinal();
                if (iOrdinal == 0) {
                    return ltv0.a;
                }
                if (iOrdinal == 1) {
                    return ltv0.b;
                }
                eg.o();
                return null;
            case 13:
                return new wuv0(((wuv0) obj).a);
            case 14:
                return Integer.valueOf(((ivv0) obj).b);
            case 15:
                fvv0 fvv0Var = (fvv0) obj;
                return new ssv0(fvv0Var.a, fvv0Var.b);
            case 16:
                return Integer.valueOf(((fvv0) obj).b);
            case 17:
                return new nsv0(((bvv0) obj).a);
            case 18:
                return Integer.valueOf(((bvv0) obj).a);
            case 19:
                cvv0 cvv0Var = (cvv0) obj;
                return new em10(cvv0Var.a, cvv0Var.b, false, cvv0Var.c);
            case 20:
                return Integer.valueOf(((cvv0) obj).b);
            case 21:
                dvv0 dvv0Var = (dvv0) obj;
                return new xsv0(dvv0Var.a, dvv0Var.b, false);
            case 22:
                return Integer.valueOf(((dvv0) obj).b);
            case 23:
                gvv0 gvv0Var = (gvv0) obj;
                return new btv0(gvv0Var.a, gvv0Var.b);
            case 24:
                return Integer.valueOf(((gvv0) obj).b);
            case 25:
                hvv0 hvv0Var = (hvv0) obj;
                return new ftv0(hvv0Var.a, hvv0Var.b);
            case 26:
                return Integer.valueOf(((hvv0) obj).b);
            case 27:
                evv0 evv0Var = (evv0) obj;
                return new gqv0(evv0Var.a, evv0Var.b);
            case 28:
                return Integer.valueOf(((evv0) obj).b);
            default:
                jvv0 jvv0Var = (jvv0) obj;
                return new lwv0(jvv0Var.a, jvv0Var.b);
        }
    }
}
