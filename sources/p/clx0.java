package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class clx0 extends Binder implements sj70 {
    public final /* synthetic */ dlx0 a;

    public clx0(dlx0 dlx0Var) {
        this.a = dlx0Var;
        attachInterface(this, sj70.i);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = sj70.i;
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
        int i3 = parcel.readInt();
        dlx0 dlx0Var = this.a;
        if (i3 == 0) {
            dlx0Var.e(k8c0.ON_STOP);
        } else if (i3 == 1) {
            dlx0Var.e(k8c0.ON_START);
        } else if (i3 == 2) {
            if (dlx0Var.d.i.a(w8c0.c)) {
                dlx0Var.e(k8c0.ON_DESTROY);
            }
            tj70 tj70Var = dlx0Var.h;
            if (tj70Var != null) {
                tj70Var.B0(this);
            }
            g2z g2zVar = dlx0Var.g;
            if (g2zVar != null) {
                g2zVar.z();
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
