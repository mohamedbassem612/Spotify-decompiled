package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sh20 implements h0r0 {
    public final gsl a;
    public final uh20 b;
    public final xrc0 c;
    public final zs11 d;
    public final n39 e;
    public final zwp f;
    public final b0d0 g;
    public final ruz h;
    public final t1p i;
    public final s1p j;
    public final d2q k;
    public final lzn0 l;
    public final map m;
    public final cbr0 n;

    public sh20(gsl gslVar, uh20 uh20Var, xrc0 xrc0Var, zs11 zs11Var, n39 n39Var, zwp zwpVar, b0d0 b0d0Var, ruz ruzVar, e5b0 e5b0Var, t1p t1pVar, s1p s1pVar, d2q d2qVar, lzn0 lzn0Var, map mapVar) {
        this.a = gslVar;
        this.b = uh20Var;
        this.c = xrc0Var;
        this.d = zs11Var;
        this.e = n39Var;
        this.f = zwpVar;
        this.g = b0d0Var;
        this.h = ruzVar;
        this.i = t1pVar;
        this.j = s1pVar;
        this.k = d2qVar;
        this.l = lzn0Var;
        this.m = mapVar;
        yxe1 yxe1Var = new yxe1(new ehc1("Find in Show"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarQ3 = yon1.Q3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.n = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarQ3, oap1.i(uh20Var.getUri()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.n;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return new w2z(new il00(this.c, (byte) 3), this, (byte) 23);
    }
}
