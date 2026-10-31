package p;

import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ny00 extends hab0 implements Function0 {
    public static final ny00 N0;
    public static final ny00 O0;
    public static final ny00 P0;
    public static final ny00 Q0;
    public static final ny00 R0;
    public static final ny00 S0;
    public static final ny00 T0;
    public static final ny00 U0;
    public static final ny00 V0;
    public static final ny00 W0;
    public static final ny00 X;
    public static final ny00 X0;
    public static final ny00 Y;
    public static final ny00 Y0;
    public static final ny00 Z;
    public static final ny00 Z0;
    public static final ny00 a1;
    public static final ny00 b;
    public static final ny00 b1;
    public static final ny00 c;
    public static final ny00 c1;
    public static final ny00 d;
    public static final ny00 d1;
    public static final ny00 e;
    public static final ny00 e1;
    public static final ny00 f;
    public static final ny00 g;
    public static final ny00 h;
    public static final ny00 i;
    public static final ny00 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new ny00(i2, (byte) 0);
        c = new ny00(i2, (byte) 1);
        d = new ny00(i2, (byte) 2);
        e = new ny00(i2, (byte) 3);
        f = new ny00(i2, (byte) 4);
        g = new ny00(i2, (byte) 5);
        h = new ny00(i2, (byte) 6);
        i = new ny00(i2, (byte) 7);
        t = new ny00(i2, (byte) 8);
        X = new ny00(i2, (byte) 9);
        Y = new ny00(i2, (byte) 10);
        Z = new ny00(i2, (byte) 11);
        N0 = new ny00(i2, (byte) 12);
        O0 = new ny00(i2, (byte) 13);
        P0 = new ny00(i2, (byte) 14);
        Q0 = new ny00(i2, (byte) 15);
        R0 = new ny00(i2, (byte) 16);
        S0 = new ny00(i2, (byte) 17);
        T0 = new ny00(i2, (byte) 18);
        U0 = new ny00(i2, (byte) 19);
        V0 = new ny00(i2, (byte) 20);
        W0 = new ny00(i2, (byte) 21);
        X0 = new ny00(i2, (byte) 22);
        Y0 = new ny00(i2, (byte) 23);
        Z0 = new ny00(i2, (byte) 24);
        a1 = new ny00(i2, (byte) 25);
        b1 = new ny00(i2, (byte) 26);
        c1 = new ny00(i2, (byte) 27);
        d1 = new ny00(i2, (byte) 28);
        e1 = new ny00(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny00(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(chc1.a, (byte) 1);
            case 1:
                return new r36(slu0.a, (byte) 0);
            case 2:
                return new r36(n510.a, (byte) 0);
            case 3:
                return new r36(chc1.a, (byte) 0);
            case 4:
                return new r36(r510.a, (byte) 0);
            case 5:
                return new nlc0(chc1.a, hga0.a);
            case 6:
                return new r36(ca20.a, (byte) 0);
            case 7:
                return new r36(ca20.a, (byte) 0);
            case 8:
                return new PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);
            case 9:
                return v8r.q(Boolean.FALSE);
            case 10:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : pk10.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 11:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            case 12:
                return v8r.q((Object) null);
            case 13:
                return new r36(fiy0.a, (byte) 0);
            case 14:
                return new r36(yhy0.a, (byte) 0);
            case 15:
                return v8r.q(Boolean.FALSE);
            case 16:
                return new r36(new r36(chc1.a, (byte) 0), (byte) 0);
            case 17:
                return new r36(wr80.a, (byte) 0);
            case 18:
                return new r36(qb20.a, (byte) 0);
            case 19:
                return new r36(hb20.a, (byte) 0);
            case 20:
                return new r36(eb20.a, (byte) 0);
            case 21:
                return rih1Var;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
            case 25:
            case 26:
                return rih1Var;
            case 27:
                return Boolean.TRUE;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new dc30(null, 31);
            default:
                try {
                    return typ0.a;
                } catch (LinkageError unused) {
                    return new azp0().t;
                }
        }
    }
}
