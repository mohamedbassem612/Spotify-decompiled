package p;

import android.content.res.Resources;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.lang.annotation.Annotation;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oa41 extends hab0 implements Function0 {
    public static final oa41 N0;
    public static final oa41 O0;
    public static final oa41 P0;
    public static final oa41 Q0;
    public static final oa41 R0;
    public static final oa41 S0;
    public static final oa41 T0;
    public static final oa41 U0;
    public static final oa41 V0;
    public static final oa41 W0;
    public static final oa41 X;
    public static final oa41 X0;
    public static final oa41 Y;
    public static final oa41 Y0;
    public static final oa41 Z;
    public static final oa41 Z0;
    public static final oa41 a1;
    public static final oa41 b;
    public static final oa41 b1;
    public static final oa41 c;
    public static final oa41 c1;
    public static final oa41 d;
    public static final oa41 d1;
    public static final oa41 e;
    public static final oa41 e1;
    public static final oa41 f;
    public static final oa41 g;
    public static final oa41 h;
    public static final oa41 i;
    public static final oa41 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new oa41(i2, (byte) 0);
        c = new oa41(i2, (byte) 1);
        d = new oa41(i2, (byte) 2);
        e = new oa41(i2, (byte) 3);
        f = new oa41(i2, (byte) 4);
        g = new oa41(i2, (byte) 5);
        h = new oa41(i2, (byte) 6);
        i = new oa41(i2, (byte) 7);
        t = new oa41(i2, (byte) 8);
        X = new oa41(i2, (byte) 9);
        Y = new oa41(i2, (byte) 10);
        Z = new oa41(i2, (byte) 11);
        N0 = new oa41(i2, (byte) 12);
        O0 = new oa41(i2, (byte) 13);
        P0 = new oa41(i2, (byte) 14);
        Q0 = new oa41(i2, (byte) 15);
        R0 = new oa41(i2, (byte) 16);
        S0 = new oa41(i2, (byte) 17);
        T0 = new oa41(i2, (byte) 18);
        U0 = new oa41(i2, (byte) 19);
        V0 = new oa41(i2, (byte) 20);
        W0 = new oa41(i2, (byte) 21);
        X0 = new oa41(i2, (byte) 22);
        Y0 = new oa41(i2, (byte) 23);
        Z0 = new oa41(i2, (byte) 24);
        a1 = new oa41(i2, (byte) 25);
        b1 = new oa41(i2, (byte) 26);
        c1 = new oa41(i2, (byte) 27);
        d1 = new oa41(i2, (byte) 28);
        e1 = new oa41(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa41(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
            case 1:
                return rih1Var;
            case 2:
                return Float.valueOf(0.0f);
            case 3:
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4, t550.c);
                Scheduler scheduler = Schedulers.a;
                return new ExecutorScheduler(executorServiceNewFixedThreadPool, false, false);
            case 4:
                return z6x.a;
            case 5:
            case 6:
            case 7:
                return rih1Var;
            case 8:
                return null;
            case 9:
                return Float.valueOf(0.0f);
            case 10:
                return Integer.valueOf((int) (78.0f * Resources.getSystem().getDisplayMetrics().density));
            case 11:
                return Integer.valueOf((int) (140.0f * Resources.getSystem().getDisplayMetrics().density));
            case 12:
                return ts3.d.a.c;
            case 13:
                return v8r.q(Boolean.FALSE);
            case 14:
                return new d8r0();
            case 15:
                return Boolean.TRUE;
            case 16:
                return rih1Var;
            case 17:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.yourupdates.domain.models.SecondaryAction", jd11Var.b(ie51.class), new tka0[]{jd11Var.b(vd51.class), jd11Var.b(ae51.class), jd11Var.b(de51.class), jd11Var.b(he51.class)}, new nma0[]{td51.a, yd51.a, be51.a, ee51.a}, new Annotation[0]);
            case 18:
                return new r36(vh51.a, (byte) 0);
            case 19:
                return new r36(ol51.a, (byte) 0);
            case 20:
                return new r36(chc1.a, (byte) 0);
            case 21:
                return new r36(chc1.a, (byte) 0);
            case 22:
                return new r36(chc1.a, (byte) 0);
            case 23:
                return new r36(gn51.a, (byte) 0);
            case 24:
                return new dw91();
            case 25:
                return rih1Var;
            case 26:
                r6h1 r6h1Var = r6h1.c;
                return new suk0();
            case 27:
                r6h1 r6h1Var2 = r6h1.c;
                return new wuk0();
            case 28:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            default:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
        }
    }
}
