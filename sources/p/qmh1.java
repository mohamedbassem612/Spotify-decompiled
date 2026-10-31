package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qmh1 extends hab0 implements iu30 {
    public static final qmh1 N0;
    public static final qmh1 O0;
    public static final qmh1 P0;
    public static final qmh1 Q0;
    public static final qmh1 R0;
    public static final qmh1 S0;
    public static final qmh1 T0;
    public static final qmh1 U0;
    public static final qmh1 V0;
    public static final qmh1 W0;
    public static final qmh1 X;
    public static final qmh1 X0;
    public static final qmh1 Y;
    public static final qmh1 Y0;
    public static final qmh1 Z;
    public static final qmh1 Z0;
    public static final qmh1 a1;
    public static final qmh1 b;
    public static final qmh1 b1;
    public static final qmh1 c;
    public static final qmh1 c1;
    public static final qmh1 d;
    public static final qmh1 d1;
    public static final qmh1 e;
    public static final qmh1 e1;
    public static final qmh1 f;
    public static final qmh1 g;
    public static final qmh1 h;
    public static final qmh1 i;
    public static final qmh1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qmh1(i2, (byte) 0);
        c = new qmh1(i2, (byte) 1);
        d = new qmh1(i2, (byte) 2);
        e = new qmh1(i2, (byte) 3);
        f = new qmh1(i2, (byte) 4);
        g = new qmh1(i2, (byte) 5);
        h = new qmh1(i2, (byte) 6);
        i = new qmh1(i2, (byte) 7);
        t = new qmh1(i2, (byte) 8);
        X = new qmh1(i2, (byte) 9);
        Y = new qmh1(i2, (byte) 10);
        Z = new qmh1(i2, (byte) 11);
        N0 = new qmh1(i2, (byte) 12);
        O0 = new qmh1(i2, (byte) 13);
        P0 = new qmh1(i2, (byte) 14);
        Q0 = new qmh1(i2, (byte) 15);
        R0 = new qmh1(i2, (byte) 16);
        S0 = new qmh1(i2, (byte) 17);
        T0 = new qmh1(i2, (byte) 18);
        U0 = new qmh1(i2, (byte) 19);
        V0 = new qmh1(i2, (byte) 20);
        W0 = new qmh1(i2, (byte) 21);
        X0 = new qmh1(i2, (byte) 22);
        Y0 = new qmh1(i2, (byte) 23);
        Z0 = new qmh1(i2, (byte) 24);
        a1 = new qmh1(i2, (byte) 25);
        b1 = new qmh1(i2, (byte) 26);
        c1 = new qmh1(i2, (byte) 27);
        d1 = new qmh1(i2, (byte) 28);
        e1 = new qmh1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmh1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (myv0) obj;
            case 1:
                return ((lnh1) obj).a;
            case 2:
                return ((lnh1) obj).a;
            case 3:
                return ((lnh1) obj).a;
            case 4:
                return ((lnh1) obj).a;
            case 5:
                return ((lnh1) obj).a;
            case 6:
                return Boolean.valueOf((obj instanceof zd3) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zd3) obj;
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof xkk1);
            case 11:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 12:
                return Boolean.valueOf(obj instanceof zoy0);
            case 13:
                if (obj != null) {
                    return (zoy0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.publishingmetadatatrait.PublishingMetadataTrait");
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof iam);
            case 15:
                if (obj != null) {
                    return (iam) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.granulartraits.contenttypetrait.ContentTypeTrait");
                return null;
            case 16:
                if (((bs11) obj).equals(bs11.a)) {
                    return knh1.a;
                }
                eg.o();
                return null;
            case 17:
                return new lnh1(((nfr0) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new lnh1(((nfr0) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Collections.singleton(((nfr0) obj).a);
            case 20:
                b261.c((e261) obj);
                return rih1Var;
            case 21:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 22:
                tph1 tph1Var = (tph1) obj;
                return new uph1(tph1Var.a, tph1Var.b, tph1Var.c);
            case 23:
                ((qtr) obj).b(new eri0(5, lnmVar, (byte) 20));
                return rih1Var;
            case 24:
                return ((nwl0) obj).a(wzu.a);
            case 25:
                return new owl0(new opl0(6, (r6h1) obj, (byte) 6));
            case 26:
                owl0 owl0Var = (owl0) obj;
                x6h1 x6h1VarC = owl0Var.a.c();
                x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1VarA, owl0Var.b.b, System.currentTimeMillis());
            case 27:
                return new yqh1((uqo) obj, null, new gax(2131961690, (String) null));
            case 28:
                return new i46(((mq70) obj).a, (byte) 1);
            default:
                return (String) obj;
        }
    }
}
