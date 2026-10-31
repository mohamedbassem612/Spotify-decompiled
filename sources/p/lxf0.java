package p;

import android.graphics.Paint;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lxf0 extends hab0 implements Function0 {
    public static final lxf0 N0;
    public static final lxf0 O0;
    public static final lxf0 P0;
    public static final lxf0 Q0;
    public static final lxf0 R0;
    public static final lxf0 S0;
    public static final lxf0 T0;
    public static final lxf0 U0;
    public static final lxf0 V0;
    public static final lxf0 W0;
    public static final lxf0 X;
    public static final lxf0 X0;
    public static final lxf0 Y;
    public static final lxf0 Y0;
    public static final lxf0 Z;
    public static final lxf0 Z0;
    public static final lxf0 a1;
    public static final lxf0 b;
    public static final lxf0 b1;
    public static final lxf0 c;
    public static final lxf0 c1;
    public static final lxf0 d;
    public static final lxf0 d1;
    public static final lxf0 e;
    public static final lxf0 e1;
    public static final lxf0 f;
    public static final lxf0 g;
    public static final lxf0 h;
    public static final lxf0 i;
    public static final lxf0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new lxf0(i2, (byte) 0);
        c = new lxf0(i2, (byte) 1);
        d = new lxf0(i2, (byte) 2);
        e = new lxf0(i2, (byte) 3);
        f = new lxf0(i2, (byte) 4);
        g = new lxf0(i2, (byte) 5);
        h = new lxf0(i2, (byte) 6);
        i = new lxf0(i2, (byte) 7);
        t = new lxf0(i2, (byte) 8);
        X = new lxf0(i2, (byte) 9);
        Y = new lxf0(i2, (byte) 10);
        Z = new lxf0(i2, (byte) 11);
        N0 = new lxf0(i2, (byte) 12);
        O0 = new lxf0(i2, (byte) 13);
        P0 = new lxf0(i2, (byte) 14);
        Q0 = new lxf0(i2, (byte) 15);
        R0 = new lxf0(i2, (byte) 16);
        S0 = new lxf0(i2, (byte) 17);
        T0 = new lxf0(i2, (byte) 18);
        U0 = new lxf0(i2, (byte) 19);
        V0 = new lxf0(i2, (byte) 20);
        W0 = new lxf0(i2, (byte) 21);
        X0 = new lxf0(i2, (byte) 22);
        Y0 = new lxf0(i2, (byte) 23);
        Z0 = new lxf0(i2, (byte) 24);
        a1 = new lxf0(i2, (byte) 25);
        b1 = new lxf0(i2, (byte) 26);
        c1 = new lxf0(i2, (byte) 27);
        d1 = new lxf0(i2, (byte) 28);
        e1 = new lxf0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxf0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new qyl0(r6h1.c);
            case 1:
                return null;
            case 2:
                return v8r.q(u0g0.b);
            case 3:
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.u();
                sku0VarP.k0();
                hru0VarS.x(sku0VarP);
                return hru0VarS.build();
            case 4:
                return v8r.q((Object) null);
            case 5:
                return rih1Var;
            case 6:
                return g;
            case 7:
                return Boolean.FALSE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return null;
            case 10:
                return new p3v(Float.NaN);
            case 11:
                return new p3v(0.0f);
            case 12:
                return Boolean.FALSE;
            case 13:
                return null;
            case 14:
                return ovt.Companion.serializer();
            case 15:
                return lz3.Companion.serializer();
            case 16:
                return new Paint(1);
            case 17:
                return new Paint(1);
            case 18:
                return new Paint(1);
            case 19:
                return v8r.q(Boolean.FALSE);
            case 20:
                return v8r.q(Boolean.FALSE);
            case 21:
                return v8r.q(Boolean.FALSE);
            case 22:
                return v8r.q((Object) null);
            case 23:
            case 24:
            case 25:
            case 26:
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 28:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            default:
                return null;
        }
    }
}
