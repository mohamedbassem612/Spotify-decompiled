package p;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s3z extends hab0 implements iu30 {
    public static final s3z N0;
    public static final s3z O0;
    public static final s3z P0;
    public static final s3z Q0;
    public static final s3z R0;
    public static final s3z S0;
    public static final s3z T0;
    public static final s3z U0;
    public static final s3z V0;
    public static final s3z W0;
    public static final s3z X;
    public static final s3z X0;
    public static final s3z Y;
    public static final s3z Y0;
    public static final s3z Z;
    public static final s3z Z0;
    public static final s3z a1;
    public static final s3z b;
    public static final s3z b1;
    public static final s3z c;
    public static final s3z c1;
    public static final s3z d;
    public static final s3z d1;
    public static final s3z e;
    public static final s3z e1;
    public static final s3z f;
    public static final s3z g;
    public static final s3z h;
    public static final s3z i;
    public static final s3z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new s3z(i2, (byte) 0);
        c = new s3z(i2, (byte) 1);
        d = new s3z(i2, (byte) 2);
        e = new s3z(i2, (byte) 3);
        f = new s3z(i2, (byte) 4);
        g = new s3z(i2, (byte) 5);
        h = new s3z(i2, (byte) 6);
        i = new s3z(i2, (byte) 7);
        t = new s3z(i2, (byte) 8);
        X = new s3z(i2, (byte) 9);
        Y = new s3z(i2, (byte) 10);
        Z = new s3z(i2, (byte) 11);
        N0 = new s3z(i2, (byte) 12);
        O0 = new s3z(i2, (byte) 13);
        P0 = new s3z(i2, (byte) 14);
        Q0 = new s3z(i2, (byte) 15);
        R0 = new s3z(i2, (byte) 16);
        S0 = new s3z(i2, (byte) 17);
        T0 = new s3z(i2, (byte) 18);
        U0 = new s3z(i2, (byte) 19);
        V0 = new s3z(i2, (byte) 20);
        W0 = new s3z(i2, (byte) 21);
        X0 = new s3z(i2, (byte) 22);
        Y0 = new s3z(i2, (byte) 23);
        Z0 = new s3z(i2, (byte) 24);
        a1 = new s3z(i2, (byte) 25);
        b1 = new s3z(i2, (byte) 26);
        c1 = new s3z(i2, (byte) 27);
        d1 = new s3z(i2, (byte) 28);
        e1 = new s3z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 2:
                if (!(obj instanceof uld) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uld) obj;
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 5:
                if (!(obj instanceof p6v0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (p6v0) obj;
            case 7:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 9:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 11:
                if (!(obj instanceof l1z) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return (String) obj;
            case 13:
                return (String) obj;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                return (String) obj;
            case 17:
                return (String) obj;
            case 18:
                return (String) obj;
            case 19:
                return (String) obj;
            case 20:
                return (String) obj;
            case 21:
                return (String) obj;
            case 22:
                return j4z.a;
            case 23:
                return (String) obj;
            case 24:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return (String) obj;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            default:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
