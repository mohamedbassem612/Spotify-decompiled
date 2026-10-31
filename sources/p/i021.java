package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i021 extends hab0 implements iu30 {
    public static final i021 N0;
    public static final i021 O0;
    public static final i021 P0;
    public static final i021 Q0;
    public static final i021 R0;
    public static final i021 S0;
    public static final i021 T0;
    public static final i021 U0;
    public static final i021 V0;
    public static final i021 W0;
    public static final i021 X;
    public static final i021 X0;
    public static final i021 Y;
    public static final i021 Y0;
    public static final i021 Z;
    public static final i021 Z0;
    public static final i021 a1;
    public static final i021 b;
    public static final i021 b1;
    public static final i021 c;
    public static final i021 c1;
    public static final i021 d;
    public static final i021 d1;
    public static final i021 e;
    public static final i021 e1;
    public static final i021 f;
    public static final i021 g;
    public static final i021 h;
    public static final i021 i;
    public static final i021 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new i021(i2, (byte) 0);
        c = new i021(i2, (byte) 1);
        d = new i021(i2, (byte) 2);
        e = new i021(i2, (byte) 3);
        f = new i021(i2, (byte) 4);
        g = new i021(i2, (byte) 5);
        h = new i021(i2, (byte) 6);
        i = new i021(i2, (byte) 7);
        t = new i021(i2, (byte) 8);
        X = new i021(i2, (byte) 9);
        Y = new i021(i2, (byte) 10);
        Z = new i021(i2, (byte) 11);
        N0 = new i021(i2, (byte) 12);
        O0 = new i021(i2, (byte) 13);
        P0 = new i021(i2, (byte) 14);
        Q0 = new i021(i2, (byte) 15);
        R0 = new i021(i2, (byte) 16);
        S0 = new i021(i2, (byte) 17);
        T0 = new i021(i2, (byte) 18);
        U0 = new i021(i2, (byte) 19);
        V0 = new i021(i2, (byte) 20);
        W0 = new i021(i2, (byte) 21);
        X0 = new i021(i2, (byte) 22);
        Y0 = new i021(i2, (byte) 23);
        Z0 = new i021(i2, (byte) 24);
        a1 = new i021(i2, (byte) 25);
        b1 = new i021(i2, (byte) 26);
        c1 = new i021(i2, (byte) 27);
        d1 = new i021(i2, (byte) 28);
        e1 = new i021(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i021(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return new huz(((vuk) obj).m(), (byte) 10);
            case 1:
                return new huz(((vuk) obj).g(), (byte) 10);
            case 2:
                return new t1l0((i3l0) obj);
            case 3:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((t1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 4:
                return mno1.h(new mmr0[]{new mmr0("onboarding_model", (xeq0) obj)});
            case 5:
                return mno1.h(new mmr0[]{new mmr0("remote_downloads_model", (k221) obj)});
            case 6:
                return rih1Var;
            case 7:
                return ((bgu0) obj).b;
            case 8:
                return new lxl0(new opl0((r6h1) obj, (byte) 16));
            case 9:
                lxl0 lxl0Var = (lxl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), lxl0Var.a, lxl0Var.b.b, System.currentTimeMillis());
            case 10:
                kxl0 kxl0Var = (kxl0) obj;
                x6h1 x6h1VarC = kxl0Var.a.c();
                x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), kxl0Var.b.b.b, System.currentTimeMillis());
            case 11:
                kxl0 kxl0Var2 = (kxl0) obj;
                x6h1 x6h1VarC2 = kxl0Var2.a.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), kxl0Var2.b.b.b, System.currentTimeMillis());
            case 12:
                return new q621("", true, false, false, false, false);
            case 13:
                return (q621) obj;
            case 14:
                return (n621) obj;
            case 15:
                return new xzk0((i3l0) obj);
            case 16:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((xzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 17:
                return new z1l0((i3l0) obj);
            case 18:
                return new u1l0((i3l0) obj);
            case 19:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((u1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 20:
                return new v1l0((i3l0) obj);
            case 21:
                return new v1l0((i3l0) obj);
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), ((c1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 23:
                return new v1l0((i3l0) obj);
            case 24:
                return new v1l0((i3l0) obj);
            case 25:
                return new v2l0((i3l0) obj);
            case 26:
                return new v1l0((i3l0) obj);
            case 27:
                ((a7m0) obj).a = y821.a;
                return rih1Var;
            case 28:
                return new y1l0((i3l0) obj);
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((y1l0) obj).a, r6h1.c, System.currentTimeMillis());
        }
    }
}
