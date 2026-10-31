package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d6d1 extends hab0 implements iu30 {
    public static final d6d1 N0;
    public static final d6d1 O0;
    public static final d6d1 P0;
    public static final d6d1 Q0;
    public static final d6d1 R0;
    public static final d6d1 S0;
    public static final d6d1 T0;
    public static final d6d1 U0;
    public static final d6d1 V0;
    public static final d6d1 W0;
    public static final d6d1 X;
    public static final d6d1 X0;
    public static final d6d1 Y;
    public static final d6d1 Y0;
    public static final d6d1 Z;
    public static final d6d1 Z0;
    public static final d6d1 a1;
    public static final d6d1 b;
    public static final d6d1 b1;
    public static final d6d1 c;
    public static final d6d1 c1;
    public static final d6d1 d;
    public static final d6d1 d1;
    public static final d6d1 e;
    public static final d6d1 e1;
    public static final d6d1 f;
    public static final d6d1 g;
    public static final d6d1 h;
    public static final d6d1 i;
    public static final d6d1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new d6d1(i2, (byte) 0);
        c = new d6d1(i2, (byte) 1);
        d = new d6d1(i2, (byte) 2);
        e = new d6d1(i2, (byte) 3);
        f = new d6d1(i2, (byte) 4);
        g = new d6d1(i2, (byte) 5);
        h = new d6d1(i2, (byte) 6);
        i = new d6d1(i2, (byte) 7);
        t = new d6d1(i2, (byte) 8);
        X = new d6d1(i2, (byte) 9);
        Y = new d6d1(i2, (byte) 10);
        Z = new d6d1(i2, (byte) 11);
        N0 = new d6d1(i2, (byte) 12);
        O0 = new d6d1(i2, (byte) 13);
        P0 = new d6d1(i2, (byte) 14);
        Q0 = new d6d1(i2, (byte) 15);
        R0 = new d6d1(i2, (byte) 16);
        S0 = new d6d1(i2, (byte) 17);
        T0 = new d6d1(i2, (byte) 18);
        U0 = new d6d1(i2, (byte) 19);
        V0 = new d6d1(i2, (byte) 20);
        W0 = new d6d1(i2, (byte) 21);
        X0 = new d6d1(i2, (byte) 22);
        Y0 = new d6d1(i2, (byte) 23);
        Z0 = new d6d1(i2, (byte) 24);
        a1 = new d6d1(i2, (byte) 25);
        b1 = new d6d1(i2, (byte) 26);
        c1 = new d6d1(i2, (byte) 27);
        d1 = new d6d1(i2, (byte) 28);
        e1 = new d6d1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6d1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        s1f1 q1f1Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        switch (b2) {
            case 0:
                return new p3v(48.0f);
            case 1:
                return new p3v(12.0f);
            case 2:
                return new p3v(8.0f);
            case 3:
                return new p3v(32.0f);
            case 4:
                n271 n271Var = (n271) obj;
                String strA = n271Var.a.a();
                int i3 = n271Var.b;
                s1f1 s1f1Var = n271Var.c;
                s1f1Var.getClass();
                if (s1f1Var instanceof r1f1) {
                    q1f1Var = r1f1.a;
                } else if (s1f1Var instanceof p1f1) {
                    q1f1Var = p1f1.a;
                } else {
                    if (!(s1f1Var instanceof q1f1)) {
                        eg.o();
                        return null;
                    }
                    q1f1Var = new q1f1(((q1f1) s1f1Var).a);
                }
                return new k9d1(strA, i3, q1f1Var);
            case 5:
                return (k9d1) obj;
            case 6:
                return rih1Var;
            case 7:
                return new dcd1(false);
            case 8:
                return new ycd1((xcd1) obj, (jo70) null, (xkk1) null, (Float) null);
            case 9:
                return ((xcd1) obj).a;
            case 10:
                return ((xcd1) obj).a;
            case 11:
                return ((xcd1) obj).a;
            case 12:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 16:
                return Boolean.valueOf((obj instanceof ro7) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 18:
                return rih1Var;
            case 19:
                return Boolean.TRUE;
            case 20:
                return rih1Var;
            case 21:
                int iOrdinal = ((bfd1) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i2 = 2;
                        if (iOrdinal != 2) {
                            i2 = 3;
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                }
                return Integer.valueOf(i2);
            case 22:
                return Boolean.valueOf(((View) obj) instanceof ViewGroup);
            case 23:
                return end1.a;
            case 24:
                return Integer.valueOf(-((Number) obj).intValue());
            case 25:
                return Integer.valueOf(((Number) obj).intValue());
            case 26:
                return Integer.valueOf(((Number) obj).intValue());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Integer.valueOf(-((Number) obj).intValue());
            case 28:
                return rih1Var;
            default:
                return new lo51(true);
        }
    }
}
