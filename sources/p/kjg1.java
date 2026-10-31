package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjg1 {
    public final cig1 a;
    public final so1 b;
    public final wt1 c;
    public final av1 d;
    public final eyh0 e;
    public final llm f;
    public final dt71 g;
    public final LinkedHashMap h;
    public final ve01 i;

    public kjg1(cig1 cig1Var, so1 so1Var, wt1 wt1Var, av1 av1Var, cfr cfrVar, eyh0 eyh0Var) {
        this.a = cig1Var;
        this.b = so1Var;
        this.c = wt1Var;
        this.d = av1Var;
        this.e = eyh0Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.f = smo1.e(flo1.l(j0d1VarB, pyf0.a).y(new v62(olj0.T0, (byte) 23)));
        dt71 dt71VarE = mgo1.e(1, 10, 0, 4);
        this.g = dt71VarE;
        this.h = new LinkedHashMap();
        this.i = d5p1.g(dt71VarE);
    }

    public final Object a(String str, bum0 bum0Var, w621 w621Var) {
        Object objEmit = this.g.emit(new rs1(bum0Var, str), w621Var);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }

    public final Object b(String str, yc41 yc41Var, p230 p230Var) {
        Object objEmit = this.g.emit(new vs1(str, yc41Var), p230Var);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }
}
