package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6r0 {
    public final g0i a;
    public final qe41 b;
    public final o7r0 c;
    public final fkk1 d;
    public final Function0 e;
    public final n2r0 f;
    public final Observable g;
    public final Observable h;
    public final dar0 i;
    public final kvn0 j;
    public final Function0 k;
    public final phi0 l;
    public final ezc m;

    public b6r0(g0i g0iVar, qe41 qe41Var, o7r0 o7r0Var, fkk1 fkk1Var, wbr0 wbr0Var, sbr0 sbr0Var, Function0 function0, n2r0 n2r0Var, Observable observable, Observable observable2, dar0 dar0Var, kvn0 kvn0Var, Function0 function1, int i) {
        fkk1 fkk1Var2 = (i & 8) != 0 ? y5r0.a : fkk1Var;
        wbr0 wbr0Var2 = (i & 16) != 0 ? y5r0.e : wbr0Var;
        y5q y5qVar = y5r0.f;
        sbr0 sbr0Var2 = (i & 64) != 0 ? y5r0.c : sbr0Var;
        v5r0 v5r0Var = y5r0.d;
        Function0 function2 = (i & 256) != 0 ? v0r0.g : function0;
        n2r0 n2r0Var2 = (i & 512) != 0 ? n6x.a : n2r0Var;
        Observable observable3 = (i & 1024) != 0 ? y5r0.g : observable;
        Observable observable4 = (i & 2048) != 0 ? y5r0.g : observable2;
        dar0 dar0Var2 = (i & 4096) != 0 ? y5r0.h : dar0Var;
        kvn0 kvn0Var2 = (i & 8192) != 0 ? y5r0.i : kvn0Var;
        this.a = g0iVar;
        this.b = qe41Var;
        this.c = o7r0Var;
        this.d = fkk1Var2;
        this.e = function2;
        this.f = n2r0Var2;
        this.g = observable3;
        this.h = observable4;
        this.i = dar0Var2;
        this.j = kvn0Var2;
        this.k = function1;
        tbr0 tbr0VarA = sbr0Var2.a("");
        this.l = new phi0((Function0) new u6j0(this, (byte) 23), (s1q0) g0iVar, wbr0Var2, (vbr0) y5qVar, tbr0VarA, v5r0Var.a(tbr0VarA));
        this.m = yoi1.g(Observable.combineLatest(observable4, observable3, dar0Var2.a(), aj20.V0).distinctUntilChanged());
    }

    public final Function0 b() {
        return this.e;
    }

    public final ezc c() {
        return this.m;
    }

    public final phi0 d() {
        return this.l;
    }

    public final ecr0 e(xnn0 xnn0Var) {
        return new ecr0(new ukm0(this, xnn0Var, (byte) 14), this.k, this.f, this.j);
    }
}
