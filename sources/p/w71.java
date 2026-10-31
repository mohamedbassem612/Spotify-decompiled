package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w71 implements v71 {
    public kly0 a;
    public kly0 b;
    public kly0 c;
    public kly0 d;
    public kly0 e;
    public kly0 f;
    public kly0 g;
    public kly0 h;
    public kly0 i;
    public kly0 j;
    public kly0 k;
    public kly0 l;
    public kly0 m;
    public kly0 n;
    public kly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kly0 f37p;

    @Override // p.v71
    public final xm41 B0() {
        return (xm41) this.i.get();
    }

    @Override // p.v71
    public final Scheduler U() {
        return (Scheduler) this.g.get();
    }

    @Override // p.v71
    public final iwe0 V() {
        return (iwe0) this.j.get();
    }

    @Override // p.v71
    public final yuj W() {
        return (yuj) this.a.get();
    }

    @Override // p.v71
    public final boolean X() {
        return ((Boolean) this.f37p.get()).booleanValue();
    }

    @Override // p.v71
    public final gj10 Y() {
        return (gj10) this.c.get();
    }

    @Override // p.v71
    public final bi0 Z() {
        return (bi0) this.l.get();
    }

    @Override // p.v71
    public final dv a0() {
        return (dv) this.e.get();
    }

    @Override // p.v71
    public final jq accountSwitcher() {
        return (jq) this.d.get();
    }

    @Override // p.v71
    public final oq accountSwitcherCredentialManager() {
        return (oq) this.f.get();
    }

    @Override // p.v71
    public final lzn0 c() {
        return (lzn0) this.b.get();
    }

    @Override // p.v71
    public final Context context() {
        return (Context) this.h.get();
    }

    @Override // p.v71
    public final kt91 j() {
        return (kt91) this.n.get();
    }

    @Override // p.v71
    public final Resources r() {
        return (Resources) this.o.get();
    }

    @Override // p.v71
    public final Activity s() {
        return (Activity) this.k.get();
    }

    @Override // p.v71
    public final Flowable z0() {
        return (Flowable) this.m.get();
    }
}
