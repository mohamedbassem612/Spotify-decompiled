package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.annotation.Annotation;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fsm0 extends hab0 implements Function0 {
    public static final fsm0 N0;
    public static final fsm0 O0;
    public static final fsm0 P0;
    public static final fsm0 Q0;
    public static final fsm0 R0;
    public static final fsm0 S0;
    public static final fsm0 T0;
    public static final fsm0 U0;
    public static final fsm0 V0;
    public static final fsm0 W0;
    public static final fsm0 X;
    public static final fsm0 X0;
    public static final fsm0 Y;
    public static final fsm0 Y0;
    public static final fsm0 Z;
    public static final fsm0 Z0;
    public static final fsm0 a1;
    public static final fsm0 b;
    public static final fsm0 b1;
    public static final fsm0 c;
    public static final fsm0 c1;
    public static final fsm0 d;
    public static final fsm0 d1;
    public static final fsm0 e;
    public static final fsm0 e1;
    public static final fsm0 f;
    public static final fsm0 g;
    public static final fsm0 h;
    public static final fsm0 i;
    public static final fsm0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new fsm0(i2, (byte) 0);
        c = new fsm0(i2, (byte) 1);
        d = new fsm0(i2, (byte) 2);
        e = new fsm0(i2, (byte) 3);
        f = new fsm0(i2, (byte) 4);
        g = new fsm0(i2, (byte) 5);
        h = new fsm0(i2, (byte) 6);
        i = new fsm0(i2, (byte) 7);
        t = new fsm0(i2, (byte) 8);
        X = new fsm0(i2, (byte) 9);
        Y = new fsm0(i2, (byte) 10);
        Z = new fsm0(i2, (byte) 11);
        N0 = new fsm0(i2, (byte) 12);
        O0 = new fsm0(i2, (byte) 13);
        P0 = new fsm0(i2, (byte) 14);
        Q0 = new fsm0(i2, (byte) 15);
        R0 = new fsm0(i2, (byte) 16);
        S0 = new fsm0(i2, (byte) 17);
        T0 = new fsm0(i2, (byte) 18);
        U0 = new fsm0(i2, (byte) 19);
        V0 = new fsm0(i2, (byte) 20);
        W0 = new fsm0(i2, (byte) 21);
        X0 = new fsm0(i2, (byte) 22);
        Y0 = new fsm0(i2, (byte) 23);
        Z0 = new fsm0(i2, (byte) 24);
        a1 = new fsm0(i2, (byte) 25);
        b1 = new fsm0(i2, (byte) 26);
        c1 = new fsm0(i2, (byte) 27);
        d1 = new fsm0(i2, (byte) 28);
        e1 = new fsm0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsm0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : jum0.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 2:
                return "Exactly one option title property must be populated.";
            case 3:
                return "Only one option description property may be populated.";
            case 4:
                return "";
            case 5:
                return WorkRunners.a();
            case 6:
                return WorkRunners.a();
            case 7:
                return rih1Var;
            case 8:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 9:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 10:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, new g371(Collections.singletonList(gan0.a)), (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, true, false, -1077936129, 1);
            case 11:
                return v8r.q(Boolean.FALSE);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return rih1Var;
            case 19:
                return Boolean.FALSE;
            case 20:
                return new xvk0(new yvk0());
            case 21:
                return new ewk0(new gwk0());
            case 22:
                return new fwk0(new gwk0());
            case 23:
                return mxe1.Companion.serializer();
            case 24:
                return vmo0.Companion.serializer();
            case 25:
                return v80.Companion.serializer();
            case 26:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.yourupdates.domain.models.NotificationImage", jd11Var.b(vmo0.class), new tka0[]{jd11Var.b(nmo0.class), jd11Var.b(qmo0.class), jd11Var.b(rmo0.class), jd11Var.b(umo0.class)}, new nma0[]{lmo0.a, omo0.a, new pfp0("com.spotify.yourupdates.domain.models.NotificationImage.UnknownFormat", rmo0.INSTANCE, new Annotation[0]), smo0.a}, new Annotation[0]);
            case 27:
                return new r36(ubi1.a, (byte) 0);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new pfp0("com.spotify.yourupdates.domain.models.NotificationImage.UnknownFormat", rmo0.INSTANCE, new Annotation[0]);
            default:
                return new r36(cno0.a, (byte) 0);
        }
    }
}
