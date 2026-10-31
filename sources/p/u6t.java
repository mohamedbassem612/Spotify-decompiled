package p;

import android.view.View;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u6t extends hab0 implements Function0 {
    public static final u6t N0;
    public static final u6t O0;
    public static final u6t P0;
    public static final u6t Q0;
    public static final u6t R0;
    public static final u6t S0;
    public static final u6t T0;
    public static final u6t U0;
    public static final u6t V0;
    public static final u6t W0;
    public static final u6t X;
    public static final u6t X0;
    public static final u6t Y;
    public static final u6t Y0;
    public static final u6t Z;
    public static final u6t Z0;
    public static final u6t a1;
    public static final u6t b;
    public static final u6t b1;
    public static final u6t c;
    public static final u6t c1;
    public static final u6t d;
    public static final u6t d1;
    public static final u6t e;
    public static final u6t e1;
    public static final u6t f;
    public static final u6t g;
    public static final u6t h;
    public static final u6t i;
    public static final u6t t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new u6t(i2, (byte) 0);
        c = new u6t(i2, (byte) 1);
        d = new u6t(i2, (byte) 2);
        e = new u6t(i2, (byte) 3);
        f = new u6t(i2, (byte) 4);
        g = new u6t(i2, (byte) 5);
        h = new u6t(i2, (byte) 6);
        i = new u6t(i2, (byte) 7);
        t = new u6t(i2, (byte) 8);
        X = new u6t(i2, (byte) 9);
        Y = new u6t(i2, (byte) 10);
        Z = new u6t(i2, (byte) 11);
        N0 = new u6t(i2, (byte) 12);
        O0 = new u6t(i2, (byte) 13);
        P0 = new u6t(i2, (byte) 14);
        Q0 = new u6t(i2, (byte) 15);
        R0 = new u6t(i2, (byte) 16);
        S0 = new u6t(i2, (byte) 17);
        T0 = new u6t(i2, (byte) 18);
        U0 = new u6t(i2, (byte) 19);
        V0 = new u6t(i2, (byte) 20);
        W0 = new u6t(i2, (byte) 21);
        X0 = new u6t(i2, (byte) 22);
        Y0 = new u6t(i2, (byte) 23);
        Z0 = new u6t(i2, (byte) 24);
        a1 = new u6t(i2, (byte) 25);
        b1 = new u6t(i2, (byte) 26);
        c1 = new u6t(i2, (byte) 27);
        d1 = new u6t(i2, (byte) 28);
        e1 = new u6t(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6t(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return rih1Var;
            case 4:
                return WorkRunners.a();
            case 5:
                return WorkRunners.a();
            case 6:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 7:
                return v8r.q(Boolean.FALSE);
            case 8:
                se11 se11Var = fen.c;
                return foo1.s();
            case 9:
                return v8r.q(Boolean.FALSE);
            case 10:
                return new a1z("com.spotify.puffin.core.domain.DevicePredictionStatus", ovt.values());
            case 11:
                return new r36(chc1.a, (byte) 0);
            case 12:
                return rih1Var;
            case 13:
                return new r36(yot.a, (byte) 0);
            case 14:
                return new r36(db0.a, (byte) 0);
            case 15:
                return n1u.Companion.serializer();
            case 16:
                return new a1z("com.spotify.oopsplatform.diagnosticreports.DiagnosticReportType", n1u.values());
            case 17:
                chc1 chc1Var2 = chc1.a;
                return new nlc0(chc1Var2, chc1Var2);
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return rih1Var;
            case 24:
                return Boolean.TRUE;
            case 25:
                return Boolean.TRUE;
            case 26:
                return rih1Var;
            case 27:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961837});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961837, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 28:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961832});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961832, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            default:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961837});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961837, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        }
    }
}
