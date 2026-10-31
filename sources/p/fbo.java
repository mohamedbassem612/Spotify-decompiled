package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbo extends hab0 implements iu30 {
    public static final fbo N0;
    public static final fbo O0;
    public static final fbo P0;
    public static final fbo Q0;
    public static final fbo R0;
    public static final fbo S0;
    public static final fbo T0;
    public static final fbo U0;
    public static final fbo V0;
    public static final fbo W0;
    public static final fbo X;
    public static final fbo X0;
    public static final fbo Y;
    public static final fbo Y0;
    public static final fbo Z;
    public static final fbo Z0;
    public static final fbo a1;
    public static final fbo b;
    public static final fbo b1;
    public static final fbo c;
    public static final fbo c1;
    public static final fbo d;
    public static final fbo d1;
    public static final fbo e;
    public static final fbo e1;
    public static final fbo f;
    public static final fbo g;
    public static final fbo h;
    public static final fbo i;
    public static final fbo t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fbo(i2, (byte) 0);
        c = new fbo(i2, (byte) 1);
        d = new fbo(i2, (byte) 2);
        e = new fbo(i2, (byte) 3);
        f = new fbo(i2, (byte) 4);
        g = new fbo(i2, (byte) 5);
        h = new fbo(i2, (byte) 6);
        i = new fbo(i2, (byte) 7);
        t = new fbo(i2, (byte) 8);
        X = new fbo(i2, (byte) 9);
        Y = new fbo(i2, (byte) 10);
        Z = new fbo(i2, (byte) 11);
        N0 = new fbo(i2, (byte) 12);
        O0 = new fbo(i2, (byte) 13);
        P0 = new fbo(i2, (byte) 14);
        Q0 = new fbo(i2, (byte) 15);
        R0 = new fbo(i2, (byte) 16);
        S0 = new fbo(i2, (byte) 17);
        T0 = new fbo(i2, (byte) 18);
        U0 = new fbo(i2, (byte) 19);
        V0 = new fbo(i2, (byte) 20);
        W0 = new fbo(i2, (byte) 21);
        X0 = new fbo(i2, (byte) 22);
        Y0 = new fbo(i2, (byte) 23);
        Z0 = new fbo(i2, (byte) 24);
        a1 = new fbo(i2, (byte) 25);
        b1 = new fbo(i2, (byte) 26);
        c1 = new fbo(i2, (byte) 27);
        d1 = new fbo(i2, (byte) 28);
        e1 = new fbo(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbo(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((zao) obj).a;
            case 1:
                return (zao) obj;
            case 2:
                return ((vao) obj).a;
            case 3:
                return (vao) obj;
            case 4:
                return ((bbo) obj).a;
            case 5:
                return (bbo) obj;
            case 6:
                return ((xao) obj).a;
            case 7:
                return ((sao) obj).a;
            case 8:
                return (xao) obj;
            case 9:
                return (sao) obj;
            case 10:
                return ((tao) obj).a;
            case 11:
                return (tao) obj;
            case 12:
                return ((yao) obj).a;
            case 13:
                return (yao) obj;
            case 14:
                return ((abo) obj).a;
            case 15:
                return (abo) obj;
            case 16:
                return ((wao) obj).a;
            case 17:
                ((Number) obj).intValue();
                return null;
            case 18:
                ((Number) obj).intValue();
                return null;
            case 19:
                ((Number) obj).intValue();
                return null;
            case 20:
                ((Number) obj).intValue();
                return null;
            case 21:
                ((Number) obj).intValue();
                return null;
            case 22:
                ((Number) obj).intValue();
                return null;
            case 23:
                ((Number) obj).intValue();
                return null;
            case 24:
                ((Number) obj).intValue();
                return null;
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                ((Number) obj).intValue();
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return o9p1.U0;
            case 28:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            default:
                return (String) obj;
        }
    }
}
