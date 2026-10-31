package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r450 extends u9 {
    public static final Parcelable.Creator<r450> CREATOR = new ynm1((byte) 19);
    public final int a;
    public final int b;
    public final Bundle c;

    public r450(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.u(parcel, 3, this.c);
        j541.M(iL, parcel);
    }
}
