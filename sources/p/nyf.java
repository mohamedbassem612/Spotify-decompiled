package p;

import android.graphics.Color;
import android.graphics.Paint;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nyf extends hab0 implements Function0 {
    public static final nyf N0;
    public static final nyf O0;
    public static final nyf P0;
    public static final nyf Q0;
    public static final nyf R0;
    public static final nyf S0;
    public static final nyf T0;
    public static final nyf U0;
    public static final nyf V0;
    public static final nyf W0;
    public static final nyf X;
    public static final nyf X0;
    public static final nyf Y;
    public static final nyf Y0;
    public static final nyf Z;
    public static final nyf Z0;
    public static final nyf a1;
    public static final nyf b;
    public static final nyf b1;
    public static final nyf c;
    public static final nyf c1;
    public static final nyf d;
    public static final nyf d1;
    public static final nyf e;
    public static final nyf e1;
    public static final nyf f;
    public static final nyf g;
    public static final nyf h;
    public static final nyf i;
    public static final nyf t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new nyf(i2, (byte) 0);
        c = new nyf(i2, (byte) 1);
        d = new nyf(i2, (byte) 2);
        e = new nyf(i2, (byte) 3);
        f = new nyf(i2, (byte) 4);
        g = new nyf(i2, (byte) 5);
        h = new nyf(i2, (byte) 6);
        i = new nyf(i2, (byte) 7);
        t = new nyf(i2, (byte) 8);
        X = new nyf(i2, (byte) 9);
        Y = new nyf(i2, (byte) 10);
        Z = new nyf(i2, (byte) 11);
        N0 = new nyf(i2, (byte) 12);
        O0 = new nyf(i2, (byte) 13);
        P0 = new nyf(i2, (byte) 14);
        Q0 = new nyf(i2, (byte) 15);
        R0 = new nyf(i2, (byte) 16);
        S0 = new nyf(i2, (byte) 17);
        T0 = new nyf(i2, (byte) 18);
        U0 = new nyf(i2, (byte) 19);
        V0 = new nyf(i2, (byte) 20);
        W0 = new nyf(i2, (byte) 21);
        X0 = new nyf(i2, (byte) 22);
        Y0 = new nyf(i2, (byte) 23);
        Z0 = new nyf(i2, (byte) 24);
        a1 = new nyf(i2, (byte) 25);
        b1 = new nyf(i2, (byte) 26);
        c1 = new nyf(i2, (byte) 27);
        d1 = new nyf(i2, (byte) 28);
        e1 = new nyf(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nyf(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.TRUE;
            case 1:
            case 2:
                return rih1Var;
            case 3:
                return null;
            case 4:
                return rih1Var;
            case 5:
                return null;
            case 6:
                return v8r.q(Boolean.FALSE);
            case 7:
                Paint paint = new Paint(1);
                paint.setColor(Color.argb(89, 0, 0, 0));
                return paint;
            case 8:
                return rih1Var;
            case 9:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 10:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 11:
                return null;
            case 12:
                return rih1Var;
            case 13:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 14:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 15:
                return new xb10((smr0) null);
            case 16:
                return Integer.valueOf(Color.parseColor("#FF0A59B8"));
            case 17:
                return Integer.valueOf(Color.parseColor("#FF19E68C"));
            case 18:
                return MainThreadWorkRunner.a();
            case 19:
                return rih1Var;
            case 20:
                return v8r.q(Boolean.FALSE);
            case 21:
                return new r36(chc1.a, (byte) 0);
            case 22:
                return new nlc0(chc1.a, m5n1.z(idh.a));
            case 23:
                return new r36(m5n1.z(azh.a), (byte) 0);
            case 24:
            case 25:
            case 26:
            case 27:
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return v8r.q(Boolean.FALSE);
            default:
                return v8r.q(0);
        }
    }
}
