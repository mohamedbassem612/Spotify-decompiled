package p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tj70 implements vj70 {
    public IBinder a;

    public final void B0(sj70 sj70Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(vj70.j);
            parcelObtain.writeStrongInterface(sj70Var);
            if (!this.a.transact(7, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method unregisterProjectedDeviceStateListener is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean s() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(vj70.j);
            if (!this.a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method isDisplayCapable is unimplemented.");
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
