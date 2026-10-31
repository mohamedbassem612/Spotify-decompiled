package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rm0 implements xpw {
    public final /* synthetic */ byte a;
    public final js20 b;
    public final eih1 c;
    public final psw d;

    public rm0(pe peVar, Optional optional, ynb0 ynb0Var, rnu rnuVar, mr20 mr20Var) {
        this.a = (byte) 3;
        z9a0 z9a0Var = (z9a0) optional.orElse(s9a0.a);
        Flowable flowable = (Flowable) new idd1(new x680(peVar, ynb0Var, (byte) 15)).getValue();
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        ht20 ht20Var = new ht20(z9a0Var.a(), new uem(2, (lnm) null, (byte) 1), (byte) 0);
        mr20 mr20VarU = rqt0.u(mr20Var);
        mr20 mr20Var2 = rnuVar.a;
        this.b = x3p1.m(h5p1.q(kgeVar, ht20Var, mr20VarU, rqt0.u(new ht20(hu20.e(new any(new tf2(hu20.e(new any(mr20Var2, (byte) 18), new i64(3, (lnm) null, (byte) 10)), (byte) 8), (byte) 18), new i64(3, (lnm) null, (byte) 9)), new qjr(2, (lnm) null, (byte) 18))), rqt0.u(hu20.e(new tf2(hu20.e(new any(mr20Var2, (byte) 18), new i64(3, (lnm) null, (byte) 10)), (byte) 8), new i64(3, (lnm) null, (byte) 8))), q9a0.h), mr90.Y, ul90.O0, (o8n) null, (iu30) null, 24);
        this.c = new eih1();
        j2i j2iVar = fui.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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
            case 3:
                break;
            case 4:
                break;
        }
        return this.b;
    }

    public rm0(zob1 zob1Var) {
        this.a = (byte) 1;
        this.b = z0o1.k(zob1Var, new bom1(this, (byte) 14), (iu30) null, 12);
        this.c = new eih1();
        j2i j2iVar = v5i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public rm0(Observable observable, v5n v5nVar, gdx0 gdx0Var) {
        this.a = (byte) 5;
        this.b = x3p1.m(yoi1.g(observable.switchMap(new bih1(gdx0Var, v5nVar, (byte) 5)).distinctUntilChanged()), kei1.U0, yji1.a, (o8n) null, (iu30) null, 24);
        this.c = new eih1();
        j2i j2iVar = spj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public rm0(fdc fdcVar) {
        this.a = (byte) 4;
        this.b = x3p1.m((mr20) fdcVar.f, mmp0.t, ofo0.a1, (o8n) null, new cnp0(this, (byte) 1), 8);
        this.c = new eih1();
        j2i j2iVar = s4j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public rm0(vu30 vu30Var, List list) {
        this.a = (byte) 0;
        this.b = x3p1.n(new pm0(vu30Var, (byte) 0), di0.i, new qm0(list, (byte) 0), (o8n) null, (iu30) null, 24);
        this.c = new eih1();
        j2i j2iVar = h3i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public rm0(xpw xpwVar, zob1 zob1Var) {
        this.a = (byte) 2;
        this.b = z0o1.j(new z5d(zob1Var, (byte) 1), new qza(this, (byte) 5), (iu30) null, 12);
        this.c = new eih1();
        j2i j2iVar = new j2i(310529657, new a5e(xpwVar, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
