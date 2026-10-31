package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qaq {
    public final /* synthetic */ gbp a;

    public qaq(gbp gbpVar) {
        this.a = gbpVar;
    }

    public final li0 a(String str) {
        daq daqVar = (daq) this.a.c;
        Single single = (Single) daqVar.a.P1.get();
        m2p m2pVar = (m2p) daqVar.uq.get();
        hbq hbqVar = daqVar.a;
        kma kmaVar = (kma) hbqVar.n2.get();
        List listW = hbqVar.w();
        taq taqVar = (taq) hbqVar.q2.get();
        int i = t380.c;
        return new li0(str, single, m2pVar, kmaVar, listW, new b291(taqVar));
    }
}
