package p;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iet0 extends hab0 implements iu30 {
    public static final iet0 N0;
    public static final iet0 O0;
    public static final iet0 P0;
    public static final iet0 Q0;
    public static final iet0 R0;
    public static final iet0 S0;
    public static final iet0 T0;
    public static final iet0 U0;
    public static final iet0 V0;
    public static final iet0 W0;
    public static final iet0 X;
    public static final iet0 X0;
    public static final iet0 Y;
    public static final iet0 Y0;
    public static final iet0 Z;
    public static final iet0 Z0;
    public static final iet0 a1;
    public static final iet0 b;
    public static final iet0 b1;
    public static final iet0 c;
    public static final iet0 c1;
    public static final iet0 d;
    public static final iet0 d1;
    public static final iet0 e;
    public static final iet0 e1;
    public static final iet0 f;
    public static final iet0 g;
    public static final iet0 h;
    public static final iet0 i;
    public static final iet0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new iet0(i2, (byte) 0);
        c = new iet0(i2, (byte) 1);
        d = new iet0(i2, (byte) 2);
        e = new iet0(i2, (byte) 3);
        f = new iet0(i2, (byte) 4);
        g = new iet0(i2, (byte) 5);
        h = new iet0(i2, (byte) 6);
        i = new iet0(i2, (byte) 7);
        t = new iet0(i2, (byte) 8);
        X = new iet0(i2, (byte) 9);
        Y = new iet0(i2, (byte) 10);
        Z = new iet0(i2, (byte) 11);
        N0 = new iet0(i2, (byte) 12);
        O0 = new iet0(i2, (byte) 13);
        P0 = new iet0(i2, (byte) 14);
        Q0 = new iet0(i2, (byte) 15);
        R0 = new iet0(i2, (byte) 16);
        S0 = new iet0(i2, (byte) 17);
        T0 = new iet0(i2, (byte) 18);
        U0 = new iet0(i2, (byte) 19);
        V0 = new iet0(i2, (byte) 20);
        W0 = new iet0(i2, (byte) 21);
        X0 = new iet0(i2, (byte) 22);
        Y0 = new iet0(i2, (byte) 23);
        Z0 = new iet0(i2, (byte) 24);
        a1 = new iet0(i2, (byte) 25);
        b1 = new iet0(i2, (byte) 26);
        c1 = new iet0(i2, (byte) 27);
        d1 = new iet0(i2, (byte) 28);
        e1 = new iet0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iet0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(((in4) obj).b());
            case 1:
                return Boolean.valueOf(((in4) obj).d());
            case 2:
                return Boolean.valueOf(((in4) obj).a());
            case 3:
                return Boolean.valueOf(((in4) obj).c());
            case 4:
                return Boolean.valueOf(((in4) obj).b());
            case 5:
                return Boolean.valueOf(((in4) obj).b());
            case 6:
                return Boolean.valueOf(((in4) obj).b());
            case 7:
                return Boolean.valueOf(((in4) obj).b());
            case 8:
                return Boolean.valueOf(((in4) obj).b());
            case 9:
                return Boolean.valueOf(((in4) obj).b());
            case 10:
                return Boolean.valueOf(((in4) obj).b());
            case 11:
                return Boolean.valueOf(((in4) obj).b());
            case 12:
                return new PlayButtonView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            case 13:
                ret0 ret0Var = (ret0) obj;
                return new bft0(new xvt0(ret0Var.a, null, false), ret0Var.b);
            case 14:
                return new vet0((qet0) obj, false, false, false);
            case 15:
                return mno1.h(new mmr0[]{new mmr0("PLAY_MODEL", (bot0) obj)});
            case 16:
                PlayButtonView playButtonView = new PlayButtonView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                playButtonView.setImportantForAccessibility(4);
                return playButtonView;
            case 17:
                return rih1Var;
            case 18:
                return ((git0) obj).c.c();
            case 19:
                return new oit0((qfd) obj);
            case 20:
                return new lit0(false, false, kit0.c, new git0("", "", (fh90) null, 12), iit0.a);
            case 21:
                return ((git0) obj).c.c();
            case 22:
                return Boolean.valueOf((obj instanceof qfd) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 24:
                return new yjt0(((xjt0) obj).e, ujt0.a, null);
            case 25:
                return null;
            case 26:
                return ((xjt0) obj).a;
            case 27:
                return new j1l0((i3l0) obj);
            case 28:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
