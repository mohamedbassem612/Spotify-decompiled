package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a7q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ a7q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final v361 a(w3f w3fVar, iu30 iu30Var) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((r7q) thqVar).b;
                return new v361((kt91) daqVar.f8.get(), (Context) daqVar.x1.a, (r35) daqVar.Vd.get(), (q8n) daqVar.V2.get(), w3fVar, iu30Var);
            default:
                daq daqVar2 = thqVar.b;
                return new v361((kt91) daqVar2.f8.get(), (Context) daqVar2.x1.a, (r35) daqVar2.Vd.get(), (q8n) daqVar2.V2.get(), w3fVar, iu30Var);
        }
    }
}
