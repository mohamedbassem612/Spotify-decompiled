package p;

import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eno extends hab0 implements iu30 {
    public static final eno N0;
    public static final eno O0;
    public static final eno P0;
    public static final eno Q0;
    public static final eno R0;
    public static final eno S0;
    public static final eno T0;
    public static final eno U0;
    public static final eno V0;
    public static final eno W0;
    public static final eno X;
    public static final eno X0;
    public static final eno Y;
    public static final eno Y0;
    public static final eno Z;
    public static final eno Z0;
    public static final eno a1;
    public static final eno b;
    public static final eno b1;
    public static final eno c;
    public static final eno c1;
    public static final eno d;
    public static final eno d1;
    public static final eno e;
    public static final eno e1;
    public static final eno f;
    public static final eno g;
    public static final eno h;
    public static final eno i;
    public static final eno t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new eno(i2, (byte) 0);
        c = new eno(i2, (byte) 1);
        d = new eno(i2, (byte) 2);
        e = new eno(i2, (byte) 3);
        f = new eno(i2, (byte) 4);
        g = new eno(i2, (byte) 5);
        h = new eno(i2, (byte) 6);
        i = new eno(i2, (byte) 7);
        t = new eno(i2, (byte) 8);
        X = new eno(i2, (byte) 9);
        Y = new eno(i2, (byte) 10);
        Z = new eno(i2, (byte) 11);
        N0 = new eno(i2, (byte) 12);
        O0 = new eno(i2, (byte) 13);
        P0 = new eno(i2, (byte) 14);
        Q0 = new eno(i2, (byte) 15);
        R0 = new eno(i2, (byte) 16);
        S0 = new eno(i2, (byte) 17);
        T0 = new eno(i2, (byte) 18);
        U0 = new eno(i2, (byte) 19);
        V0 = new eno(i2, (byte) 20);
        W0 = new eno(i2, (byte) 21);
        X0 = new eno(i2, (byte) 22);
        Y0 = new eno(i2, (byte) 23);
        Z0 = new eno(i2, (byte) 24);
        a1 = new eno(i2, (byte) 25);
        b1 = new eno(i2, (byte) 26);
        c1 = new eno(i2, (byte) 27);
        d1 = new eno(i2, (byte) 28);
        e1 = new eno(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eno(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((cno) obj).a;
            case 1:
                return ((cno) obj).b;
            case 2:
                return (zmo) obj;
            case 3:
                b261.d((e261) obj);
                return rih1Var;
            case 4:
                return new upo((wy71) obj);
            case 5:
                nfm0 nfm0Var = ((kqo) obj).a;
                if (nfm0Var instanceof hfm0) {
                    return "spotify:chat-pick-custom-reaction";
                }
                if (nfm0Var instanceof gfm0) {
                    return "spotify:listening-activity-pick-custom-reaction";
                }
                eg.o();
                return null;
            case 6:
                return (uqo) obj;
            case 7:
                return rih1Var;
            case 8:
                return ((zuc0) obj).g;
            case 9:
                return "spotify:internal:personal-podcast:onboarding:personalization:edit";
            case 10:
                return f4i1.f("spotify:internal:personal-podcast:onboarding:personalization:", ((eso) obj).a, "");
            case 11:
                return rih1Var;
            case 12:
                cfd1 cfd1Var = (efd1) obj;
                if (cfd1Var instanceof cfd1) {
                    return new uoc(cfd1Var.a);
                }
                if (cfd1Var instanceof dfd1) {
                    return voc.a;
                }
                eg.o();
                return null;
            case 13:
                return (h881) obj;
            case 14:
                return ((h881) obj).d;
            case 15:
                String str = ((h881) obj).b;
                return str == null ? "" : str;
            case 16:
                String str2 = ((cp11) obj).a;
                return new uho(str2, str2, null, null, null, null, 252);
            case 17:
                return new gvu(14, ((cp11) obj).a, (String) null, false, (String) null);
            case 18:
                return new t671(54, ((cp11) obj).a, (String) null, (String) null, "audiobook-release", (List) null, false);
            case 19:
                return new ret0(((cp11) obj).a, 2);
            case 20:
                return new oe51(((cp11) obj).a);
            case 21:
                return new bnb(((cp11) obj).a);
            case 22:
                return ((cp11) obj).a;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                return b7x.a;
            case 26:
                return new bx21(2131954496);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new ugc1(poo1.A((PlayerState) obj));
            case 28:
                return poo1.J((PlayerState) obj);
            default:
                return ((uho) obj).a;
        }
    }
}
