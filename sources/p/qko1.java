package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qko1 extends u9 {
    public static final Parcelable.Creator<qko1> CREATOR = new sao1((byte) 25);
    public final int a;
    public final udo1 b;

    public qko1(int i, IBinder iBinder) {
        udo1 ndo1Var;
        this.a = i;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            ndo1Var = iInterfaceQueryLocalInterface instanceof udo1 ? (udo1) iInterfaceQueryLocalInterface : new ndo1(iBinder);
        } else {
            ndo1Var = null;
        }
        this.b = ndo1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        udo1 udo1Var = this.b;
        j541.y(parcel, 2, udo1Var == null ? null : udo1Var.asBinder());
        j541.M(iL, parcel);
    }

    public qko1(gro1 gro1Var) {
        this.a = 1;
        this.b = gro1Var;
    }
}
