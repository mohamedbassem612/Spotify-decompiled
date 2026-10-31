package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rj70 implements yt90 {
    public final Context a;
    public final kt91 b;
    public final zfr c;
    public final p4s d;
    public final hur e;
    public final ucs f;
    public final f2l g;
    public final z1s h;
    public final yqg i;
    public final q8h1 j;
    public final q8h1 k;
    public final c9c0 l;
    public final Observable m;
    public final Scheduler n;
    public final llm o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public faa0 f74p;
    public final rku q = new rku();

    public rj70(Context context, kt91 kt91Var, zfr zfrVar, p4s p4sVar, hur hurVar, ucs ucsVar, f2l f2lVar, z1s z1sVar, yqg yqgVar, q8h1 q8h1Var, q8h1 q8h1Var2, c9c0 c9c0Var, Observable observable, Scheduler scheduler, q8n q8nVar) {
        this.a = context;
        this.b = kt91Var;
        this.c = zfrVar;
        this.d = p4sVar;
        this.e = hurVar;
        this.f = ucsVar;
        this.g = f2lVar;
        this.h = z1sVar;
        this.i = yqgVar;
        this.j = q8h1Var;
        this.k = q8h1Var2;
        this.l = c9c0Var;
        this.m = observable;
        this.n = scheduler;
        this.o = l1d.x(q8nVar);
    }

    @Override // p.yt90
    public final void start() {
        this.f74p = c921.y(this.o, (o8n) null, 0, new j020(this, (lnm) null, (byte) 29), 3);
    }

    @Override // p.yt90
    public final void stop() {
        faa0 faa0Var = this.f74p;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        int iOrdinal = hqq0.l0(this.g.a.a).ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 14) {
            this.f.a.onNext(Boolean.FALSE);
        }
        this.q.a();
    }
}
