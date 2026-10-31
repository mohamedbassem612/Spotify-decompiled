package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hvg extends Binder implements vug {
    public final /* synthetic */ ovg a;

    public hvg(ovg ovgVar) {
        this.a = ovgVar;
        attachInterface(this, "com.ravelin.core.IDeviceIdRequestListener");
    }

    @Override // p.vug
    public final void h0(kqt kqtVar) {
        if (kqtVar != null) {
            ovg ovgVar = this.a;
            int i = ovgVar.g;
            ovgVar.g = i + 1;
            nvg nvgVar = new nvg(Integer.valueOf(i), kqtVar.a, kqtVar.b, Long.valueOf(kqtVar.c));
            wug wugVarU = ovgVar.a.u();
            qyo1.x(wugVarU.a, false, true, new b6(wugVarU, nvgVar, (byte) 15));
            String str = ovg.m;
            String str2 = kqtVar.a;
            String str3 = kqtVar.b;
            long j = kqtVar.c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbN = gvg.n("***Debug DeviceId received from ", str2, " with device id: ", str3, " created at ");
            sbN.append(j);
            sbN.append(" collected at ");
            sbN.append(jCurrentTimeMillis);
            String string = sbN.toString();
            utw0 utw0Var = ike1.a;
            utw0Var.y(str);
            utw0Var.o(string, new Object[0]);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.ravelin.core.IDeviceIdRequestListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.ravelin.core.IDeviceIdRequestListener");
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            t(parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        kqt kqtVar = (kqt) (parcel.readInt() != 0 ? kqt.CREATOR.createFromParcel(parcel) : null);
        h0(kqtVar);
        parcel2.writeNoException();
        if (kqtVar == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        kqtVar.writeToParcel(parcel2, 1);
        return true;
    }

    @Override // p.vug
    public final void t(int i, String str, String str2) {
        String str3 = ovg.m;
        StringBuilder sbS = l1d.s(i, "***Debug error receiving device id from ", str2, " with error code: ", " and message: ");
        sbS.append(str);
        String string = sbS.toString();
        utw0 utw0Var = ike1.a;
        utw0Var.y(str3);
        utw0Var.o(string, new Object[0]);
        int i2 = this.a.g;
        this.a.g = i2 + 1;
        nvg nvgVar = new nvg(Integer.valueOf(i2), (String) null, (String) null, 0L);
        wug wugVarU = this.a.a.u();
        qyo1.x(wugVarU.a, false, true, new b6(wugVarU, nvgVar, (byte) 15));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
