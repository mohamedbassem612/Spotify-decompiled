package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.scannables.scannables.ScannablesActivity;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o641 extends hab0 implements iu30 {
    public static final o641 N0;
    public static final o641 O0;
    public static final o641 P0;
    public static final o641 Q0;
    public static final o641 R0;
    public static final o641 S0;
    public static final o641 T0;
    public static final o641 U0;
    public static final o641 V0;
    public static final o641 W0;
    public static final o641 X;
    public static final o641 X0;
    public static final o641 Y;
    public static final o641 Y0;
    public static final o641 Z;
    public static final o641 Z0;
    public static final o641 a1;
    public static final o641 b;
    public static final o641 b1;
    public static final o641 c;
    public static final o641 c1;
    public static final o641 d;
    public static final o641 d1;
    public static final o641 e;
    public static final o641 e1;
    public static final o641 f;
    public static final o641 g;
    public static final o641 h;
    public static final o641 i;
    public static final o641 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new o641(i2, (byte) 0);
        c = new o641(i2, (byte) 1);
        d = new o641(i2, (byte) 2);
        e = new o641(i2, (byte) 3);
        f = new o641(i2, (byte) 4);
        g = new o641(i2, (byte) 5);
        h = new o641(i2, (byte) 6);
        i = new o641(i2, (byte) 7);
        t = new o641(i2, (byte) 8);
        X = new o641(i2, (byte) 9);
        Y = new o641(i2, (byte) 10);
        Z = new o641(i2, (byte) 11);
        N0 = new o641(i2, (byte) 12);
        O0 = new o641(i2, (byte) 13);
        P0 = new o641(i2, (byte) 14);
        Q0 = new o641(i2, (byte) 15);
        R0 = new o641(i2, (byte) 16);
        S0 = new o641(i2, (byte) 17);
        T0 = new o641(i2, (byte) 18);
        U0 = new o641(i2, (byte) 19);
        V0 = new o641(i2, (byte) 20);
        W0 = new o641(i2, (byte) 21);
        X0 = new o641(i2, (byte) 22);
        Y0 = new o641(i2, (byte) 23);
        Z0 = new o641(i2, (byte) 24);
        a1 = new o641(i2, (byte) 25);
        b1 = new o641(i2, (byte) 26);
        c1 = new o641(i2, (byte) 27);
        d1 = new o641(i2, (byte) 28);
        e1 = new o641(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o641(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof d7u0) || (obj instanceof rih1));
            case 1:
                return ((p541) obj).a;
            case 2:
                return ((p541) obj).a;
            case 3:
                return ((p541) obj).a;
            case 4:
                return ((p541) obj).a;
            case 5:
                ((qtr) obj).b(new gp9(5, (lnm) null, (byte) 9));
                return rih1.a;
            case 6:
                ck3 ck3Var = ((s941) obj).a;
                ck3 ck3Var2 = ck3Var instanceof ck3 ? ck3Var : null;
                if (ck3Var2 != null) {
                    return ck3Var2.a;
                }
                return null;
            case 7:
                ck3 ck3Var3 = ((s941) obj).a;
                ck3 ck3Var4 = ck3Var3 instanceof ck3 ? ck3Var3 : null;
                if (ck3Var4 != null) {
                    return ck3Var4.a;
                }
                return null;
            case 8:
                ck3 ck3Var5 = ((s941) obj).a;
                ck3 ck3Var6 = ck3Var5 instanceof ck3 ? ck3Var5 : null;
                if (ck3Var6 != null) {
                    return new rxc0(ck3Var6.a);
                }
                return null;
            case 9:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 11:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 13:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 15:
                return null;
            case 16:
                return ((bc41) obj).a;
            case 17:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 18:
                return ((nwl0) obj).e();
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                return pze0.i("=", entry.getKey(), entry.getValue());
            case 20:
                Map.Entry entry2 = (Map.Entry) obj;
                return pze0.i("=", entry2.getKey(), entry2.getValue());
            case 21:
                return new ih41(false);
            case 22:
                return ((hh41) obj).b;
            case 23:
                return new gh41((iix0) obj);
            case 24:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 26:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((f2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 27:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((eol0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                int i2 = ScannablesActivity.k1;
                return new Intent((Context) obj, (Class<?>) ScannablesActivity.class);
            default:
                return ((ni41) obj).a;
        }
    }
}
