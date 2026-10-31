package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cgh extends hab0 implements iu30 {
    public static final cgh N0;
    public static final cgh O0;
    public static final cgh P0;
    public static final cgh Q0;
    public static final cgh R0;
    public static final cgh S0;
    public static final cgh T0;
    public static final cgh U0;
    public static final cgh V0;
    public static final cgh W0;
    public static final cgh X;
    public static final cgh X0;
    public static final cgh Y;
    public static final cgh Y0;
    public static final cgh Z;
    public static final cgh Z0;
    public static final cgh a1;
    public static final cgh b;
    public static final cgh b1;
    public static final cgh c;
    public static final cgh c1;
    public static final cgh d;
    public static final cgh d1;
    public static final cgh e;
    public static final cgh e1;
    public static final cgh f;
    public static final cgh g;
    public static final cgh h;
    public static final cgh i;
    public static final cgh t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cgh(i2, (byte) 0);
        c = new cgh(i2, (byte) 1);
        d = new cgh(i2, (byte) 2);
        e = new cgh(i2, (byte) 3);
        f = new cgh(i2, (byte) 4);
        g = new cgh(i2, (byte) 5);
        h = new cgh(i2, (byte) 6);
        i = new cgh(i2, (byte) 7);
        t = new cgh(i2, (byte) 8);
        X = new cgh(i2, (byte) 9);
        Y = new cgh(i2, (byte) 10);
        Z = new cgh(i2, (byte) 11);
        N0 = new cgh(i2, (byte) 12);
        O0 = new cgh(i2, (byte) 13);
        P0 = new cgh(i2, (byte) 14);
        Q0 = new cgh(i2, (byte) 15);
        R0 = new cgh(i2, (byte) 16);
        S0 = new cgh(i2, (byte) 17);
        T0 = new cgh(i2, (byte) 18);
        U0 = new cgh(i2, (byte) 19);
        V0 = new cgh(i2, (byte) 20);
        W0 = new cgh(i2, (byte) 21);
        X0 = new cgh(i2, (byte) 22);
        Y0 = new cgh(i2, (byte) 23);
        Z0 = new cgh(i2, (byte) 24);
        a1 = new cgh(i2, (byte) 25);
        b1 = new cgh(i2, (byte) 26);
        c1 = new cgh(i2, (byte) 27);
        d1 = new cgh(i2, (byte) 28);
        e1 = new cgh(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgh(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((yfh) obj).b;
            case 1:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 3:
                return Boolean.valueOf(obj instanceof nqm);
            case 4:
                return (k1r) obj;
            case 5:
                return ((khh) obj).c;
            case 6:
                return ((khh) obj).c;
            case 7:
                khh khhVar = (khh) obj;
                mqm mqmVar = new mqm(new kvm(khhVar.b), new lqm(Collections.singletonList(ovm.c), (List) null, (qle1) null, 6));
                if (khhVar.g.equals(yyz0.a)) {
                    return mqmVar;
                }
                return null;
            case 8:
                return new wzk0((i3l0) obj);
            case 9:
                return ((wzk0) obj).e();
            case 10:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 16:
                dhl dhlVar = (dhl) obj;
                xid.r(dhlVar.f, dhlVar.c.f, 0.0f, 6);
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                return ((o3m0) obj).l();
            case 20:
                return new akh();
            case 21:
                return ((zjh) obj).a;
            case 22:
                return ((zjh) obj).a;
            case 23:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 25:
                return Boolean.valueOf(obj instanceof jo70);
            case 26:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return h7p1.A((tlh) obj, 0);
            default:
                return ((mlh) obj).a;
        }
    }
}
