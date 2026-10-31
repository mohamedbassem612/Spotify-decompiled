package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fz6 extends hab0 implements iu30 {
    public static final fz6 N0;
    public static final fz6 O0;
    public static final fz6 P0;
    public static final fz6 Q0;
    public static final fz6 R0;
    public static final fz6 S0;
    public static final fz6 T0;
    public static final fz6 U0;
    public static final fz6 V0;
    public static final fz6 W0;
    public static final fz6 X;
    public static final fz6 X0;
    public static final fz6 Y;
    public static final fz6 Y0;
    public static final fz6 Z;
    public static final fz6 Z0;
    public static final fz6 a1;
    public static final fz6 b;
    public static final fz6 b1;
    public static final fz6 c;
    public static final fz6 c1;
    public static final fz6 d;
    public static final fz6 d1;
    public static final fz6 e;
    public static final fz6 e1;
    public static final fz6 f;
    public static final fz6 g;
    public static final fz6 h;
    public static final fz6 i;
    public static final fz6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fz6(i2, (byte) 0);
        c = new fz6(i2, (byte) 1);
        d = new fz6(i2, (byte) 2);
        e = new fz6(i2, (byte) 3);
        f = new fz6(i2, (byte) 4);
        g = new fz6(i2, (byte) 5);
        h = new fz6(i2, (byte) 6);
        i = new fz6(i2, (byte) 7);
        t = new fz6(i2, (byte) 8);
        X = new fz6(i2, (byte) 9);
        Y = new fz6(i2, (byte) 10);
        Z = new fz6(i2, (byte) 11);
        N0 = new fz6(i2, (byte) 12);
        O0 = new fz6(i2, (byte) 13);
        P0 = new fz6(i2, (byte) 14);
        Q0 = new fz6(i2, (byte) 15);
        R0 = new fz6(i2, (byte) 16);
        S0 = new fz6(i2, (byte) 17);
        T0 = new fz6(i2, (byte) 18);
        U0 = new fz6(i2, (byte) 19);
        V0 = new fz6(i2, (byte) 20);
        W0 = new fz6(i2, (byte) 21);
        X0 = new fz6(i2, (byte) 22);
        Y0 = new fz6(i2, (byte) 23);
        Z0 = new fz6(i2, (byte) 24);
        a1 = new fz6(i2, (byte) 25);
        b1 = new fz6(i2, (byte) 26);
        c1 = new fz6(i2, (byte) 27);
        d1 = new fz6(i2, (byte) 28);
        e1 = new fz6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 6:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 8:
                return rih1Var;
            case 9:
                pfr0 pfr0Var = (pfr0) obj;
                return new o4o(pfr0Var.b, pfr0Var.a, pfr0Var.c, pfr0Var.d);
            case 10:
                return Collections.singleton(((pfr0) obj).b);
            case 11:
                im6 im6Var = (im6) obj;
                return new gd6(im6Var.a, (String) o7h.q0(im6Var.b));
            case 12:
                return new v27("", false);
            case 13:
                return ((w27) obj).a;
            case 14:
                return ((w27) obj).a;
            case 15:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 19:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 21:
                xkk1 xkk1Var = (xkk1) obj;
                return (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null) ? "" : str;
            case 22:
                return rih1Var;
            case 23:
                return Boolean.valueOf(obj instanceof List);
            case 24:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.promptedplaylists.assistance.PromptedPlaylistAssistanceRow>");
                return null;
            case 25:
                return rih1Var;
            case 26:
                return (List) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                fe7 fe7Var = (fe7) obj;
                return xcg1.i(fe7Var.c.U0(), "?context=", fe7Var.a);
        }
    }
}
