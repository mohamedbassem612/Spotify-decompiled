package p;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c7o1 extends u9 {
    public static final Parcelable.Creator<c7o1> CREATOR = new sao1((byte) 6);
    public final udo1 a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public c7o1(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        udo1 ndo1Var;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            ndo1Var = iInterfaceQueryLocalInterface instanceof udo1 ? (udo1) iInterfaceQueryLocalInterface : new ndo1(iBinder);
        } else {
            ndo1Var = null;
        }
        this.a = ndo1Var;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        udo1 udo1Var = this.a;
        j541.y(parcel, 2, udo1Var == null ? null : udo1Var.asBinder());
        j541.I(parcel, 3, this.b, i);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.M(iL, parcel);
    }

    public c7o1(gro1 gro1Var) {
        this.a = gro1Var;
        this.b = gro1Var.m;
        this.c = null;
        this.d = null;
    }
}
