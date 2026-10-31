package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ a4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xbj1 a(fv0 fv0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((thq) r7qVar).b;
                return new xbj1((q8n) daqVar.r2.get(), fv0Var, (Flowable) daqVar.D5.get());
            case 1:
                daq daqVar2 = r7qVar.b;
                return new xbj1((q8n) daqVar2.r2.get(), fv0Var, (Flowable) daqVar2.D5.get());
            default:
                daq daqVar3 = r7qVar.b;
                return new xbj1((q8n) daqVar3.r2.get(), fv0Var, (Flowable) daqVar3.D5.get());
        }
    }
}
