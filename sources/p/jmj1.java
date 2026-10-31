package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jmj1 extends hab0 implements iu30 {
    public static final jmj1 N0;
    public static final jmj1 O0;
    public static final jmj1 P0;
    public static final jmj1 Q0;
    public static final jmj1 R0;
    public static final jmj1 S0;
    public static final jmj1 T0;
    public static final jmj1 U0;
    public static final jmj1 V0;
    public static final jmj1 W0;
    public static final jmj1 X;
    public static final jmj1 X0;
    public static final jmj1 Y;
    public static final jmj1 Y0;
    public static final jmj1 Z;
    public static final jmj1 Z0;
    public static final jmj1 a1;
    public static final jmj1 b;
    public static final jmj1 b1;
    public static final jmj1 c;
    public static final jmj1 c1;
    public static final jmj1 d;
    public static final jmj1 d1;
    public static final jmj1 e;
    public static final jmj1 e1;
    public static final jmj1 f;
    public static final jmj1 g;
    public static final jmj1 h;
    public static final jmj1 i;
    public static final jmj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jmj1(i2, (byte) 0);
        c = new jmj1(i2, (byte) 1);
        d = new jmj1(i2, (byte) 2);
        e = new jmj1(i2, (byte) 3);
        f = new jmj1(i2, (byte) 4);
        g = new jmj1(i2, (byte) 5);
        h = new jmj1(i2, (byte) 6);
        i = new jmj1(i2, (byte) 7);
        t = new jmj1(i2, (byte) 8);
        X = new jmj1(i2, (byte) 9);
        Y = new jmj1(i2, (byte) 10);
        Z = new jmj1(i2, (byte) 11);
        N0 = new jmj1(i2, (byte) 12);
        O0 = new jmj1(i2, (byte) 13);
        P0 = new jmj1(i2, (byte) 14);
        Q0 = new jmj1(i2, (byte) 15);
        R0 = new jmj1(i2, (byte) 16);
        S0 = new jmj1(i2, (byte) 17);
        T0 = new jmj1(i2, (byte) 18);
        U0 = new jmj1(i2, (byte) 19);
        V0 = new jmj1(i2, (byte) 20);
        W0 = new jmj1(i2, (byte) 21);
        X0 = new jmj1(i2, (byte) 22);
        Y0 = new jmj1(i2, (byte) 23);
        Z0 = new jmj1(i2, (byte) 24);
        a1 = new jmj1(i2, (byte) 25);
        b1 = new jmj1(i2, (byte) 26);
        c1 = new jmj1(i2, (byte) 27);
        d1 = new jmj1(i2, (byte) 28);
        e1 = new jmj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 2:
                return new e3l0((i3l0) obj);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                return Boolean.valueOf(obj instanceof Boolean);
            case 5:
                if (obj != null) {
                    return (Boolean) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            case 6:
                return dnj1.b;
            case 7:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 9:
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            case 10:
                return new lo51(true);
            case 11:
                return new sl1(true);
            case 12:
                return new sl1(true);
            case 13:
                return new y691(false);
            case 14:
                return new y691(false);
            case 15:
                return new y691(false);
            case 16:
                return l4o1.b0((ContextTrack) obj);
            case 17:
                ((qtr) obj).b(new gp9(5, (lnm) null, (byte) 11));
                return rih1Var;
            case 18:
                return new xpj1((String) null, w7x.a);
            case 19:
                return ((vhc1) obj).getUri();
            case 20:
                return "allow-child-video";
            case 21:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 23:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 25:
                neg negVar = (neg) obj;
                neg.b(negVar, "name", pma.b, 4);
                qnw0 qnw0Var = nma.b;
                neg.b(negVar, "alignment", qnw0Var, 4);
                neg.b(negVar, "offset", qnw0Var, 4);
                neg.b(negVar, "period", qnw0Var, 4);
                return rih1Var;
            case 26:
                neg negVar2 = (neg) obj;
                qnw0 qnw0Var2 = pma.b;
                neg.b(negVar2, "type", qnw0Var2, 4);
                qnw0 qnw0Var3 = oma.b;
                neg.b(negVar2, "seek_to", qnw0Var3, 4);
                neg.b(negVar2, "end_position", qnw0Var3, 4);
                neg.b(negVar2, "stop_position", qnw0Var3, 4);
                neg.b(negVar2, "track", r2g1.b, 4);
                neg.b(negVar2, "future", jrj1.b.c, 4);
                neg.b(negVar2, "player_options", wkm.Companion.serializer().getDescriptor(), 4);
                qnw0 qnw0Var4 = hma.b;
                neg.b(negVar2, "initially_paused", qnw0Var4, 4);
                neg.b(negVar2, "system_initiated", qnw0Var4, 4);
                neg.b(negVar2, "client_offline", qnw0Var4, 4);
                neg.b(negVar2, "start_reason", qnw0Var2, 4);
                neg.b(negVar2, "session_id", qnw0Var2, 4);
                neg.b(negVar2, "logging_params", dve0.b, 4);
                neg.b(negVar2, "system_initiated_time", qnw0Var3, 4);
                neg.b(negVar2, "tracks", jrj1.c.c, 4);
                neg.b(negVar2, "config", xjm.b, 4);
                neg.b(negVar2, "position", qnw0Var3, 4);
                neg.b(negVar2, "timekeeper_builder", qnw0Var2, 4);
                neg.b(negVar2, "marker_boundary_start", qnw0Var3, 4);
                neg.b(negVar2, "marker_boundary_end", qnw0Var3, 4);
                neg.b(negVar2, "markers", jrj1.d.c, 4);
                neg.b(negVar2, "is_list_player", qnw0Var4, 4);
                neg.b(negVar2, "automatically_sync_to_live_head", qnw0Var4, 4);
                return rih1Var;
            case 27:
                return Boolean.valueOf(((Number) obj).intValue() == 1);
            case 28:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 4);
            default:
                ofr0 ofr0Var = (ofr0) obj;
                String str = ofr0Var.a;
                return new nuj1(str, ofr0Var.b, str);
        }
    }
}
