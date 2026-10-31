package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class di2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fi2 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di2(fi2 fi2Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = fi2Var;
        this.c = i;
    }

    public final Object invoke() {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        int i = this.c;
        fi2 fi2Var = this.b;
        switch (b) {
            case 0:
                zwg zwgVar = fi2Var.G1;
                if (zwgVar == null) {
                    u890.C("actions");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) zwgVar.b;
                int iC = l1d.C(i);
                if (iC == 0) {
                    x6h1 x6h1VarC = ((bqk0) zwgVar.c).b.c();
                    x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 1) {
                    x6h1 x6h1VarC2 = ((bqk0) zwgVar.d).b.c();
                    x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = ((bqk0) zwgVar.e).b.c();
                    x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var.j(w7h1Var);
                ((kg0) zwgVar.a).d(new bkt(false), true);
                return rih1Var;
            default:
                zwg zwgVar2 = fi2Var.G1;
                if (zwgVar2 == null) {
                    u890.C("actions");
                    throw null;
                }
                i8h1 i8h1Var2 = (i8h1) zwgVar2.b;
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    x6h1 x6h1VarC4 = ((bqk0) zwgVar2.c).b.c();
                    x6h1VarC4.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC2 == 1) {
                    x6h1 x6h1VarC5 = ((bqk0) zwgVar2.d).b.c();
                    x6h1VarC5.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = ((bqk0) zwgVar2.e).b.c();
                    x6h1VarC6.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var2.j(w7h1Var2);
                ((kg0) zwgVar2.a).d(new bkt(false), true);
                return rih1Var;
        }
    }
}
