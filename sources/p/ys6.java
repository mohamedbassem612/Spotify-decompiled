package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ys6 extends hab0 implements iu30 {
    public static final ys6 N0;
    public static final ys6 O0;
    public static final ys6 P0;
    public static final ys6 Q0;
    public static final ys6 R0;
    public static final ys6 S0;
    public static final ys6 T0;
    public static final ys6 U0;
    public static final ys6 V0;
    public static final ys6 W0;
    public static final ys6 X;
    public static final ys6 X0;
    public static final ys6 Y;
    public static final ys6 Y0;
    public static final ys6 Z;
    public static final ys6 Z0;
    public static final ys6 a1;
    public static final ys6 b;
    public static final ys6 b1;
    public static final ys6 c;
    public static final ys6 c1;
    public static final ys6 d;
    public static final ys6 d1;
    public static final ys6 e;
    public static final ys6 e1;
    public static final ys6 f;
    public static final ys6 g;
    public static final ys6 h;
    public static final ys6 i;
    public static final ys6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ys6(i2, (byte) 0);
        c = new ys6(i2, (byte) 1);
        d = new ys6(i2, (byte) 2);
        e = new ys6(i2, (byte) 3);
        f = new ys6(i2, (byte) 4);
        g = new ys6(i2, (byte) 5);
        h = new ys6(i2, (byte) 6);
        i = new ys6(i2, (byte) 7);
        t = new ys6(i2, (byte) 8);
        X = new ys6(i2, (byte) 9);
        Y = new ys6(i2, (byte) 10);
        Z = new ys6(i2, (byte) 11);
        N0 = new ys6(i2, (byte) 12);
        O0 = new ys6(i2, (byte) 13);
        P0 = new ys6(i2, (byte) 14);
        Q0 = new ys6(i2, (byte) 15);
        R0 = new ys6(i2, (byte) 16);
        S0 = new ys6(i2, (byte) 17);
        T0 = new ys6(i2, (byte) 18);
        U0 = new ys6(i2, (byte) 19);
        V0 = new ys6(i2, (byte) 20);
        W0 = new ys6(i2, (byte) 21);
        X0 = new ys6(i2, (byte) 22);
        Y0 = new ys6(i2, (byte) 23);
        Z0 = new ys6(i2, (byte) 24);
        a1 = new ys6(i2, (byte) 25);
        b1 = new ys6(i2, (byte) 26);
        c1 = new ys6(i2, (byte) 27);
        d1 = new ys6(i2, (byte) 28);
        e1 = new ys6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        yqc0 yqc0Var = yqc0.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return (String) obj;
            case 1:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l((String) obj)), (c3d0) null, Collections.singleton(yqc0Var), (mqz0) null, 10);
            case 2:
                return new qvc0(l1d.m("spotify:list:popular-release-segments:artist_", blo1.l((String) obj)), (c3d0) null, Collections.singleton(yqc0Var), (mqz0) null, 10);
            case 3:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 5:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 7:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 9:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 11:
                return rih1Var;
            case 12:
                return ((pu6) obj).d();
            case 13:
                return (String) obj;
            case 14:
                return (jo70) obj;
            case 15:
                y0r y0rVar = (y0r) obj;
                return new dr11(y0rVar.a, y0rVar.d, y0rVar.e);
            case 16:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 18:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 20:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 22:
                return Boolean.valueOf(obj instanceof Boolean);
            case 23:
                if (obj != null) {
                    return (Boolean) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            case 24:
                return Boolean.valueOf(obj instanceof jo70);
            case 25:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 26:
                return "type";
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return "streaming-rules";
            case 28:
                return rih1Var;
            default:
                return (String) obj;
        }
    }
}
