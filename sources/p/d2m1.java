package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d2m1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m4m1 b;
    public final /* synthetic */ zxl1 c;
    public final /* synthetic */ b2m1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2m1(m4m1 m4m1Var, zxl1 zxl1Var, b2m1 b2m1Var, byte b) {
        super(0);
        this.a = b;
        this.b = m4m1Var;
        this.c = zxl1Var;
        this.d = b2m1Var;
    }

    public final Object invoke() {
        Object obj;
        Object obj2;
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b2m1 b2m1Var = this.d;
        b7x b7xVar = b7x.a;
        zxl1 zxl1Var = this.c;
        m4m1 m4m1Var = this.b;
        String str = "off";
        switch (b) {
            case 0:
                if (m4m1Var != null) {
                    boolean z = m4m1Var.q;
                    i8h1 i8h1Var = (i8h1) zxl1Var.b;
                    zok0 zok0Var = (zok0) zxl1Var.c;
                    zok0Var.getClass();
                    x6h1 x6h1VarC = zok0Var.b.c();
                    x6h1VarC.i.add(new a7h1("beat_matching_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    char c = z ? (char) 2 : (char) 1;
                    char c2 = z ? (char) 1 : (char) 2;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (c == 1) {
                        obj = "off";
                    } else {
                        if (c != 2) {
                            throw null;
                        }
                        obj = "on";
                    }
                    mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
                    if (c2 != 1) {
                        if (c2 != 2) {
                            throw null;
                        }
                        str = "on";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    b2m1Var.a.accept(m3m1.a);
                }
                return rih1Var;
            case 1:
                if (m4m1Var != null) {
                    boolean z2 = m4m1Var.r;
                    i8h1 i8h1Var2 = (i8h1) zxl1Var.b;
                    zok0 zok0Var2 = (zok0) zxl1Var.c;
                    zok0Var2.getClass();
                    x6h1 x6h1VarC2 = zok0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("adjust_speed_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    char c3 = z2 ? (char) 2 : (char) 1;
                    char c4 = z2 ? (char) 1 : (char) 2;
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (c3 == 1) {
                        obj2 = "off";
                    } else {
                        if (c3 != 2) {
                            throw null;
                        }
                        obj2 = "on";
                    }
                    mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj2);
                    if (c4 != 1) {
                        if (c4 != 2) {
                            throw null;
                        }
                        str = "on";
                    }
                    i8h1Var2.m(new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str)})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    b2m1Var.a.accept(s3m1.a);
                }
                return rih1Var;
            default:
                if (m4m1Var != null) {
                    boolean z3 = m4m1Var.p;
                    i8h1 i8h1Var3 = (i8h1) zxl1Var.b;
                    zok0 zok0Var3 = (zok0) zxl1Var.c;
                    zok0Var3.getClass();
                    x6h1 x6h1VarC3 = zok0Var3.b.c();
                    x6h1VarC3.i.add(new a7h1("coaching_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    char c5 = z3 ? (char) 2 : (char) 1;
                    char c6 = z3 ? (char) 1 : (char) 2;
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (c5 == 1) {
                        obj3 = "off";
                    } else {
                        if (c5 != 2) {
                            throw null;
                        }
                        obj3 = "on";
                    }
                    mmr0 mmr0Var3 = new mmr0("state_before_toggle", obj3);
                    if (c6 != 1) {
                        if (c6 != 2) {
                            throw null;
                        }
                        str = "on";
                    }
                    i8h1Var3.m(new w7h1("", "", z7h1Var3, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var3, new mmr0("state_after_toggle", str)})), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    b2m1Var.a.accept(l3m1.a);
                }
                return rih1Var;
        }
    }
}
