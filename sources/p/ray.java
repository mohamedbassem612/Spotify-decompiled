package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ray {
    public final /* synthetic */ zgg1 a;
    public final /* synthetic */ ft71 b;
    public final /* synthetic */ zgg1 c;
    public final /* synthetic */ bjg1 d;
    public final /* synthetic */ bby e;
    public final /* synthetic */ ln00 f;
    public final /* synthetic */ zgg1 g;

    public /* synthetic */ ray(zgg1 zgg1Var, ft71 ft71Var, zgg1 zgg1Var2, bjg1 bjg1Var, bby bbyVar, ln00 ln00Var, zgg1 zgg1Var3) {
        this.a = zgg1Var;
        this.b = ft71Var;
        this.c = zgg1Var2;
        this.d = bjg1Var;
        this.e = bbyVar;
        this.f = ln00Var;
        this.g = zgg1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final o4u a() {
        ygg1 ygg1VarA;
        ofg1 ofg1Var;
        ofg1 ofg1Var2;
        ygg1 ygg1VarA2;
        bby bbyVar = this.e;
        oig1 oig1Var = bbyVar.a;
        zgg1 zgg1Var = this.a;
        ft71 ft71Var = this.b;
        ln00 ln00Var = this.f;
        ygg1 ygg1VarA3 = null;
        if (zgg1Var != null) {
            ygg1VarA = zgg1Var.a(new tay(bbyVar, ln00Var, (byte) 0), ft71Var.m() ? Float.valueOf(ft71Var.g) : null, null, new uay(bbyVar, ln00Var, ft71Var, (byte) 0));
        } else {
            ygg1VarA = null;
        }
        zgg1 zgg1Var2 = this.c;
        if (zgg1Var2 != null) {
            ygg1VarA3 = zgg1Var2.a(new tay(bbyVar, ln00Var, (byte) 1), ft71Var.m() ? Float.valueOf(ft71Var.h) : null, ft71Var.j(), new uay(bbyVar, ln00Var, ft71Var, (byte) 1));
        }
        if (((mhg1) this.d).a.P0() == pay.a) {
            eg41 eg41Var = oig1Var.d;
            if (eg41Var != null) {
                ofg1Var = new ofg1(eg41Var.b);
            } else {
                eg41 eg41Var2 = ln00Var.a.d;
                if (eg41Var2 != null) {
                    ofg1Var = new ofg1(eg41Var2.b);
                } else {
                    ofg1Var2 = ygg1VarA3;
                }
            }
            ofg1Var2 = ofg1Var;
        } else {
            eg41 eg41Var3 = ln00Var.a.d;
            if (eg41Var3 != null) {
                ofg1Var = new ofg1(eg41Var3.b);
            } else {
                eg41 eg41Var4 = oig1Var.d;
                if (eg41Var4 != null) {
                    ofg1Var = new ofg1(eg41Var4.b);
                } else {
                    ofg1Var2 = ygg1VarA3;
                }
            }
            ofg1Var2 = ofg1Var;
        }
        zgg1 zgg1Var3 = this.g;
        if (zgg1Var3 != null) {
            ygg1VarA2 = zgg1Var3.a(x0y.a1, ft71Var.m() ? new ofg1(ft71Var.i) : ygg1VarA3, null, new lhx(ofg1Var2, bbyVar, ln00Var, ft71Var, (byte) 2));
        } else {
            ygg1VarA2 = ygg1VarA3;
        }
        return new o4u(ft71Var, ygg1VarA, ygg1VarA3, ygg1VarA2, (byte) 2);
    }
}
