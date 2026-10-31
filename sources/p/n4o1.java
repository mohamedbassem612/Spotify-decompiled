package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n4o1 extends u9 {
    public static final Parcelable.Creator<n4o1> CREATOR = new w2o1((byte) 5);
    public final int a;
    public final boolean b;

    public n4o1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.M(iL, parcel);
    }
}
