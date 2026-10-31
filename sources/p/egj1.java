package p;

import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class egj1 extends hab0 implements iu30 {
    public static final egj1 N0;
    public static final egj1 O0;
    public static final egj1 P0;
    public static final egj1 Q0;
    public static final egj1 R0;
    public static final egj1 S0;
    public static final egj1 T0;
    public static final egj1 U0;
    public static final egj1 V0;
    public static final egj1 W0;
    public static final egj1 X;
    public static final egj1 X0;
    public static final egj1 Y;
    public static final egj1 Y0;
    public static final egj1 Z;
    public static final egj1 Z0;
    public static final egj1 a1;
    public static final egj1 b;
    public static final egj1 b1;
    public static final egj1 c;
    public static final egj1 c1;
    public static final egj1 d;
    public static final egj1 d1;
    public static final egj1 e;
    public static final egj1 e1;
    public static final egj1 f;
    public static final egj1 g;
    public static final egj1 h;
    public static final egj1 i;
    public static final egj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new egj1(i2, (byte) 0);
        c = new egj1(i2, (byte) 1);
        d = new egj1(i2, (byte) 2);
        e = new egj1(i2, (byte) 3);
        f = new egj1(i2, (byte) 4);
        g = new egj1(i2, (byte) 5);
        h = new egj1(i2, (byte) 6);
        i = new egj1(i2, (byte) 7);
        t = new egj1(i2, (byte) 8);
        X = new egj1(i2, (byte) 9);
        Y = new egj1(i2, (byte) 10);
        Z = new egj1(i2, (byte) 11);
        N0 = new egj1(i2, (byte) 12);
        O0 = new egj1(i2, (byte) 13);
        P0 = new egj1(i2, (byte) 14);
        Q0 = new egj1(i2, (byte) 15);
        R0 = new egj1(i2, (byte) 16);
        S0 = new egj1(i2, (byte) 17);
        T0 = new egj1(i2, (byte) 18);
        U0 = new egj1(i2, (byte) 19);
        V0 = new egj1(i2, (byte) 20);
        W0 = new egj1(i2, (byte) 21);
        X0 = new egj1(i2, (byte) 22);
        Y0 = new egj1(i2, (byte) 23);
        Z0 = new egj1(i2, (byte) 24);
        a1 = new egj1(i2, (byte) 25);
        b1 = new egj1(i2, (byte) 26);
        c1 = new egj1(i2, (byte) 27);
        d1 = new egj1(i2, (byte) 28);
        e1 = new egj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((ufj1) obj).a;
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
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
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
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof jo70);
            case 10:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 11:
                qhj1 qhj1Var = (qhj1) obj;
                return new rhj1(qhj1Var.a, qhj1Var.b, qhj1Var.c, qhj1Var.d, qhj1Var.e, qhj1Var.f, qhj1Var.g, qhj1Var.h, qhj1Var.i, qhj1Var.j, (phj1) null, 3072);
            case 12:
                u771 u771Var = ((g271) obj).a;
                c871 c871Var = u771Var.b.b;
                if (c871Var instanceof shj1) {
                    shj1 shj1Var = (shj1) c871Var;
                    return new qhj1(shj1Var.h, shj1Var.i, shj1Var.a, shj1Var.b, shj1Var.c, shj1Var.d, shj1Var.e, u771Var, shj1Var.f, shj1Var.g);
                }
                eg.m("Check failed.");
                return null;
            case 13:
                return new vhj1(((uhj1) obj).a, false);
            case 14:
                return (qxc0) obj;
            case 15:
                return Boolean.valueOf(obj instanceof qxc0);
            case 16:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 17:
                return rih1Var;
            case 18:
                return new njj1((String) null, false);
            case 19:
                ((qtr) obj).b(new gp9(5, (lnm) null, (byte) 10));
                return rih1Var;
            case 20:
                return new jkj1("");
            case 21:
                return new mbj1((ji0) o7h.q0((List) obj));
            case 22:
                ji0 ji0Var = (ji0) o7h.q0((List) obj);
                return new taj1(ji0Var, ji0Var.b, new raj1(ji0Var.c, ji0Var.S0, ji0Var.U0), new saj1(ji0Var.R0, ji0Var), ji0Var.g.b, ji0Var.i, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a);
            case 23:
                return rih1Var;
            case 24:
                return new rxc0((String) obj);
            case 25:
                return (qxc0) obj;
            case 26:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 28:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
        }
    }
}
