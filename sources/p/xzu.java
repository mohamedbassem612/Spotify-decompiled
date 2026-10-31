package p;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.HashSet;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xzu extends hab0 implements Function0 {
    public static final xzu N0;
    public static final xzu O0;
    public static final xzu P0;
    public static final xzu Q0;
    public static final xzu R0;
    public static final xzu S0;
    public static final xzu T0;
    public static final xzu U0;
    public static final xzu V0;
    public static final xzu W0;
    public static final xzu X;
    public static final xzu X0;
    public static final xzu Y;
    public static final xzu Y0;
    public static final xzu Z;
    public static final xzu Z0;
    public static final xzu a1;
    public static final xzu b;
    public static final xzu b1;
    public static final xzu c;
    public static final xzu c1;
    public static final xzu d;
    public static final xzu d1;
    public static final xzu e;
    public static final xzu e1;
    public static final xzu f;
    public static final xzu g;
    public static final xzu h;
    public static final xzu i;
    public static final xzu t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new xzu(i2, (byte) 0);
        c = new xzu(i2, (byte) 1);
        d = new xzu(i2, (byte) 2);
        e = new xzu(i2, (byte) 3);
        f = new xzu(i2, (byte) 4);
        g = new xzu(i2, (byte) 5);
        h = new xzu(i2, (byte) 6);
        i = new xzu(i2, (byte) 7);
        t = new xzu(i2, (byte) 8);
        X = new xzu(i2, (byte) 9);
        Y = new xzu(i2, (byte) 10);
        Z = new xzu(i2, (byte) 11);
        N0 = new xzu(i2, (byte) 12);
        O0 = new xzu(i2, (byte) 13);
        P0 = new xzu(i2, (byte) 14);
        Q0 = new xzu(i2, (byte) 15);
        R0 = new xzu(i2, (byte) 16);
        S0 = new xzu(i2, (byte) 17);
        T0 = new xzu(i2, (byte) 18);
        U0 = new xzu(i2, (byte) 19);
        V0 = new xzu(i2, (byte) 20);
        W0 = new xzu(i2, (byte) 21);
        X0 = new xzu(i2, (byte) 22);
        Y0 = new xzu(i2, (byte) 23);
        Z0 = new xzu(i2, (byte) 24);
        a1 = new xzu(i2, (byte) 25);
        b1 = new xzu(i2, (byte) 26);
        c1 = new xzu(i2, (byte) 27);
        d1 = new xzu(i2, (byte) 28);
        e1 = new xzu(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzu(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961832});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961832, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 1:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961837});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961837, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 2:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961832});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new er91((fs91) null, "", 2131961832, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            case 3:
                return Float.valueOf(1.0f);
            case 4:
                return new Handler(Looper.getMainLooper());
            case 5:
                return new r36(chc1.a, (byte) 0);
            case 6:
                return new r36(wr80.a, (byte) 0);
            case 7:
                return rih1Var;
            case 8:
                return v8r.q(Boolean.FALSE);
            case 9:
                return v8r.q(new c8e1(0L, 7, (String) null));
            case 10:
                return v8r.q(Boolean.FALSE);
            case 11:
                return v8r.q(Boolean.FALSE);
            case 12:
                return rih1Var;
            case 13:
                return v8r.q(Boolean.FALSE);
            case 14:
                return rih1Var;
            case 15:
                return v8r.q(Boolean.FALSE);
            case 16:
                return v8r.q(Boolean.FALSE);
            case 17:
                return new r36(j7w.a, (byte) 0);
            case 18:
                return rih1Var;
            case 19:
                return Boolean.FALSE;
            case 20:
                return null;
            case 21:
                return new r36(chc1.a, (byte) 0);
            case 22:
            case 23:
                return rih1Var;
            case 24:
                throw new IllegalStateException("No EncoreTheme provided");
            case 25:
                return Boolean.FALSE;
            case 26:
                return rih1Var;
            case 27:
                String[] availableIDs = TimeZone.getAvailableIDs();
                HashSet hashSet = new HashSet(zno1.s(availableIDs.length));
                f46.K0(availableIDs, hashSet);
                return hashSet;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                throw new IllegalStateException("No EncoreLayoutTheme provided");
            default:
                return new uvx((pgx) null, 0, (tvx) null, (p3v) null, 31);
        }
    }
}
