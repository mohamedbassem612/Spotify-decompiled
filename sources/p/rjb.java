package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rjb {
    public final BluetoothAdapter a;
    public final Context b;
    public final ii9 c;
    public final tgb d;
    public final tgb e;
    public final idd1 f = new idd1(new vv8(this, (byte) 25));
    public pjb g;

    public rjb(BluetoothAdapter bluetoothAdapter, Context context, ii9 ii9Var, tgb tgbVar, tgb tgbVar2) {
        this.a = bluetoothAdapter;
        this.b = context;
        this.c = ii9Var;
        this.d = tgbVar;
        this.e = tgbVar2;
    }

    public final void a(ObservableEmitter observableEmitter, ScanResult scanResult) {
        int iB;
        mya myaVarI = j82.I(scanResult, this.d.isEnabled());
        int rssi = scanResult.getRssi();
        BluetoothDevice device = scanResult.getDevice();
        String strR = null;
        Integer numValueOf = myaVarI != null ? Integer.valueOf(myaVarI.a()) : null;
        if (myaVarI != null && (iB = myaVarI.b()) != 0) {
            strR = i3a.r(iB);
        }
        observableEmitter.onNext(new njb(new ug41(rssi, device, numValueOf, strR)));
    }
}
