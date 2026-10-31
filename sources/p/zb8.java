package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zb8 implements wpw {
    public final /* synthetic */ byte a = 0;
    public final di4 b;
    public final ia00 c;
    public final poy0 d;
    public final kjv e;

    public zb8(zfx zfxVar, urk0 urk0Var, ccc0 ccc0Var, g7h g7hVar, di4 di4Var, j2h1 j2h1Var, iu30 iu30Var, yqg yqgVar) {
        ia00 ia00VarA;
        this.b = di4Var;
        if (j2h1Var instanceof xsr0) {
            ia00VarA = n3o1.q(this).a(new zm01(urk0Var, (byte) 4), vy61.a1);
        } else {
            if (!(j2h1Var instanceof ysr0)) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(new y63(urk0Var, ((ysr0) j2h1Var).d, (byte) 7), vy61.Z0);
        }
        this.c = ia00VarA;
        this.d = y3o1.X(new a88(g7hVar, (byte) 2), rz71.h, ea71.X0, new ny51(iu30Var, yqgVar, ccc0Var, (byte) 11), 8);
        this.e = lnn1.h(rz71.f, rz71.g, new c861(zfxVar, this, (byte) 22));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public zb8(zfx zfxVar, urk0 urk0Var, yqg yqgVar, aru0 aru0Var, di4 di4Var, iu30 iu30Var) {
        this.b = di4Var;
        this.c = n3o1.q(this).a(new z63(urk0Var, (byte) 26), gou0.i);
        this.d = y3o1.X(new mvn0((iz00) aru0Var.c, (xrc0) aru0Var.b, (Scheduler) aru0Var.d, (byte) 23), lqu0.R0, fnt0.Y0, new azr0(iu30Var, (byte) 22), 8);
        this.e = lnn1.h(lqu0.N0, new vf3(yqgVar, (byte) 11), new aft0(zfxVar, this, (byte) 23));
    }

    public zb8(pp ppVar, urk0 urk0Var, yqg yqgVar, g7h g7hVar, di4 di4Var, iu30 iu30Var) {
        this.b = di4Var;
        this.c = n3o1.q(this).a(new z63(urk0Var, (byte) 5), jb8.c);
        this.d = y3o1.X(new a88(g7hVar, (byte) 1), db8.Z0, c37.a1, new ib2(iu30Var, (byte) 21), 8);
        this.e = lnn1.h(db8.Y0, new vf3(yqgVar, (byte) 4), new xg6(ppVar, this, (byte) 29));
    }
}
