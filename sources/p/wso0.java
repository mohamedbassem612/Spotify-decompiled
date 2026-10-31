package p;

import android.os.SystemClock;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wso0 extends hab0 implements Function0 {
    public static final wso0 N0;
    public static final wso0 O0;
    public static final wso0 P0;
    public static final wso0 Q0;
    public static final wso0 R0;
    public static final wso0 S0;
    public static final wso0 T0;
    public static final wso0 U0;
    public static final wso0 V0;
    public static final wso0 W0;
    public static final wso0 X;
    public static final wso0 X0;
    public static final wso0 Y;
    public static final wso0 Y0;
    public static final wso0 Z;
    public static final wso0 Z0;
    public static final wso0 a1;
    public static final wso0 b;
    public static final wso0 b1;
    public static final wso0 c;
    public static final wso0 c1;
    public static final wso0 d;
    public static final wso0 d1;
    public static final wso0 e;
    public static final wso0 e1;
    public static final wso0 f;
    public static final wso0 g;
    public static final wso0 h;
    public static final wso0 i;
    public static final wso0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new wso0(i2, (byte) 0);
        c = new wso0(i2, (byte) 1);
        d = new wso0(i2, (byte) 2);
        e = new wso0(i2, (byte) 3);
        f = new wso0(i2, (byte) 4);
        g = new wso0(i2, (byte) 5);
        h = new wso0(i2, (byte) 6);
        i = new wso0(i2, (byte) 7);
        t = new wso0(i2, (byte) 8);
        X = new wso0(i2, (byte) 9);
        Y = new wso0(i2, (byte) 10);
        Z = new wso0(i2, (byte) 11);
        N0 = new wso0(i2, (byte) 12);
        O0 = new wso0(i2, (byte) 13);
        P0 = new wso0(i2, (byte) 14);
        Q0 = new wso0(i2, (byte) 15);
        R0 = new wso0(i2, (byte) 16);
        S0 = new wso0(i2, (byte) 17);
        T0 = new wso0(i2, (byte) 18);
        U0 = new wso0(i2, (byte) 19);
        V0 = new wso0(i2, (byte) 20);
        W0 = new wso0(i2, (byte) 21);
        X0 = new wso0(i2, (byte) 22);
        Y0 = new wso0(i2, (byte) 23);
        Z0 = new wso0(i2, (byte) 24);
        a1 = new wso0(i2, (byte) 25);
        b1 = new wso0(i2, (byte) 26);
        c1 = new wso0(i2, (byte) 27);
        d1 = new wso0(i2, (byte) 28);
        e1 = new wso0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wso0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return v8r.q(Boolean.FALSE);
            case 2:
                return null;
            case 3:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return yon1.X2().c;
            case 4:
            case 5:
                return rih1Var;
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 8:
                return new a18();
            case 9:
                return new g310();
            case 10:
                return new oab1();
            case 11:
                return new ipk1();
            case 12:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 13:
                return new khp0(new aip0(new nbc((byte) 16)));
            case 14:
                return v8r.q(Boolean.FALSE);
            case 15:
                return pro1.t("offlinePlayback");
            case 16:
                return new dtp0(new vgc0(2131959359, tgc0.a, 1), 1);
            case 17:
                return new dtp0(new vgc0(2131959358, new sgc0(2131959357, (String) null), 1), 3);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new hxl0(new opl0(r6h1.c, (byte) 14));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 21:
                return rih1Var;
            case 22:
                return v8r.q(new c8e1(0L, 6, ""));
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return rih1Var;
        }
    }
}
