package p;

import android.location.Location;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kzn1 extends Binder implements IInterface {
    public final /* synthetic */ bsd1 a;

    public kzn1(bsd1 bsd1Var) {
        this.a = bsd1Var;
        attachInterface(this, "com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Status.CREATOR;
        int i3 = ssn1.a;
        Status status = (Status) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        Location location = (Location) (parcel.readInt() != 0 ? (Parcelable) Location.CREATOR.createFromParcel(parcel) : null);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(gvg.l(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
        }
        u0p1.u(status, location, this.a);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
