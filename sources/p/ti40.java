package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ti40 implements wpw {
    public final /* synthetic */ byte a = 1;
    public final ia00 b;
    public final rey0 c;
    public final kjv d;

    public ti40(zfx zfxVar, urk0 urk0Var, yqg yqgVar, j2h1 j2h1Var, iu30 iu30Var) {
        ia00 ia00VarA;
        if (j2h1Var instanceof xsr0) {
            ia00VarA = n3o1.q(this).a(new z63(urk0Var, (byte) 17), d640.t);
        } else {
            if (!(j2h1Var instanceof ysr0)) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(new y63(urk0Var, ((ysr0) j2h1Var).d, (byte) 5), d640.i);
        }
        this.b = ia00VarA;
        this.c = new rey0(new ipy(iu30Var, (byte) 5));
        this.d = lnn1.h(vc40.i, new vf3(yqgVar, (byte) 8), new u830(zfxVar, (byte) 19));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    public ti40(zfx zfxVar, urk0 urk0Var, yqg yqgVar, iu30 iu30Var) {
        this.b = n3o1.q(this).a(new z63(urk0Var, (byte) 28), nzv0.R0);
        this.c = new rey0(new ict0(iu30Var, (byte) 2));
        this.d = lnn1.h(p7w0.Y0, new vf3(yqgVar, (byte) 12), new mwv0(zfxVar, (byte) 17));
    }

    public ti40(igx igxVar, urk0 urk0Var, ejb ejbVar, iu30 iu30Var) {
        this.b = n3o1.q(this).a(new zm01(urk0Var, (byte) 11), cxj1.h);
        this.c = new rey0(new ict0(iu30Var, this));
        this.d = lnn1.h(a0k1.d1, a0k1.e1, new xaj1(igxVar, (byte) 28));
    }

    public ti40(hjc hjcVar, urk0 urk0Var, iu30 iu30Var) {
        this.b = n3o1.q(this).a(new z63(urk0Var, (byte) 22), fri0.Y);
        this.c = new rey0(new ipy(iu30Var, (byte) 17));
        this.d = lnn1.h(hvi0.f, hvi0.g, new nwi0(hjcVar, this, (byte) 0));
    }
}
