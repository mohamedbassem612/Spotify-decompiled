package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import p.ak70;
import p.wr3;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a extends Binder implements ak70 {
    public static final /* synthetic */ int l = 0;
    public final /* synthetic */ ResultReceiver a;

    public a(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, ak70.k);
    }

    @Override // p.ak70
    public final void Y(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        Handler handler = resultReceiver.mHandler;
        if (handler != null) {
            handler.post(new wr3(resultReceiver, i, bundle, (byte) 9, false));
        } else {
            resultReceiver.onReceiveResult(i, bundle);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ak70.k;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        Y(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
