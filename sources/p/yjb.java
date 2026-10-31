package p;

import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.ParcelUuid;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yjb extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(int i, mbg1 mbg1Var, List list, ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, tcd1 tcd1Var) {
        super(1);
        this.c = i;
        this.d = mbg1Var;
        this.e = list;
        this.f = marginLayoutParams;
        this.b = z;
        this.g = tcd1Var;
    }

    public final Object invoke(Object obj) {
        ku8 ku8Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        boolean z = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        int i = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                mhd mhdVar = (mhd) obj;
                p811 p811Var = new p811();
                p811Var.a = cu9.T0;
                AdvertiseCallback wjbVar = new wjb(new kd8(mhdVar, p811Var, (byte) 27));
                p811Var.a = new rqa((BluetoothManager) obj2, wjbVar, (byte) 5);
                mhdVar.n(new i3(p811Var, (byte) 2));
                BluetoothLeAdvertiser bluetoothLeAdvertiser = (BluetoothLeAdvertiser) obj5;
                rhb rhbVar = (rhb) obj3;
                AdvertiseSettings.Builder advertiseMode = new AdvertiseSettings.Builder().setAdvertiseMode(((qhb) obj4).a);
                if (rhbVar != null) {
                    advertiseMode.setTxPowerLevel(rhbVar.a);
                }
                AdvertiseSettings advertiseSettingsBuild = advertiseMode.setConnectable(true).build();
                UUID uuid = tgl.a;
                AdvertiseData.Builder builder = new AdvertiseData.Builder();
                if (z) {
                    ParcelUuid parcelUuid = new ParcelUuid(uuid);
                    Map map = lya.a;
                    builder.addServiceData(parcelUuid, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)});
                } else {
                    builder.addServiceUuid(new ParcelUuid(uuid));
                }
                bluetoothLeAdvertiser.startAdvertising(advertiseSettingsBuild, builder.build(), wjbVar);
                break;
            case 1:
                e261 e261Var = (e261) obj;
                String str = (String) obj4;
                if (!z) {
                    b261.a(e261Var);
                }
                b261.n(e261Var, (String) obj5);
                b261.A(e261Var, str);
                b261.w(e261Var, new vfx0(i, (jsg) obj3, 11));
                e261Var.b(m161.i, new we(str, new o9o((byte) 1, i, (iu30) obj2, z)));
                break;
            default:
                y2s y2sVar = (y2s) obj;
                mbg1 mbg1Var = (mbg1) obj5;
                if (i != 1) {
                    qtw qtwVarA = f6o1.A(mbg1Var.c, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                    int iC = l1d.C(i);
                    if (iC == 2) {
                        ku8Var = ku8.b;
                    } else if (iC != 3) {
                        ku8Var = iC != 4 ? ku8.a : ku8.d;
                    } else {
                        ku8Var = ku8.c;
                    }
                    lu8 lu8Var = new lu8(ku8Var);
                    z6w z6wVar = z6w.U0;
                    fdv fdvVar = fdv.X0;
                    l7m0 l7m0Var = y2sVar.a;
                    ((ArrayList) l7m0Var.b).add(new hrw(qtwVarA, lu8Var, new k7f(l7m0Var, fdvVar), z6wVar));
                }
                y2sVar.b(BehaviorProcessor.e0((List) obj4), new eu91(mbg1Var, (ViewGroup.MarginLayoutParams) obj3, z, (tcd1) obj2));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(BluetoothLeAdvertiser bluetoothLeAdvertiser, qhb qhbVar, rhb rhbVar, int i, boolean z, BluetoothManager bluetoothManager) {
        super(1);
        this.d = bluetoothLeAdvertiser;
        this.e = qhbVar;
        this.f = rhbVar;
        this.c = i;
        this.b = z;
        this.g = bluetoothManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(boolean z, String str, String str2, int i, jsg jsgVar, iu30 iu30Var) {
        super(1);
        this.b = z;
        this.d = str;
        this.e = str2;
        this.c = i;
        this.f = jsgVar;
        this.g = iu30Var;
    }
}
