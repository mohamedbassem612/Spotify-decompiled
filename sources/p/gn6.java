package p;

import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gn6 extends hab0 implements iu30 {
    public static final gn6 N0;
    public static final gn6 O0;
    public static final gn6 P0;
    public static final gn6 Q0;
    public static final gn6 R0;
    public static final gn6 S0;
    public static final gn6 T0;
    public static final gn6 U0;
    public static final gn6 V0;
    public static final gn6 W0;
    public static final gn6 X;
    public static final gn6 X0;
    public static final gn6 Y;
    public static final gn6 Y0;
    public static final gn6 Z;
    public static final gn6 Z0;
    public static final gn6 a1;
    public static final gn6 b;
    public static final gn6 b1;
    public static final gn6 c;
    public static final gn6 c1;
    public static final gn6 d;
    public static final gn6 d1;
    public static final gn6 e;
    public static final gn6 e1;
    public static final gn6 f;
    public static final gn6 g;
    public static final gn6 h;
    public static final gn6 i;
    public static final gn6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gn6(i2, (byte) 0);
        c = new gn6(i2, (byte) 1);
        d = new gn6(i2, (byte) 2);
        e = new gn6(i2, (byte) 3);
        f = new gn6(i2, (byte) 4);
        g = new gn6(i2, (byte) 5);
        h = new gn6(i2, (byte) 6);
        i = new gn6(i2, (byte) 7);
        t = new gn6(i2, (byte) 8);
        X = new gn6(i2, (byte) 9);
        Y = new gn6(i2, (byte) 10);
        Z = new gn6(i2, (byte) 11);
        N0 = new gn6(i2, (byte) 12);
        O0 = new gn6(i2, (byte) 13);
        P0 = new gn6(i2, (byte) 14);
        Q0 = new gn6(i2, (byte) 15);
        R0 = new gn6(i2, (byte) 16);
        S0 = new gn6(i2, (byte) 17);
        T0 = new gn6(i2, (byte) 18);
        U0 = new gn6(i2, (byte) 19);
        V0 = new gn6(i2, (byte) 20);
        W0 = new gn6(i2, (byte) 21);
        X0 = new gn6(i2, (byte) 22);
        Y0 = new gn6(i2, (byte) 23);
        Z0 = new gn6(i2, (byte) 24);
        a1 = new gn6(i2, (byte) 25);
        b1 = new gn6(i2, (byte) 26);
        c1 = new gn6(i2, (byte) 27);
        d1 = new gn6(i2, (byte) 28);
        e1 = new gn6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        xp6 xp6Var = xp6.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof jo70);
            case 1:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof z6a1);
            case 3:
                if (obj != null) {
                    return (z6a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnaartistfacts.SongDNAArtistFacts");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof List);
            case 5:
                return rih1Var;
            case 6:
                return ((bp6) obj).a;
            case 7:
                return (jo70) obj;
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                return xp6Var;
            case 12:
                return ((wp6) obj).a;
            case 13:
                return (iq6) obj;
            case 14:
                if (!(obj instanceof iq6) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iq6) obj;
            case 16:
                return xp6Var;
            case 17:
                return new rq6("", "", "");
            case 18:
                return rih1Var;
            case 19:
                return new dr6(z6x.a);
            case 20:
                ss6 ss6Var = (ss6) obj;
                return new kx6(ss6Var.a, ss6Var.b, ss6Var.c);
            case 21:
                return ((ss6) obj).a;
            case 22:
                ((Number) obj).intValue();
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                return new nr6(((zer0) obj).a);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Collections.singleton(((zer0) obj).a);
            case 26:
                return new bx21(2131954489);
            case 27:
                PlayerState playerState = (PlayerState) obj;
                String strH = poo1.H(playerState, "artist_name");
                String strH2 = poo1.H(playerState, "artist_uri");
                String strH3 = poo1.H(playerState, "artist_name");
                int i2 = 1;
                while (true) {
                    strH2.getClass();
                    if (strH2.length() > 0) {
                        if (u890.j(playerState.contextUri(), strH2)) {
                            strH3.getClass();
                            if (strH3.length() > 0) {
                                strH = strH3;
                            }
                        } else {
                            strH2 = poo1.H(playerState, String.format(new Locale(upn1.m()), "artist_uri:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                            strH3 = poo1.H(playerState, String.format(new Locale(upn1.m()), "artist_name:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                            i2++;
                        }
                    }
                }
                strH.getClass();
                return new ugc1(strH);
            case 28:
                PlayerState playerState2 = (PlayerState) obj;
                return ihc1.h0(playerState2.contextUri(), "popular-release-segments-main-roles", false) ? poo1.H(playerState2, "artist_uri") : playerState2.contextUri();
            default:
                return (String) obj;
        }
    }
}
