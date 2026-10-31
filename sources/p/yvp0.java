package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yvp0 implements wpw, cvl1 {
    public final /* synthetic */ byte a = 1;
    public final hy00 b;
    public final poy0 c;
    public final kjv d;

    public yvp0(urk0 urk0Var, lgy lgyVar, r0s0 r0s0Var, j2h1 j2h1Var, iu30 iu30Var) {
        hy00 hy00VarC;
        if (j2h1Var instanceof xsr0) {
            hy00VarC = n3o1.r(this).c(new z63(urk0Var, (byte) 25), e9t0.c1);
        } else {
            if (!(j2h1Var instanceof ysr0)) {
                eg.o();
                throw null;
            }
            hy00VarC = n3o1.r(this).c(new y63(urk0Var, ((ysr0) j2h1Var).d, (byte) 6), e9t0.b1);
        }
        this.b = hy00VarC;
        this.c = y3o1.X(new ntf0((iz00) lgyVar.d, (Flowable) lgyVar.b, (xrc0) lgyVar.c, (Scheduler) lgyVar.i, (byte) 28), hxt0.Z0, fnt0.Q0, new mvn0((Object) iu30Var, (Object) this, (Object) lgyVar, (byte) 22), 8);
        this.d = lnn1.h(hxt0.a1, new hhu0(r0s0Var, (byte) 0), new hhu0(r0s0Var, (byte) 1));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public yvp0(zfx zfxVar, urk0 urk0Var, p410 p410Var, yqg yqgVar, iu30 iu30Var) {
        this.b = n3o1.r(this).c(new z63(urk0Var, (byte) 24), rmp0.Z);
        this.c = y3o1.X(new tjf0((Flowable) p410Var.b, (zr00) p410Var.c, (yh2) p410Var.d, (ne) p410Var.g, p410Var, (byte) 7), new cnp0(p410Var, (byte) 10), ofo0.e1, new mvn0((Object) iu30Var, (Object) this, (Object) p410Var, (byte) 9), 8);
        this.d = lnn1.h(cwp0.b, new vf3(yqgVar, (byte) 10), new cnp0(zfxVar, (byte) 11));
    }
}
