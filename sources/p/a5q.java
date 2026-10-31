package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5q implements slu {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ a5q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.slu
    public final tlu create() {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((thq) r7qVar).b;
                return new tlu((Context) daqVar.x1.a, (kxc0) daqVar.j5.get(), (s8q) daqVar.b5.get());
            default:
                r7q r7qVar2 = r7qVar;
                daq daqVar2 = r7qVar2.b;
                return new tlu((Context) daqVar2.x1.a, (kxc0) r7qVar2.d.F1.get(), (s8q) daqVar2.b5.get());
        }
    }
}
