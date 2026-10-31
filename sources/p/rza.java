package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rza extends hab0 implements iu30 {
    public static final rza N0;
    public static final rza O0;
    public static final rza P0;
    public static final rza Q0;
    public static final rza R0;
    public static final rza S0;
    public static final rza T0;
    public static final rza U0;
    public static final rza V0;
    public static final rza W0;
    public static final rza X;
    public static final rza X0;
    public static final rza Y;
    public static final rza Y0;
    public static final rza Z;
    public static final rza Z0;
    public static final rza a1;
    public static final rza b;
    public static final rza b1;
    public static final rza c;
    public static final rza c1;
    public static final rza d;
    public static final rza d1;
    public static final rza e;
    public static final rza e1;
    public static final rza f;
    public static final rza g;
    public static final rza h;
    public static final rza i;
    public static final rza t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rza(i2, (byte) 0);
        c = new rza(i2, (byte) 1);
        d = new rza(i2, (byte) 2);
        e = new rza(i2, (byte) 3);
        f = new rza(i2, (byte) 4);
        g = new rza(i2, (byte) 5);
        h = new rza(i2, (byte) 6);
        i = new rza(i2, (byte) 7);
        t = new rza(i2, (byte) 8);
        X = new rza(i2, (byte) 9);
        Y = new rza(i2, (byte) 10);
        Z = new rza(i2, (byte) 11);
        N0 = new rza(i2, (byte) 12);
        O0 = new rza(i2, (byte) 13);
        P0 = new rza(i2, (byte) 14);
        Q0 = new rza(i2, (byte) 15);
        R0 = new rza(i2, (byte) 16);
        S0 = new rza(i2, (byte) 17);
        T0 = new rza(i2, (byte) 18);
        U0 = new rza(i2, (byte) 19);
        V0 = new rza(i2, (byte) 20);
        W0 = new rza(i2, (byte) 21);
        X0 = new rza(i2, (byte) 22);
        Y0 = new rza(i2, (byte) 23);
        Z0 = new rza(i2, (byte) 24);
        a1 = new rza(i2, (byte) 25);
        b1 = new rza(i2, (byte) 26);
        c1 = new rza(i2, (byte) 27);
        d1 = new rza(i2, (byte) 28);
        e1 = new rza(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rza(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                return ((xza) obj).a;
            case 5:
                return ((xza) obj).b;
            case 6:
                return ((xza) obj).a;
            case 7:
                return ((xza) obj).b;
            case 8:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 16:
                return (qxc0) obj;
            case 17:
                return Boolean.valueOf(obj instanceof qxc0);
            case 18:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 19:
                return new i1b(((cxc0) obj).f.a);
            case 20:
                thc1 thc1Var = (vhc1) obj;
                if (thc1Var instanceof thc1) {
                    Set set = s4b1.f;
                    thc1 thc1Var2 = thc1Var;
                    if (uic.x(thc1Var2.d).c == blc0.ti && u890.j(thc1Var2.j.get("blend.show_recs_icon"), "true")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                return new o1b(((n1b) obj).b, false);
            case 22:
                return d3b.a;
            case 23:
                return "session-".concat(((ea61) obj).a);
            case 24:
                return new bzk0((i3l0) obj);
            case 25:
                return new czk0((i3l0) obj, 2);
            case 26:
                return ((czk0) obj).e();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new dzk0((i3l0) obj);
            case 28:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((dzk0) obj).a, r6h1.c, System.currentTimeMillis());
            default:
                return new ezk0((i3l0) obj);
        }
    }
}
