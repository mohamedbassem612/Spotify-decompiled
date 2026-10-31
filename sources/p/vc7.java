package p;

import android.view.View;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vc7 extends hab0 implements Function0 {
    public static final vc7 N0;
    public static final vc7 O0;
    public static final vc7 P0;
    public static final vc7 Q0;
    public static final vc7 R0;
    public static final vc7 S0;
    public static final vc7 T0;
    public static final vc7 U0;
    public static final vc7 V0;
    public static final vc7 W0;
    public static final vc7 X;
    public static final vc7 X0;
    public static final vc7 Y;
    public static final vc7 Y0;
    public static final vc7 Z;
    public static final vc7 Z0;
    public static final vc7 a1;
    public static final vc7 b;
    public static final vc7 b1;
    public static final vc7 c;
    public static final vc7 c1;
    public static final vc7 d;
    public static final vc7 d1;
    public static final vc7 e;
    public static final vc7 e1;
    public static final vc7 f;
    public static final vc7 g;
    public static final vc7 h;
    public static final vc7 i;
    public static final vc7 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new vc7(i2, (byte) 0);
        c = new vc7(i2, (byte) 1);
        d = new vc7(i2, (byte) 2);
        e = new vc7(i2, (byte) 3);
        f = new vc7(i2, (byte) 4);
        g = new vc7(i2, (byte) 5);
        h = new vc7(i2, (byte) 6);
        i = new vc7(i2, (byte) 7);
        t = new vc7(i2, (byte) 8);
        X = new vc7(i2, (byte) 9);
        Y = new vc7(i2, (byte) 10);
        Z = new vc7(i2, (byte) 11);
        N0 = new vc7(i2, (byte) 12);
        O0 = new vc7(i2, (byte) 13);
        P0 = new vc7(i2, (byte) 14);
        Q0 = new vc7(i2, (byte) 15);
        R0 = new vc7(i2, (byte) 16);
        S0 = new vc7(i2, (byte) 17);
        T0 = new vc7(i2, (byte) 18);
        U0 = new vc7(i2, (byte) 19);
        V0 = new vc7(i2, (byte) 20);
        W0 = new vc7(i2, (byte) 21);
        X0 = new vc7(i2, (byte) 22);
        Y0 = new vc7(i2, (byte) 23);
        Z0 = new vc7(i2, (byte) 24);
        a1 = new vc7(i2, (byte) 25);
        b1 = new vc7(i2, (byte) 26);
        c1 = new vc7(i2, (byte) 27);
        d1 = new vc7(i2, (byte) 28);
        e1 = new vc7(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc7(int i2, byte b2) {
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
                return rih1Var;
            case 3:
                throw new IllegalStateException("no AttentionTrackerHolder available");
            case 4:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 5:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 8:
                return new r36(wr80.a, (byte) 0);
            case 9:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961735});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961735, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 10:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961736});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961736, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 11:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961735});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961735, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 12:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961736});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961736, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 13:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961735});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961735, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 14:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961735});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961735, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 15:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -262149, 1);
            case 16:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : gd8.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 17:
                return new a1z("com.spotify.thestage.vtec.datasource.AuthType", ci8.values());
            case 18:
                hv8.Companion.getClass();
                return new hv8(false, "not_logged_in", null);
            case 19:
                jdi1.Companion.getClass();
                return new jdi1((String) null, (String) null, false, "not_logged_in", 3);
            case 20:
                return v8r.q(Boolean.FALSE);
            case 21:
                return rih1Var;
            case 22:
                return new r36(chc1.a, (byte) 0);
            case 23:
                return new r36(y89.a, (byte) 0);
            case 24:
                return null;
            case 25:
                return new r36(chc1.a, (byte) 0);
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            default:
                return rih1Var;
        }
    }
}
