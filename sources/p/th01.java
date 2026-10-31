package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class th01 extends hab0 implements iu30 {
    public static final th01 N0;
    public static final th01 O0;
    public static final th01 P0;
    public static final th01 Q0;
    public static final th01 R0;
    public static final th01 S0;
    public static final th01 T0;
    public static final th01 U0;
    public static final th01 V0;
    public static final th01 W0;
    public static final th01 X;
    public static final th01 X0;
    public static final th01 Y;
    public static final th01 Y0;
    public static final th01 Z;
    public static final th01 Z0;
    public static final th01 a1;
    public static final th01 b;
    public static final th01 b1;
    public static final th01 c;
    public static final th01 c1;
    public static final th01 d;
    public static final th01 d1;
    public static final th01 e;
    public static final th01 e1;
    public static final th01 f;
    public static final th01 g;
    public static final th01 h;
    public static final th01 i;
    public static final th01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new th01(i2, (byte) 0);
        c = new th01(i2, (byte) 1);
        d = new th01(i2, (byte) 2);
        e = new th01(i2, (byte) 3);
        f = new th01(i2, (byte) 4);
        g = new th01(i2, (byte) 5);
        h = new th01(i2, (byte) 6);
        i = new th01(i2, (byte) 7);
        t = new th01(i2, (byte) 8);
        X = new th01(i2, (byte) 9);
        Y = new th01(i2, (byte) 10);
        Z = new th01(i2, (byte) 11);
        N0 = new th01(i2, (byte) 12);
        O0 = new th01(i2, (byte) 13);
        P0 = new th01(i2, (byte) 14);
        Q0 = new th01(i2, (byte) 15);
        R0 = new th01(i2, (byte) 16);
        S0 = new th01(i2, (byte) 17);
        T0 = new th01(i2, (byte) 18);
        U0 = new th01(i2, (byte) 19);
        V0 = new th01(i2, (byte) 20);
        W0 = new th01(i2, (byte) 21);
        X0 = new th01(i2, (byte) 22);
        Y0 = new th01(i2, (byte) 23);
        Z0 = new th01(i2, (byte) 24);
        a1 = new th01(i2, (byte) 25);
        b1 = new th01(i2, (byte) 26);
        c1 = new th01(i2, (byte) 27);
        d1 = new th01(i2, (byte) 28);
        e1 = new th01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (iix0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.progressstate.state.ProgressState");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof zg01);
            case 2:
                if (obj != null) {
                    return (zg01) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.recap.Recap");
                return null;
            case 3:
                return rih1Var;
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                b261.c((e261) obj);
                return rih1Var;
            case 9:
                return rc11.a.b(((hl01) obj).getClass());
            case 10:
                return mno1.h(new mmr0[]{new mmr0("receipt_model", (hl01) obj)});
            case 11:
                if (!(obj instanceof j6k) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (j6k) obj;
            case 13:
                if (!(obj instanceof lhe0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (lhe0) obj;
            case 15:
                return ((um01) obj).b;
            case 16:
                return ((um01) obj).b;
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof fuj0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (fuj0) obj;
            case 20:
                if (!(obj instanceof dxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (dxc0) obj;
            case 22:
                if (!(obj instanceof ldj1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ldj1) obj;
            case 24:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 26:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
