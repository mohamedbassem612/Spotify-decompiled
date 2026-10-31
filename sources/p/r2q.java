package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r2q implements s2x, gm30, imf0, dl4, g701, th11, no91, t8n, m8b, bbg1 {
    public final daq a;
    public final v5q b;

    public /* synthetic */ r2q(daq daqVar, v5q v5qVar) {
        this.a = daqVar;
        this.b = v5qVar;
    }

    public jmf0 a(p2p0 p2p0Var, Flowable flowable, PublishProcessor publishProcessor) {
        return new qqp(this.a, this.b, flowable, publishProcessor);
    }

    public oo91 b(lik1 lik1Var) {
        lik1Var.getClass();
        return new wtp(this.a, this.b, lik1Var, (byte) 16);
    }

    public h701 c(n6r0 n6r0Var, lik1 lik1Var, gn10 gn10Var, iac0 iac0Var, Flowable flowable) {
        a680 a680Var = new a680();
        v5q v5qVar = this.b;
        a680Var.e = v5qVar;
        a680Var.a = n6r0Var;
        a680Var.b = iac0Var;
        a680Var.c = lik1Var;
        a680Var.d = gn10Var;
        a680Var.f = xqu.b(new n1p(v5qVar, (byte) 2));
        return a680Var;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public u8n m914create() {
        return new pzp(this.a, this.b, (byte) 9);
    }

    @Override // p.s2x
    public t2x g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new em0(this.a, this.b, q2p0Var);
    }

    public void w(Object obj) {
        bvs0 bvs0Var = (bvs0) obj;
        daq daqVar = this.a;
        bvs0Var.G1 = (c3s) daqVar.e6.get();
        bvs0Var.K1 = new t8r0((i8h1) daqVar.A5.get(), (byte) 4);
        bvs0Var.J1 = (Scheduler) daqVar.z1.get();
        zo5 zo5Var = (zo5) daqVar.Gh.get();
        t8r0 t8r0Var = new t8r0();
        t8r0Var.a = zo5Var;
        t8r0Var.b = new Bundle();
        bvs0Var.H1 = t8r0Var;
        v5q v5qVar = this.b;
        bvs0Var.L1 = new t8r0((ljg) v5qVar.N3.get(), new ih4(true, false, false, (luk) v5qVar.b.L1.get()));
        bvs0Var.F1 = (Flowable) daqVar.D5.get();
        bvs0Var.I1 = (w2k1) daqVar.L8.get();
    }

    @Override // p.gm30
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public hm30 mo912create() {
        return new tzp(this.a, this.b, (byte) 4);
    }

    @Override // p.th11
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public uh11 mo915create() {
        return new tzp(this.a, this.b, (byte) 7);
    }

    public cbg1 create() {
        return new pzp(this.a, this.b, (byte) 11);
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public n8b m913create() {
        return new pzp(this.a, this.b, (byte) 10);
    }
}
