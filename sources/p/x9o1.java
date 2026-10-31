package p;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9o1 extends u9 {
    public static final Parcelable.Creator<x9o1> CREATOR = new w2o1((byte) 28);
    public final int a;
    public final ParcelFileDescriptor b;

    public x9o1(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 3, this.b, i | 1);
        j541.M(iL, parcel);
    }
}
