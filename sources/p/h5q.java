package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h5q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ h5q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ywv0 a(muz muzVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                daq daqVar = thqVar.b;
                kt91 kt91Var = (kt91) daqVar.f8.get();
                v5q v5qVar = (v5q) thqVar.c;
                Resources resources = (Resources) v5qVar.X0.get();
                e7p0 e7p0Var = (e7p0) v5qVar.P4.get();
                daq daqVar2 = v5qVar.b;
                return new ywv0(kt91Var, resources, e7p0Var, new z8c0((g0l) daqVar2.E5.get(), aan0.l((eu4) daqVar2.af.get())), (Scheduler) daqVar.z1.get(), (i5q) v5qVar.I7.get(), new x65(false, (luk) daqVar2.L1.get()), (Flowable) daqVar.D5.get(), muzVar);
            case 1:
                r7q r7qVar2 = r7qVar;
                daq daqVar3 = r7qVar2.b;
                kt91 kt91Var2 = (kt91) daqVar3.f8.get();
                s7q s7qVar = (s7q) r7qVar2.d;
                return new ywv0(kt91Var2, (Resources) s7qVar.i2.get(), (e7p0) s7qVar.f3.get(), new z8c0((g0l) daqVar3.E5.get(), aan0.l((eu4) daqVar3.af.get())), (Scheduler) daqVar3.z1.get(), (i5q) s7qVar.n5.get(), new x65(false, (luk) s7qVar.b.L1.get()), (Flowable) daqVar3.D5.get(), muzVar);
            default:
                r7q r7qVar3 = r7qVar;
                daq daqVar4 = r7qVar3.b;
                kt91 kt91Var3 = (kt91) daqVar4.f8.get();
                teq teqVar = r7qVar3.d;
                Resources resources2 = (Resources) teqVar.N0.get();
                e7p0 e7p0Var2 = (e7p0) teqVar.W4.get();
                daq daqVar5 = teqVar.d;
                return new ywv0(kt91Var3, resources2, e7p0Var2, new z8c0((g0l) daqVar5.E5.get(), aan0.l((eu4) daqVar5.af.get())), (Scheduler) daqVar4.z1.get(), (i5q) teqVar.cb.get(), new x65(false, (luk) daqVar5.L1.get()), (Flowable) daqVar4.D5.get(), muzVar);
        }
    }
}
