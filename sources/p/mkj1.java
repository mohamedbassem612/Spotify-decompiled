package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mkj1 implements xpw {
    public final w2k1 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final qlb e;
    public final poy0 f;
    public final psw g;
    public final eih1 h;

    public mkj1(w2k1 w2k1Var, int i, int i2, boolean z, yjj1 yjj1Var, c3s c3sVar, qlb qlbVar, FlowableMap flowableMap, bv4 bv4Var) {
        this.a = w2k1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = qlbVar;
        BehaviorSubject behaviorSubject = c3sVar.e;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        this.f = d4o1.g(Flowable.e(behaviorSubject.toFlowable(backpressureStrategy), yjj1Var.a().toFlowable(backpressureStrategy), flowableMap, new y1t0(bv4Var, (byte) 16)), egj1.V0, zhi1.e1, (iu30) null, 24);
        j2i j2iVar = new j2i(-1522174600, new l6i1(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = new eih1();
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.g;
    }

    public final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1277189707);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xaj1(this, (byte) 15);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, u291.d(nim0.a, 1.0f), (iu30) null, x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muh1(this, i, (byte) 21);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
