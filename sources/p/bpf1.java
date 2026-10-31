package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bpf1 extends hab0 implements iu30 {
    public static final bpf1 N0;
    public static final bpf1 O0;
    public static final bpf1 P0;
    public static final bpf1 Q0;
    public static final bpf1 R0;
    public static final bpf1 S0;
    public static final bpf1 T0;
    public static final bpf1 U0;
    public static final bpf1 V0;
    public static final bpf1 W0;
    public static final bpf1 X;
    public static final bpf1 X0;
    public static final bpf1 Y;
    public static final bpf1 Y0;
    public static final bpf1 Z;
    public static final bpf1 Z0;
    public static final bpf1 a1;
    public static final bpf1 b;
    public static final bpf1 b1;
    public static final bpf1 c;
    public static final bpf1 c1;
    public static final bpf1 d;
    public static final bpf1 d1;
    public static final bpf1 e;
    public static final bpf1 e1;
    public static final bpf1 f;
    public static final bpf1 g;
    public static final bpf1 h;
    public static final bpf1 i;
    public static final bpf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new bpf1(i2, (byte) 0);
        c = new bpf1(i2, (byte) 1);
        d = new bpf1(i2, (byte) 2);
        e = new bpf1(i2, (byte) 3);
        f = new bpf1(i2, (byte) 4);
        g = new bpf1(i2, (byte) 5);
        h = new bpf1(i2, (byte) 6);
        i = new bpf1(i2, (byte) 7);
        t = new bpf1(i2, (byte) 8);
        X = new bpf1(i2, (byte) 9);
        Y = new bpf1(i2, (byte) 10);
        Z = new bpf1(i2, (byte) 11);
        N0 = new bpf1(i2, (byte) 12);
        O0 = new bpf1(i2, (byte) 13);
        P0 = new bpf1(i2, (byte) 14);
        Q0 = new bpf1(i2, (byte) 15);
        R0 = new bpf1(i2, (byte) 16);
        S0 = new bpf1(i2, (byte) 17);
        T0 = new bpf1(i2, (byte) 18);
        U0 = new bpf1(i2, (byte) 19);
        V0 = new bpf1(i2, (byte) 20);
        W0 = new bpf1(i2, (byte) 21);
        X0 = new bpf1(i2, (byte) 22);
        Y0 = new bpf1(i2, (byte) 23);
        Z0 = new bpf1(i2, (byte) 24);
        a1 = new bpf1(i2, (byte) 25);
        b1 = new bpf1(i2, (byte) 26);
        c1 = new bpf1(i2, (byte) 27);
        d1 = new bpf1(i2, (byte) 28);
        e1 = new bpf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((nof1) obj).a();
            case 1:
                return ((nof1) obj).b;
            case 2:
                return (lof1) obj;
            case 3:
                return (gof1) obj;
            case 4:
                return rih1Var;
            case 5:
                return sof1.a;
            case 6:
                return ((pof1) obj).a;
            case 7:
                return ((pof1) obj).a;
            case 8:
                return ((ho70) obj).a;
            case 9:
                return Boolean.valueOf(obj instanceof jo70);
            case 10:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 11:
                return Boolean.valueOf(obj instanceof xkk1);
            case 12:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 13:
                return rih1Var;
            case 14:
                return new qpf1(new opf1(0, ""), new lpf1(false, ""));
            case 15:
                return rih1Var;
            case 16:
                return Long.valueOf(((Number) obj).longValue());
            case 17:
                return Long.valueOf(((Number) obj).longValue());
            case 18:
                return new csf1("", false);
            case 19:
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                return ((s1g1) obj).b;
            case 22:
                return ((ho70) obj).a;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return new quf1("", cvf1.a, muf1.a, 2131963354, 2131963353, (String) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 28:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            default:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }
}
