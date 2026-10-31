package p;

import android.system.Os;
import android.system.OsConstants;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.ExecutorServiceWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fnc0 extends hab0 implements Function0 {
    public static final fnc0 N0;
    public static final fnc0 O0;
    public static final fnc0 P0;
    public static final fnc0 Q0;
    public static final fnc0 R0;
    public static final fnc0 S0;
    public static final fnc0 T0;
    public static final fnc0 U0;
    public static final fnc0 V0;
    public static final fnc0 W0;
    public static final fnc0 X;
    public static final fnc0 X0;
    public static final fnc0 Y;
    public static final fnc0 Y0;
    public static final fnc0 Z;
    public static final fnc0 Z0;
    public static final fnc0 a1;
    public static final fnc0 b;
    public static final fnc0 b1;
    public static final fnc0 c;
    public static final fnc0 c1;
    public static final fnc0 d;
    public static final fnc0 d1;
    public static final fnc0 e;
    public static final fnc0 e1;
    public static final fnc0 f;
    public static final fnc0 g;
    public static final fnc0 h;
    public static final fnc0 i;
    public static final fnc0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new fnc0(i2, (byte) 0);
        c = new fnc0(i2, (byte) 1);
        d = new fnc0(i2, (byte) 2);
        e = new fnc0(i2, (byte) 3);
        f = new fnc0(i2, (byte) 4);
        g = new fnc0(i2, (byte) 5);
        h = new fnc0(i2, (byte) 6);
        i = new fnc0(i2, (byte) 7);
        t = new fnc0(i2, (byte) 8);
        X = new fnc0(i2, (byte) 9);
        Y = new fnc0(i2, (byte) 10);
        Z = new fnc0(i2, (byte) 11);
        N0 = new fnc0(i2, (byte) 12);
        O0 = new fnc0(i2, (byte) 13);
        P0 = new fnc0(i2, (byte) 14);
        Q0 = new fnc0(i2, (byte) 15);
        R0 = new fnc0(i2, (byte) 16);
        S0 = new fnc0(i2, (byte) 17);
        T0 = new fnc0(i2, (byte) 18);
        U0 = new fnc0(i2, (byte) 19);
        V0 = new fnc0(i2, (byte) 20);
        W0 = new fnc0(i2, (byte) 21);
        X0 = new fnc0(i2, (byte) 22);
        Y0 = new fnc0(i2, (byte) 23);
        Z0 = new fnc0(i2, (byte) 24);
        a1 = new fnc0(i2, (byte) 25);
        b1 = new fnc0(i2, (byte) 26);
        c1 = new fnc0(i2, (byte) 27);
        d1 = new fnc0(i2, (byte) 28);
        e1 = new fnc0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnc0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(chc1.a, (byte) 0);
            case 1:
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(WorkRunners.a);
                Preconditions.b(executorServiceNewCachedThreadPool);
                return new ExecutorServiceWorkRunner(executorServiceNewCachedThreadPool);
            case 2:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 3:
            case 4:
            case 5:
            case 6:
                return rih1Var;
            case 7:
                return new cyc0("", 0L);
            case 8:
                return new hyc0(false, (x7i1) null, (gyc0) null);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return rih1Var;
            case 17:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 18:
                return mid0.Companion.serializer();
            case 19:
                return new a1z("com.spotify.audiobookpremium.listeninghoursrequest.ListeningHoursRequestResponseEnum", mid0.values());
            case 20:
            case 21:
            case 22:
                return rih1Var;
            case 23:
                return Double.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            case 24:
                return null;
            case 25:
                return rih1Var;
            case 26:
            case 27:
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                throw new IllegalStateException("No AttentionAreaTracker provided");
            default:
                return b7x.a;
        }
    }
}
