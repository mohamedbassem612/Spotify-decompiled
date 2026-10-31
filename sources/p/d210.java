package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d210 extends hab0 implements iu30 {
    public static final d210 N0;
    public static final d210 O0;
    public static final d210 P0;
    public static final d210 Q0;
    public static final d210 R0;
    public static final d210 S0;
    public static final d210 T0;
    public static final d210 U0;
    public static final d210 V0;
    public static final d210 W0;
    public static final d210 X;
    public static final d210 X0;
    public static final d210 Y;
    public static final d210 Y0;
    public static final d210 Z;
    public static final d210 Z0;
    public static final d210 a1;
    public static final d210 b;
    public static final d210 b1;
    public static final d210 c;
    public static final d210 c1;
    public static final d210 d;
    public static final d210 d1;
    public static final d210 e;
    public static final d210 e1;
    public static final d210 f;
    public static final d210 g;
    public static final d210 h;
    public static final d210 i;
    public static final d210 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new d210(i2, (byte) 0);
        c = new d210(i2, (byte) 1);
        d = new d210(i2, (byte) 2);
        e = new d210(i2, (byte) 3);
        f = new d210(i2, (byte) 4);
        g = new d210(i2, (byte) 5);
        h = new d210(i2, (byte) 6);
        i = new d210(i2, (byte) 7);
        t = new d210(i2, (byte) 8);
        X = new d210(i2, (byte) 9);
        Y = new d210(i2, (byte) 10);
        Z = new d210(i2, (byte) 11);
        N0 = new d210(i2, (byte) 12);
        O0 = new d210(i2, (byte) 13);
        P0 = new d210(i2, (byte) 14);
        Q0 = new d210(i2, (byte) 15);
        R0 = new d210(i2, (byte) 16);
        S0 = new d210(i2, (byte) 17);
        T0 = new d210(i2, (byte) 18);
        U0 = new d210(i2, (byte) 19);
        V0 = new d210(i2, (byte) 20);
        W0 = new d210(i2, (byte) 21);
        X0 = new d210(i2, (byte) 22);
        Y0 = new d210(i2, (byte) 23);
        Z0 = new d210(i2, (byte) 24);
        a1 = new d210(i2, (byte) 25);
        b1 = new d210(i2, (byte) 26);
        c1 = new d210(i2, (byte) 27);
        d1 = new d210(i2, (byte) 28);
        e1 = new d210(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d210(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                if (!(obj instanceof f7l1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 3:
                if (!(obj instanceof tlr0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (tlr0) obj;
            case 5:
                if (!(obj instanceof v740) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (v740) obj;
            case 7:
                if (!(obj instanceof v6v0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (v6v0) obj;
            case 9:
                if (!(obj instanceof cd8) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cd8) obj;
            case 11:
                if (!(obj instanceof s78) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (s78) obj;
            case 13:
                if (!(obj instanceof zc8) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zc8) obj;
            case 15:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                return (k1r) obj;
            case 17:
                return Boolean.valueOf(obj instanceof ma8);
            case 18:
                return (k1r) obj;
            case 19:
                return Boolean.valueOf(obj instanceof jo70);
            case 20:
                return (k1r) obj;
            case 21:
                return Boolean.valueOf(obj instanceof r9v0);
            case 22:
                return (k1r) obj;
            case 23:
                return Boolean.valueOf(obj instanceof hll);
            case 24:
                return (k1r) obj;
            case 25:
                return Boolean.valueOf(obj instanceof xlw0);
            case 26:
                return Boolean.valueOf(obj instanceof va81);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (k1r) obj;
            case 28:
                return (k1r) obj;
            default:
                return Boolean.valueOf(obj instanceof iam);
        }
    }
}
