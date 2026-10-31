package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hz51 extends hab0 implements iu30 {
    public static final hz51 N0;
    public static final hz51 O0;
    public static final hz51 P0;
    public static final hz51 Q0;
    public static final hz51 R0;
    public static final hz51 S0;
    public static final hz51 T0;
    public static final hz51 U0;
    public static final hz51 V0;
    public static final hz51 W0;
    public static final hz51 X;
    public static final hz51 X0;
    public static final hz51 Y;
    public static final hz51 Y0;
    public static final hz51 Z;
    public static final hz51 Z0;
    public static final hz51 a1;
    public static final hz51 b;
    public static final hz51 b1;
    public static final hz51 c;
    public static final hz51 c1;
    public static final hz51 d;
    public static final hz51 d1;
    public static final hz51 e;
    public static final hz51 e1;
    public static final hz51 f;
    public static final hz51 g;
    public static final hz51 h;
    public static final hz51 i;
    public static final hz51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hz51(i2, (byte) 0);
        c = new hz51(i2, (byte) 1);
        d = new hz51(i2, (byte) 2);
        e = new hz51(i2, (byte) 3);
        f = new hz51(i2, (byte) 4);
        g = new hz51(i2, (byte) 5);
        h = new hz51(i2, (byte) 6);
        i = new hz51(i2, (byte) 7);
        t = new hz51(i2, (byte) 8);
        X = new hz51(i2, (byte) 9);
        Y = new hz51(i2, (byte) 10);
        Z = new hz51(i2, (byte) 11);
        N0 = new hz51(i2, (byte) 12);
        O0 = new hz51(i2, (byte) 13);
        P0 = new hz51(i2, (byte) 14);
        Q0 = new hz51(i2, (byte) 15);
        R0 = new hz51(i2, (byte) 16);
        S0 = new hz51(i2, (byte) 17);
        T0 = new hz51(i2, (byte) 18);
        U0 = new hz51(i2, (byte) 19);
        V0 = new hz51(i2, (byte) 20);
        W0 = new hz51(i2, (byte) 21);
        X0 = new hz51(i2, (byte) 22);
        Y0 = new hz51(i2, (byte) 23);
        Z0 = new hz51(i2, (byte) 24);
        a1 = new hz51(i2, (byte) 25);
        b1 = new hz51(i2, (byte) 26);
        c1 = new hz51(i2, (byte) 27);
        d1 = new hz51(i2, (byte) 28);
        e1 = new hz51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hz51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof gz51) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gz51) obj;
            case 2:
                return rih1Var;
            case 3:
                gz51 gz51Var = (gz51) obj;
                return gz51Var == null ? gz51.c : gz51Var;
            case 4:
                b061 b061Var = (b061) obj;
                return mno1.h(new mmr0[]{new mmr0("selectionBundle", new mz51(b061Var.h, b061Var.i))});
            case 5:
                ((a7m0) obj).a = u361.a;
                return rih1Var;
            case 6:
                return "country_code";
            case 7:
                return (String) obj;
            case 8:
                return Boolean.valueOf(obj instanceof nyb1);
            case 9:
                if (obj != null) {
                    return (nyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof String);
            case 11:
                if (obj != null) {
                    return (String) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.String");
                return null;
            case 12:
                return new myb1((String) obj);
            case 13:
                return ((nyb1) obj).a;
            case 14:
                return "country_code";
            case 15:
                return (String) obj;
            case 16:
                return Boolean.valueOf(obj instanceof String);
            case 17:
                if (obj != null) {
                    return (String) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.String");
                return null;
            case 18:
                return rmb1.a;
            case 19:
                return Collections.singletonList(((k761) obj).a);
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
                if (!(obj instanceof zc8) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zc8) obj;
            case 24:
                return Boolean.valueOf(obj instanceof jo70);
            case 25:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 26:
                return (String) obj;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
