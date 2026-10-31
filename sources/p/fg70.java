package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fg70 implements hg70, IInterface {
    public final IBinder a;

    public fg70(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // p.hg70
    public final void A0(Bundle bundle, ibn1 ibn1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = qsn1.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(ibn1Var);
        s(3, parcelObtain);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // p.hg70
    public final void f0(Bundle bundle, ibn1 ibn1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = qsn1.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(ibn1Var);
        s(1, parcelObtain);
    }

    @Override // p.hg70
    public final void l0(Bundle bundle, ibn1 ibn1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = qsn1.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(ibn1Var);
        s(4, parcelObtain);
    }

    public final void s(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // p.hg70
    public final void t0(Bundle bundle, ibn1 ibn1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = qsn1.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(ibn1Var);
        s(2, parcelObtain);
    }
}
