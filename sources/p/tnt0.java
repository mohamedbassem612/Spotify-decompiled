package p;

import android.app.ActivityManager;
import android.icu.text.MeasureFormat;
import android.icu.util.ULocale;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import j$.time.ZonedDateTime;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tnt0 extends hab0 implements Function0 {
    public static final tnt0 N0;
    public static final tnt0 O0;
    public static final tnt0 P0;
    public static final tnt0 Q0;
    public static final tnt0 R0;
    public static final tnt0 S0;
    public static final tnt0 T0;
    public static final tnt0 U0;
    public static final tnt0 V0;
    public static final tnt0 W0;
    public static final tnt0 X;
    public static final tnt0 X0;
    public static final tnt0 Y;
    public static final tnt0 Y0;
    public static final tnt0 Z;
    public static final tnt0 Z0;
    public static final tnt0 a1;
    public static final tnt0 b;
    public static final tnt0 b1;
    public static final tnt0 c;
    public static final tnt0 c1;
    public static final tnt0 d;
    public static final tnt0 d1;
    public static final tnt0 e;
    public static final tnt0 e1;
    public static final tnt0 f;
    public static final tnt0 g;
    public static final tnt0 h;
    public static final tnt0 i;
    public static final tnt0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new tnt0(i2, (byte) 0);
        c = new tnt0(i2, (byte) 1);
        d = new tnt0(i2, (byte) 2);
        e = new tnt0(i2, (byte) 3);
        f = new tnt0(i2, (byte) 4);
        g = new tnt0(i2, (byte) 5);
        h = new tnt0(i2, (byte) 6);
        i = new tnt0(i2, (byte) 7);
        t = new tnt0(i2, (byte) 8);
        X = new tnt0(i2, (byte) 9);
        Y = new tnt0(i2, (byte) 10);
        Z = new tnt0(i2, (byte) 11);
        N0 = new tnt0(i2, (byte) 12);
        O0 = new tnt0(i2, (byte) 13);
        P0 = new tnt0(i2, (byte) 14);
        Q0 = new tnt0(i2, (byte) 15);
        R0 = new tnt0(i2, (byte) 16);
        S0 = new tnt0(i2, (byte) 17);
        T0 = new tnt0(i2, (byte) 18);
        U0 = new tnt0(i2, (byte) 19);
        V0 = new tnt0(i2, (byte) 20);
        W0 = new tnt0(i2, (byte) 21);
        X0 = new tnt0(i2, (byte) 22);
        Y0 = new tnt0(i2, (byte) 23);
        Z0 = new tnt0(i2, (byte) 24);
        a1 = new tnt0(i2, (byte) 25);
        b1 = new tnt0(i2, (byte) 26);
        c1 = new tnt0(i2, (byte) 27);
        d1 = new tnt0(i2, (byte) 28);
        e1 = new tnt0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnt0(int i2, byte b2) {
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
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 2:
            case 3:
                return rih1Var;
            case 4:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 5:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 6:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 7:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 8:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 9:
                kzq.Companion.getClass();
                return jzq.a("not_logged_in");
            case 10:
                chc1 chc1Var2 = chc1.a;
                return new nlc0(chc1Var2, chc1Var2);
            case 11:
                return Boolean.FALSE;
            case 12:
                return new r36(wr80.a, (byte) 0);
            case 13:
                return new r36(ah90.a, (byte) 0);
            case 14:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : oxu0.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 15:
                return rih1Var;
            case 16:
                return new r36(chc1.a, (byte) 0);
            case 17:
                return MainThreadWorkRunner.a();
            case 18:
                return ZonedDateTime.now();
            case 19:
                return Locale.forLanguageTag(upn1.p());
            case 20:
                return Float.valueOf(0.0f);
            case 21:
                return new r36(l3w0.a, (byte) 0);
            case 22:
                return new r36(ocl1.a, (byte) 0);
            case 23:
                return new r36(bo10.a, (byte) 0);
            case 24:
                return new r36(uti0.a, (byte) 0);
            case 25:
                return new r36(chc1.a, (byte) 0);
            case 26:
                return MeasureFormat.getInstance(new ULocale(upn1.m()), MeasureFormat.FormatWidth.SHORT);
            case 27:
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                runningAppProcessInfo.importance = 0;
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                return Integer.valueOf(runningAppProcessInfo.importance);
            default:
                return new r36(wr80.a, (byte) 0);
        }
    }
}
