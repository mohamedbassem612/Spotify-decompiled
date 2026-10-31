package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ou1 extends hab0 implements Function0 {
    public static final ou1 N0;
    public static final ou1 O0;
    public static final ou1 P0;
    public static final ou1 Q0;
    public static final ou1 R0;
    public static final ou1 S0;
    public static final ou1 T0;
    public static final ou1 U0;
    public static final ou1 V0;
    public static final ou1 W0;
    public static final ou1 X;
    public static final ou1 X0;
    public static final ou1 Y;
    public static final ou1 Y0;
    public static final ou1 Z;
    public static final ou1 Z0;
    public static final ou1 a1;
    public static final ou1 b;
    public static final ou1 b1;
    public static final ou1 c;
    public static final ou1 c1;
    public static final ou1 d;
    public static final ou1 d1;
    public static final ou1 e;
    public static final ou1 e1;
    public static final ou1 f;
    public static final ou1 g;
    public static final ou1 h;
    public static final ou1 i;
    public static final ou1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new ou1(i2, (byte) 0);
        c = new ou1(i2, (byte) 1);
        d = new ou1(i2, (byte) 2);
        e = new ou1(i2, (byte) 3);
        f = new ou1(i2, (byte) 4);
        g = new ou1(i2, (byte) 5);
        h = new ou1(i2, (byte) 6);
        i = new ou1(i2, (byte) 7);
        t = new ou1(i2, (byte) 8);
        X = new ou1(i2, (byte) 9);
        Y = new ou1(i2, (byte) 10);
        Z = new ou1(i2, (byte) 11);
        N0 = new ou1(i2, (byte) 12);
        O0 = new ou1(i2, (byte) 13);
        P0 = new ou1(i2, (byte) 14);
        Q0 = new ou1(i2, (byte) 15);
        R0 = new ou1(i2, (byte) 16);
        S0 = new ou1(i2, (byte) 17);
        T0 = new ou1(i2, (byte) 18);
        U0 = new ou1(i2, (byte) 19);
        V0 = new ou1(i2, (byte) 20);
        W0 = new ou1(i2, (byte) 21);
        X0 = new ou1(i2, (byte) 22);
        Y0 = new ou1(i2, (byte) 23);
        Z0 = new ou1(i2, (byte) 24);
        a1 = new ou1(i2, (byte) 25);
        b1 = new ou1(i2, (byte) 26);
        c1 = new ou1(i2, (byte) 27);
        d1 = new ou1(i2, (byte) 28);
        e1 = new ou1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou1(int i2, byte b2) {
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
                return v8r.q(Boolean.FALSE);
            case 3:
                return v8r.q(Boolean.FALSE);
            case 4:
            case 5:
                return rih1Var;
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 7:
            case 8:
                return rih1Var;
            case 9:
                return Float.valueOf(-0.7853982f);
            case 10:
                return new m511(3, 1000.0f, 1000.0f);
            case 11:
                return rih1Var;
            case 12:
                return v8r.q((Object) null);
            case 13:
                return v8r.q(Boolean.FALSE);
            case 14:
                return v8r.q((Object) null);
            case 15:
                return rih1Var;
            case 16:
                return nik1.b2.a;
            case 17:
                return nik1.b2.a;
            case 18:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : bh3.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 19:
                a3i1 a3i1Var2 = new a3i1();
                for (t2i1 t2i1Var2 : jy3.b) {
                    a3i1Var2.b(t2i1Var2.a, t2i1Var2.b);
                }
                return a3i1Var2;
            case 20:
                return new a1z("com.spotify.puffin.core.domain.AmbiguousType", lz3.values());
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 22:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 23:
                return new r36(chc1.a, (byte) 1);
            case 24:
                return new r36(chc1.a, (byte) 1);
            case 25:
                fns fnsVar = igu.a;
                return smo1.e(flo1.l(b3s.c, new z8n("AndroidTimeKeeper")));
            case 26:
                return rih1Var;
            case 27:
                return new drr0(0.0f);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Float.valueOf(1.0f);
            default:
                return v8r.q(Boolean.FALSE);
        }
    }
}
