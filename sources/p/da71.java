package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class da71 extends hab0 implements Function0 {
    public static final da71 N0;
    public static final da71 O0;
    public static final da71 P0;
    public static final da71 Q0;
    public static final da71 R0;
    public static final da71 S0;
    public static final da71 T0;
    public static final da71 U0;
    public static final da71 V0;
    public static final da71 W0;
    public static final da71 X;
    public static final da71 X0;
    public static final da71 Y;
    public static final da71 Y0;
    public static final da71 Z;
    public static final da71 Z0;
    public static final da71 a1;
    public static final da71 b;
    public static final da71 b1;
    public static final da71 c;
    public static final da71 c1;
    public static final da71 d;
    public static final da71 d1;
    public static final da71 e;
    public static final da71 e1;
    public static final da71 f;
    public static final da71 g;
    public static final da71 h;
    public static final da71 i;
    public static final da71 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new da71(i2, (byte) 0);
        c = new da71(i2, (byte) 1);
        d = new da71(i2, (byte) 2);
        e = new da71(i2, (byte) 3);
        f = new da71(i2, (byte) 4);
        g = new da71(i2, (byte) 5);
        h = new da71(i2, (byte) 6);
        i = new da71(i2, (byte) 7);
        t = new da71(i2, (byte) 8);
        X = new da71(i2, (byte) 9);
        Y = new da71(i2, (byte) 10);
        Z = new da71(i2, (byte) 11);
        N0 = new da71(i2, (byte) 12);
        O0 = new da71(i2, (byte) 13);
        P0 = new da71(i2, (byte) 14);
        Q0 = new da71(i2, (byte) 15);
        R0 = new da71(i2, (byte) 16);
        S0 = new da71(i2, (byte) 17);
        T0 = new da71(i2, (byte) 18);
        U0 = new da71(i2, (byte) 19);
        V0 = new da71(i2, (byte) 20);
        W0 = new da71(i2, (byte) 21);
        X0 = new da71(i2, (byte) 22);
        Y0 = new da71(i2, (byte) 23);
        Z0 = new da71(i2, (byte) 24);
        a1 = new da71(i2, (byte) 25);
        b1 = new da71(i2, (byte) 26);
        c1 = new da71(i2, (byte) 27);
        d1 = new da71(i2, (byte) 28);
        e1 = new da71(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da71(int i2, byte b2) {
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
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 2:
            case 3:
                return rih1Var;
            case 4:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 5:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 6:
                return rih1Var;
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 8:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 9:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 10:
                WorkRunners.MyThreadFactory myThreadFactory7 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 11:
                return rih1Var;
            case 12:
                return v8r.q("");
            case 13:
                r6h1 r6h1Var = r6h1.c;
                return new uxl0();
            case 14:
                return new qyl0(r6h1.c);
            case 15:
            case 16:
                return rih1Var;
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory8 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 18:
                WorkRunners.MyThreadFactory myThreadFactory9 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 19:
                return null;
            case 20:
                return new nlc0(chc1.a, eu71.a);
            case 21:
                return null;
            case 22:
                return UUID.randomUUID().toString();
            case 23:
                return new e481(new t881(new y381((e3z) null, new x381((List) null, Collections.singletonMap("formatListAttributes", Boolean.TRUE)), 5)), (nia1) null, (nqz0) null, 262141);
            case 24:
                return Boolean.TRUE;
            case 25:
            case 26:
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                return new e27((byte) 5);
            default:
                return rih1Var;
        }
    }
}
