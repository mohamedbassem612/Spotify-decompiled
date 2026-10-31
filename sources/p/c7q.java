package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c7q implements x3h {
    public final /* synthetic */ r7q a;

    public c7q(r7q r7qVar) {
        this.a = r7qVar;
    }

    public final a4h a(Resources resources) {
        daq daqVar = this.a.b;
        return new a4h((kt91) daqVar.f8.get(), (eny) daqVar.xp.get(), (q8n) daqVar.V2.get(), (Scheduler) daqVar.z1.get(), resources);
    }
}
