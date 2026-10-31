package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gt51 {
    public final /* synthetic */ byte a;
    public final List b;
    public final gtf1[] c;
    public final t01 d;

    public gt51(List list, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = new gtf1[list.size()];
                t01 t01Var = new t01((se21) new iyh1(this, (byte) 2));
                this.d = t01Var;
                t01Var.F(3);
                break;
            default:
                this.b = list;
                this.c = new gtf1[list.size()];
                this.d = new t01((se21) new jf11(this, (byte) 11));
                break;
        }
    }

    public void a(long j, izr0 izr0Var) {
        if (izr0Var.a() < 9) {
            return;
        }
        int iQ = izr0Var.q();
        int iQ2 = izr0Var.q();
        int iE = izr0Var.E();
        if (iQ == 434 && iQ2 == 1195456820 && iE == 3) {
            this.d.a(j, izr0Var);
        }
    }

    public final void b(gc10 gc10Var, wwg1 wwg1Var) {
        byte b = this.a;
        List list = this.b;
        gtf1[] gtf1VarArr = this.c;
        switch (b) {
            case 0:
                for (int i = 0; i < gtf1VarArr.length; i++) {
                    wwg1Var.a();
                    wwg1Var.b();
                    gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 3);
                    ie30 ie30Var = (ie30) list.get(i);
                    String str = ie30Var.f66p;
                    dm5.o("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                    String str2 = ie30Var.a;
                    if (str2 == null) {
                        wwg1Var.b();
                        str2 = wwg1Var.e;
                    }
                    ge30 ge30Var = new ge30();
                    ge30Var.a = str2;
                    ge30Var.n = asj0.p("video/mp2t");
                    ge30Var.o = asj0.p(str);
                    ge30Var.e = ie30Var.e;
                    ge30Var.d = ie30Var.d;
                    ge30Var.O = ie30Var.P;
                    ge30Var.r = ie30Var.s;
                    xvj1.q(ge30Var, gtf1VarW);
                    gtf1VarArr[i] = gtf1VarW;
                }
                break;
            default:
                for (int i2 = 0; i2 < gtf1VarArr.length; i2++) {
                    wwg1Var.a();
                    wwg1Var.b();
                    gtf1 gtf1VarW2 = gc10Var.w(wwg1Var.d, 3);
                    ie30 ie30Var2 = (ie30) list.get(i2);
                    String str3 = ie30Var2.f66p;
                    dm5.o("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                    ge30 ge30Var2 = new ge30();
                    wwg1Var.b();
                    ge30Var2.a = wwg1Var.e;
                    ge30Var2.n = asj0.p("video/mp2t");
                    ge30Var2.o = asj0.p(str3);
                    ge30Var2.e = ie30Var2.e;
                    ge30Var2.d = ie30Var2.d;
                    ge30Var2.O = ie30Var2.P;
                    ge30Var2.r = ie30Var2.s;
                    xvj1.q(ge30Var2, gtf1VarW2);
                    gtf1VarArr[i2] = gtf1VarW2;
                }
                break;
        }
    }
}
