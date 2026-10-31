package p;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pjb extends ScanCallback {
    public final /* synthetic */ rjb a;
    public final /* synthetic */ ObservableEmitter b;

    public pjb(rjb rjbVar, ObservableEmitter observableEmitter) {
        this.a = rjbVar;
        this.b = observableEmitter;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        super.onBatchScanResults(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.a(this.b, (ScanResult) it.next());
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.b.onNext(jjb.a);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        this.a.a(this.b, scanResult);
    }
}
