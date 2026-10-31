package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kvn1 implements svn1, IInterface {
    public final IBinder a;

    public kvn1(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void B0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel s() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return parcelObtain;
    }
}
