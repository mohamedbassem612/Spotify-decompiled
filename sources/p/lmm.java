package p;

import android.system.Os;
import android.system.OsConstants;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lmm extends hab0 implements Function0 {
    public static final lmm N0;
    public static final lmm O0;
    public static final lmm P0;
    public static final lmm Q0;
    public static final lmm R0;
    public static final lmm S0;
    public static final lmm T0;
    public static final lmm U0;
    public static final lmm V0;
    public static final lmm W0;
    public static final lmm X;
    public static final lmm X0;
    public static final lmm Y;
    public static final lmm Y0;
    public static final lmm Z;
    public static final lmm Z0;
    public static final lmm a1;
    public static final lmm b;
    public static final lmm b1;
    public static final lmm c;
    public static final lmm c1;
    public static final lmm d;
    public static final lmm d1;
    public static final lmm e;
    public static final lmm e1;
    public static final lmm f;
    public static final lmm g;
    public static final lmm h;
    public static final lmm i;
    public static final lmm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new lmm(i2, (byte) 0);
        c = new lmm(i2, (byte) 1);
        d = new lmm(i2, (byte) 2);
        e = new lmm(i2, (byte) 3);
        f = new lmm(i2, (byte) 4);
        g = new lmm(i2, (byte) 5);
        h = new lmm(i2, (byte) 6);
        i = new lmm(i2, (byte) 7);
        t = new lmm(i2, (byte) 8);
        X = new lmm(i2, (byte) 9);
        Y = new lmm(i2, (byte) 10);
        Z = new lmm(i2, (byte) 11);
        N0 = new lmm(i2, (byte) 12);
        O0 = new lmm(i2, (byte) 13);
        P0 = new lmm(i2, (byte) 14);
        Q0 = new lmm(i2, (byte) 15);
        R0 = new lmm(i2, (byte) 16);
        S0 = new lmm(i2, (byte) 17);
        T0 = new lmm(i2, (byte) 18);
        U0 = new lmm(i2, (byte) 19);
        V0 = new lmm(i2, (byte) 20);
        W0 = new lmm(i2, (byte) 21);
        X0 = new lmm(i2, (byte) 22);
        Y0 = new lmm(i2, (byte) 23);
        Z0 = new lmm(i2, (byte) 24);
        a1 = new lmm(i2, (byte) 25);
        b1 = new lmm(i2, (byte) 26);
        c1 = new lmm(i2, (byte) 27);
        d1 = new lmm(i2, (byte) 28);
        e1 = new lmm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lmm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return v8r.q(Boolean.FALSE);
            case 1:
                return rih1Var;
            case 2:
                r6h1 r6h1Var = r6h1.c;
                return new vcl0();
            case 3:
                throw new IllegalStateException("No AnimatedVisibilityScope provided");
            case 4:
                throw new IllegalStateException("No SharedTransitionScope provided");
            case 5:
                return rih1Var;
            case 6:
                return Double.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            case 7:
                return new File("/proc/self/stat");
            case 8:
                return new File("/proc/self/stat");
            case 9:
                return Thread.currentThread().getName();
            case 10:
                return FirebaseCrashlytics.getInstance();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return rih1Var;
            case grn1.d /* 12 */:
                return v8r.q("");
            case 13:
                return rih1Var;
            case 14:
                return v8r.q(Boolean.TRUE);
            case 15:
                return new r36(chc1.a, (byte) 0);
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 17:
                return gio1.b(new whx0(b7x.a));
            case 18:
                return mno1.g();
            case 19:
                return new r36(xw70.a, (byte) 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 21:
                return rih1Var;
            case 22:
                return v8r.q((Object) null);
            case 23:
            case 24:
            case 25:
            case 26:
                return rih1Var;
            case 27:
                return new tgm((String) null, false, false, false, false, false, true, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -129, 1);
            case 28:
                return new r36(chc1.a, (byte) 0);
            default:
                return rih1Var;
        }
    }
}
