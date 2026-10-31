package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y551 implements eck1 {
    public final Scheduler a;
    public final p551 b;
    public final ov41 c;
    public final y441 d;
    public final ly41 e;
    public final z551 f;

    public y551(Scheduler scheduler, p551 p551Var, ov41 ov41Var, y441 y441Var, ly41 ly41Var, z551 z551Var) {
        this.a = scheduler;
        this.b = p551Var;
        this.c = ov41Var;
        this.d = y441Var;
        this.e = ly41Var;
        this.f = z551Var;
    }

    public final xbk1 b(Class cls) {
        return new u551(new x551(this), this.c, this.f, this.d);
    }
}
