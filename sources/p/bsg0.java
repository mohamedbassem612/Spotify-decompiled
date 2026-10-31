package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bsg0 implements h0r0 {
    public final q7e0 a;
    public final Scheduler b;
    public final dsg0 c;
    public final u9c d;
    public final yrg0 e;
    public final hzr f;
    public final a7s g;
    public final xuj h;
    public final cbr0 i;

    public bsg0(q7e0 q7e0Var, Scheduler scheduler, dsg0 dsg0Var, u9c u9cVar, yrg0 yrg0Var, hzr hzrVar, a7s a7sVar, xuj xujVar) {
        this.a = q7e0Var;
        this.b = scheduler;
        this.c = dsg0Var;
        this.d = u9cVar;
        this.e = yrg0Var;
        this.f = hzrVar;
        this.g = a7sVar;
        this.h = xujVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131958181));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarS3 = yon1.S3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.i = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarS3, oap1.i(dsg0Var.a() + ":markasplayed"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        Single map;
        String strA = this.c.a();
        u9c u9cVar = this.d;
        if (((atg0) u9cVar.f).a()) {
            map = ((n481) u9cVar.b).a(new b481(ulc.t(strA), new o8z(1000000), ((ogr) u9cVar.e).L(strA), (azo1) null, (t881) u9cVar.d, Boolean.TRUE, Boolean.FALSE, 97960)).map(new ogr(u9cVar, (byte) 9));
        } else {
            map = ((h481) u9cVar.a).a(ulc.t(strA), (e481) u9cVar.c).map(new tzo(u9cVar, (byte) 15));
        }
        return q7e0.b(this.a, bbp1.h(map.observeOn(this.b)), new e4f0(this, (byte) 24), new n7e0(new asg0(this), new fc3(this, (byte) 16), zi20.X));
    }
}
