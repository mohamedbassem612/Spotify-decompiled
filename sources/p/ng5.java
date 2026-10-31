package p;

import android.os.Looper;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ng5 extends hab0 implements Function0 {
    public static final ng5 N0;
    public static final ng5 O0;
    public static final ng5 P0;
    public static final ng5 Q0;
    public static final ng5 R0;
    public static final ng5 S0;
    public static final ng5 T0;
    public static final ng5 U0;
    public static final ng5 V0;
    public static final ng5 W0;
    public static final ng5 X;
    public static final ng5 X0;
    public static final ng5 Y;
    public static final ng5 Y0;
    public static final ng5 Z;
    public static final ng5 Z0;
    public static final ng5 a1;
    public static final ng5 b;
    public static final ng5 b1;
    public static final ng5 c;
    public static final ng5 c1;
    public static final ng5 d;
    public static final ng5 d1;
    public static final ng5 e;
    public static final ng5 e1;
    public static final ng5 f;
    public static final ng5 g;
    public static final ng5 h;
    public static final ng5 i;
    public static final ng5 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new ng5(i2, (byte) 0);
        c = new ng5(i2, (byte) 1);
        d = new ng5(i2, (byte) 2);
        e = new ng5(i2, (byte) 3);
        f = new ng5(i2, (byte) 4);
        g = new ng5(i2, (byte) 5);
        h = new ng5(i2, (byte) 6);
        i = new ng5(i2, (byte) 7);
        t = new ng5(i2, (byte) 8);
        X = new ng5(i2, (byte) 9);
        Y = new ng5(i2, (byte) 10);
        Z = new ng5(i2, (byte) 11);
        N0 = new ng5(i2, (byte) 12);
        O0 = new ng5(i2, (byte) 13);
        P0 = new ng5(i2, (byte) 14);
        Q0 = new ng5(i2, (byte) 15);
        R0 = new ng5(i2, (byte) 16);
        S0 = new ng5(i2, (byte) 17);
        T0 = new ng5(i2, (byte) 18);
        U0 = new ng5(i2, (byte) 19);
        V0 = new ng5(i2, (byte) 20);
        W0 = new ng5(i2, (byte) 21);
        X0 = new ng5(i2, (byte) 22);
        Y0 = new ng5(i2, (byte) 23);
        Z0 = new ng5(i2, (byte) 24);
        a1 = new ng5(i2, (byte) 25);
        b1 = new ng5(i2, (byte) 26);
        c1 = new ng5(i2, (byte) 27);
        d1 = new ng5(i2, (byte) 28);
        e1 = new ng5(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng5(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Looper.getMainLooper().getThread().getStackTrace();
            case 1:
                return new r36(chc1.a, (byte) 0);
            case 2:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 3:
                return new r36(m5n1.z(chc1.a), (byte) 0);
            case 4:
                return new r36(tr5.a, (byte) 0);
            case 5:
                return new r36(chc1.a, (byte) 0);
            case 6:
                return new r36(yp5.a, (byte) 0);
            case 7:
                return new r36(chc1.a, (byte) 0);
            case 8:
                return new r36(chc1.a, (byte) 0);
            case 9:
                return v8r.q(Boolean.FALSE);
            case 10:
                return v8r.q((Object) null);
            case 11:
                return new err0(0);
            case 12:
                return new hwx0((ArrayList) null, (ArrayList) null, 7);
            case 13:
                return Boolean.TRUE;
            case 14:
                return Boolean.FALSE;
            case 15:
                return Boolean.FALSE;
            case 16:
                return Float.valueOf(0.0f);
            case 17:
                return Float.valueOf(0.0f);
            case 18:
                return rih1Var;
            case 19:
                return gio1.b(gn6.g);
            case 20:
                return gio1.b(new vn6("", (k6r0) null, (ArrayList) null, "", 54));
            case 21:
                return new r36(jo6.a, (byte) 0);
            case 22:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1);
            case 23:
                return rih1Var;
            case 24:
                return WorkRunners.a();
            case 25:
                return WorkRunners.a();
            case 26:
                return new rk70(2131231699);
            case 27:
                return new rk70(2131231798);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new rk70(2131231848);
            default:
                return v8r.q(Boolean.FALSE);
        }
    }
}
