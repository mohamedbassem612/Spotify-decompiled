package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ek70 implements gk70 {
    public IBinder a;

    public final boolean B0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.waze.sdk.ISdkService");
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final Messenger s(String str, Bundle bundle, Messenger messenger) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.waze.sdk.ISdkService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (messenger != null) {
                parcelObtain.writeInt(1);
                messenger.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (Messenger) Messenger.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
