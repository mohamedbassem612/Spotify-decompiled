package p;

import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o5v0 extends hab0 implements iu30 {
    public static final o5v0 N0;
    public static final o5v0 O0;
    public static final o5v0 P0;
    public static final o5v0 Q0;
    public static final o5v0 R0;
    public static final o5v0 S0;
    public static final o5v0 T0;
    public static final o5v0 U0;
    public static final o5v0 V0;
    public static final o5v0 W0;
    public static final o5v0 X;
    public static final o5v0 X0;
    public static final o5v0 Y;
    public static final o5v0 Y0;
    public static final o5v0 Z;
    public static final o5v0 Z0;
    public static final o5v0 a1;
    public static final o5v0 b;
    public static final o5v0 b1;
    public static final o5v0 c;
    public static final o5v0 c1;
    public static final o5v0 d;
    public static final o5v0 d1;
    public static final o5v0 e;
    public static final o5v0 e1;
    public static final o5v0 f;
    public static final o5v0 g;
    public static final o5v0 h;
    public static final o5v0 i;
    public static final o5v0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new o5v0(i2, (byte) 0);
        c = new o5v0(i2, (byte) 1);
        d = new o5v0(i2, (byte) 2);
        e = new o5v0(i2, (byte) 3);
        f = new o5v0(i2, (byte) 4);
        g = new o5v0(i2, (byte) 5);
        h = new o5v0(i2, (byte) 6);
        i = new o5v0(i2, (byte) 7);
        t = new o5v0(i2, (byte) 8);
        X = new o5v0(i2, (byte) 9);
        Y = new o5v0(i2, (byte) 10);
        Z = new o5v0(i2, (byte) 11);
        N0 = new o5v0(i2, (byte) 12);
        O0 = new o5v0(i2, (byte) 13);
        P0 = new o5v0(i2, (byte) 14);
        Q0 = new o5v0(i2, (byte) 15);
        R0 = new o5v0(i2, (byte) 16);
        S0 = new o5v0(i2, (byte) 17);
        T0 = new o5v0(i2, (byte) 18);
        U0 = new o5v0(i2, (byte) 19);
        V0 = new o5v0(i2, (byte) 20);
        W0 = new o5v0(i2, (byte) 21);
        X0 = new o5v0(i2, (byte) 22);
        Y0 = new o5v0(i2, (byte) 23);
        Z0 = new o5v0(i2, (byte) 24);
        a1 = new o5v0(i2, (byte) 25);
        b1 = new o5v0(i2, (byte) 26);
        c1 = new o5v0(i2, (byte) 27);
        d1 = new o5v0(i2, (byte) 28);
        e1 = new o5v0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5v0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return new c7v0(1, ((Boolean) obj).booleanValue());
            case 1:
                return new sl1(true);
            case 2:
                return new sl1(true);
            case 3:
                return new k68((String) obj);
            case 4:
                return new euy(false);
            case 5:
                return new nhe();
            case 6:
                return new xsy((String) obj, false);
            case 7:
                return new q491(3, null);
            case 8:
                return new xhl0((yhl0) obj, (byte) 3);
            case 9:
                return new xhl0((yhl0) obj, (byte) 1);
            case 10:
                return new xhl0((yhl0) obj, (byte) 4);
            case 11:
                return new xhl0((yhl0) obj, (byte) 2);
            case 12:
                return new xhl0((yhl0) obj, (byte) 0);
            case 13:
                return new y691(false);
            case 14:
                return new lo51(((Boolean) obj).booleanValue());
            case 15:
                PlayerState playerState = (PlayerState) obj;
                String strH = poo1.H(playerState, ContextTrack$Metadata.KEY_ALBUM_TITLE);
                if (strH.length() == 0) {
                    strH = poo1.A(playerState);
                }
                return new ugc1(strH);
            case 16:
                return ((sxo0) obj).a;
            case 17:
                return w7xVar;
            case 18:
                c7v0 c7v0Var = (c7v0) obj;
                return new b7v0(1, c7v0Var.a, c7v0Var.b);
            case 19:
                dbv0 dbv0Var = (ebv0) obj;
                if (dbv0Var.equals(bbv0.a)) {
                    return nbv0.a;
                }
                if (dbv0Var instanceof cbv0) {
                    return new obv0(((cbv0) dbv0Var).a);
                }
                if (dbv0Var.equals(bbv0.b)) {
                    return nbv0.b;
                }
                if (!(dbv0Var instanceof dbv0)) {
                    eg.o();
                    return null;
                }
                z6x z6xVar = dbv0Var.a;
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                return new rbv0(z6xVar);
            case 20:
                return w7xVar;
            case 21:
                return rih1.a;
            case 22:
                return wxd.a;
            case 23:
                return ((efr0) obj).a;
            case 24:
                return w7xVar;
            case 25:
                afv0 afv0Var = (afv0) obj;
                return new bfv0(afv0Var.b, afv0Var.c, "");
            case 26:
                return ((o3m0) obj).l();
            case 27:
                wiv0 wiv0Var = (wiv0) obj;
                return new yiv0(1, wiv0Var.a, wiv0Var.b);
            case 28:
                return new ajv0(((viv0) obj).a, false, false);
            default:
                return xiv0.a;
        }
    }
}
