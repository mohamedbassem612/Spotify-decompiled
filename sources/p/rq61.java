package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rq61 extends hab0 implements iu30 {
    public static final rq61 N0;
    public static final rq61 O0;
    public static final rq61 P0;
    public static final rq61 Q0;
    public static final rq61 R0;
    public static final rq61 S0;
    public static final rq61 T0;
    public static final rq61 U0;
    public static final rq61 V0;
    public static final rq61 W0;
    public static final rq61 X;
    public static final rq61 X0;
    public static final rq61 Y;
    public static final rq61 Y0;
    public static final rq61 Z;
    public static final rq61 Z0;
    public static final rq61 a1;
    public static final rq61 b;
    public static final rq61 b1;
    public static final rq61 c;
    public static final rq61 c1;
    public static final rq61 d;
    public static final rq61 d1;
    public static final rq61 e;
    public static final rq61 e1;
    public static final rq61 f;
    public static final rq61 g;
    public static final rq61 h;
    public static final rq61 i;
    public static final rq61 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rq61(i2, (byte) 0);
        c = new rq61(i2, (byte) 1);
        d = new rq61(i2, (byte) 2);
        e = new rq61(i2, (byte) 3);
        f = new rq61(i2, (byte) 4);
        g = new rq61(i2, (byte) 5);
        h = new rq61(i2, (byte) 6);
        i = new rq61(i2, (byte) 7);
        t = new rq61(i2, (byte) 8);
        X = new rq61(i2, (byte) 9);
        Y = new rq61(i2, (byte) 10);
        Z = new rq61(i2, (byte) 11);
        N0 = new rq61(i2, (byte) 12);
        O0 = new rq61(i2, (byte) 13);
        P0 = new rq61(i2, (byte) 14);
        Q0 = new rq61(i2, (byte) 15);
        R0 = new rq61(i2, (byte) 16);
        S0 = new rq61(i2, (byte) 17);
        T0 = new rq61(i2, (byte) 18);
        U0 = new rq61(i2, (byte) 19);
        V0 = new rq61(i2, (byte) 20);
        W0 = new rq61(i2, (byte) 21);
        X0 = new rq61(i2, (byte) 22);
        Y0 = new rq61(i2, (byte) 23);
        Z0 = new rq61(i2, (byte) 24);
        a1 = new rq61(i2, (byte) 25);
        b1 = new rq61(i2, (byte) 26);
        c1 = new rq61(i2, (byte) 27);
        d1 = new rq61(i2, (byte) 28);
        e1 = new rq61(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq61(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof qxc0);
            case 1:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 2:
                return rih1Var;
            case 3:
                return rih1Var;
            case 4:
                return new f0l0((i3l0) obj);
            case 5:
                return rih1Var;
            case 6:
                String strR = rc11.a.b(((mu61) obj).getClass()).r();
                strR.getClass();
                return strR;
            case 7:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                b261.G(e261Var, -100000.0f);
                return rih1Var;
            case 8:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 9:
                return new sy61(false);
            case 10:
                return qy61.a;
            case 11:
                return ((py61) obj).a;
            case 12:
                return ((py61) obj).a;
            case 13:
                if (!(obj instanceof vn71) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vn71) obj;
            case 15:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 17:
                return new k171((j171) obj, false, (l171) null);
            case 18:
                return new b371(false);
            case 19:
                return CardShareConfiguration.u((byte[]) obj);
            case 20:
                return ((CardShareConfiguration) obj).toByteArray();
            case 21:
                return ((s371) obj).a;
            case 22:
                String str = ((s371) obj).a;
                Set set = s4b1.f;
                int iOrdinal = uic.x(str).c.ordinal();
                if (iOrdinal == 844 || iOrdinal == 860) {
                    return str;
                }
                return null;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                return Boolean.valueOf(obj instanceof vn71);
            case 26:
                return (k1r) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 28:
                e261 e261Var2 = (e261) obj;
                b261.d(e261Var2);
                b261.B(e261Var2, "destination.title");
                return rih1Var;
            default:
                return Integer.valueOf(new m15(0, 0, (luk) obj).a());
        }
    }
}
