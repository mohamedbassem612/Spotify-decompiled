package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aw50 extends hab0 implements iu30 {
    public static final aw50 N0;
    public static final aw50 O0;
    public static final aw50 P0;
    public static final aw50 Q0;
    public static final aw50 R0;
    public static final aw50 S0;
    public static final aw50 T0;
    public static final aw50 U0;
    public static final aw50 V0;
    public static final aw50 W0;
    public static final aw50 X;
    public static final aw50 X0;
    public static final aw50 Y;
    public static final aw50 Y0;
    public static final aw50 Z;
    public static final aw50 Z0;
    public static final aw50 a1;
    public static final aw50 b;
    public static final aw50 b1;
    public static final aw50 c;
    public static final aw50 c1;
    public static final aw50 d;
    public static final aw50 d1;
    public static final aw50 e;
    public static final aw50 e1;
    public static final aw50 f;
    public static final aw50 g;
    public static final aw50 h;
    public static final aw50 i;
    public static final aw50 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new aw50(i2, (byte) 0);
        c = new aw50(i2, (byte) 1);
        d = new aw50(i2, (byte) 2);
        e = new aw50(i2, (byte) 3);
        f = new aw50(i2, (byte) 4);
        g = new aw50(i2, (byte) 5);
        h = new aw50(i2, (byte) 6);
        i = new aw50(i2, (byte) 7);
        t = new aw50(i2, (byte) 8);
        X = new aw50(i2, (byte) 9);
        Y = new aw50(i2, (byte) 10);
        Z = new aw50(i2, (byte) 11);
        N0 = new aw50(i2, (byte) 12);
        O0 = new aw50(i2, (byte) 13);
        P0 = new aw50(i2, (byte) 14);
        Q0 = new aw50(i2, (byte) 15);
        R0 = new aw50(i2, (byte) 16);
        S0 = new aw50(i2, (byte) 17);
        T0 = new aw50(i2, (byte) 18);
        U0 = new aw50(i2, (byte) 19);
        V0 = new aw50(i2, (byte) 20);
        W0 = new aw50(i2, (byte) 21);
        X0 = new aw50(i2, (byte) 22);
        Y0 = new aw50(i2, (byte) 23);
        Z0 = new aw50(i2, (byte) 24);
        a1 = new aw50(i2, (byte) 25);
        b1 = new aw50(i2, (byte) 26);
        c1 = new aw50(i2, (byte) 27);
        d1 = new aw50(i2, (byte) 28);
        e1 = new aw50(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw50(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (a7q0) obj;
            case 1:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 3:
                if (!(obj instanceof uxn) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uxn) obj;
            case 5:
                if (!(obj instanceof pn30) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pn30) obj;
            case 7:
                return ((sz50) obj).a;
            case 8:
                return ((sz50) obj).a;
            case 9:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case grn1.d /* 12 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 13:
                return (sz50) obj;
            case 14:
                j060 j060Var = (j060) obj;
                return new n060(j060Var.a, j060Var.b, null, j060Var.c, null);
            case 15:
                return new o060((gd80) null);
            case 16:
                dhl dhlVar = (dhl) obj;
                xid xidVar = dhlVar.d;
                ihl ihlVar = dhlVar.c;
                xid.r(xidVar, ihlVar.d, 0.0f, 6);
                yf.p(dhlVar.e, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                return rih1Var;
            case 17:
                dhl dhlVar2 = (dhl) obj;
                xid xidVar2 = dhlVar2.f;
                ihl ihlVar2 = dhlVar2.c;
                xid.r(xidVar2, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar2.e, ihlVar2.e, 0.0f, 6);
                yf.p(dhlVar2.g, ihlVar2.g, 0.0f, 6);
                return rih1Var;
            case 18:
                dhl dhlVar3 = (dhl) obj;
                xid xidVar3 = dhlVar3.f;
                ihl ihlVar3 = dhlVar3.c;
                xid.r(xidVar3, ihlVar3.f, 0.0f, 6);
                yf.p(dhlVar3.e, ihlVar3.e, 0.0f, 6);
                yf.p(dhlVar3.g, ihlVar3.g, 0.0f, 6);
                return rih1Var;
            case 19:
                dhl dhlVar4 = (dhl) obj;
                xid xidVar4 = dhlVar4.f;
                ihl ihlVar4 = dhlVar4.c;
                xid.r(xidVar4, ihlVar4.f, 0.0f, 6);
                yf.p(dhlVar4.e, ihlVar4.e, 0.0f, 6);
                yf.p(dhlVar4.g, ihlVar4.g, 0.0f, 6);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new h3j1((String) obj, 28);
            case 21:
                return new sz50(((dqw) obj).a);
            case 22:
                b261.c((e261) obj);
                return rih1Var;
            case 23:
                dhl dhlVar5 = (dhl) obj;
                xid xidVar5 = dhlVar5.d;
                ihl ihlVar5 = dhlVar5.c;
                xid.r(xidVar5, ihlVar5.d, 0.0f, 6);
                yf.p(dhlVar5.e, ihlVar5.e, 0.0f, 6);
                yf.p(dhlVar5.g, ihlVar5.g, 0.0f, 6);
                return rih1Var;
            case 24:
                return Boolean.valueOf(obj instanceof a7q0);
            case 25:
                return (k1r) obj;
            case 26:
                return Boolean.valueOf(obj instanceof v6v0);
            case 27:
                return (k1r) obj;
            case 28:
                v6v0 v6v0Var = (v6v0) obj;
                t6v0 t6v0Var = v6v0Var.c;
                int i2 = v6v0Var.a.a;
                return new fy50(i2 > 0, Integer.valueOf(i2), Double.valueOf(t6v0Var.a), Long.valueOf(t6v0Var.b), Boolean.valueOf(t6v0Var.c));
            default:
                return Boolean.valueOf(obj instanceof String);
        }
    }
}
