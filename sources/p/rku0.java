package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rku0 extends hab0 implements iu30 {
    public static final rku0 N0;
    public static final rku0 O0;
    public static final rku0 P0;
    public static final rku0 Q0;
    public static final rku0 R0;
    public static final rku0 S0;
    public static final rku0 T0;
    public static final rku0 U0;
    public static final rku0 V0;
    public static final rku0 W0;
    public static final rku0 X;
    public static final rku0 X0;
    public static final rku0 Y;
    public static final rku0 Y0;
    public static final rku0 Z;
    public static final rku0 Z0;
    public static final rku0 a1;
    public static final rku0 b;
    public static final rku0 b1;
    public static final rku0 c;
    public static final rku0 c1;
    public static final rku0 d;
    public static final rku0 d1;
    public static final rku0 e;
    public static final rku0 e1;
    public static final rku0 f;
    public static final rku0 g;
    public static final rku0 h;
    public static final rku0 i;
    public static final rku0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rku0(i2, (byte) 0);
        c = new rku0(i2, (byte) 1);
        d = new rku0(i2, (byte) 2);
        e = new rku0(i2, (byte) 3);
        f = new rku0(i2, (byte) 4);
        g = new rku0(i2, (byte) 5);
        h = new rku0(i2, (byte) 6);
        i = new rku0(i2, (byte) 7);
        t = new rku0(i2, (byte) 8);
        X = new rku0(i2, (byte) 9);
        Y = new rku0(i2, (byte) 10);
        Z = new rku0(i2, (byte) 11);
        N0 = new rku0(i2, (byte) 12);
        O0 = new rku0(i2, (byte) 13);
        P0 = new rku0(i2, (byte) 14);
        Q0 = new rku0(i2, (byte) 15);
        R0 = new rku0(i2, (byte) 16);
        S0 = new rku0(i2, (byte) 17);
        T0 = new rku0(i2, (byte) 18);
        U0 = new rku0(i2, (byte) 19);
        V0 = new rku0(i2, (byte) 20);
        W0 = new rku0(i2, (byte) 21);
        X0 = new rku0(i2, (byte) 22);
        Y0 = new rku0(i2, (byte) 23);
        Z0 = new rku0(i2, (byte) 24);
        a1 = new rku0(i2, (byte) 25);
        b1 = new rku0(i2, (byte) 26);
        c1 = new rku0(i2, (byte) 27);
        d1 = new rku0(i2, (byte) 28);
        e1 = new rku0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rku0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        String strB = null;
        switch (b2) {
            case 0:
                return ((z6h) obj).getEntityUri();
            case 1:
                return ((zul1) obj).getEntityUri();
            case 2:
                return new rxc0(((z6h) obj).getEntityUri());
            case 3:
                return ((z6h) obj).getEntityUri();
            case 4:
                return ((z6h) obj).getEntityUri();
            case 5:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            case 6:
                return new m1l0((i3l0) obj);
            case 7:
                ((qtr) obj).b(new eri0(5, (lnm) null, (byte) 7));
                return rih1Var;
            case 8:
                return (String) obj;
            case 9:
                xkk1 xkk1Var = (xkk1) obj;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null) {
                    return null;
                }
                return up70VarA.a.a;
            case 10:
                return new nwc0(((dnu0) obj).b);
            case 11:
                return (owc0) obj;
            case 12:
                return new rxc0(((dnu0) obj).b);
            case 13:
                return (qxc0) obj;
            case 14:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 16:
                return Boolean.valueOf((obj instanceof owc0) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (owc0) obj;
            case 18:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 20:
                b261.c((e261) obj);
                return rih1Var;
            case 21:
                return new aou0((znu0) null, (String) null, (x4i1) null, (String) null, (String) null, (String) null);
            case 22:
                return ((yif1) obj).a;
            case 23:
                return new kou0(((jou0) obj).a, "");
            case 24:
                return rih1Var;
            case 25:
                return (jou0) obj;
            case 26:
                return (List) obj;
            case 27:
                return Boolean.valueOf(obj instanceof List);
            case 28:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            default:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.track().c()) {
                    ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(playerState.contextUri());
                    try {
                        strB = s4b1VarX.h();
                        break;
                    } catch (UnsupportedOperationException unused) {
                    }
                    if (strB != null) {
                        contextTrack.getClass();
                        if (u890.j(contextTrack.metadata().get("provider"), "enhanced_recommendation")) {
                            Set set2 = s4b1.f;
                            strB = uic.x("spotify:playlist:".concat(strB)).B(contextTrack.uri());
                        } else {
                            contextTrack.getClass();
                            strB = (l4o1.U(contextTrack) && !u890.j(strB, "37i9dQZEVXhds8kU6ckEgw")) ? s4b1VarX.B(contextTrack.uri()) : s4b1VarX.z();
                        }
                    } else {
                        contextTrack.getClass();
                        if (l4o1.U(contextTrack)) {
                            strB = s4b1VarX.z();
                        }
                    }
                }
                return strB == null ? poo1.z(playerState) : strB;
        }
    }
}
