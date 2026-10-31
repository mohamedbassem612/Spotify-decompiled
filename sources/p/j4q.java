package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j4q implements x3h {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ j4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final a4h a(Resources resources) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((thq) r7qVar).b;
                return new a4h((kt91) daqVar.f8.get(), (eny) daqVar.xp.get(), (q8n) daqVar.V2.get(), (Scheduler) daqVar.z1.get(), resources);
            default:
                daq daqVar2 = r7qVar.b;
                return new a4h((kt91) daqVar2.f8.get(), (eny) daqVar2.xp.get(), (q8n) daqVar2.V2.get(), (Scheduler) daqVar2.z1.get(), resources);
        }
    }
}
