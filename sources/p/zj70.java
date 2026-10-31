package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zj70 implements ak70 {
    public IBinder a;

    @Override // p.ak70
    public final void Y(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ak70.k);
            parcelObtain.writeInt(i);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method send is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
