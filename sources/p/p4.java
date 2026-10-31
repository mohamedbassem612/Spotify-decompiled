package p;

import androidx.car.app.navigation.model.Maneuver;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p4 extends hab0 implements Function0 {
    public static final p4 N0;
    public static final p4 O0;
    public static final p4 P0;
    public static final p4 Q0;
    public static final p4 R0;
    public static final p4 S0;
    public static final p4 T0;
    public static final p4 U0;
    public static final p4 V0;
    public static final p4 W0;
    public static final p4 X;
    public static final p4 X0;
    public static final p4 Y;
    public static final p4 Y0;
    public static final p4 Z;
    public static final p4 Z0;
    public static final p4 a1;
    public static final p4 b;
    public static final p4 b1;
    public static final p4 c;
    public static final p4 c1;
    public static final p4 d;
    public static final p4 d1;
    public static final p4 e;
    public static final p4 e1;
    public static final p4 f;
    public static final p4 g;
    public static final p4 h;
    public static final p4 i;
    public static final p4 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new p4(i2, (byte) 0);
        c = new p4(i2, (byte) 1);
        d = new p4(i2, (byte) 2);
        e = new p4(i2, (byte) 3);
        f = new p4(i2, (byte) 4);
        g = new p4(i2, (byte) 5);
        h = new p4(i2, (byte) 6);
        i = new p4(i2, (byte) 7);
        t = new p4(i2, (byte) 8);
        X = new p4(i2, (byte) 9);
        Y = new p4(i2, (byte) 10);
        Z = new p4(i2, (byte) 11);
        N0 = new p4(i2, (byte) 12);
        O0 = new p4(i2, (byte) 13);
        P0 = new p4(i2, (byte) 14);
        Q0 = new p4(i2, (byte) 15);
        R0 = new p4(i2, (byte) 16);
        S0 = new p4(i2, (byte) 17);
        T0 = new p4(i2, (byte) 18);
        U0 = new p4(i2, (byte) 19);
        V0 = new p4(i2, (byte) 20);
        W0 = new p4(i2, (byte) 21);
        X0 = new p4(i2, (byte) 22);
        Y0 = new p4(i2, (byte) 23);
        Z0 = new p4(i2, (byte) 24);
        a1 = new p4(i2, (byte) 25);
        b1 = new p4(i2, (byte) 26);
        c1 = new p4(i2, (byte) 27);
        d1 = new p4(i2, (byte) 28);
        e1 = new p4(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 1:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 2:
                return null;
            case 3:
                return rih1Var;
            case 4:
                return hcx.c;
            case 5:
                return "Exactly one action text property must be populated.";
            case 6:
                return new a1z("com.spotify.yourupdates.domain.models.ActionType", v80.values());
            case 7:
                return UUID.randomUUID().toString();
            case 8:
                return new tgm((String) null, false, false, false, false, false, true, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -129, 1);
            case 9:
                return Boolean.FALSE;
            case 10:
                return Boolean.TRUE;
            case 11:
                return new nlc0(chc1.a, wgc1.a);
            case 12:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 13:
                return new r36(hs0.a, (byte) 0);
            case 14:
                return new r36(es0.a, (byte) 0);
            case 15:
                return v8r.q(Boolean.TRUE);
            case 16:
                chc1 chc1Var2 = chc1.a;
                return new nlc0(chc1Var2, new r36(chc1Var2, (byte) 0));
            case 17:
                chc1 chc1Var3 = chc1.a;
                return new nlc0(chc1Var3, chc1Var3);
            case 18:
                return new r36(nv0.a, (byte) 0);
            case 19:
                return new r36(jv0.a, (byte) 0);
            case 20:
                return new r36(tv0.a, (byte) 0);
            case 21:
                return new r36(qv0.a, (byte) 0);
            case 22:
                return new nlc0(chc1.a, new r36(iv0.a, (byte) 0));
            case 23:
                return new r36(chc1.a, (byte) 0);
            case 24:
                return new r36(chc1.a, (byte) 0);
            case 25:
                return Float.valueOf(0.25f);
            case 26:
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return v8r.q("");
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return rih1Var;
            default:
                return v8r.q(Boolean.FALSE);
        }
    }
}
