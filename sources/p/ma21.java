package p;

import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ma21 extends hab0 implements iu30 {
    public static final ma21 N0;
    public static final ma21 O0;
    public static final ma21 P0;
    public static final ma21 Q0;
    public static final ma21 R0;
    public static final ma21 S0;
    public static final ma21 T0;
    public static final ma21 U0;
    public static final ma21 V0;
    public static final ma21 W0;
    public static final ma21 X;
    public static final ma21 X0;
    public static final ma21 Y;
    public static final ma21 Y0;
    public static final ma21 Z;
    public static final ma21 Z0;
    public static final ma21 a1;
    public static final ma21 b;
    public static final ma21 b1;
    public static final ma21 c;
    public static final ma21 c1;
    public static final ma21 d;
    public static final ma21 d1;
    public static final ma21 e;
    public static final ma21 e1;
    public static final ma21 f;
    public static final ma21 g;
    public static final ma21 h;
    public static final ma21 i;
    public static final ma21 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ma21(i2, (byte) 0);
        c = new ma21(i2, (byte) 1);
        d = new ma21(i2, (byte) 2);
        e = new ma21(i2, (byte) 3);
        f = new ma21(i2, (byte) 4);
        g = new ma21(i2, (byte) 5);
        h = new ma21(i2, (byte) 6);
        i = new ma21(i2, (byte) 7);
        t = new ma21(i2, (byte) 8);
        X = new ma21(i2, (byte) 9);
        Y = new ma21(i2, (byte) 10);
        Z = new ma21(i2, (byte) 11);
        N0 = new ma21(i2, (byte) 12);
        O0 = new ma21(i2, (byte) 13);
        P0 = new ma21(i2, (byte) 14);
        Q0 = new ma21(i2, (byte) 15);
        R0 = new ma21(i2, (byte) 16);
        S0 = new ma21(i2, (byte) 17);
        T0 = new ma21(i2, (byte) 18);
        U0 = new ma21(i2, (byte) 19);
        V0 = new ma21(i2, (byte) 20);
        W0 = new ma21(i2, (byte) 21);
        X0 = new ma21(i2, (byte) 22);
        Y0 = new ma21(i2, (byte) 23);
        Z0 = new ma21(i2, (byte) 24);
        a1 = new ma21(i2, (byte) 25);
        b1 = new ma21(i2, (byte) 26);
        c1 = new ma21(i2, (byte) 27);
        d1 = new ma21(i2, (byte) 28);
        e1 = new ma21(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma21(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                return new x1l0((i3l0) obj);
            case 3:
                return new a2l0((i3l0) obj);
            case 4:
                return ((a2l0) obj).e();
            case 5:
                return new a2l0((i3l0) obj);
            case 6:
                return ((a2l0) obj).e();
            case 7:
                return new j0l0((i3l0) obj);
            case 8:
                b261.c((e261) obj);
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                return new b2l0((i3l0) obj);
            case 11:
                ((Number) obj).longValue();
                return rih1Var;
            case 12:
                long j = ((Offset) obj).a;
                return rih1Var;
            case 13:
                return Boolean.TRUE;
            case 14:
                return new ue21("", 1, 1, true);
            case 15:
                return rih1Var;
            case 16:
                return Boolean.TRUE;
            case 17:
                return new xf21(false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                Bundle bundle = new Bundle();
                bundle.putBoolean("markLaterAsUnplayed", ((xf21) obj).a);
                return bundle;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((xas) obj).a(T0, rs11.T0);
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                return new qh21(false, true, null);
            case 22:
                return mno1.h(new mmr0[]{new mmr0("report_a_problem_model", (yi21) obj)});
            case 23:
                return rih1Var;
            case 24:
                ((Function0) obj).invoke();
                return rih1Var;
            case 25:
                return new d2l0((i3l0) obj);
            case 26:
                return ((d2l0) obj).e();
            case 27:
                return new c2l0((i3l0) obj);
            case 28:
                return new c2l0((i3l0) obj);
            default:
                return new d2l0((i3l0) obj);
        }
    }
}
