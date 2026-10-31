package p;

import com.spotify.carapplibrary.androidauto.AndroidAutoService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e0q implements dl4 {
    public final daq a;
    public final e0q b;

    public e0q(daq daqVar, e0q e0qVar) {
        this.a = daqVar;
        this.b = e0qVar;
    }

    public void w(Object obj) {
        AndroidAutoService androidAutoService = (AndroidAutoService) obj;
        daq daqVar = this.a;
        androidAutoService.e = (oo70) daqVar.M2.get();
        androidAutoService.f = (dma1) daqVar.C5.get();
        androidAutoService.d = new e0q(daqVar, this.b);
    }

    public e0q(daq daqVar) {
        this.b = this;
        this.a = daqVar;
    }
}
