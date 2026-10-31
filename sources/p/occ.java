package p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class occ extends Binder {
    public final b380 a;

    public occ(List list) {
        this.a = b380.p(list);
    }

    public static b380 a(IBinder iBinder) {
        int i;
        if (iBinder instanceof occ) {
            return ((occ) iBinder).a;
        }
        v280 v280VarM = b380.m();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            v280VarM.c(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return v280VarM.g();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        b380 b380Var = this.a;
        int size = b380Var.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < whc.a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) b380Var.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
