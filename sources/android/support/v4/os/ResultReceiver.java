package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p.ak70;
import p.s231;
import p.wr3;
import p.zj70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new s231((byte) 2);
    final Handler mHandler;
    final boolean mLocal;
    ak70 mReceiver;

    public ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        ak70 ak70Var = null;
        this.mHandler = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = a.l;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ak70.k);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ak70)) {
                zj70 zj70Var = new zj70();
                zj70Var.a = strongBinder;
                ak70Var = zj70Var;
            } else {
                ak70Var = (ak70) iInterfaceQueryLocalInterface;
            }
        }
        this.mReceiver = ak70Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new wr3(this, i, bundle, (byte) 9, false));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        ak70 ak70Var = this.mReceiver;
        if (ak70Var != null) {
            try {
                ak70Var.Y(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                ak70 aVar = this.mReceiver;
                if (aVar == null) {
                    aVar = new a(this);
                    this.mReceiver = aVar;
                }
                parcel.writeStrongBinder(aVar.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }
}
