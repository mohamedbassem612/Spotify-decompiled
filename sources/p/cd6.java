package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cd6 implements xpw {
    public final rqw X;
    public final /* synthetic */ byte a;
    public final boolean b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final mqw t;

    public cd6(zob1 zob1Var, d0r d0rVar, boolean z, vzo vzoVar, xzo xzoVar, mmr mmrVar, xrk xrkVar) {
        this.a = (byte) 0;
        this.d = zob1Var;
        this.e = d0rVar;
        this.b = z;
        this.f = vzoVar;
        this.g = xzoVar;
        this.h = mmrVar;
        this.i = xrkVar;
        this.t = z0o1.j(new ve3(this, (byte) 18), new xb2(this, (byte) 22), (iu30) null, 12);
        this.X = new eih1();
        j2i j2iVar = new j2i(137238254, new i43(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.X;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.t;
    }

    public cd6(Context context, Flowable flowable, pqc1 pqc1Var, yge0 yge0Var, dp5 dp5Var, ynb0 ynb0Var, boolean z) {
        this.a = (byte) 1;
        this.d = context;
        this.e = flowable;
        this.f = pqc1Var;
        this.g = yge0Var;
        this.h = dp5Var;
        this.i = ynb0Var;
        this.b = z;
        this.t = d4o1.f(new r2k1(this, (byte) 0), a0k1.h, new muh1(this, (byte) 29), new r2k1(this, (byte) 1), 8);
        j2i j2iVar = drj.d;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.X = n3o1.q(this).a(cxj1.f, cxj1.g);
    }
}
