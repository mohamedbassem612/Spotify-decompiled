package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n8q {
    public final /* synthetic */ caq a;

    public n8q(caq caqVar) {
        this.a = caqVar;
    }

    public final g38 a(u28 u28Var) {
        daq daqVar = this.a.a;
        o8q o8qVar = (o8q) daqVar.ol.get();
        daqVar.getClass();
        return new g38(o8qVar, new ghb(new wl4(false, (luk) daqVar.L1.get()), Optional.of((ck) daqVar.I5.get()), Optional.of((crd) daqVar.N4.get())), (phb) daqVar.pl.get(), u28Var, (Scheduler) daqVar.A2.get());
    }
}
