package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nug implements vug {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // p.vug
    public final void h0(kqt kqtVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdRequestListener");
            parcelObtain.writeInt(1);
            kqtVar.writeToParcel(parcelObtain, 0);
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() != 0) {
                kqtVar.a(parcelObtain2);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p.vug
    public final void t(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdRequestListener");
            parcelObtain.writeInt(401);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
