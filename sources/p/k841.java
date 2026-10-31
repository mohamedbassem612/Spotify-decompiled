package p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k841 extends Binder implements IInterface {
    public final /* synthetic */ dk70 a;
    public final /* synthetic */ ObservableEmitter l;
    public final /* synthetic */ l841 m;

    public k841(l841 l841Var, dk70 dk70Var, ObservableEmitter observableEmitter) {
        this.m = l841Var;
        this.a = dk70Var;
        this.l = observableEmitter;
        attachInterface(this, "com.msc.sa.aidl.ISACallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        j741 i741Var;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.msc.sa.aidl.ISACallback");
        }
        if (i == 1) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.readInt();
        boolean z = parcel.readInt() != 0;
        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        l841 l841Var = this.m;
        try {
            if (l841Var.c.c()) {
                ((bk70) this.a).X0((String) l841Var.c.b());
            }
        } catch (RemoteException unused) {
        }
        ObservableEmitter observableEmitter = this.l;
        if (!observableEmitter.isDisposed()) {
            if (bundle.containsKey("id_token") && bundle.containsKey("authcode") && bundle.containsKey("api_server_url") && bundle.containsKey("auth_server_url")) {
                String string = bundle.getString("id_token");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("authcode");
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = bundle.getString("api_server_url");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = bundle.getString("auth_server_url");
                if (string4 == null) {
                    string4 = "";
                }
                i741Var = new j741(string, string2, string3, string4);
            } else {
                i741Var = new i741("Data missing in auth code result");
            }
            if (z) {
                observableEmitter.onNext(i741Var);
            } else {
                observableEmitter.onNext(new i741(l1d.m("Failed to fetch id token. ", bundle.getString("error_message", ""))));
            }
            observableEmitter.onComplete();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
