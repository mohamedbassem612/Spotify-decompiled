package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iz0 implements xpw {
    public final /* synthetic */ byte a;
    public boolean b;
    public final mqw c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final rqw g;

    public iz0(boolean z, o241 o241Var, dp4 dp4Var) {
        this.a = (byte) 1;
        this.b = z;
        this.e = dp4Var;
        Flowable flowable = ((p241) o241Var).a.toFlowable(BackpressureStrategy.d);
        vbm[] vbmVarArr = q601.a;
        this.f = new kge(flowable);
        this.c = x3p1.n(new jm1(this, (byte) 22), q83.X0, new bom1((avl1) this, (byte) 15), (o8n) null, (iu30) null, 24);
        this.g = new eih1();
        j2i j2iVar = new j2i(-2040257266, new i43(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        eih1 eih1Var = this.g;
        switch (b) {
            case 0:
                return (ia00) eih1Var;
            case 1:
                return eih1Var;
            default:
                return eih1Var;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        rey0 rey0Var = this.c;
        switch (b) {
            case 0:
                return (js20) rey0Var;
            case 1:
                return (js20) rey0Var;
            default:
                return rey0Var;
        }
    }

    public iz0(mr20 mr20Var, mr20 mr20Var2, mr20 mr20Var3, mr20 mr20Var4, mr20 mr20Var5, xu30 xu30Var) {
        this.a = (byte) 0;
        this.e = new gk(mr20Var2, this, (byte) 6);
        this.f = new fu20(mr20Var, new kk(this, (lnm) null, (byte) 1), (byte) 1);
        this.c = x3p1.n(new db((Object) this, (Object) mr20Var3, (Object) mr20Var5, (Object) mr20Var4, (byte) 3), gx0.t, e3.c1, (o8n) null, new d4(this, xu30Var, (byte) 10), 8);
        j2i j2iVar = q3i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(fp0.i, fp0.t);
    }

    public iz0(gw70 gw70Var, boolean z, idd1 idd1Var) {
        this.a = (byte) 2;
        this.e = gw70Var;
        this.b = z;
        this.f = idd1Var;
        this.c = new rey0(gce0.i);
        this.g = new eih1();
        j2i j2iVar = new j2i(1599520827, new y3i0(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
