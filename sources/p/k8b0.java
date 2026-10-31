package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k8b0 extends hab0 implements iu30 {
    public static final k8b0 N0;
    public static final k8b0 O0;
    public static final k8b0 P0;
    public static final k8b0 Q0;
    public static final k8b0 R0;
    public static final k8b0 S0;
    public static final k8b0 T0;
    public static final k8b0 U0;
    public static final k8b0 V0;
    public static final k8b0 W0;
    public static final k8b0 X;
    public static final k8b0 X0;
    public static final k8b0 Y;
    public static final k8b0 Y0;
    public static final k8b0 Z;
    public static final k8b0 Z0;
    public static final k8b0 a1;
    public static final k8b0 b;
    public static final k8b0 b1;
    public static final k8b0 c;
    public static final k8b0 c1;
    public static final k8b0 d;
    public static final k8b0 d1;
    public static final k8b0 e;
    public static final k8b0 e1;
    public static final k8b0 f;
    public static final k8b0 g;
    public static final k8b0 h;
    public static final k8b0 i;
    public static final k8b0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new k8b0(i2, (byte) 0);
        c = new k8b0(i2, (byte) 1);
        d = new k8b0(i2, (byte) 2);
        e = new k8b0(i2, (byte) 3);
        f = new k8b0(i2, (byte) 4);
        g = new k8b0(i2, (byte) 5);
        h = new k8b0(i2, (byte) 6);
        i = new k8b0(i2, (byte) 7);
        t = new k8b0(i2, (byte) 8);
        X = new k8b0(i2, (byte) 9);
        Y = new k8b0(i2, (byte) 10);
        Z = new k8b0(i2, (byte) 11);
        N0 = new k8b0(i2, (byte) 12);
        O0 = new k8b0(i2, (byte) 13);
        P0 = new k8b0(i2, (byte) 14);
        Q0 = new k8b0(i2, (byte) 15);
        R0 = new k8b0(i2, (byte) 16);
        S0 = new k8b0(i2, (byte) 17);
        T0 = new k8b0(i2, (byte) 18);
        U0 = new k8b0(i2, (byte) 19);
        V0 = new k8b0(i2, (byte) 20);
        W0 = new k8b0(i2, (byte) 21);
        X0 = new k8b0(i2, (byte) 22);
        Y0 = new k8b0(i2, (byte) 23);
        Z0 = new k8b0(i2, (byte) 24);
        a1 = new k8b0(i2, (byte) 25);
        b1 = new k8b0(i2, (byte) 26);
        c1 = new k8b0(i2, (byte) 27);
        d1 = new k8b0(i2, (byte) 28);
        e1 = new k8b0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8b0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        long jK0;
        byte b2 = this.a;
        boolean z = false;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                tfa0 tfa0Var = (tfa0) obj;
                tfa0Var.c = true;
                tfa0Var.a = true;
                return rih1Var;
            case 1:
                return null;
            case 2:
                String str = (String) obj;
                if (str != null) {
                    return new yxe1(new ehc1(str));
                }
                return null;
            case 3:
                return new ygc0(null, null);
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return ((mey0) obj).d;
            case 7:
                mey0 mey0Var = (mey0) obj;
                String str2 = mey0Var.h;
                return str2 == null ? mey0Var.c : str2;
            case 8:
                return ((cbi0) obj).c;
            case 9:
                return ((fdi0) obj).c;
            case 10:
                ((qtr) obj).b(new pgi0(5, null));
                return rih1Var;
            case 11:
                ((qtr) obj).b(new xia());
                return rih1Var;
            case 12:
                return ((xkl0) obj).h().p();
            case 13:
                m5j0 m5j0Var = (m5j0) obj;
                if ((m5j0Var instanceof l5j0) || (m5j0Var instanceof j5j0) || (m5j0Var instanceof k5j0)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                return rih1Var;
            case 15:
                return ((d2m0) obj).e();
            case 16:
                return b7xVar;
            case 17:
                b261.c((e261) obj);
                return rih1Var;
            case 18:
                return Boolean.FALSE;
            case 19:
                wsn0 wsn0Var = (wsn0) obj;
                return new dtn0(wsn0Var.a, wsn0Var.b, fg91.b);
            case 20:
                return rih1Var;
            case 21:
                j7p0 j7p0Var = (j7p0) obj;
                if ((j7p0Var instanceof i7p0) && ((i7p0) j7p0Var).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                return ((k7p0) obj).b;
            case 23:
                return new hrp0("");
            case 24:
                return b7xVar;
            case 25:
                mmr0 mmr0Var = (mmr0) obj;
                dtp0 dtp0Var = (dtp0) mmr0Var.a;
                dtp0 dtp0Var2 = (dtp0) mmr0Var.b;
                if (dtp0Var == null || !dtp0Var.b) {
                    ytw0 ytw0Var = jfv.b;
                    jK0 = fdg1.k0(0, ngv.SECONDS);
                } else {
                    jK0 = dtp0Var2.a;
                }
                return new jfv(jK0);
            case 26:
                return b7xVar;
            case 27:
                int iOrdinal = ((pup0) obj).ordinal();
                if (iOrdinal == 0) {
                    return cvp0.a;
                }
                if (iOrdinal == 1) {
                    return dvp0.a;
                }
                eg.o();
                return null;
            case 28:
                return new z6r0();
            default:
                ((FrameLayout) obj).removeAllViews();
                return rih1Var;
        }
    }
}
