package p;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t5o1 extends u9 {
    public static final Parcelable.Creator<t5o1> CREATOR = new w2o1((byte) 9);
    public final int a;
    public final ParcelFileDescriptor b;
    public final boolean c;

    public t5o1(int i, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 3, this.b, i);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.M(iL, parcel);
    }
}
