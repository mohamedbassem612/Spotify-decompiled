package p;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qjb implements ObservableOnSubscribe {
    public int a;
    public long b;
    public Object c;

    public qjb(rjb rjbVar, int i, long j) {
        this.c = rjbVar;
        this.a = i;
        this.b = j;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        rjb rjbVar = (rjb) this.c;
        ScanCallback pjbVar = new pjb(rjbVar, observableEmitter);
        rjbVar.g = pjbVar;
        idd1 idd1Var = rjbVar.f;
        if (((BluetoothLeScanner) idd1Var.getValue()) == null) {
            observableEmitter.onNext(ljb.a);
            observableEmitter.onComplete();
            return;
        }
        BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) idd1Var.getValue();
        bluetoothLeScanner.getClass();
        ParcelUuid parcelUuid = new ParcelUuid(tgl.a);
        int i = 0;
        ArrayList arrayListO = p7h.O(new ScanFilter[]{new ScanFilter.Builder().setServiceUuid(parcelUuid).build(), new ScanFilter.Builder().setServiceData(parcelUuid, new byte[0]).build()});
        if (rjbVar.d.isEnabled()) {
            ScanFilter.Builder builder = new ScanFilter.Builder();
            if (rjbVar.e.isEnabled()) {
                byte[] bArr = new byte[17];
                bArr[0] = 1;
                bArr[13] = -128;
                byte[] bArr2 = new byte[17];
                bArr2[0] = -1;
                bArr2[13] = -128;
                builder.setManufacturerData(76, bArr, bArr2);
            } else {
                builder.setManufacturerData(76, new byte[0]);
            }
            arrayListO.add(builder.build());
        }
        int i2 = this.a;
        long j = this.b;
        ScanSettings.Builder builder2 = new ScanSettings.Builder();
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 != 3) {
            throw null;
        }
        bluetoothLeScanner.startScan(arrayListO, builder2.setScanMode(i).setReportDelay(j).build(), pjbVar);
    }

    public qjb(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
