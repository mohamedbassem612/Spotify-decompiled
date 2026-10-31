package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k3x0 {
    public final g341 a;
    public final bfd b;
    public final v5n c;
    public final zsc d;
    public final o241 e;
    public final do70 f;
    public final gdx0 g;
    public final Scheduler h;
    public final add i;
    public final j0a1 j;
    public final Scheduler k;
    public final f3x0 l;
    public final cfi1 m;
    public final q8n n;
    public final Scheduler o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dt71 f7p = mgo1.e(0, 1, 0, 5);
    public final mwv0 q = new mwv0(this, 18);

    public k3x0(g341 g341Var, bfd bfdVar, v5n v5nVar, zsc zscVar, o241 o241Var, do70 do70Var, gdx0 gdx0Var, Scheduler scheduler, add addVar, j0a1 j0a1Var, Scheduler scheduler2, f3x0 f3x0Var, cfi1 cfi1Var, q8n q8nVar, Scheduler scheduler3) {
        this.a = g341Var;
        this.b = bfdVar;
        this.c = v5nVar;
        this.d = zscVar;
        this.e = o241Var;
        this.f = do70Var;
        this.g = gdx0Var;
        this.h = scheduler;
        this.i = addVar;
        this.j = j0a1Var;
        this.k = scheduler2;
        this.l = f3x0Var;
        this.m = cfi1Var;
        this.n = q8nVar;
        this.o = scheduler3;
    }

    public final Observable a(String str, String str2, boolean z) {
        return Observable.defer(new j3x0(this, str, str2, z));
    }
}
