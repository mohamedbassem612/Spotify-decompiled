package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w2s implements wpw {
    public final Object X;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final nsw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object t;

    public w2s(kwn kwnVar, iu30 iu30Var, vu30 vu30Var, zr11 zr11Var, q8n q8nVar, q8n q8nVar2, zob1 zob1Var, vb2 vb2Var) {
        this.a = (byte) 2;
        this.e = kwnVar;
        this.f = iu30Var;
        this.b = vu30Var;
        this.g = zr11Var;
        this.h = q8nVar2;
        this.i = zob1Var;
        this.t = vb2Var;
        this.c = a4p1.h(new yr11(this, (byte) 0), br11.i, h211.Y0, q8nVar, new yr11(this, (byte) 1));
        this.X = n3o1.q(this).a(ok11.O0, ok11.P0);
        this.d = jch0.j(new g001(this, (byte) 22));
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.X;
        switch (b) {
            case 0:
                return (eih1) obj;
            case 1:
                return (eih1) obj;
            case 2:
                return (ia00) obj2;
            default:
                return (ia00) obj2;
        }
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
                return (rey0) this.X;
            case 1:
                return (e7m0) this.X;
            case 2:
                return (js20) this.c;
            default:
                return (poy0) this.c;
        }
    }

    public w2s(dx0 dx0Var, jpg0 jpg0Var, wpw wpwVar, wpw wpwVar2, wpw wpwVar3, dzb1 dzb1Var, Flowable flowable, a0b a0bVar) {
        this.a = (byte) 3;
        this.e = dx0Var;
        this.f = jpg0Var;
        this.b = wpwVar;
        this.g = wpwVar2;
        this.h = wpwVar3;
        this.i = dzb1Var;
        this.t = flowable;
        this.c = y3o1.X(new l5b1(this, (byte) 18), axb1.P0, nva1.X0, axb1.Q0, 8);
        this.X = n3o1.q(this).a(vva1.c1, vva1.d1);
        this.d = jch0.j(new nsb1(this, (byte) 3));
    }

    public w2s(z67 z67Var, pd80 pd80Var, iac0 iac0Var, hjc hjcVar, Scheduler scheduler, ft30 ft30Var) {
        this.a = (byte) 0;
        this.e = z67Var;
        this.f = pd80Var;
        this.b = iac0Var;
        this.g = hjcVar;
        this.h = scheduler;
        this.i = ft30Var;
        this.c = new eih1();
        this.X = ila0.D();
        this.d = jch0.j(new cml(this, (byte) 28));
    }

    public w2s(qwc1 qwc1Var, cmd1 cmd1Var, zob1 zob1Var, LinkedHashMap linkedHashMap, Map map, List list, ij81 ij81Var, fai0 fai0Var, tl7 tl7Var, iac0 iac0Var) {
        this.a = (byte) 1;
        this.e = linkedHashMap;
        this.f = map;
        this.g = list;
        this.h = ij81Var;
        this.i = fai0Var;
        this.t = tl7Var;
        this.b = iac0Var;
        this.X = sbl.z(fqc0.a, new drm1((byte) 25), new qn(qwc1Var, cmd1Var, (byte) 3), f7c0.V0, new vq80(zob1Var, this, (byte) 26));
        this.c = new eih1();
        this.d = jch0.j(new bt70(this, (byte) 25));
    }
}
