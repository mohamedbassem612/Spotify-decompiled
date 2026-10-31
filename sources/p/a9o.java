package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a9o extends hab0 implements iu30 {
    public static final a9o N0;
    public static final a9o O0;
    public static final a9o P0;
    public static final a9o Q0;
    public static final a9o R0;
    public static final a9o S0;
    public static final a9o T0;
    public static final a9o U0;
    public static final a9o V0;
    public static final a9o W0;
    public static final a9o X;
    public static final a9o X0;
    public static final a9o Y;
    public static final a9o Y0;
    public static final a9o Z;
    public static final a9o Z0;
    public static final a9o a1;
    public static final a9o b;
    public static final a9o b1;
    public static final a9o c;
    public static final a9o c1;
    public static final a9o d;
    public static final a9o d1;
    public static final a9o e;
    public static final a9o e1;
    public static final a9o f;
    public static final a9o g;
    public static final a9o h;
    public static final a9o i;
    public static final a9o t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new a9o(i2, (byte) 0);
        c = new a9o(i2, (byte) 1);
        d = new a9o(i2, (byte) 2);
        e = new a9o(i2, (byte) 3);
        f = new a9o(i2, (byte) 4);
        g = new a9o(i2, (byte) 5);
        h = new a9o(i2, (byte) 6);
        i = new a9o(i2, (byte) 7);
        t = new a9o(i2, (byte) 8);
        X = new a9o(i2, (byte) 9);
        Y = new a9o(i2, (byte) 10);
        Z = new a9o(i2, (byte) 11);
        N0 = new a9o(i2, (byte) 12);
        O0 = new a9o(i2, (byte) 13);
        P0 = new a9o(i2, (byte) 14);
        Q0 = new a9o(i2, (byte) 15);
        R0 = new a9o(i2, (byte) 16);
        S0 = new a9o(i2, (byte) 17);
        T0 = new a9o(i2, (byte) 18);
        U0 = new a9o(i2, (byte) 19);
        V0 = new a9o(i2, (byte) 20);
        W0 = new a9o(i2, (byte) 21);
        X0 = new a9o(i2, (byte) 22);
        Y0 = new a9o(i2, (byte) 23);
        Z0 = new a9o(i2, (byte) 24);
        a1 = new a9o(i2, (byte) 25);
        b1 = new a9o(i2, (byte) 26);
        c1 = new a9o(i2, (byte) 27);
        d1 = new a9o(i2, (byte) 28);
        e1 = new a9o(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9o(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return obj;
            case 1:
                return cko.a;
            case 2:
                return b7xVar;
            case 3:
                return rih1Var;
            case 4:
                return Boolean.TRUE;
            case 5:
                return (cot) obj;
            case 6:
                return new p7u(2);
            case 7:
                return b7xVar;
            case 8:
                return obj;
            case 9:
                af afVar = (af) obj;
                return Integer.valueOf(((afVar.compareTo(af.d) <= 0 && afVar.compareTo(af.a) >= 0) || afVar.compareTo(af.i) > 0 || afVar.compareTo(af.e) < 0) ? 1 : 2);
            case 10:
                return new u7h(((afx) d7e.x((xos0) obj, gfx.a)).b.a);
            case 11:
                return new mr0();
            case 12:
                return new mmr0(((vxy) obj).a.b, (Object) null);
            case 13:
                return Boolean.TRUE;
            case 14:
                return mno1.h(oqn1.n("face_header_state", (le10) obj));
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                return new u7h(((afx) d7e.x((xos0) obj, gfx.a)).c.a);
            case 18:
                return ((kb61) obj).I().b;
            case 19:
                return rih1Var;
            case 20:
                return b7xVar;
            case 21:
                return (c8r) obj;
            case 22:
                by60 by60Var = ((mcl) ((nx9) obj).b()).P0;
                if (by60Var != null) {
                    return h4p1.m(by60Var);
                }
                u890.C("hostsProvider");
                throw null;
            case 23:
                int iOrdinal = ((zt70) obj).ordinal();
                if (iOrdinal == 0) {
                    return du70.a;
                }
                if (iOrdinal == 1) {
                    return eu70.a;
                }
                eg.o();
                return null;
            case 24:
                return Boolean.valueOf(((mu70) obj).l);
            case 25:
                return ((sod1) obj).a;
            case 26:
                return b7xVar;
            case 27:
                return b7xVar;
            case 28:
                return Boolean.valueOf(!((qo90) obj).b().isEmpty());
            default:
                return new qcr((hi) obj, new mj(2131963044, 2131963033, 2131963039, 33, "https://spotify-tap.spotifycdn.com/onboarding/generic/Earbuds_Spotify_Tap.json", (String) null));
        }
    }
}
