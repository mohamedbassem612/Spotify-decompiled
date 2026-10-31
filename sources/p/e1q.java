package p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e1q implements mih0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ e1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.mih0
    public final d520 a(ComponentName componentName) {
        byte b = this.a;
        obq obqVar = this.b;
        switch (b) {
            case 0:
                p2p p2pVar = (p2p) obqVar;
                daq daqVar = (daq) p2pVar.c;
                return new d520((Context) daqVar.x1.a, (q8n) daqVar.V2.get(), new m85(false, (luk) ((daq) ((f9p) p2pVar.d).X).L1.get()), componentName);
            case 1:
                s2q s2qVar = (s2q) obqVar;
                daq daqVar2 = s2qVar.b;
                return new d520((Context) daqVar2.x1.a, (q8n) daqVar2.V2.get(), new m85(false, (luk) ((daq) ((f9p) s2qVar.d).X).L1.get()), componentName);
            default:
                obq obqVar2 = obqVar;
                daq daqVar3 = obqVar2.b;
                return new d520((Context) daqVar3.x1.a, (q8n) daqVar3.V2.get(), new m85(false, (luk) ((daq) ((f9p) obqVar2.d).X).L1.get()), componentName);
        }
    }
}
